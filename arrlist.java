import java.util.*;
public class arrlist
{
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.set(1, 50);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        System.out.println(list.size());

        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i)+" ");
        }

        int n = list.get(0);
        System.out.println(n);


    }
}
