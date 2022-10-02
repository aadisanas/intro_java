public class StudentDetails{//Super Class

  double studentGPA = 4.0;
  String studentExictement = "High";
  String studentName = "Bob";
 public void fullTimeStudent(){
 
  System.out.println(studentGPA +""+ studentExictement+""+ studentName);

}
  public void printName(){ 
    System.out.println(studentName);
  }
}
class StudentDetailsPrt extends StudentDetails{
  double studentGPA2 =3.8;
  String studentName = "Joe";
  public void partTimeStudent(){
    System.out.println(studentGPA2);
  }
  public void printName(){ // this print name method is overiding the line 11 printname
    System.out.println("The Student Name is" + studentName);


  

  
}
}
class SpOnlineStudent extends StudentDetailsPrt{// Multilevel inheritance
  double studentGPA3 = 3.7;
  public void onlineStudent(){
    System.out.println(studentGPA3);
  }
}
class SpOnlineStudent2 extends StudentDetails{ //Hieracrhel Inheritance
  String studentName = "Larry";
  public void onlineStudent1(){
    System.out.println("The Special Online Students name is"+ studentName);
  }
  
  
}

