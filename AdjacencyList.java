public class AdjacencyList 
{
    int V;
    int E;
    Edges edges[];
    
        
    public AdjacencyList(int v, int e)
    {
        this.V = v;
        this.E = e;
        edges = new Edges[E];
        for(int i = 0; i < E; i++)
        {
            edges[i] = new Edges();
        }
    }
    
    static class Edges
    {
       int src;
       int dst;
       
    }
    
    public static void addEdge(AdjacencyList g, int src, int dst, int edge)
    {
        g.edges[edge].src = src;
        g.edges[edge].dst = dst;
    }
    
    public void removeEdge(AdjacencyList g, int src, int des)
    {
       // need to finish up
    }    

    public static void printGraph(AdjacencyList g)
    {
      for(int i = 0; i < g.edges.length; i++)
      {
          System.out.println("Edge:" + i + " Source=" + g.edges[i].src + " Destination=" +  g.edges[i].dst);
       
      }      
    }

    public static void main(String[] args) 
    {
        int V = 3; int E = 3;
        
        AdjacencyList graph1 = new AdjacencyList(V, E);
        
         // add edge 0 - 1
        AdjacencyList.addEdge(graph1, 0, 1, 0);
        
         // add edge 1 - 2
        AdjacencyList.addEdge(graph1, 1, 2, 1);
        
         // add edge 0 - 2
        AdjacencyList.addEdge(graph1, 2, 1, 2);   
        
        printGraph(graph1);
        
    }
    
}
