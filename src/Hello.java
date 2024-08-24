//WAP TO FIND THE LARGEST ELEMENT FROM THE ARRAY IN JAVA.

import java.util.Scanner;

public class Hello {
    public static void main(String[] arg)
    {
        int [] a = new int [] {5,10,15,20,25};
        int max = a[0];

        for (int i = 0; i < a.length; i++)
        {
            if(a[i] > max)
            {
                max = a[i];
            }
        }
        System.out.println("Largest element is: " + max);
    }
}
