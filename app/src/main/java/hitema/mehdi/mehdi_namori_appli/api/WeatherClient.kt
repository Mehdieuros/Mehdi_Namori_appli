package hitema.mehdi.mehdi_namori_appli.api

/**
 * Created by Mehdi on 11/01/2019.
 */

import hitema.mehdi.mehdi_namori_appli.model.City
import retrofit2.Call
import retrofit2.http.GET

interface StackInterface {

    @GET("")
    fun getWeather(): Call<City>

}