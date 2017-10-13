package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Max on 2017-10-13.
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void addTweet(Tweet tweet){
        if(tweets.contains(tweet)){
            throw new IllegalArgumentException();
        }
        else {
            tweets.add(tweet);
        }

    }
    // taken from stack overflow https://stackoverflow.com/questions/5927109/sort-objects-in-arraylist-by-date
    public void getTweets(){
        Collections.sort(tweets, new Comparator<Tweet>() {
            public int compare(Tweet t1, Tweet t2) {
                return (t1.getDate().compareTo(t2.getDate()));
            }
        });

    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);

    }
    public int getCount(){
        return tweets.size();
    }

    public void deleteTweet(Tweet tweet){

        tweets.remove(tweet);

    }

    public Tweet  getTweet(int index){
        return tweets.get(index);
    }


}