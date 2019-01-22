

class twitterReadertests {

	public static void main(String [] args){
		twitterReadertests test = new twitterReadertests();
		System.out.println(test.testURL());
		System.out.println(test.testTopic());
		System.out.println(test.testMention());
	}


	private boolean testURL() {
		String testmsg = "@franky goes to #hollywood. See http://cnn.com.";
		twitterReader test = new twitterReader(testmsg);
		return("http://cnn.com".equals(twitterReader.getURL(testmsg)));
	}


	boolean testTopic() {
		String testmsg = "@franky goes to #hollywood. See http://cnn.com.";
		twitterReader test = new twitterReader(testmsg);
		return("#hollywood".equals(twitterReader.getTopic(testmsg)));
	}
	

	boolean testMention() {
		String testmsg = "@franky goes to #hollywood. See http://cnn.com.";
		twitterReader test = new twitterReader(testmsg);
		return("@franky".equals(twitterReader.getMention(testmsg)));
	}
}
