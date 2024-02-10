import java.util.*;
class inssufficientMoney extends Throwable {
    inssufficientMoney(String message) {
        super(message);
    }
    public String toString() {
        return "Insufficient funds " + getMessage();
    }
}

class bankAccount {
    double balence;
    void withdraw(double amount) throws inssufficientMoney {
        try {
            if (balence < amount) {
                throw new inssufficientMoney("No enough money to withdraw");
            }
            balence-= 15;
            System.out.println("Withdrawn: " + amount);
        } catch (inssufficientMoney e) {
            System.out.println(e);
        }

    } 

}

class Example1 {
    public static void main(String[] args) throws inssufficientMoney {
        bankAccount a1 = new bankAccount();
        a1.balence = 100;
        a1.withdraw(150);
    }    
}
