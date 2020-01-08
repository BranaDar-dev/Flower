package com.example.branaflower.model

import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET

data class Flower (
    val name: String,
    val best_season: String,
    val image_link: String

)
// Data Model for the Response returned from the TMDB Api
data class FlowerResponse(
    val results: List<Flower>
)
//A retrofit Network Interface for the Api
interface Api{
    @GET("/api/demo/flowers")
    fun getFlowers(): Deferred<Response<FlowerResponse>>
}


