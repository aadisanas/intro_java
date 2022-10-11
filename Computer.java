interface Computer{
   void camera();
   void keyboard();
  }

class Dell implements Computer {
 void camera(){
  System.out.println("Camera");

}
 void keyboard(){
  System.out.println("keyboard");
  
} 
  
}