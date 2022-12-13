import java.util.Scanner;

class BinarySearch {
  public static void main(String args[]){
    int arr[]={2,5,10,21,32,45,58,70};
    System.out.println("Binary Search");
    for(int i=0; i<arr.length; i++){
      System.out.println(arr[i]);
    }
       System.out.println("Enter the search element");
    Scanner s=new Scanner(System.in );
   int search= s.nextInt();
    binarySearch(arr,0,arr.length-1, search);
  }

  public static void binarySearch(int a[], int i, int j, int value) {
    if (j >= i) {
      int middle;
      middle = (i + j) / 2;
      if (a[middle] == value) {
        System.out.println("number found at index ", middle);
      } else if (value < a[middle]) {

        binarySearch(a, i, middle - 1, value);
      } else {
        binarySearch(a, middle + 1, j, value);

      }

    }

  }
}
