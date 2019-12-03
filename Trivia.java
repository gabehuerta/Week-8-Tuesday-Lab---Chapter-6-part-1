import java.util.Scanner;

public class Trivia {

   private String question;
   private String answer;

   public Trivia(String question, String answer) {

       super();
       this.question = question;
       this.answer = answer;
   }
   public String getQuestion() {
       return question;
   }
   public String getAnswer() {
       return answer;
   }
   public String toString() {
       return "Question: "+question+"\n"+
               "Answer: "+answer;
   }
   public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);

       String Q1 = "What is a dog? ";
       String ans1 = "Animal";

       String Q2 = "What is 1? ";
       String ans2 = "Number";
    
       System.out.println(Q1);
       String ans = keyboard.nextLine();

       Trivia t1 = new Trivia(Q1, ans);

       System.out.println(Q2);
       ans = keyboard.nextLine();

       keyboard.close();
       Trivia t2 = new Trivia(Q2, ans);

       if(t1.getAnswer().equalsIgnoreCase(ans1)) {
           System.out.println("Answer 1 is correct");
       }else{
           System.out.println("Answer for Q1 is incorrect. Correct answer is "+ans1);
       }

       if(t2.getAnswer().equalsIgnoreCase(ans2)) {
           System.out.println("Answer 2 is correct");
       }else{
           System.out.println("Answer for Q2 is incorrect. Correct answer is "+ans2);

       }

   }

}




