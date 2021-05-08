import java.util.*;
import java.lang.*;

public class Swap
{
    public static void main(String[] args)
    {
        int a = 13;
        int b = 9;
        
        Swap sp = new Swap();
        List<Integer> res = sp.swap(a,b);
        for(int i: res)
            System.out.print(i+" ");
    }

    public List<Integer> swap(int a, int b)
    {
        List<Integer> al = new ArrayList<Integer>();
        a = a+b;
        b = a-b;
        a = a-b;
        al.add(a);
        al.add(b);

        return al;
    }
}
