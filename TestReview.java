import java.util.*;

public class TestReview {
  public static void main(String[] args)
  {
      
    Scanner input = new Scanner(System.in);
        /*System.out.println("How many words do you want to enter?");
        int numWords = input.nextInt();
        for (int i = 0; i < numWords; i++) {
            Review comment = new Review();

            System.out.println("Input a word:");
            String word = input.nextLine();
            //String word = "Lovely";
            
            System.out.println(comment.sentimentVal(word));
        }    */
        Review value = new Review();
        System.out.println("Enter file name");
        System.out.println(value.totalSentiment(input.nextLine()));
        System.out.println("Enter file name");
        System.out.println(Review.starRating(input.nextLine()));
  }
}