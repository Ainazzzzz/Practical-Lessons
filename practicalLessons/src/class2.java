import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class class2 {
    public static void main(String[] args) {
        Scanner xc = new Scanner(System.in);
        Random rn=new Random();
        int size=xc.nextInt();
        int [] arr=new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=rn.nextInt(1,5);
            System.out.println(arr[i]);


        }
      int[] s=  target(arr,4);
        System.out.println(Arrays.toString(s) +"-target");

}
public static int [] target (int num[],int target){
    for (int i = 0; i < num.length; i++) {
        for (int j = i+1; j < num.length; j++) {
            if(num[i]+num[j]==target){
                return new int []{i,j};
            }

        }

    }


        return new int[]{};
}
}