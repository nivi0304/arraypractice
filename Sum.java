public class Sum{
    public static void main(String[] args){
        int[] a={5,6,7,8,9,10};
        int sum=0;
        for(int i=0;i<a.length;i++){
          sum=sum+a[i];  
        }
        System.out.println("The sum of array:"+sum);
    }
}