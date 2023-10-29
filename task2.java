import java.util.*;
class task2{
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        Random rd=new Random();
        System.out.println("\t\tWELCOME TO THE NUMBER GUESSING GAME!");
        System.out.println("Select Difficulty level\n1.Easy\n2.Medium\n3.Hard");
        int choice=ss.nextInt();
        int score=0;
        switch (choice) {
            case 1 -> score=easy();
             
            case 2 -> score=medium(0);
            case 3 -> score=hard(0);
            default -> System.out.println("Enter the correct choice");
        }
        System.out.println("Your Score : "+score);

    }
    public static int easy(){
        Scanner ss=new Scanner(System.in);
        Random rd=new Random();
         int guess=rd.nextInt(20);
            int c=0;
            while(true){
            System.out.println("Guess a number between 1 to 20");
            int gsdnmbr=ss.nextInt();
            if(gsdnmbr==guess){
                System.out.println("Hurray! You Guessed it right in "+(c+1)+" attempt");
                if(c<=3){
                    System.out.println("You are promoted to next level!");
                    c=medium(c*10);
                    break;
                }
                else{
                return c*10;
                }
            }
            else if(gsdnmbr<guess){
                System.out.println("You number is smaller");
            }
            else{
                System.out.println("your number is larger than original number");
            }
            c++;
            if(c>=5){
                System.out.println("You are exceded number of Attempts,Try Again!");
                break;
            }
        }
            return c;
    }
    public static int medium(int score){
           Random rd=new Random();
           Scanner sp=new Scanner(System.in);
           int  org=rd.nextInt(50);
           int k = 0;
           while (true) { 
             System.out.println("Guess a number between 1 to 50");
               int gsdnmbr=sp.nextInt();
               if(org==gsdnmbr){
                 System.out.println("Hurray! You have guessed it Right in "+k+" Attempts");
                //  break;
                 if(k<=5){
                    System.out.println("You are promoted to next level!");
                    score=hard(score+k*20);
                    // return score;
                    // break;
                 }
                 else{
                    score=score+k*20;
                 }
                 break;
               }
               else if(org<gsdnmbr){
                System.out.println("your number is larger");
               }
               else{
                System.out.println("Your number is smaller");
               }
               k++;
           }
           return score;
        }
    public static int hard(int score){
           Random rd=new Random();
           Scanner sp=new Scanner(System.in);
           int  org=rd.nextInt(100);
           int k = 0;
            while (true) {
                 System.out.println("Guess a number between 1 to 100");
               int gsdnmbr=sp.nextInt();
               if(org==gsdnmbr){
                 System.out.println("Hurray! You have guessed it Right in "+k+" Attempts");
                 
                //  break;
                //  if(k<=10){
                    // score=hard(score);
                    // return score;
                    // break;
                //  }
                //  else{
                    score=score+k*50;
                //  }
                 break;
               }
               else if(org<gsdnmbr){
                System.out.println("your number is larger");
               }
               else{
                System.out.println("Your number is smaller");
               }
               k++;
           }
           return score;
    } 
}