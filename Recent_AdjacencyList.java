package adjacencyList;
import java.util.*;


public class AdjacencyList 
{    
    int V;
    LinkedList<Integer> adjList[];
    
    public AdjacencyList(int v) 
    {
        this.V = v;
        
        // define the size of array as 
	      // number of vertices 
        adjList = new LinkedList[V];
        
       // Create a new list for each vertex 
       // such that adjacent nodes can be stored 
        for(int i = 0; i < adjList.length; i++)
        {
            adjList[i] = new LinkedList<>();
        }        
    }
    
    // Adds an edge to an undirected graph 
    public void addEdge(int src, int dst)
    {
        // Add an edge from source to destination
        adjList[src].add(dst);        
        
        // Since the graph is not directed, 
        // add an edge from destination to source too
        adjList[dst].add(src);
    }
    
    public void removeEdge(int V, int W)
    {
        Iterator it = adjList[V].iterator();
        while(it.hasNext())
        {
            if((int)it.next() == W)
            {
                it.remove();
                return;
            }
        }
    }
    
    boolean hasEdge(int V, int W)
    {
        return adjList[V].contains(W);
    }
    
    LinkedList<Integer> inEdges(int i)
    {
        LinkedList<Integer> edges = new LinkedList<>();
        for(int j = 0; j < V; j++)
        {
            if(adjList[j].contains(i))
            {
                edges.add(j);
            }
        }
        return edges;        
    }
    
    public void print()
    {
        for(int i = 0; i < adjList.length; i++)
        {
            System.out.print("Adjancy List of Vertex " + i  + "\n");
            
            LinkedList temp = adjList[i];
            
            System.out.print("head");
            
            for(int j=0; j < temp.size();j++)
            {
                System.out.print( " -> " + temp.get(j));
            } 
            
            System.out.print("\n");
        }
    }
    
    public void BFS(int s)
    {
        boolean visited[] = new boolean[V];
        
        LinkedList<Integer> queue = new LinkedList<>();
        
        visited[s] = true;
        
        queue.add(s);
        
        while(!queue.isEmpty())
        {
            int j = queue.poll();
            
            System.out.print(j);
            
            Iterator it = adjList[s].iterator();
            
            while(it.hasNext())
            {
                int n = (int)it.next();
                
                if(!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
                
            }
        }
    }
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Greaph g = new Greaph(5);
        g.addEdge(0, 1); 
        g.addEdge(0, 4); 
        g.addEdge(1, 2); 
        g.addEdge(1, 3); 
        g.addEdge(1, 4); 
        g.addEdge(2, 3); 
        g.addEdge(3, 4); 
        
        g.print();
        
        g.BFS(2);
        
    }
    
    }
