package com.github.iaroslavomelianenko.newsapp.data.api

import com.github.iaroslavomelianenko.newsapp.models.NewsResponse
import retrofit2.http.Query
import com.github.iaroslavomelianenko.newsapp.utils.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET

interface NewsService {

    @GET("/v2/everything")
    suspend fun getEverything(
        @Query("q") query: String,
        @Query("page") page: Int = 1,
        @Query("apiKey") apiKey: String = API_KEY
    ) : Response<NewsResponse>

    @GET("/v2/top-headlines")
    suspend fun getHeadlines(
        @Query("country") countryCode: String = "ru",
        @Query("page") page: Int = 1,
        @Query("apiKey") apiKey:String = API_KEY
    ) : Response<NewsResponse>
}