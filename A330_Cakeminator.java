import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class A330_Cakeminator
{
    public static void main(String[] args)
    {

      Scanner sc= new Scanner(System.in);

      int row=sc.nextInt();
      int col=sc.nextInt();

      sc.nextLine();
      char cake[][] = new char[row][col];
//      String s[] = new String[row];


      for(int i=0;i<row;i++)
      {
          String s = sc.nextLine();
          cake[i]=s.toCharArray();
//          sc.nextLine();

//          s[i]=sc.nextLine();
      }

//        for(int i=0;i<row;i++)
//        {
//            System.out.println(Arrays.toString(cake[i]));
//        }



        HashSet<Integer> rowSet = new HashSet<>();
        HashSet<Integer> colSet = new HashSet<>();

      for(int i=0;i<row;i++)
      {
          boolean hasBerry=false;
          for(int j=0;j<col;j++)
          {
              if(cake[i][j]=='S')
              {
                  colSet.add(j);
                  hasBerry=true;
              }
          }

          if(hasBerry)
              rowSet.add(i);
      }

//      int berryCells = Math.max(rowSet.size(), colSet.size());
//
//      int cakeCells = (row*col)-2*berryCells;
//
//        System.out.println(cakeCells);

        int count=0;
        //Row traversal
        for(int i=0;i<row;i++)
        {
            if(rowSet.contains(i))
                continue;

            count+=col;
        }

        for(int j=0;j<col;j++)
        {
            if(colSet.contains(j))
                continue;

            count+=row;

            count-=(row-rowSet.size());
        }

        System.out.println(count);


    }
  
}
