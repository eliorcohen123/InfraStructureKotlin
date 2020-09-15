package elior.com.infrastructurekotlin.CustomAdaptersPackage

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import elior.com.infrastructurekotlin.ModelsPackage.Results
import elior.com.infrastructurekotlin.OthersPackage.MyApplication
import elior.com.infrastructurekotlin.PagesPackage.FavoritesActivity
import elior.com.infrastructurekotlin.R
import elior.com.infrastructurekotlin.RoomPackage.InfraModelRoom
import elior.com.infrastructurekotlin.RoomPackage.InfraViewModel
import kotlinx.android.synthetic.main.adapter_infra.view.*

class CustomAdapterInfraList internal constructor(
    private val context: Context,
    private val dataList: List<Results>
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.adapter_infra, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(context, dataList[position])
    }

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(context: Context, part: Results) {
            itemView.title1.text = part.title
            itemView.overview1.text = part.overview
            Picasso.get().load("https://image.tmdb.org/t/p/original" + part.poster_path)
                .into(itemView.image1)

            val infraName = InfraModelRoom(
                part.title.toString(), part.overview.toString(), part.poster_path.toString()
            )
            val infraViewModel = MyApplication.getApplication()?.let { InfraViewModel(it) }!!
            infraViewModel.insert(infraName)
            itemView.linear1.setOnClickListener {
                context.startActivity(Intent(context, FavoritesActivity::class.java))
            }
        }
    }

    override fun getItemCount() = dataList.size
}

