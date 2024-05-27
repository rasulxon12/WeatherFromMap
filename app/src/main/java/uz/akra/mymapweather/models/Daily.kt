package uz.akra.mymapweather.models

data class Daily(
    val apparent_temperature_max: List<Double>,
    val time: List<String>
)