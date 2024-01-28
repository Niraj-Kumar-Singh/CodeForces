import java.util.Scanner;

public class A785_AntonAndPolyhedrons
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int sum=0;
        String s = "";

        for(int i=0;i<n;i++)
        {
            s=sc.nextLine();

            if(s.equals("Tetrahedron"))
                sum+=4;
            else if(s.equals("Cube"))
                sum+=6;
            else if(s.equals("Octahedron"))
                sum+=8;
            else if(s.equals("Dodecahedron"))
                sum+=12;
            else
                sum+=20;
        }

        System.out.println(sum);
    }

  
}
