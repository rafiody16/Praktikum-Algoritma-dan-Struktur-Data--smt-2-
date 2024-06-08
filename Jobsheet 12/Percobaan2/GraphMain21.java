import java.util.Scanner;

public class GraphMain21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Graph21 gedung = new Graph21(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.removeEdge(1, 3);
        gedung.printGraph();

        // while (true) {

        //     System.out.print("Masukkan gedung asal: ");
        //     int gdAsal = Integer.parseInt(sc.nextLine());
        //     if (gdAsal < 0) {
        //         break;
        //     }
        //     System.out.print("Masukkan gedung tujuan: ");
        //     int gdTujuan = Integer.parseInt(sc.nextLine());
        //     if (gdTujuan < 0) {
        //         break;
        //     }
        //     gedung.checkPath(gdAsal, gdTujuan);
        //     System.out.println();    
            
        // }

        GraphMatriks21 gdg = new GraphMatriks21(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        gdg.printGraph();
        System.out.println("Hasil setelah penghapusan edge");
        gdg.removeEdge(2, 1);
        gdg.printGraph();

        for (int i = 0; i < gdg.vertex; i++) {
            System.out.println((char) ('A' + i));
            gdg.degree(i);
        }

        sc.close();
    }
    
}
