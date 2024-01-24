import java.util.Scanner;

public class A151_Drinks
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int k =sc.nextInt();
        int l=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int p=sc.nextInt();
        int nl=sc.nextInt();
        int np=sc.nextInt();

        int minDrinks=(k*l)/nl;
        int minSalt=p/np;
        int minSlices=c*d;

//        System.out.println(minDrinks + " " + minSalt + " " + minSlices);

        System.out.println(Math.min(minDrinks, Math.min(minSalt, minSlices))/n);
    }
  
}
