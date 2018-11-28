public class AdjacencyMatrix 
{

   private final int vertexCount;
   private final boolean adjMatrix[][];
   
   public AdjacencyMatrix(int vc)
   {
       this.vertexCount = vc;
       this.adjMatrix = new boolean[vertexCount+1][vertexCount+1];
   }
   
   public void addEdge(int src, int des)
   {
       if((src >=0 && src<=vertexCount) && (des >=0 && des <=vertexCount))
       {
           adjMatrix[src][des] = true;
           adjMatrix[des][src] = true;           
       }
   }
   
   public void removeEdge(int src, int des)
   {
       if((src >=0 && src<=vertexCount) && (des >=0 && des <=vertexCount))
       {
           adjMatrix[src][des] = false;
           adjMatrix[des][src] = false;           
       }
   }
   
   public boolean isEdge(int src, int des)
   {
       if((src >=0 && src<=vertexCount) && (des >=0 && des <=vertexCount))
       {
           return adjMatrix[src][des];
       }
       else
       {
           return false;
       }
   }
   
   public void printGraph(AdjacencyMatrix graph)
   {
        System.out.println("Adjacency Matrix of vertex" + graph.vertexCount);
        for(int i = 0; i <= graph.vertexCount; i++)
         {
             for (int j = 0; j <= graph.vertexCount ; j++)
             {
                 if(graph.isEdge(i, j))
                 {
                      System.out.print("Connected Edeges:   " + i + "---" + j + "\n");
                 }
             }
         }
         System.out.println("\n");
   }
   
   
   
   
    public static void main(String[] args) 
    {
         AdjacencyMatrix graphAdjMatrix = new AdjacencyMatrix(4);
         graphAdjMatrix.addEdge(1, 2);        
         graphAdjMatrix.addEdge(2, 3);
         graphAdjMatrix.addEdge(3, 4);
         graphAdjMatrix.addEdge(4, 1);
         graphAdjMatrix.addEdge(1, 3); 
         
         graphAdjMatrix.printGraph(graphAdjMatrix);
    }
    
}
