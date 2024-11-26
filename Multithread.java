import java.util.Random;

class RandomNumberThread extends Thread {
    public void run() {
        Random random = new Random();
        while (true) {
            int randomNumber = random.nextInt(100); // Generates a random number between 0 and 99
            System.out.println("Random Integer: " + randomNumber);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("RandomNumberThread interrupted.");
            }
        }
    }
}

class UppercaseAlphabetThread extends Thread {
    public void run() {
        while (true) {
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println(); // New line after printing A-Z
            try {
                Thread.sleep(2000); // Sleep for 2 seconds after printing A-Z
            } catch (InterruptedException e) {
                System.out.println("UppercaseAlphabetThread interrupted.");
            }
        }
    }
}

class LowercaseAlphabetThread extends Thread {
    public void run() {
        while (true) {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println(); // New line after printing a-z
            try {
                Thread.sleep(2000); // Sleep for 2 seconds after printing a-z
            } catch (InterruptedException e) {
                System.out.println("LowercaseAlphabetThread interrupted.");
            }
        }
    }
}

public class MultithreadedApplication {
    public static void main(String[] args) {
        // Creating instances of each thread
        RandomNumberThread randomNumberThread = new RandomNumberThread();
        UppercaseAlphabetThread uppercaseAlphabetThread = new UppercaseAlphabetThread();
        LowercaseAlphabetThread lowercaseAlphabetThread = new LowercaseAlphabetThread();

        // Starting each thread
        randomNumberThread.start();
        uppercaseAlphabetThread.start();
        lowercaseAlphabetThread.start();
    }
}
