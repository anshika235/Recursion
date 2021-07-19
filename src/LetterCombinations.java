import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class LetterCombinations {
    static  int cnt;
    static String[] mapping = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public List<String> letterCombinations(String digits) {

        return null;
        }




    public static void helper(String digits, String comb) {

        if (digits.length() == 0) {
            cnt++;
            System.out.println(comb);
            return;
        }
        char digitPressed = digits.charAt(0); // '2' char
        int index = digitPressed - '0'; // int 2

        String mappedString = mapping[index];
        //System.out.println(mappedString);

        for (int i = 0; i < mappedString.length(); i++) {

            String bachiKuchiString = digits.substring(1);
            char choice = mappedString.charAt(i);
            helper(bachiKuchiString, comb + choice);
        }

    }

    public static void main(String[] args) {


        cnt=0;

        helper("23", "");
        System.out.println(cnt);
    }
}
