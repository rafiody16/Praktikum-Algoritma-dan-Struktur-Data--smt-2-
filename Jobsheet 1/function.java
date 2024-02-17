import java.util.Scanner;

public class function {

    private static String toko [] = {"Royal Garden 1", "Royal Garden 2", "Royal Garden 3", "Royal Garden 4"};
    private static String bunga[] = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    private static int stok [][] = {
        { 10, 5, 15, 7 },
        { 6, 11, 11, 12 },
        { 2, 10, 10, 5 },
        { 5, 7, 12, 9 }
    };
    private static int harga [] = {75000, 50000, 60000, 10000};
    private static int pengurangan [] = {1, 2, 0, 5};

    public static void pendapatanCabang() {
        for (int i = 0; i < stok.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stok[i].length; j++) {
                int hrgbunga = 0;
                switch (j) {
                    case 0:
                        hrgbunga = harga[0];
                        break;
                    case 1:
                        hrgbunga = harga[1];
                        break;
                    case 2:
                        hrgbunga = harga[2];
                        break;
                    case 3:
                        hrgbunga = harga[3];
                        break;
                    default:
                        break;
                }
                pendapatan += stok[i][j] * hrgbunga;
            }
            System.out.println("Cabang "+ toko[i] +": "+ pendapatan);
        }
    }

    public static void stokBunga(int cabToko) {
        System.out.println("Stok royal garden "+cabToko+": ");
        for (int i = 0; i < stok[cabToko - 1].length; i++) {
            System.out.println(stok[cabToko - 1][i]);
        }
    }

    public static void updateStok(){
        for (int i = 0; i < stok.length; i++) {
            for (int j = 0; j < stok[i].length; j++) {
                stok[i][j] -= pengurangan[j];
            }            
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] terjual = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Jumlah Bunga "+ bunga[i] +"yang terjual: ");
            terjual[i] = sc.nextInt();
        }
        pendapatanCabang();
        stokBunga(4);
        updateStok();
    }
    
}
