package pl.jakubokrasa.scientistlivedata

import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import pl.jakubokrasa.scientistlivedata.databinding.RvItemBinding
import java.util.*
import java.util.concurrent.ThreadLocalRandom

class RvAdapter() : RecyclerView.Adapter<RvAdapter.SciViewHolder>() {

    private var scientists = mutableListOf<Scientist>()


    fun setItems(scientists: List<Scientist>) {
        if (scientists.isNotEmpty()) this.scientists.clear()
        this.scientists.addAll(scientists)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvAdapter.SciViewHolder {
        val binding = RvItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return SciViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SciViewHolder, position: Int) {
        val route = scientists[position]
        holder.bind(route)
    }

    override fun getItemCount(): Int {
        return scientists.size
    }



    inner class SciViewHolder(private val binding: RvItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(scientist: Scientist) {
            with(binding) {
                tvName.text = scientist.name
            }
        }


    }

}