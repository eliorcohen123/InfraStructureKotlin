package elior.com.infrastructurekotlin.CustomAdaptersPackage

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import elior.com.infrastructurekotlin.PagesPackage.FavoritesActivity
import elior.com.infrastructurekotlin.ModelsPackage.Results
import elior.com.infrastructurekotlin.OthersPackage.MyApplication
import elior.com.infrastructurekotlin.R
import elior.com.infrastructurekotlin.RoomPackage.InfraModelRoom
import elior.com.infrastructurekotlin.RoomPackage.InfraViewModel

class CustomAdapterInfraList internal constructor(context: Context, dataList: List<Results>) :
    RecyclerView.Adapter<CustomAdapterInfraList.InfraViewHolder>() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private var infra = dataList
    private lateinit var infraViewModel: InfraViewModel

    inner class InfraViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val infraItemViewTitle: TextView = itemView.findViewById(R.id.title1)
        val infraItemViewOverview: TextView = itemView.findViewById(R.id.overview1)
        val infraItemViewImage: ImageView = itemView.findViewById(R.id.image1)
        val infraLinear: LinearLayout = itemView.findViewById(R.id.linear1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InfraViewHolder {
        val itemView = inflater.inflate(R.layout.recyclerview_item, parent, false)
        return InfraViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: InfraViewHolder, position: Int) {
        val current = infra[position]
        holder.infraItemViewTitle.text = current.title
        holder.infraItemViewOverview.text = current.overview
        Picasso.get().load("https://image.tmdb.org/t/p/original" + current.poster_path)
            .into(holder.infraItemViewImage)

        infraViewModel = MyApplication.getApplication()?.let { InfraViewModel(it) }!!
        val infraName = InfraModelRoom(
            current.title.toString(), current.overview.toString(), current.poster_path.toString()
        )
        infraViewModel.insert(infraName)
        holder.infraLinear.setOnClickListener {
            inflater.context.startActivity(Intent(inflater.context, FavoritesActivity::class.java))
        }
    }

    override fun getItemCount() = infra.size
}
