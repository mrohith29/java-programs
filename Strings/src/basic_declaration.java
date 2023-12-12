public class basic_declaration {
    public static void main(String[] args) {
//        char []name = {'r', 'o', 'h', 'i', 't', 'h'};
//        String []na = {"df", "df", "af", "saf", "df"};
//        String n = new String(na);
//        System.out.println(name);
        String str = "rohith1";
        str = str.concat("kumar");
        str = "heloo";
        String st = "rohith";
        System.out.println(str);
        String str1 = new String("rohith2");
//        System.out.println(str1);
        if (str.equals(st)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

//        System.out.println(str.compareTo(str1));
    }
}


// in java String data type is not a primitive data type it is a class
// String is a sequence of characters
// String is immutable
// String is a final class
// String is a final class so we can't inherit the String class
// String is a final class so we can't override the methods of String class

// String datatype is different from the string class
// i.e., String st = "rohith" is different from String str = new String("rohith")