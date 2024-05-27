package uz.akra.mymapweather.retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import uz.akra.mymapweather.models.LocWeather

interface APIService {

@GET("forecast")
fun getLocationWeather(@Query("latitude")latitude:Double, @Query("longitude")longitude:Double, @Query("daily")daily:String="apparent_temperature_max"): Call<LocWeather>




}