package searchalgos;

import java.util.Arrays;

public class palin {
    public static void main(String[] args) {
        String str = "Malayalam";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
// public class palin{
//     public static void main(String[] args) {
//         String series= "abcdcba";
//         checkpalindrome(series);
//     }

//    static boolean checkpalindrome(String series) {
//      if (series == null || series.length() == 0) {
//                 return true;
//             }
//             series= series.toLowerCase() ;
//         for(int i=0; i <=series.length()/2; i++){
//                 char start = series.charAt(i);
//             char end= series.charAt(series.length()-1-i);
//             if(start != end){
//                 return false;
//         }
//         return true;

//     }
// }
    




