import java.util.*;

public class Problem_100
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int min = scan.nextInt();
        int max = scan.nextInt();
        while (true)
        {
            int maxCount = 1;

            for (int i = min; i <= max; i++)
            {
                int x = cycleCount(1, i);
                if (maxCount < x)
                {
                    maxCount = x;
                }
            }
            System.out.println(min + " " + max + " " + maxCount);
            min = scan.nextInt();
            max = scan.nextInt();
        }
    }

    public static int cycleCount(int count, int n)
    {
        if (n == 1)
            return count;
        else
        {
            if (n % 2 == 0)
            {
                n = n / 2;
                count++;
                cycleCount (count, n);

            }
            else
            {
                count += 2;
                n = ((n * 3) + 1) / 2;
                cycleCount(count, n);
            }
        }
        return count;
    }

}
