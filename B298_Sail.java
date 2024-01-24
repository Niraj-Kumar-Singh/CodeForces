import java.util.Scanner;

public class B298_Sail
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int ex = sc.nextInt();
        int ey = sc.nextInt();

        sc.nextLine();
        String s = sc.nextLine();

        int time = 0;
        int south=0;
        int north=0;
        int east=0;
        int west=0;

        int distX=ex-sx;
        int distY=ey-sy;

        if(distX<0)
            west=Math.abs(distX);
        else
            east=distX;

        if(distY<0)
            south=Math.abs(distY);
        else
            north=distY;

        while(time<s.length())
        {
            char c = s.charAt(time);

            if(c=='N' && north>0)
                north--;
            else if(c=='E' && east>0)
                east--;
            else if(c=='S' && south>0)
                south--;
            else if(c=='W' && west>0)
                west--;

            time++;

            if(north==0 && south==0 && east==0 && west==0)
                break;
        }


        if(north==0 && south==0 && east==0 && west==0)
            System.out.println(time);
        else
            System.out.println(-1);

    }
  
}
