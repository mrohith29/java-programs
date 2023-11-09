class Employee{
    int salary;
    String name;
    int getSalary()
    {
        return salary;
    }
    String getName()
    {
        return name;
    }
    void setName(String n) {
        name = n;
    }
}

class Main{
    public static void main(String[] args) {
        Employee Rohith = new Employee();
        Rohith.salary = 100;
        System.out.println(Rohith.getSalary());
        Rohith.setName("Mariyala Rohith");
        System.out.println(Rohith.getName());
    }
}