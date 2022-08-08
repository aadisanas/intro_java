class Student{
int classId;
String name;
  //construtor
Student(){
    System.out.println("constructor");
    classId=111;
    name= "bob";
  }

  Student(int a,String b)
  {
    //second constructor
    System.out.println("second constructor");
    classId=a;
    name= b;
  }
  
  Student(int a)
  {
    System.out.println(" third constructor");
classId=a;  
  }

  public void studentdata()
  {
  
 System.out.println(classId);
     System.out.println(this.name);
    
  }
public void studentdata(int a, String b)

  {
   
 System.out.println(classId);
     System.out.println(this.name);
 
  }
  
  
}

  }
}