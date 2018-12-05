package com.nyp.sit.movierater

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.nyp.sit.movierater.data.MovieRating

class EditMovieActivity : AppCompatActivity() {

    var mr: MovieRating? = null
    var pos = 0

    var mrApp: MovieRaterApplication? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_movie)

        mrApp = MovieRaterApplication.getInstance()

    }

}
