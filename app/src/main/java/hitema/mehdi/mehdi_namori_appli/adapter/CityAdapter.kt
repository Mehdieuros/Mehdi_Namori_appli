package hitema.mehdi.mehdi_namori_appli.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import hitema.mehdi.mehdi_namori_appli.R
import hitema.mehdi.mehdi_namori_appli.model.City
import kotlinx.android.synthetic.main.item_city.view.*
import org.jetbrains.anko.toast

class CityAdapter(private val cities: ArrayList<City>) : RecyclerView.Adapter<CityAdapter.ViewHolder>(){

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): CityAdapter.ViewHolder {
        val v = LayoutInflater.from(p0.context).inflate(R.layout.item_city, p0, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: CityAdapter.ViewHolder, position: Int) {
        holder.bindItems(cities[position])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindItems(city: City){

            itemView.setOnClickListener {
                itemView.context.toast(city.name.toString())
            }

            itemView.textName.text = city.name
        }
    }

    override fun getItemCount(): Int {
        return cities.size
    }

}