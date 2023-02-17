public class class6 {
//    public static int summ(int a,int b,int c){
//        int sum = (a+b+c)/3;
//        System.out.print("the average sum is: ");
//        return sum;
//    }

//        public static String middle(String s){
//            int middle = s.length()/2;
//            if(s.length()%2==1){
//                String result = String.valueOf(s.charAt(middle));
//                    return result;
//                } else {
//                        String result = String.valueOf(s.charAt(middle-1) + " " + s.charAt(middle));
//                        return result;
//            }
//    }
////    public static int[][] matrix(int size){
//        Random rn=new Random();
//        int [][] matrix = new int [size][size];
//        for (int i = 0; i < size; i++) {
//            System.out.println();
//            for (int j = 0; j <size ; j++) {
//                matrix[i][j]=rn.nextInt(0,2);
//                System.out.print( matrix[i][j]+" ");
//
//
//            }
//        }return matrix;}
//    public static boolean password(String password) {//charAt();Бир индекстеги символду кайтарат
//        int length = password.length();
//        int sifra = 0;
//        if (length < 8) {
//            return false;
//        }
//        for (int i = 0; i < length; i++) {
//            char c = password.charAt(i);
//            if (!Character.isLetterOrDigit(c)) {
//                return false;
//            }
//            if (Character.isDigit(c)) {
//                sifra++;
//            }
//        }
//        if (sifra < 2) {
//            return false;
//        }
//        return true;
//    }

    public static void main(String[] args) {
      //   System.out.println(lucky(1,2,6,1,2,3));


        //System.out.println(test(1,2,6));
//        for (int i = 2; i < 100; i++) {
//
//            if (is_Prime(i) && is_Prime(i + 2)) {
//                System.out.printf("(%d, %d)\n", i, i + 2);
//            }
//        }
    }

    //    public static boolean is_Prime(long n) {
//
//        if (n < 2) return false;
//
//        for (int i = 2; i < n / 2; i++) {
//
//            if (n % i == 0)
//                return false;
//        }
//        return true;
//    }
//    public static boolean test(int... z) {
//
//        for (int i=0; i<z.length;i++) {
//            for (int j = i+1; j < z.length; j++) {
//                int next=z[i]+=1;
//                if(next==z[j]){
//                    int next2=z[j]+1;
//                    for (int k = j+1; k < z.length; k++) {
//                        if(z[k]==next2){
//                            return true;
//                        }
//
//                    }
//                }
//            }
//
//        }
//
//        return false;
//
//}
//    public static String days(int ... i) {
//        for (int j = 0; j < i.length; j++) {
//            switch (i[j]) {
//                case 1:
//                    System.out.println("MONDAY");
//                    break;
//
//                case 2:
//                    System.out.println("TUESDAY");
//                    break;
//
//                case 3:
//                    System.out.println("WEDNESDAY");
//                    break;
//
//                case 4:
//                    System.out.println("THURSDAY");
//                    break;
//
//                case 5:
//                    System.out.println("FRIDAY");
//                    break;
//
//                case 6:
//                    System.out.println("SATURDAY");
//                    break;
//
//                case 7:
//                    System.out.println("SUNDAY");
//                    break;
//
//
//            }
//
//
//        }
//    return "end";}
//
//    public static String lucky(int...num){
//        int sum=0;
//        int sumLast=0;
//        int counter =0;
//        for (int i = 0; i < num.length; i++) {
//            sum += num[i];
//            counter++;
//            if (counter == 3) {
//                for (int j = i+1; j < num.length; j++) {
//                    sumLast += num[j];
//                    if(sum==sumLast){
//                        if(sum%2==0 ){
//                            return "lucky number";
//
//                        }
//                    }
//
//                }
//            }
//        }
//
//
//    return "simple";}
}


