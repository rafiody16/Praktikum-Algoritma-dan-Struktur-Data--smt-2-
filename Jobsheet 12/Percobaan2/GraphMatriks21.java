public class GraphMatriks21 {

    int vertex;
    int[][] matriks;

    public GraphMatriks21(int v) {
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = 0;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.println("Gedung "+ (char) ('A' + i)+ ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung "+ (char) ('A' + j)+ " (" +matriks[i][j]+ "m), ");
                }
            }
            System.out.println();
        }
    }

    public void degree(int asal) {
        int k, totalIn = 0, totalOut = 0;
        //inDegree
        for (int j = 0; j < vertex; j++) {
            if (matriks[j][asal] > 0) {
                ++totalIn;
            }
        }
        //outDegree
        for (k = 0; k < matriks[asal].length; k++) {
            if (matriks[asal][k] > 0) {
                k++;
            }
        }
        totalOut = k;
        System.out.println("InDegree dari Gedung "+(char) ('A'+ asal)+": "+ totalIn);
        System.out.println("OutDegree dari Gedung "+(char) ('A'+ asal)+": "+ totalOut);
        System.out.println("Degree dari Gedung "+(char) ('A'+ asal)+": "+ (totalIn + totalOut));
    }
    
}
