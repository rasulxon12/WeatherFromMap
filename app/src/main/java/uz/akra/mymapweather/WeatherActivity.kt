package uz.akra.mymapweather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Response
import uz.akra.mymapweather.databinding.ActivityWeatherBinding
import uz.akra.mymapweather.models.LocWeather
import uz.akra.mymapweather.retrofit.APIClient
import javax.security.auth.callback.Callback

private const val TAG = "WeatherActivity"

class WeatherActivity : AppCompatActivity() {
    private val binding by lazy { ActivityWeatherBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        APIClient.apiService.getLocationWeather(41.29183255045775, 69.24212173597422)
            .enqueue(object : retrofit2.Callback<LocWeather> {
                override fun onResponse(call: Call<LocWeather>, response: Response<LocWeather>) {
                    if (response.isSuccessful) {
                        Log.d(TAG, "onResponse: ${response.body()}")
                        val rb = response.body()
                        binding.apply {
                            val list = rb?.daily?.time!!
                            dateWeekly1.text = list[0]
                            dateWeekly2.text = list[1]
                            dateWeekly3.text = list[2]
                            dateWeekly4.text = list[3]
                            dateWeekly5.text = list[4]
                            dateWeekly6.text = list[5]
                            dateWeekly7.text = list[6]

                            val list2 = rb?.daily?.apparent_temperature_max!!
                            maxWeekly1.text = list2[0].toString()
                            maxWeekly2.text = list2[1].toString()
                            maxWeekly3.text = list2[2].toString()
                            maxWeekly4.text = list2[3].toString()
                            maxWeekly5.text = list2[4].toString()
                            maxWeekly6.text = list2[5].toString()
                            maxWeekly7.text = list2[6].toString()


                        }
                    }
                    Log.d(TAG, "onResponse: $response")

                }

                override fun onFailure(call: Call<LocWeather>, t: Throwable) {

                    Log.e(TAG, "onFailure: Xatolikka tushdi")
                }
            })

    }
}