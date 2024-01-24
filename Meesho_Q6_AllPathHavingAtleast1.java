import java.util.ArrayList;
import java.util.List;

class Edge
{
    int src, nbr, wt;
    public Edge(int src, int nbr, int wt)
    {
        this.src=src;
        this.nbr=nbr;
        this.wt=wt;
    }

}

public class Meesho_Q6_AllPathHavingAtleast1
{
    private static final int MOD = 1000000007;

    public static void main(String[] args)
    {
//        int houseNodes = 4;
//        int[] houseFrom = {0, 0, 2};
//        int[] houseTo = {1, 2, 3};
//        int[] val = {0, 0, 1};
//        int result = countSequences(houseNodes, houseFrom, houseTo, val);
//        System.out.println(result);

        int houseNodes = 4;
        int[] houseFrom = {0, 0, 2};
        int[] houseTo = {1, 2, 3};
        int[] val = {1, 1, 0};
        int result = countSequences(houseNodes, houseFrom, houseTo, val);
        System.out.println(result);
    }

    public static int countSequences(int houseNodes, int houseFrom[],  int houseTo[], int val[])
    {
        ArrayList<Edge> paths[] = new ArrayList[houseNodes];
        for(int i=0;i<houseNodes;i++)
        {
            paths[i]=new ArrayList<>();
        }

        for(int i=0;i<houseTo.length;i++)
        {
            int s=houseFrom[i];
            int d=houseTo[i];
            int w=val[i];

            paths[s].add(new Edge(s, d, w));
            paths[d].add(new Edge(d, s, w));

        }

        boolean isVisited[] = new boolean[houseNodes];
        int count[]=new int[1];

        for(int i=0;i<houseNodes;i++)
        {
            isVisited[i]=true;
//            System.out.println(paths[i]);
            findAllPaths(paths, paths[i], isVisited, count, 0, Integer.toString(i));
            isVisited[i]=false;
        }

        return count[0];
    }

    public static void findAllPaths(ArrayList<Edge> paths[], ArrayList<Edge> path, boolean isVisited[], int count[], int totalWt, String s)
    {
        for(int i=0;i<path.size();i++)
        {
            Edge edge = path.get(i);
            if(!isVisited[edge.nbr])
            {
                isVisited[edge.nbr]=true;

                if(totalWt+edge.wt>=1)
                {
                    count[0]=(count[0]+1)%MOD;
                    System.out.println(s+Integer.toString(edge.nbr));

                }

                findAllPaths(paths,paths[edge.nbr], isVisited, count, totalWt+edge.wt, s+Integer.toString(edge.nbr));
                isVisited[edge.nbr]=false;
            }
        }
    }



}


//        for(int i=0;i<houseNodes;i++)
//        {
//            ArrayList<Edge> path = paths[i];
//            for(Edge edge : path)
//            {
//                System.out.print("(" + edge.src + ", " + edge.nbr + ", " + edge.wt + ")  ");
//            }
//
//            System.out.println();
//        }