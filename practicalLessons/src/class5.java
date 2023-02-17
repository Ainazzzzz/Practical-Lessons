public class class5 {
    public static void main(String[] args) {
        System.out.println( method(1,2,3));

    }
    public  static boolean method(int... a){
        for (int i = 0; i < a.length; i++) { //a[0]+=1; =2 next=2;
            int next = a[i]+=1;
            for (int j = i+1; j < a.length; j++) { // j=0+1 j=1 a
                if(a[j]==next){  //a[1]==next 2==2
                    int next1= a[j]+=1;  // a[1]+=1;  2+1=3; next1=3;
                    for (int k = j+1; k < a.length ; k++) {  //a[k] = a[2]
                        if(a[k]==next1){   //a[2] == next1
                            return true;
                        }



            }

        }}}
     return false;}
        }

