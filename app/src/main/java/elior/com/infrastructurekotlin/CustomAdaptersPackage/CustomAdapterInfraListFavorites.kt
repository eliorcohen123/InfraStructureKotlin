package elior.com.infrastructurekotlin.CustomAdaptersPackage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import elior.com.infrastructurekotlin.R
import elior.com.infrastructurekotlin.RoomPackage.InfraModelRoom
import kotlinx.android.synthetic.main.adapter_infra.view.*

class CustomAdapterInfraListFavorites internal constructor(
    private var infraModelRooms: List<InfraModelRoom>
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.adapter_infra, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(infraModelRooms[position])
    }

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(part: InfraModelRoom) {
            itemView.title1.text = part.infraName
            itemView.overview1.text = part.infraOverview
            Picasso.get().load("https://image.tmdb.org/t/p/original" + part.infraPosterPath)
                .into(itemView.image1)
        }
    }

    override fun getItemCount() = infraModelRooms.size
}


