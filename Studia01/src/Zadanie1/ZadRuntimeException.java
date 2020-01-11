package Zadanie1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZadRuntimeException
{

    // when integers list is null then NullPointerEception (an unchecked exception) is thrown from this method
    private static int sumElements(List<Integer> integers)
    {
        int[] sum = new int[1];
        integers.forEach(integer -> sum[0] += integer);
        return sum[0];
    }

    public static void main(String[] args)
    {

        List<Integer> list = null;

        // odkomentuj zeby nie leciel wyjatek NPE i udalo sie obliczyc sume elementow
//        list = Arrays.asList(1, 2, 3, 4, 5);

        int sum = 0;
        boolean isSumCalculated = false;

        try
        {
            sum = sumElements(list);
            isSumCalculated = true;
        }
        catch(Exception ex)
        {
            isSumCalculated = false;
        }

        if (isSumCalculated)
        {
            System.out.println("Udalo sie obliczyc sume elementow listy. Suma rowna jest "+sum);
        }
        else
        {
            System.out.println("Nie udalo sie obliczyc sume elementow listy.");
        }
    }
}
