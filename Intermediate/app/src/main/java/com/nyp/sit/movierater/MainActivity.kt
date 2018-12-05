package com.nyp.sit.movierater

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    var mrApp: MovieRaterApplication? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mrApp = MovieRaterApplication.getInstance()


        var text : TextView = this.findViewById(R.id.noMovieText)

        registerForContextMenu(text)

    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)

        menuInflater.inflate(R.menu.addmoviemenu, menu)

    }

    override fun onContextItemSelected(item: MenuItem?): Boolean {

        //Toast.makeText(this, "Add Movie", Toast.LENGTH_SHORT).show()

        var i = Intent(this, AddMovieActivity::class.java)
        //i.putExtra("loginid", loginid.text.toString())
        startActivity(i)

        return true
        //return super.onContextItemSelected(item)
    }


}
