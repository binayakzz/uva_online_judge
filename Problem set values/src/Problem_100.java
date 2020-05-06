import java.io.BufferedInputStream;
import java.util.*;

public class Problem_100
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(new BufferedInputStream(System.in));

        while (scan.hasNext())
        {
            int i = scan.nextInt();
            int j = scan.nextInt();
            int maxCount = 1;
            int min;
            int max;
            if (i > j)
            {
                max = i;
                min = j;
            }
            else
            {
                min = i;
                max = j;
            }

            for (int y = min; y <= max; y++)
            {
                int x = cycleCount(1, y);
                if (maxCount < x)
                {
                    maxCount = x;
                }
            }
            System.out.println(min + " " + max + " " + maxCount);
        }
    }

    // Counting the cycle of a number
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
            }

            else
            {
                count += 2;
                n = ((n * 3) + 1) / 2;
            }

            return cycleCount (count, n);
        }
    }
}
