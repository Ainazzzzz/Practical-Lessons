import java.util.Arrays;
import java.util.Scanner;

public class examTasks {

    public static void main(String[]args) {
        int [][] arr = new int [10][10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=i*10+(j+1);
                System.out.print(arr[i][j]+" ");

            }

        }
        // System.out.println(palindrom(1000021));
        //
        // System.out.println(search(new int []{1,2,3,5},7));
    }


//        //    contains(1,);
//
//        Scanner sc = new Scanner(System.in);
//        int input= sc.nextInt();
//        boolean cont=contains(input,2,3,4,56,2,1);
//        if (cont==true){
//            System.out.println(input+"yes");
//        }else {
//            System.out.println(input+"not");
//        }
//    }
//    static boolean contains(int x, int ... arr){
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]==x){
//                return true;
//            }
//        }
//        return false;
//    }
    }
//   static boolean palindrom(int x){
//       //1234321
//          int j;
//          int y;
//       String ch=String.valueOf(x);
//       if(ch.length()==1){
//           return true;
//       }
//       if(ch.charAt(1)==ch.lastIndexOf(ch)){
//           return false;
//
//       }
//
//       for (int i = 0; i < ch.length(); i++) {
//           for (j = ch.length()-1; j>i; j--) {
//               System.out.println(ch.charAt(i) + " " + ch.charAt(j));
//
//               if (ch.charAt(i) == ch.charAt(j)) {
//
//                   return true;}
//               }
//
//
//           }
//
//
//  return false; }
//    static boolean isMatch(String s,String p){
//        if (s.matches(p) || s.equals(p) || p.contains(".") || p.contains(".*") || p.contains("*.")){
//            return true;
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            if(p.contains("*")){
//                p=p.replace('*',s.charAt(i));
//                return true;
//
//            } if(p.contains(".") && p.length()==s.length() ){
//                p = p.replace('.', s.charAt(i));
//                return true;
//            }
//
//        }
//
//   return false; }
//    public static int search(int [] arr,int target){
//        Arrays.sort(arr);
//
//           int i=0;
//           int next=0;
//           int max=arr[0];
//        for (int j = 0; j < arr.length; j++) {
//
//            if(arr[j]>max){
//                max=arr[j];
//            }
//
//        }
//       while(i<arr.length){
//           next=arr[i];
//           next=next+1;
//            if(arr[i]==target){
//                return i;
//            } if (next==target) {
//                return i+1;
//
//            }if(arr[i]<target){
//               for (int j = 1; j < arr.length; j++) {
//
//
//               boolean b = !(arr[j] < target);
//               if (b){
//
//            return i+j;}
//
//                   else if(target>=10){
//                   for (int k = arr.length-1; k > 0; k--) {
//                       if(arr[k]<target){
//                           return k+1;
//                       }
//
//                   }
//
//
//               }}
//           }if(arr[i]==max){
//                if(max<target){
//                    return i+1;
//                }
//           }
//           i++;
//
//
//        }
//   return 0; }

