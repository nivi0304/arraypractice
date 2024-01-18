public class Largest{
    public static void main(String[] args) {
        int[] a={100,45,67,200,250};
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("The maximum number in a array "+max);
    }
}