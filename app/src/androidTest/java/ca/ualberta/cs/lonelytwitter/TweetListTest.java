package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;


/**
 * Created by Max on 2017-10-13.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }
    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet myTweet = new NormalTweet("my tweet");
        tweets.addTweet(myTweet);
        assertTrue(tweets.hasTweet(myTweet));
    }

    public void testGetTweets(){
        TweetList tweets = new TweetList();
        NormalTweet myTweet1 = new NormalTweet("tweet1");
        NormalTweet myTweet2 = new NormalTweet("tweet2");
        tweets.addTweet(myTweet1);
        tweets.addTweet(myTweet2);
        tweets.getTweets();
        assertTrue(tweets.getTweet(1).getDate().compareTo(tweets.getTweet(0).getDate())==0);

    }
    public void testHasTweet(){
        TweetList tweets = new TweetList();
        Tweet myTweet = new NormalTweet("my tweet");
        assertFalse(tweets.hasTweet(myTweet));
        tweets.addTweet(myTweet);
        assertTrue(tweets.hasTweet(myTweet));
    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        Tweet myTweet = new NormalTweet("my tweet");
        tweets.addTweet(myTweet);
        tweets.deleteTweet(myTweet);
        assertFalse(tweets.hasTweet(myTweet));
    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        NormalTweet myTweet = new NormalTweet("my tweet");
        tweets.addTweet(myTweet);
        Tweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getMessage(),myTweet.getMessage());
        assertEquals(returnedTweet.getDate(),myTweet.getDate());
    }



}
