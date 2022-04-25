class Main {
  public static void main(String[] args) {
    int varOne = 50,varTwo = 25,varThree = 9;
    int smallest=0,highest=0,secondHighest=0;
    if((varOne > varTwo) && (varOne > varThree)){
      highest = varOne;
      if(varTwo > varThree){
        secondHighest = varTwo;
        smallest = varThree;
      }else{
        secondHighest = varThree;
        smallest = varTwo;
      }
    }else if((varTwo > varOne) && (varTwo > varThree)){
      highest = varTwo;
      if(varOne > varThree){
        secondHighest = varOne;
        smallest = varThree;
      }else{
        secondHighest = varThree;
        smallest = varOne;
      }
    }else{
      highest = varThree;
      if(varOne > varTwo){
        secondHighest = varOne;
        smallest = varTwo;
      }else{
        secondHighest = varTwo;
        smallest = varOne;
      }
    }
    
    System.out.println("Highest = "+highest);
    System.out.println("secondHighest = "+secondHighest);
    System.out.println("smallest = "+smallest);
  }
}