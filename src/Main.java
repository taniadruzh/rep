import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by java on 29.12.2017.
 */
public class Main {
    public static void main(String[] args) {
        boolean flExit = true;
        while (flExit) {
            System.out.println("Let's play! (y/n)");
            Scanner in = new Scanner(System.in);
            String st = in.nextLine();
            if (st.equals("n")) {
                flExit = false;
                System.out.println("Goodbye!");
                continue;
            }
            System.out.println("1. Do you want to try your luck?");
            System.out.println("2. Do you want to know your fate?");
            System.out.println("3. Do you need calculator?");
            int ans = in.nextInt();
            switch (ans)
            {
                case 1: lotteryDrawind(); break;
                case 2: fate();
            }

        }
    }

    public static void lotteryDrawind()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you need to draw?");
        int k = in.nextInt();
        System.out.println("What is the highest number you can draw?");
        int n = in.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = i +1;
        }
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++)
        {
            int r = (int) (Math.random() * n);
            result[i] = numbers[r];
            numbers[r] = numbers[n - 1];
            n--;
        }
        Arrays.sort(result);
        System.out.println("Bet the folowing combination. It'll make you rich.");
        for (int i : result) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }

    public static void fate()
    {
        System.out.println("Chose your favourite poet.");
        System.out.println("1. Pushkin");
        System.out.println("2. Lermontov");
        System.out.println("3. Shevchenko");

        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
    }
}