import java.util.Scanner;

public class MainSum21 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===============================");
        System.out.println("Program Menghitung Keuntungan total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah perusahaan yang akan dihitung: ");
        int prs = sc.nextInt();
        Sum21[] arr = new Sum21[prs];

        for (int x = 0; x < prs; x++) {
            System.out.println("Perhitungan keuntungan perusahaan ke - "+ (x + 1));
            System.out.print("Masukkan Jumlah Bulan: ");
            int elm = sc.nextInt();
            arr[x] = new Sum21(elm);
    
            System.out.println("===============================");
            for (int i = 0; i < arr[x].elemen; i++) {
                System.out.print("Masukkan untung bulan ke - "+ (i+1) +" : ");
                arr[x].keuntungan[i] = sc.nextDouble();
            }
            
        }

        System.out.println();

        for (int y = 0; y < arr.length; y++) {
            System.out.println("Perhitungan Perusahaan "+ (y + 1));
            System.out.println("===============================");
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama "+ arr[y].elemen +" bulan adalah "
            + arr[y].totalBF(arr[y].keuntungan));
            System.out.println("===============================");
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total keuntungan perusahaan selama "+ arr[y].elemen +" bulan adalah "
            + arr[y].totalDC(arr[y].keuntungan, 0, arr[y].elemen-1));
        }

        sc.close();
    }
    
}
