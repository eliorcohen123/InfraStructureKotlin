package elior.com.infrastructurekotlin.AdapterPackage

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import elior.com.infrastructurekotlin.DataPackage.MovieModel
import elior.com.infrastructurekotlin.R

class InfraListAdapter internal constructor(
    context: Context,
    dataList: List<MovieModel>
) :
    RecyclerView.Adapter<InfraListAdapter.InfraViewHolder>() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private var infra = dataList

    inner class InfraViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val infraItemViewTitle: TextView = itemView.findViewById(R.id.title1)
        val infraItemViewOverview: TextView = itemView.findViewById(R.id.overview1)
        val infraItemViewImage: ImageView = itemView.findViewById(R.id.image1)
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
    }

    override fun getItemCount() = infra.size
}
