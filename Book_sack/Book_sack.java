
import java.util.*;

class Book_sack{
    public static void main(String[] args) {
        
        book book1  = new book();
       
        Scanner sc = new Scanner(System.in);

        
       

        int choice;

        //get choice from user 
        do
        {
                System.out.println("------WeLLCOME TO MY PERSONAL COLLECTION OF BOOKS------");
                System.out.println(" ");
                System.out.println(" 1 ->  Show Book Collection:");
                System.out.println(" 2 -> Add book to collection:");
                System.out.println(" 3 -> Add Borrow Entry :");
                System.out.println(" 4 -> Remove Borrow Entry : ");    
                System.out.println(" 5 -> exit:");

                System.out.println(" ");

                System.out.println("Enter your choice :");
                choice = sc.nextInt();

                switch (choice)
                {

                    case 1:
                        book1.SHOW_BOOKS();  

                    break;

            

                    case 2:
                        
                        book1.Addbook( );
                        
                    break;

                    case 3:
                    
                        book1.borrow();
                        
                    break;

                    case 4:
                    
                        book1.remove_entry();
                    break;


                    case 5:
                        System.out.println("thankyou for using !");
                    break;
                
                    default:
                        System.out.println("Invalid choice");
                    break;
                }
        }while (choice != 5); 

    }
}