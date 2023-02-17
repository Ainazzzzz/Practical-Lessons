import java.util.Arrays;
import java.util.Scanner;

public class class1 {
    public static String reverse(String a){
        char[] newWord = new char[a.length()];
        for (int i = 0, j = a.length() - 1; i < a.length(); i++, j--) {
            newWord[j] = a.charAt(i);
        }
        return new String(newWord);
    }
        public static void main(String[] args) {

            // массив который берем через консоль
           String [] numbers=new String[10];
         //правильный Массив
            String [] numbersReady={"BIR","EKI","UCH","TORT","BESH","ALTY","JETI","SEGIZ","TOGUZ","ON"};

            Scanner sc=new Scanner(System.in);

        for(int i=0; i<numbers.length; i++ ){

            numbers[i]=sc.nextLine();
            if(numbers[i].contains("B")&&numbers[i].contains("I")&&numbers[i].contains("R")){
             //метод который переворачивает слова
                String g=reverse(numbersReady[i]);
                if( numbers[i].matches(reverse(numbersReady[i]))  || numbers[i].length()>=7 ){
                    System.out.println(g);
                    System.out.println(false);
                } else{
                    System.out.println(i);
                    System.out.println(true);

                }

                    }

            else if(numbers[i].contains("E")&&numbers[i].contains("K")&&numbers[i].contains("I")){


                 if( numbers[i].matches(reverse(numbersReady[i]))  || numbers[i].length()>=7 ){

                     System.out.println(false);
                 } else{
                     System.out.println(i);
                     System.out.println(true);

                 }

            }else if(numbers[i].contains("U")&&numbers[i].contains("C")&&numbers[i].contains("H")) {



                    if (numbers[i].matches(reverse(numbersReady[i]))  || numbers[i].length() >= 7) {

                        System.out.println(false);
                    }else {
                        System.out.println(i);
                        System.out.println(true);


                }} else if (numbers[i].contains("T")&&numbers[i].contains("O")&&numbers[i].contains("R")&&numbers[i].contains("T")){


                if( numbers[i].matches(reverse(numbersReady[i])) || numbers[i].length()>=8 ){

                    System.out.println(false);
                } else{
                    System.out.println(i);
                    System.out.println(true);


                }
            } else if(numbers[i].contains("B")&&numbers[i].contains("E")&&numbers[i].contains("S")&&numbers[i].contains("H")){

                if( numbers[i].matches(reverse(numbersReady[i]))  || numbers[i].length()>=8 ){

                    System.out.println(false);
                } else{
                    System.out.println(i);
                    System.out.println(true);

                }

            }else if(numbers[i].contains("A")&&numbers[i].contains("L")&&numbers[i].contains("T")&&numbers[i].contains("Y")){


                if( numbers[i].matches(reverse(numbersReady[i])) || numbers[i].length()>=8 ){

                    System.out.println(false);
                } else{
                    System.out.println(i);
                    System.out.println(true);

                }

            } else if(numbers[i].contains("J")&&numbers[i].contains("E")&&numbers[i].contains("T")&&numbers[i].contains("I")){


                if( numbers[i].matches(reverse(numbersReady[i])) || numbers[i].length()>=8 ){

                    System.out.println(false);
                } else{
                    System.out.println(i);
                    System.out.println(true);

                }

            } if(numbers[i].contains("S")&&numbers[i].contains("E")&&numbers[i].contains("G")&&numbers[i].contains("I")&&numbers[i].contains("Z")){


                if( numbers[i].matches(reverse(numbersReady[i]))  || numbers[i].length()>=9 ){

                    System.out.println(false);
                } else{
                    System.out.println(i);
                    System.out.println(true);

                }

            } else if(numbers[i].contains("T")&&numbers[i].contains("O")&&numbers[i].contains("G")&&numbers[i].contains("U")&&numbers[i].contains("Z")){


                if( numbers[i].matches(reverse(numbersReady[i]))  || numbers[i].length()>=9 ){

                    System.out.println(false);
                } else{
                    System.out.println(i);
                    System.out.println(true);

                }

            }else if(numbers[i].contains("O")&&numbers[i].contains("N")){


                if( numbers[i].matches(reverse(numbersReady[i])) || numbers[i].length()>=5 ){

                    System.out.println(false);
                } else{
                    System.out.println(i);
                    System.out.println(true);

                }


            }
        }}
            }



