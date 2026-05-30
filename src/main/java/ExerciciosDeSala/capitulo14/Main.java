package ExerciciosDeSala.capitulo14;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Thread 1 - " + i);
                //                    Thread.sleep(10);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Thread 2 - " + i);
                //                    Thread.sleep(10);
            }
        });

        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Thread 3 - " + i);
                //                    Thread.sleep(10);
            }
        });

        Thread thread4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Thread 3 - " + i);
                //                    Thread.sleep(10);
            }
        });

        Thread thread5 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Thread 3 - " + i);
                //                    Thread.sleep(10);
            }
        });

        Thread thread6 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Thread 3 - " + i);
                //                    Thread.sleep(10);
            }
        });



        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();

    }

}
