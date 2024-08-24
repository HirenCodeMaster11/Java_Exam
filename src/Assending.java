public class Assending {
    public static void main(String[] arg)
    {
        int[] a = new int[]{5,4,3,2,1};

        int max = a[0];

        for (int i = 0; i < a.length; i++)
        {
            for(int j = i+1; j<a.length; j++)
            {
                if(a[j] <= a[i])
                {
                    max = a[i];
                    a[i] = a[j];
                    a[j] = max;
                }
            }
        }
        for(int i = 0; i< a.length; i++)
        {
            System.out.println(a[i]);
        }

    }
}
