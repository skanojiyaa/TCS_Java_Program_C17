package ThreadExcercises;

public class PrintNameThread2 extends Thread{
	PrintNameThread2(String name) {
        super(name);
        // start() method is inside the constructor of the subclass
        start();
    }
   
    public void run() {
        String name = getName();
        for (int i = 0; i < 10; i++) {
            System.out.print(name);
        }
    }
}
