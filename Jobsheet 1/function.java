import java.util.Scanner;

public class function {

    private static Scanner sc = new Scanner(System.in);
    private static String toko [] = {"Royal Garden 1", "Royal Garden 2", "Royal Garden 3", "Royal Garden 4"};
    private static String bunga[] = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    private static int stok [][] = {
        { 10, 5, 15, 7 },
        { 6, 11, 11, 12 },
        { 2, 10, 10, 5 },
        { 5, 7, 12, 9 }
    };
    private static int harga [] = {75000, 50000, 60000, 10000};
    private static int[][] bgMati = new int[4][4];
    private static int[][] terjual = new int[4][4];

    public static void stokBunga() {
        System.out.print("Silahkan Pilih Cabang(1-4): ");
        int cabToko = sc.nextInt();
        System.out.println("Stok Bunga Cabang "+ toko[cabToko - 1]);
        System.out.println("=====================================================================");
        System.out.printf("%-15s | %-15s | %-15s | %-15s\n", "Bunga", "Stok", "Terjual", "Bunga Mati");
        System.out.println("=====================================================================");
        for (int i = 0; i < bunga.length; i++) {
            System.out.printf("%-15s | %-15s | %-15s | %-15s\n", bunga[i], stok[cabToko - 1][i], terjual[cabToko - 1][i], bgMati[cabToko - 1][i]);
        }
    }

    public static void bungaMati(){
        System.out.print("Silahkan Pilih Cabang(1-4): ");
        int cabToko = sc.nextInt();
        System.out.println("Data Bunga Mati Pada Cabang "+ toko[cabToko - 1]);
        for (int i = 0; i < terjual.length; i++) {
            System.out.print("Jumlah Bunga "+ bunga[i] +"yang mati: ");
            bgMati[cabToko - 1][i] = sc.nextInt();
            stok[cabToko - 1][i] -= bgMati[cabToko - 1][i];
        }
        System.out.println("===========================================");
        System.out.printf("%-15s | %-15s | %-15s\n", "Bunga", "Jumlah Mati", "Sisa Bunga");
        System.out.println("===========================================");
        for (int x = 0; x < bunga.length; x++) {  
            System.out.printf("%-15s | %-15s | %-15s\n", bunga[x], bgMati[cabToko - 1][x], stok[cabToko - 1][x]);          
        }
    }

    public static void pendapatanCabang() {
        System.out.print("Silahkan Pilih Cabang(1-4): ");
        int plhCbg = sc.nextInt();
        for (int i = 0; i < terjual.length; i++) {
            System.out.print("Jumlah Bunga "+ bunga[i] +"yang terjual: ");
            terjual[plhCbg - 1][i] = sc.nextInt();
            stok[plhCbg - 1][i] -= terjual[plhCbg - 1][i];
        }
        System.out.println("Pendapatan Cabang "+ toko[plhCbg - 1]);
        System.out.println("===========================================");
        System.out.printf("%-15s | %-15s | %-15s\n", "Bunga", "Terjual", "Omset");
        System.out.println("===========================================");
        int pendapatan = 0;
        for (int x = 0; x < harga.length; x++) {
            pendapatan += harga[x] * terjual[plhCbg - 1][x];
            System.out.printf("%-15s | %-15s | %-15s\n", bunga[x], terjual[plhCbg - 1][x], pendapatan);
        }
    }

    public static void main(String[] args) {
        System.out.println("Toko Bunga Royalgarden");
        System.out.println("===========================");
        boolean exit = false;
        do {
            System.out.println("1. Pendapatan\n2. Bunga Mati\n3. Stock Bunga\n0. Exit");
            System.out.println("Pilih menu: ");
            int select = sc.nextInt();
            switch (select) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    pendapatanCabang();
                    break;
                case 2:
                    bungaMati();
                    break;
                case 3:
                    stokBunga();
                    break;
                default:
                    break;
            }
            System.out.println("Kembali ke menu utama? (1 = Ya, 0 = Tidak): ");
            int backToMenu = sc.nextInt();
            if (backToMenu != 1) {
                exit = true;
            }
        } while (!exit);
    }
        

}
