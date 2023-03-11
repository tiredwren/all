package com.example.search

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rv_item.view.*

// on below line we are creating a course rv adapter class.
class ItemsAdapter(
    // on below line we are passing variables as course list and context
    private var itemList: ArrayList<ItemsModal>, private val onItemClickListener: ClickListener
) : RecyclerView.Adapter<ItemsAdapter.itemViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): itemViewHolder {
        // this method is use to inflate the layout file
        // which we have created for our recycler view.
        // on below line we are inflating our layout file.
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.rv_item,
            parent, false
        )

        // at last we are returning our view holder
        // class with our item View File.
        return itemViewHolder(itemView)
    }

    // method for filtering our recyclerview items.
    fun filterList(filterlist: ArrayList<ItemsModal>) {
        // below line is to add our filtered
        // list in our course array list.
        itemList = filterlist
        // below line is to notify our adapter
        // as change in recycler view data.
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: ItemsAdapter.itemViewHolder, position: Int) {

        val item = itemList[position]

        // on below line we are setting data to our text view and our image view.
        holder.itemView.itemName.text = item.name
        holder.itemView.itemDesc.text = item.short_desc
        holder.itemImage.setImageResource(item.image)

        holder.itemView.setOnClickListener {
            onItemClickListener.onItemClicked(position)
        }

    }

    override fun getItemCount(): Int {
        // on below line we are returning
        // our size of our list
        return itemList.size
    }

    class itemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // on below line we are initializing our course name text view and our image view.
        val itemName: TextView = itemView.findViewById(R.id.itemName)
        val itemDesc: TextView = itemView.findViewById(R.id.itemDesc)
        val itemImage: ImageView = itemView.findViewById(R.id.imageView)

    }
}
