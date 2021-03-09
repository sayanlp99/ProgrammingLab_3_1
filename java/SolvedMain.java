import java.lang.*;
import java.util.*;
class ThreadOne implements Runnable {
    @Override
    public void run() {
        System.out.println("The first thread(created using Runnable interface) is running...");
    }
}

class ThreadTwo extends Thread{
    public void run() {
        System.out.println("The second thread(created using the Thread class) is running...");
    }
}
class SolvedMain {
    public static void main(String[] args) {
        ThreadOne t1 = new ThreadOne(); 
        t1.run();
        ThreadTwo t2 = new ThreadTwo(); 
    }
}
