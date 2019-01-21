
public class twitterReader {
	
	String msgstored;
	
	public twitterReader(String msg) {
		msgstored = msg;
	}
	
	public String getmsg() {
		return msgstored;
	}
	
	public static String getURL(String testmsg) {
		// regex expression for links found at https://stackoverflow.com/questions/163360/regular-expression-to-match-urls-in-java
		String regex = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";

		//splits message at whitespaces (space character " "), turning it into an array
		String[] message = testmsg.split("\\s");

		//iterates through array of strings after they are split at whitespace characters (spacebar)
		for(int i=0;i<message.length;i++){
			//if there is a period at the end of the string, it gets removed
			if(message[i].charAt(message[i].length()-1) == '.'){
				message[i] = message[i].substring(0,message[i].length()-1);
			}
			// if the word matches our regex to check for links(see above), return it
			if(message[i].matches(regex)){
				return message[i];
			}
		}
		// otherwise return null to indicate no links were found
		return null;
	}
	
	public static String getTopic(String testmsg) {
		return testmsg;
	}
	
	public static String getMention(String testmsg) {
		return testmsg;
	}
}

