package com.example.moviesapp.models


import androidx.annotation.Keep

@Keep
data class MovieListResponse(
    val page: Int,
    val results: List<MovieListResult>,
    val total_pages: Int,
    val total_results: Int
)