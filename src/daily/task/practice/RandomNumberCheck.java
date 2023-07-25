package daily.task.practice;

import java.util.Random;
import java.util.Scanner;
public class RandomNumberCheck {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int myNum = (int) (Math.random() *100);
        int UserNumber=0;
        
        do {
            System.out.println("Guess my number is: ");
            UserNumber = SC.nextInt();
            if(UserNumber==myNum) {
                System.out.println("Yes, your guess is correct");
                break;
            }
                else if(UserNumber > myNum) {
                    
                        System.out.println("Your number is too large");
                }
            
                else {
                    System.out.println("Your Number is too ssmall");
                }
        }
    
    while (UserNumber >= 0);
                System.out.println("My number was");
                System.out.println(myNum);
            
        }
    }