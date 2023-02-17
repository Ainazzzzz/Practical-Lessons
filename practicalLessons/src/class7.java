import java.util.Scanner;

import static java.lang.Character.isDigit;

public class class7 {
    public static String QuestionsMarks(String str) {
      int j = 0;
      int i=0;

        for (i = 0; i < str.length(); i++) {
            int counter = 0;

            if (isDigit(str.charAt(i))) {
                for (j = i + 1; j < str.length(); j++) {
                    if (str.charAt(j) == '?') {
                        counter++;
                        if (isDigit(str.charAt(j))) {
                            int ten1 = Integer.parseInt(str.charAt(i) + "") + Integer.parseInt(str.charAt(j) + "");
                            System.out.println(ten1);
                            if(ten1== 10 && counter == 3) {
                                return "true";
                            }

                        }
                    }
                }}}


            return "false";
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(QuestionsMarks(s.nextLine()));
    }

}
