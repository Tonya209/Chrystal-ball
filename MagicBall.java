
package magicBall;

import java.util.*;

public class MagicBall {

	public static void main(String[] args) {
	
            byte number = 0;
         
            Scanner sc = new Scanner (System.in);
            
                    try{
                System.out.print("Write a number from 1 to 7 here: ");
                 
                        number = sc.nextByte();
                    }
                    catch(InputMismatchException e){
                        System.out.println("Please, write a number from 1 to 7.");
                    }
                  
                  
                    switch(number) {
                        
                        case 1: System.out.println("You will be very lucky today!");
                        break;
                        case 2: System.out.println("You should spend this day with your friends.");
                        break;
                        case 3: System.out.println("It´s an excellent day to go shopping.");
                        break;
                        case 4: System.out.println("Why not spend this day with your family?");
                        break;
                        case 5: System.out.println("You will be the star of the office today.");
                        break;
                        case 6: System.out.println("You´re feeling healthy and energetic today.");
                        break;
                        case 7: System.out.println("It´s an excellent day for taking an exam. You will pass.");
                        break;
                        
                    }
                    sc.close();
                }   
}  
