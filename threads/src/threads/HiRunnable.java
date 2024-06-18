package threads;

class HiRunnable implements Runnable {
 @Override
 public void run() {
     for (int i = 0; i < 5; i++) {
         System.out.println("Hi from " + Thread.currentThread().getName());
         try {

        	 Thread.sleep(500);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
 }
}

public class Main {
 public static void main(String[] args) {
     
	 HiRunnable hiRunnable = new HiRunnable();


Thread thread1 = new Thread(hiRunnable, "Thread-1");
     Thread thread2 = new Thread(hiRunnable, "Thread-2");

     thread1.start();
     thread2.start();
 }
}
