

public class SieveOfErastosthenes
{
    public static void main(String [] args)
    {
        SieveOfErastosthenes soe = new SieveOfErastosthenes();
        int n = 23;
        soe.findSieveOfErastosthenes(n);
    }

    void findSieveOfErastosthenes(int n)
    {
        boolean[] isPrime = new boolean[n];
        for(int i = 2; i*i <=n; i++)
        {
            if(isPrime[i])
            {
                for(int j=2*i;j<=n;j=j+i)
                    isPrime[j] = false;
            }
        }

        for(int i=2; i<=n; i++)
        {
            if(isPrime[i])
                System.out.println(i);
        }
    }
}