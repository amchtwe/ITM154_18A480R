package com.nyp.sit.movierater

import android.app.Application
import com.nyp.sit.movierater.data.MovieRating

class MovieRaterApplication : Application() {

    private var movieRatingArray: MutableList<MovieRating> = mutableListOf()



    init {

        movieRatingInstance = this
    }


    companion object {
        private var movieRatingInstance: MovieRaterApplication?=null

        fun getInstance(): MovieRaterApplication? {

            return movieRatingInstance

        }
    }

    fun getMovieRating(index: Int): MovieRating? {


        return movieRatingArray.get(index)

    }

    fun getMovieRatingArray(): MutableList<MovieRating>? {

        return movieRatingArray

    }

    fun addMovieRating(mr: MovieRating):Int {


        movieRatingArray.add(mr)

        return movieRatingArray.indexOf(mr)


    }

    fun updateMovieRating(index: Int, mr: MovieRating) {

        mr.ratingsList = movieRatingArray.get(index).ratingsList
        movieRatingArray.set(index, mr)

    }


}