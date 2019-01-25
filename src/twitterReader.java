public class twitterReader {
	
	public twitterReader() {
	}
	
	public static String[] getURLs(String testmsg) {
		// regex expression for links found at https://stackoverflow.com/questions/163360/regular-expression-to-match-urls-in-java
		String regex = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";

		//splits message at whitespaces (space character " "), turning it into an array
		String[] message = testmsg.split("\\s");

		String[] URLList = new String[20];

		//URL counter
		int URLCount = 0;

		//max number of characters in the twitter message declared
		int maxLength = 280;
		
		//if message exceeds 280 characters, then return null...?
		if(message.length > maxLength){
			System.out.println("Error: character limit exceeded over 280 characters.");
		}

		//iterates through array of strings after they are split at whitespace characters (spacebar)
		for(int i=0;i<message.length;i++){
			
			//if there is a period at the end of the string, it gets removed
			if(message[i].charAt(message[i].length()-1) == '.'){
				message[i] = message[i].substring(0,message[i].length()-1);
			}
			// if the word matches our regex to check for links(see above), return it
			if(message[i].matches(regex)){
				URLList[URLCount] = message[i];
				URLCount++;
			}
		}
		System.out.println(URLCount + "URLs found");
		// otherwise return null to indicate no links were found
		return URLList;
	}
	
	public static String getTopic(String testmsg) {
		// regex expression for hashtags found at https://www.regextester.com/96916
		String regex = "(?:\\s|^)#[A-Za-z0-9\\-\\.\\_]+(?:\\s|$)";

		//splits message at whitespaces (space character " "), turning it into an array
		String[] message = testmsg.split("\\s");

		//URL counter
		int URLcount = 0;

		//max number of characters in the twitter message declared
		int maxLength = 280;

		//if message exceeds 280 characters, then return null...?
		if(message.length > maxLength){
			System.out.println("Error: character limit exceeded over 280 characters.");
		}

		//iterates through array of strings after they are split at whitespace characters (spacebar)
		for(int i=0;i<message.length;i++){
			//if there is a period at the end of the string, it gets removed
			if(message[i].charAt(message[i].length()-1) == '.'){
				message[i] = message[i].substring(0,message[i].length()-1);
			}
			// if the word matches our regex to check for hashtags(see above), return it
			if(message[i].matches(regex)){
				return message[i];
			}
		}
		// otherwise return null to indicate no links were found
		return null;
	}
	
	public static String getMention(String testmsg) {
		// regex expression for mentions found at https://www.regextester.com/96916
		String regex = "@[A-Za-z0-9_-]*";

		//splits message at whitespaces (space character " "), turning it into an array
		String[] message = testmsg.split("\\s");

		//URL counter
		int URLcount = 0;

		//max number of characters in the twitter message declared
		int maxLength = 280;

		//if message exceeds 280 characters, then return null...?
		if(message.length > maxLength){
			System.out.println("Error: character limit exceeded over 280 characters.");
		}

		//iterates through array of strings after they are split at whitespace characters (spacebar)
		for(int i=0;i<message.length;i++){
			//if there is a period at the end of the string, it gets removed
			if(message[i].charAt(message[i].length()-1) == '.'){
				message[i] = message[i].substring(0,message[i].length()-1);
			}
			// if the word matches our regex to check for mentions(see above), return it
			if(message[i].matches(regex)){
				return message[i];
			}
		}
		// otherwise return null to indicate no links were found
		return null;
	}

	public static String getRetweet(String testmsg) {
		//regex expression for retweets found at https://www.regextester.com/93445
		String regex = "^(RT|rt)( @\\w*)?[: ]";
		//"retweeted_status"

		//splits message at whitespaces (space character " "), turning it into an array
		String[] message = testmsg.split("\\s");

		//URL counter
		int URLcount = 0;

		//max number of characters in the twitter message declared
		int maxLength = 280;

		//if message exceeds 280 characters, then return null...?
		if(message.length > maxLength){
			System.out.println("Error: character limit exceeded over 280 characters.");
		}

		//iterates through array of strings after they are split at whitespace characters (spacebar)
		for(int i = 0; i < message.length; i++) {
			//if there is a period at the end of the string, it gets removed
			if(message[i].charAt(message[i].length() - 1) == '.') {
				message[i] = message[i].substring(0, message[i].length() - 1);
			}
			//if the word matches our regex to check for mentions (see above), return it
			if(message[i].matches(regex)) {
				return message[i];
			}
		}
		//otherwise return null to indicate no links were found
		return null;
	}
}

