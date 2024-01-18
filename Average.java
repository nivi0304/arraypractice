public class Average{
    public static void main(String[] args) {
        double[] a={25.6,30.5,95.7,80.5,75.4};
        //int[] b={1,2,3,4,5};
        double sum=0.0;
        double average=0.0;
        for(int i=0;i<a.length;i++){
           sum=sum+a[i]; 
        }
        average=sum/a.length;
        System.out.println("The average of array:"+average);
    }
}