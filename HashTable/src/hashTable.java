import java.util.Hashtable;
import java.util.Scanner;
public class hashTable {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            ht.put(i, sc.next());
        }
        ht.put(1, "one");
        ht.put(2, "two");
        ht.put(3, "three");
        ht.put(4, "four");
        ht.put(5, "five");
        ht.compute(1, (k, v) ->  "o");
        System.out.println(ht.keySet());
        System.out.println(ht.values());
        System.out.println(ht.get(1));
    }
}
