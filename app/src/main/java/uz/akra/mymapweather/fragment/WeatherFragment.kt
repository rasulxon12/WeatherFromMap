package uz.akra.mymapweather.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import uz.akra.mymapweather.databinding.FragmentWeatherBinding

private const val TAG = "WeatherFragment"
class WeatherFragment : Fragment() {
    private val binding by lazy { FragmentWeatherBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

//        APIClient.apiService.getLocationWeather()
//            .enqueue(object  :Callback<List<Location>>{
//                override fun onResponse(
//                    call: Call<List<Location>>,
//                    response: Response<List<Location>>
//                ) {
//                    if (response.isSuccessful){
//                        Log.d(TAG, "onResponse: ${response.body()}")
//                        val list = response.body()
//                        list?.forEach {
//                            Log.d(TAG, "onResponse: $it")
//                        }
//                        binding.tvCity.text
//                    }
//                }
//
//                override fun onFailure(call: Call<List<Location>>, t: Throwable) {
//                    Toast.makeText(context, "Xatolikka tushdi", Toast.LENGTH_SHORT).show()
//                }
//            })
//
//



        return binding.root
    }
}