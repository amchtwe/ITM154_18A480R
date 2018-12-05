package com.nyp.sit.movierater

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class RatingActivity : AppCompatActivity() {

    var mrApp: MovieRaterApplication? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating)

        mrApp = MovieRaterApplication.getInstance()

    }

}
