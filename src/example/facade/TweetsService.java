package src.example.facade;

public class TweetsService {
    public void getTweets(String appkey, String secret){
        var oauth = new OAuth();
        var requestToken = oauth.requestToken(appkey, secret);
        var accessToken = oauth.getAccessToken(requestToken);
        var twitterClient = new TwitterClient();
        var tweets = twitterClient.getRecentTweets(accessToken);
        //System.out.println(requestToken+accessToken+tweets);
    }
}
