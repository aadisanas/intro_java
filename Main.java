import java.util.Scanner;
class Main{
public static void main (String[] args) {
        
int[] numbers = new int[10];
for ( int i = 0; i<10; i++){
  numbers[i] = i+1;
}boolean issearch = false; 
Scanner s = new Scanner(System.in);
int search = s.nextInt();
for ( int i = 0; i<10; i++){
  if (numbers[i] == search){
    System.out.println("numberfoundat"+ i );
  issearch = true;
  
  }



}
if (issearch == false){
  System.out.println("searchnumbernonexistent");
  
}
}

}