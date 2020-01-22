import java.util.*;

public class TestReview {
  public static void main(String[] args)
  {
      
    //Scanner input = new Scanner(System.in);

        //Test for sentimentVal method

        /*System.out.println("How many words do you want to enter?");
        int numWords = input.nextInt();
        for (int i = 0; i < numWords; i++) {
            Review comment = new Review();

            System.out.println("Input a word:");
            String word = input.nextLine();
            //String word = "Lovely";
            
            System.out.println(comment.sentimentVal(word));
        }    
        */

        //Test for totalSentiment method
        /*Review value = new Review();
        System.out.println("Enter file name");
        System.out.println(value.totalSentiment(input.nextLine()));
        */

        //Test for fakeReview method
    System.out.println(Review.sentimentVal("terrible"));
    System.out.println(Review.sentimentVal("vile"));
    System.out.println(Review.sentimentVal("cluttered"));
    System.out.println(Review.sentimentVal("tragic"));
    System.out.println(Review.sentimentVal("traumatic"));
    System.out.println(Review.sentimentVal("aging"));
    System.out.println(Review.sentimentVal("irritating"));
    System.out.println(Review.sentimentVal("murderous"));
    System.out.println(Review.sentimentVal("crushing"));
    System.out.println(Review.sentimentVal("puzzled"));
    System.out.println(Review.sentimentVal("jagged"));
    System.out.println(Review.sentimentVal("limited"));
    System.out.println(Review.sentimentVal("dirty"));
    System.out.println(Review.sentimentVal("scrawny"));
    System.out.println(Review.sentimentVal("inappropriate"));
    System.out.println(Review.sentimentVal("hysterical"));
    System.out.println(Review.sentimentVal("rotting"));
    System.out.println(Review.sentimentVal("distant"));
    System.out.println(Review.sentimentVal("eccentric"));
    System.out.println(Review.sentimentVal("obssessed"));
    System.out.println(Review.sentimentVal("ugly"));
    System.out.println(Review.sentimentVal("smelly"));
    System.out.println(Review.fakeReviewStronger("SimpleReview.txt"));
  }
}