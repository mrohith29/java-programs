import java.util.*;

public class Anagram {
    public static  boolean Anagram_check(String word_one, String word_two)
    {
        word_one = word_one.replaceAll("\\s", "").toLowerCase();
        word_two = word_two.replaceAll("\\s", "").toLowerCase();

        if (word_one.length() != word_two.length())
        {
            return false;
        }

        char[] array1 = word_one.toCharArray();
        char[] array2 = word_two.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String w1 = sc.next();
        String w2 = sc.next();

        if (Anagram_check(w1, w2))
        {
            System.out.println(w1+" and "+w2+" are Anagrams");
        }
        else
        {
            System.out.println(w1+" and "+w2+" are not Anagrams");
        }
    }
}
