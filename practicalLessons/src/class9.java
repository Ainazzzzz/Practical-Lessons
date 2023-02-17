public class class9 {
    public static String longestWord(String[] strs){
        if(strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for(int i = 1 ; i < strs.length ; i++){
            String str = strs[i];
            while(str.indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
           }
            }
  return prefix;  }

    public static void main(String[] args) {
        System.out.println(longestWord(new String[]{"oflower","oflow","oflight"}));
    }
}
