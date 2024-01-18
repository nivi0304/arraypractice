public class Searchelement{
    public static int findIndexApproach1(int[] a, int b) {
        for (int i = 0; i < a.length; i++) {
           if (a[i] == b) {
              return i;
           }
        }
        return -1; // Element not found
     }
  
     public static void main(String[] args) {
        int[] a = {3,4,5,6,7};
        int b = 3;
        int index = findIndexApproach1(a, b);
        System.out.println("Index of element " +b + ": " + index);
     }
  }