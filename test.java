import java.util.Scanner;

class Question{

    static Scanner reader;
    
    public static void main(String[] arg){
        reader = new Scanner(System.in);
        QuestionOne();
    }

    // static Scanner reader = new Scanner(System.in);
    // static Scanner reader;
    static char answerOne;
    static char answerTwo;
    static char answerThree;
    static int score;
    
    public static void QuestionOne(){
        score = 0;
        // char answerOne;
        // Scanner reader = new Scanner(System.in);
        System.out.println("Here is Level one question");
        System.out.println("Type 't' if you think it's true, type 'f' if you think it's false\n");

        System.out.println("QUESTION 1: -------------");
        System.out.print("-->");

        answerOne = reader.next().charAt(0);
        
        if (answerOne == 't') {
            score ++;
            QuestionTwo();
        } else {
            gameOver();
        }
    }   

    public static void QuestionTwo(){
        System.out.println("\nHere is Level two question");
        System.out.println("Type 't' if you think it's true, type 'f' if you think it's false\n");

        System.out.println("QUESTION 2: -------------");
        System.out.print("-->");

        answerTwo = reader.next().charAt(0);

        if (answerTwo == 'f') {
            score++;
            QuestionThree();
        } else {
            gameOver();
        }
    }

    public static void QuestionThree(){
        System.out.println("\nHere is Level three question");
        System.out.println("Type 't' if you think it's true, type 'f' if you think it's false\n");

        System.out.println("QUESTION 3: -------------");
        System.out.print("-->");

        answerThree = reader.next().charAt(0);

        if (answerThree == 't') {
            score ++;
            endOfGame();
        } else {
            gameOver();
        }
    }
    public static void gameOver(){
        System.out.println("You are wrong.");
        System.out.println("Your score was " + score);
        System.out.println("Thanks for playing");
    }

    public static void endOfGame(){
        System.out.println("Thank you for playing this game!");
        System.out.println("Your score was " + score);
        System.out.println("See you next time");
    }
}
