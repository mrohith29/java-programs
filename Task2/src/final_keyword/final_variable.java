package final_keyword;

class final_class {
    final String roll_no = "22241A050C";
}
public class final_variable {
    public static void main(String[] args) {
        final_class ob = new final_class();
//        ob.roll_no += 10;  this may cause error because roll_no is declared as final
        System.out.println(ob.roll_no);
    }
}

// A final variable is a constant, and its value cannot be changed after it is initialized. This is useful when you want to create immutable objects or ensure that a variable's value remains constant.