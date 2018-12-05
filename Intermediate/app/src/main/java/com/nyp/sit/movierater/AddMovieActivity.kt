package com.nyp.sit.movierater

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.InputType
import android.view.View
import android.widget.RadioGroup
import com.nyp.sit.movierater.data.MovieRating
import kotlinx.android.synthetic.main.activity_add_movie.*
import android.widget.Toast
import android.content.Intent


class AddMovieActivity : AppCompatActivity() {


    var mrApp: MovieRaterApplication? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_movie)


        mrApp = MovieRaterApplication.getInstance()

        chkSuitable.setOnClickListener{

            if(chkSuitable.isChecked == true){
                this.chkLayout.visibility = View.VISIBLE
            } else {
                this.chkLayout.visibility = View.INVISIBLE
            }

        }

        btnSubmit.setOnClickListener{

            var language = ""

/*
val radio: RadioGroup = findViewById (rgLanguage.id)
when (radio) {
rbnChn -> {
language = "Chn"
}
rbnEng -> {
language = "Eng"
}
rbnMly -> {
language = "Mly"
}
rbnTml -> {
language = "Tml"
}
}
*/

            if(rbnChn.isChecked){
                language = "Chinese"
            } else if(rbnEng.isChecked){
                language = "English"
            } else if(rbnMly.isChecked){
                language = "Malay"
            } else { language = "Tamil"}

            var movie = MovieRating(
                    movieName.text.toString()
                    , movieDesc.text.toString()
                    , language
                    , movieDate.text.toString()
                    , chkViolence.isChecked
                    , chkLanguageUsed.isChecked
            )


            Toast.makeText(this, "Title : ${movie.name}\n" +
                    "Overview : ${movie.description}\n" +
                    "Release Date : ${movie.releasedate}\n" +
                    "Language : ${movie.langauge}\n" +
                    "Suitable for all ages ${movie.langaugeused || movie.violent}\n" +
                    "Reason : \n" +
                    "${if (movie.langaugeused) "Language" else "" }\n" +
                    "${if (movie.violent) "Violence" else ""}", Toast.LENGTH_SHORT).show()


            //Toast.makeText(this, movie.toString(), Toast.LENGTH_SHORT).show()

            //var i = Intent(this, MovieDetail::class.java)
//            //i.putExtra("movie", loginid.text.toString())
            //i.putex
            //startActivity(i)

        }

    }

}
