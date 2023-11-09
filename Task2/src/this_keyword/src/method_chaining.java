public class method_chaining {
    private int value;

    public method_chaining(int value) {
        this.value = value;
    }

    public method_chaining performAction() {
        System.out.println("Performing an action with value: " + value);
        return this; // Returning the current object
    }

    public void anotherMethod() {
        System.out.println("Another method is called.");
    }

    public static void main(String[] args) {
        method_chaining obj = new method_chaining(42);

        // Demonstrate method chaining
        obj.performAction().anotherMethod(); // the returned value will be used as obj.anotherMethod() and executes the next method
    }
}
