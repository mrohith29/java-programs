class demo {
    static int count = 0; // This variable will remain static irrespective of object used to access it
    void add() {
        count ++;
    }

    void show() {
        System.out.println(count);
    }
}

public class static_variables {
    public static void main(String[] args) {
        demo ob1 = new demo();
        ob1.add(); // count updated to 1
        ob1.show();// count = 1
        demo ob2 = new demo();
        ob2.add(); // count updated to 2
        ob2.show(); // count = 2
        ob1.show(); // count = 2
    }
}

// Static variables are used to store common data for different objects