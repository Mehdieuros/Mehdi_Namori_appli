package hitema.mehdi.mehdi_namori_appli.fragment

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater

import android.view.View
import android.view.ViewGroup

import hitema.mehdi.mehdi_namori_appli.R
import hitema.mehdi.mehdi_namori_appli.adapter.CityAdapter
import hitema.mehdi.mehdi_namori_appli.model.City
import kotlinx.android.synthetic.main.fragment_city.*


/**
 * A simple [Fragment] subclass.
 */
class CityFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_city, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val users = ArrayList<City>()
        users.add(City("Paris"))
        users.add(City("Paris"))
        users.add(City("Paris"))
        users.add(City("Paris"))
        users.add(City("Paris"))
        users.add(City("Paris"))

        recyclerUser.layoutManager = LinearLayoutManager(context)
        val adapter = CityAdapter(users)
        recyclerUser.adapter = adapter

    }
}// Required empty public constructor
