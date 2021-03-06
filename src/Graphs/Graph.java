package Graphs;

public class Graph {
    public int vertices;
    public int adjMat[][];

    public Graph(int n){
        vertices=n;
        adjMat=new int[n][n];
    }
    public void insertEdge(int u,int v,int x){
        adjMat[u][v]=x;
    }
    public void removeEdge(int u,int v){
        adjMat[u][v]=0;
    }
    public boolean existEdge(int u,int v){
        return adjMat[u][v]!=0;
    }
    public int vertexCount(){
        return vertices;
    }
    public int edgeCount(){
        int count=0;
        for(int i=0;i<vertices;i++)
            for(int j=0;j<vertices;j++)
                if(adjMat[i][j]!=0)
                    count++;
    return  count;
    }
    public void edges(){
        System.out.println("Edges: ");
        for(int i=0;i<vertices;i++)
            for(int j=0;j<vertices;j++)
                if(adjMat[i][j]!=0)
                    System.out.println(i+"--"+j);
    }
    public int outdegree(int v){
        int count=0;
        for(int i=0;i<vertices;i++)
                if(adjMat[v][i]!=0)
                    count++;
        return count;

    }
    public int indegree(int v){
        int count=0;
        for (int i = 0; i < vertices; i++) {
            if (adjMat[i][v]!=0)
                count++;
        }
        return count;
    }
    public void display(){
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j <vertices; j++) {
                System.out.print(adjMat[i][j]+" ");
            }
            System.out.println(" ");

        }
    }

    public static void main(String[] args) {
        Graph g=new Graph(4);
        System.out.println("matrix");
        g.display();
        System.out.println(g.vertexCount());
        System.out.println(g.edgeCount());
        g.insertEdge(0,1,1);
        g.insertEdge(0,2,1);
        g.insertEdge(1,0,1);
        g.insertEdge(1,2,1);
        g.insertEdge(2,0,1);
        g.insertEdge(2,1,1);
        g.insertEdge(2,3,1);
        g.insertEdge(3,2,1);
        g.display();

    }
}
