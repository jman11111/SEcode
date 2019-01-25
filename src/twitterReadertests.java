

class twitterReadertests {

	public static void main(String [] args){
		twitterReadertests test = new twitterReadertests();
		System.out.println(test.testURLs());
		System.out.println(test.testTopic());
		System.out.println(test.testMention());
		System.out.println(test.testRetweet());
	}


	private boolean testURLs() {
		String testmsg = "@franky goes to #hollywood. See http://cnn.com and http://abc.com";
		System.out.println(twitterReader.getURLs(testmsg)[0] + " " + twitterReader.getURLs(testmsg)[1]);
		return(twitterReader.getURLs(testmsg)[0].equals("http://cnn.com")&&twitterReader.getURLs(testmsg)[1].equals("http://abc.com"));
	}

	boolean testTopic() {
		String testmsg = "@franky goes to #hollywood. See http://cnn.com.";
		return("#hollywood".equals(twitterReader.getTopic(testmsg)));
	}
	

	boolean testMention() {
		String testmsg = "@franky goes to #hollywood. See http://cnn.com.";
		return("@franky".equals(twitterReader.getMention(testmsg)));
	}


	boolean testRetweet() {
		String testmsg = "RT @franky: cool story bro!";
		System.out.println(twitterReader.getRetweet(testmsg));
		return("RT @franky:".equals(twitterReader.getRetweet(testmsg)));
		//retweeted_status
		//String testmsg = "retweeted_status @franky: cool story bro!"'
		//return("retweeted_status".equals(twitterReader.getRetweet(testmsg)));

	}
}
