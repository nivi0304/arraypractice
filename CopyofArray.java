public class CopyofArray{
    public static void main(String[] args){
        int[]a={1,2,3,4,5};
        int[]b=new int[5];
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
            for(int i=0;i<b.length;i++){
        System.out.println("The copy of array "+b[i]);
        }
    }
}