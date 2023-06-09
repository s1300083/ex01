import java.util.Random;
import java.util.Scanner;

public class DiceGame 
{
    public static void main(String[] args)
    {
        run();
    }    

    static void run()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        System.out.println("Rolling dice...");
        Random random = new Random();
        int die1 = random.nextInt(6)+1;
        int die2 = random.nextInt(6)+1;
        int total = die1 + die2;
        System.out.println("Die1: " + die1);
        System.out.println("Die2: " + die2);
        System.out.println("Total value: " + total);
        System.out.format("%s %s\n", name, (total > 7) ? "won!" : "lost.");
        scanner.close();
    }
}