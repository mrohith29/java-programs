import java.sql.SQLOutput;

public class typecasting {
    public static void main(String[] args) {
        int x = 15;
        long y = (int) x;
//        System.out.println(Integer.class);
//        System.out.println(Character.SIZE); // 16 bits
        String str = "124";
        int num = Integer.parseInt(str);
        System.out.println(x);
        System.out.println(y);
        System.out.println(str);
        System.out.println(num);

        String s = Integer.toString(x);
        System.out.println(s+"11");
        System.out.println(Integer.toBinaryString(x) + " " + Integer.toOctalString(x) + " " + Integer.toHexString(x));
        System.out.println(Integer.MAX_VALUE + " " + Integer.MIN_VALUE);
        byte by = 11;
        String s1 = Byte.toString(by);
        System.out.println(s1);
        String ss = String.valueOf(by);
        System.out.println(ss);  // 11

        String sentence = String.format("I have a %s", "banana");
        System.out.println(sentence);

        Object ob = new int[10];
        System.out.println(ob.getClass().getName());
        System.out.println(ob.getClass().getSimpleName());
        System.out.println(ob.getClass().getCanonicalName());
        System.out.println(ob.getClass().getTypeName());
        System.out.println(ob.getClass().getPackageName());
        System.out.println(ob.getClass().getModule());

        Class<?> type = byte.class;
        System.out.println(type.getClass());
        System.out.println(type.getName());
//        int size = type.getType().getSize();
//        System.out.println(size);
     }
}
