package sample.samplekotlinandroidextensions

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.view_sample_recycler_item.view.*

class SampleRecyclerViewAdapter(private val itemDataList: List<String>) :
        RecyclerView.Adapter<SampleRecyclerViewAdapter.ViewHolder>() {
    override fun getItemCount(): Int = itemDataList.count()

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder? {
        parent ?: return null
        return ViewHolder(LayoutInflater.from(parent.context).inflate(
                R.layout.view_sample_recycler_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.itemView?.sampleRecyclerItemTextView?.text = itemDataList[position]
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            itemView.setOnClickListener {
                Toast.makeText(
                        itemView.context,
                        itemView.sampleRecyclerItemTextView.text,
                        Toast.LENGTH_SHORT).show()
            }
        }
    }
}