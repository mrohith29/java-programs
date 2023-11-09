class constoverload {
    constoverload() {
        System.out.println("Constructor with no parameters executed");
    }
    constoverload(int a) {
        System.out.println("Constructor with one parameters executed");
    }
    constoverload(int a, double b) {
        System.out.println("Constructor with two parameters executed");
    }
}
public class constructorOverloading {
    public static void main(String[] args) {
        constoverload c1 = new constoverload();
        constoverload c2 = new constoverload(10);
        constoverload c3 = new constoverload(10, 10.1);
    }
}
