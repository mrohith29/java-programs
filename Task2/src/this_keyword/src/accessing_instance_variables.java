import java.util.Scanner;
public class accessing_instance_variables {
    int x;
    int method(int x)
    {
        this.x = x;
        this.x++; //This.x here refers to the x which belongs to the class i.e., it is a class attribute
        return this.x; //we are updating the this.x i.e. the class attribute, we are returning the x which is a parameter of the method so, the argument which is passed will be returned.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        accessing_instance_variables ob = new accessing_instance_variables();
        System.out.println("The entered value is = " + ob.method(sc.nextInt()));
    }
}
