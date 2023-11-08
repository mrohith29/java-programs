// Inheritance is an important property of java through which we try to access the methods of one class to another class Systematically
// So to inherit the properties we access modifiers. There are 4 access modifiers in java : Public, Private, Protected, Default.
// Access modifiers simple but the keywords that allow the usage of particular method, variable, class to get used by other lines of code.
// You can accesibility of different access modifiers in the table.jpeg, you can find the table below the program.
class RBI // parent or super class
{
    private long Acc_no = 12345678910l;
    protected int amount = 1000;
    public String Name = "Rohith";
}

class SBI extends RBI // child or subclass
{
    int credited_amount = 200;
    int total_amt = credited_amount + amount; // we can directly access the super class variables and methods other than private ones through the child class
    void print()
    {
        //System.out.println("Your account number is " + Acc_no); // We will get an error when we try to access anything that is private
        System.out.println("The account holder name is " + Name);
    }
    void show_balance()
    {
        System.out.println("You have " + total_amt + " in your bank account");
    }
}

class Main {
    public static void main(String[] args) {
        SBI person = new SBI();
        person.print();
        person.show_balance();
    }
}
