package com.nyp.sit.movierater

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.RatingBar
import android.widget.TextView
import com.nyp.sit.movierater.data.MovieRating
import kotlinx.android.synthetic.main.activity_movie_detail.*

class MovieDetail : AppCompatActivity() {

    var mrApp :MovieRaterApplication ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        mrApp = MovieRaterApplication.getInstance()


    }

}
