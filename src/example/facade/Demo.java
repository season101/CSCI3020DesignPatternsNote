package src.example.facade;

public class Demo {
  public static void main(String[] args) {
    new TweetsService().getTweets("appkey", "secret");
   
    /** These codes is now handled by Facade TweetsService
    var oauth = new OAuth();
    var requestToken = oauth.requestToken("appKey", "secret");
    var accessToken = oauth.getAccessToken(requestToken);

    var twitterClient = new TwitterClient();
    var tweets = twitterClient.getRecentTweets(accessToken);
  */

  }
}
