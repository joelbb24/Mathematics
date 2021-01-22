

public class ComputePower
{
    public static void main(String [] args)
    {
        ComputePower cp = new ComputePower();

        int x = 4;
        int n = 3;
        int res = cp.power(x, n);
        System.out.println(res);
    }


    int power(int x, int n)
    {
        int res = 1;
        while(n>0)
        {
            if(n%2!=0)
                res = res * x;
            x = x*x;
            n = n/2;
        }

        return res;
    }
}