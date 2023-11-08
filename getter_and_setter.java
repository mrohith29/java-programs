import java.util.Scanner;
public class getter_and_setter {
    private int radius;
//int radius;
    void setter(int r) // This will get the value from the command line and assign it to the private value radius
    {
        radius = r;
    }

    int getter() // This will return the private value to the desired class..
    {
        int r = radius;
        return r;
    }
}

class Mains
{
    public static void main(String[] args) {
        System.out.println("Enter the Radius of the circle ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        getter_and_setter ob = new getter_and_setter();
//        ob.radius = r;       //we cannot directly use the private variables in other class, we can use them in the same class.
//        System.out.println(ob.radius); // we need to make a getter and setter to use the private variable in other class.
        ob.setter(r);
        System.out.println("The radius provided is "+ob.getter());

    }
}

// You can see the accessibility different access modifiers availability in the table.jpg