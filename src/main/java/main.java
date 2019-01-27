import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Put in a tweet and the mentions, topics, and URLs will be extrapolated");
        String message = scan.nextLine();

        String [] mentions = twitterReader.getMentions(message);

        for(int i = 0; i<mentions.length; i++){
            if(!(mentions[i] == null)){
                System.out.println(mentions[i]);
            }else{
                break;
            }
        }

        String [] topics =twitterReader.getTopics(message);

        for(int i = 0; i<topics.length; i++){
            if(!(topics[i] == null)){
                System.out.println(topics[i]);
            }else{
                break;
            }
        }

        String [] URLs =twitterReader.getURLs(message);

        for(int i = 0; i<URLs.length; i++){
            if(!(URLs[i] == null)){
                System.out.println(URLs[i]);
            }else{
                break;
            }
        }
    }
}
