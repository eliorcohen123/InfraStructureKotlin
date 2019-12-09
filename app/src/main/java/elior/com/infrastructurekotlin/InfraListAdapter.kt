package elior.com.infrastructurekotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class InfraListAdapter internal constructor(context: Context) :
    RecyclerView.Adapter<InfraListAdapter.WordViewHolder>() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private var infra = emptyList<Infra>()

    inner class WordViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val infraItemView: TextView = itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        val itemView = inflater.inflate(R.layout.recyclerview_item, parent, false)
        return WordViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        val current = infra[position]
        holder.infraItemView.text = current.infra
    }

    internal fun setInfras(infras: List<Infra>) {
        this.infra = infras
        notifyDataSetChanged()
    }

    override fun getItemCount() = infra.size
}
