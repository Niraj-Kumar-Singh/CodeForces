import java.util.Scanner;

public class B1620_TrianglesOnARectangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            getMaxTriangle(sc);
        }
    }

    public static void getMaxTriangle(Scanner sc)
    {
        int w = sc.nextInt();
        int h = sc.nextInt();

        int k= sc.nextInt();
        int h0[]=new int [k];
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<k;i++)
        {
            h0[i]=sc.nextInt();

            min=Math.min(h0[i], min);
            max=Math.max(h0[i], max);
        }
        int hDist=max-min;

        k=sc.nextInt();
        int h1[] = new int[k];
        min=Integer.MAX_VALUE;
        max=0;
        for(int i=0;i<k;i++)
        {
            h1[i]=sc.nextInt();

            min=Math.min(h1[i], min);
            max=Math.max(h1[i], max);
        }
        hDist = Math.max(hDist, max-min);

        k= sc.nextInt();
        int v0[]=new int [k];
        min=Integer.MAX_VALUE;
        max=0;
        for(int i=0;i<k;i++)
        {
            v0[i]=sc.nextInt();

            min=Math.min(v0[i], min);
            max=Math.max(v0[i], max);
        }
        int vDist=max-min;


        k=sc.nextInt();
        int v1[] = new int[k];
        min=Integer.MAX_VALUE;
        max=0;
        for(int i=0;i<k;i++)
        {
            v1[i]=sc.nextInt();

            min=Math.min(v1[i], min);
            max=Math.max(v1[i], max);
        }
        vDist = Math.max(vDist, max-min);

        long ans = Math.max((long)vDist*w, (long)hDist*h);

        System.out.println(ans);

    }
  
}
