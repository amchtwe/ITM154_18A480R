package com.nyp.sit.movierater.data

import android.database.Cursor

class MovieRating {

    var name:String
    var description:String
    var langauge: String
    var releasedate: String
    var violent: Boolean
    var langaugeused: Boolean
    var ratingsList : Ratings?= null
    /**
     * Create a new Movie from discrete values
     */
    constructor(name: String, description: String, langauge: String, releasedate: String, violent: Boolean, langaugeused: Boolean) {
        this.name = name
        this.description = description
        this.langauge = langauge
        this.releasedate = releasedate
        this.violent = violent
        this.langaugeused=langaugeused

    }

    fun addRatings(comments: String, ratings: Float){

        ratingsList = Ratings(comments, ratings)


    }

    fun getRatingsComments():String?{

        return ratingsList?.comments


    }


    fun getRatingsRatings():Float?{

        return ratingsList?.rating


    }
    class Ratings{

        var comments:String
        var rating:Float



        constructor(comments: String, rating: Float)
        {
            this.comments = comments
            this.rating = rating


        }

        override fun toString(): String {
            return "Ratings(comments='$comments', rating=$rating')"
        }


    }

    override fun toString(): String {
        return "MovieRating(name='$name',\n" +
                "description='$description',\n" +
                "langauge=$langauge,\n" +
                "releasedate='$releasedate',\n" +
                "violent=$violent,\n" +
                "langaugeused=$langaugeused,\n" +
                "ratings=$ratingsList)"
    }

}
