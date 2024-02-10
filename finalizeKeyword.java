class finalizeKeyword {
    public static void main(String[] args) {

        finalizeKeyword f = new finalizeKeyword();
        f = null;
        System.gc();
        System.out.println("Main thread");

    }
//  finalize keyword is used to perform clean up processing just before object is garbage collected.
    public void finalize() {
        System.out.println("Finalize method called");
    }
//    But it us depricated and not recommended to use.
}
