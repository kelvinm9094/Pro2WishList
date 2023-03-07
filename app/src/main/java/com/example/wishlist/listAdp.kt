package com.example.wishlist
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class listAdp(private val lists: MutableList<list>) : RecyclerView.Adapter<listAdp.vHold>() {

    class vHold(itemView: View) : RecyclerView.ViewHolder(itemView) {


        val itemEditText: TextView
        val urlEditText: TextView
        val priceEditText: TextView

        init {

            itemEditText = itemView.findViewById(R.id.Name)
            urlEditText=itemView.findViewById(R.id.Url)
            priceEditText=itemView.findViewById(R.id.Price)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): vHold {
        val context=parent.context
        val inflater= LayoutInflater.from(context)
        val contactView=inflater.inflate(R.layout.list_item, parent, false)

        return vHold(contactView)
    }

    override fun onBindViewHolder(holder: vHold, position: Int) {
        val list=lists[position]
        holder.itemEditText.text= list.item
        holder.urlEditText.text=list.url_type
        holder.priceEditText.text=list.price.toString()

    }

    override fun getItemCount(): Int {
        return lists.size
    }


}