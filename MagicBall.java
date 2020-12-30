
    import java.util.*;

public class MagicBall {
	
	static int number = 0;
	 
	// a method that receives a number from the user and checks that it´s a number (not letters)
	public static int getNumber() {
		
	Scanner sc = new Scanner (System.in);
	
        while(true){
        System.out.print("Write a number from 1 to 7 here: ");
                 
        try{
            number = sc.nextInt();
            return number;
        }
          catch(InputMismatchException ex){
              System.out.println("Wrong format. Introduce a number from 1 to 7.");
              sc.nextLine();
        }
      }
    }   
        
	public static void main(String[] args) {
	
           // recieve a number from the user - at this point we can be sure that it is a number
           getNumber();
           
           //check that the introduced number is between 1 and 7. If not - ask to intoduce he number again
           do{
           if(number < 0 || number > 7){
               System.out.println("Choose a number from 1 to 7!");
               getNumber();
           }
           } while (number <0|| number >7);
           
           
          
           //now choose a prediction depending on the introduced number
                    
           System.out.println("The magic ball says: ");
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
                        case 7: System.out.println("It´s an excellent day for taking an exam.");
                        break;
                        
                    }
                  
        }
}
