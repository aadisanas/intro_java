import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner s= new Scanner(System.in);
    String firstname = s.next();
    String lastname = s.next();
    String emailid = firstname + "." + lastname + "123" + "@gmail.com";
    String emailid2 = firstname.substring(0,3) + "." + lastname.substring(lastname.length()-3) + "123@gmail.com" ;
    System.out.println(emailid);
    System.out.print(emailid2);
    
  }
}
