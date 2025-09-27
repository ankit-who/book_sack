
import java.util.*;

public class book {


      static int  books ;
      ArrayList<String> TotalBooks = new ArrayList<>();
      ArrayList<String> Borrower = new ArrayList<>();

      Scanner sc = new Scanner(System.in);        



  void SHOW_BOOKS()
 {
       System.out.println("Total no. of books in the collections:" + book.books + 
       TotalBooks);
        
 }

  void Addbook()
 {
      System.out.println("Enter book you want to add:");
      String name = sc.nextLine();
        
      TotalBooks.add(name);
      book.books++;
      System.out.println("New book Added");

 }

 void borrow()
 {
      System.out.println("Enter you name :");
      String name = sc.nextLine();
      
      System.out.println(" enter book name you want to borrow ");
      String Bname = sc.nextLine();
      if (TotalBooks.contains(Bname))
      {
            TotalBooks.remove(Bname);
            book.books--;
            Borrower.add(name);

      } 
      else
      {
            System.out.println("Sorry! BOOK is alraeady taken");
      }
              
      



 }
 void remove_entry()
 {
      System.out.println("Enter you name :");
      String name = sc.nextLine();
      System.out.println(" enter book name you want to borrowed ");
      String Bname = sc.nextLine();
      if (Borrower.contains(name))
      {
            Borrower.remove(name);
            book.books++;
            TotalBooks.add(Bname);

      } 
      else
      {
            System.out.println("Sorry! BOOK is alraeady taken");
      }
           


 }





    
    
}
