public class Principal {
    public static void main(String args[]) {
        Thread t1 = new Thread(new Operario("chinelo", 100));
        Thread t2 = new Thread(new Operario("sandalia", 500));
        t1.start();
        t2.start();
    }
}
