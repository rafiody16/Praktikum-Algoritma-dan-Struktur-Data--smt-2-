import java.util.Scanner;

public class ImplementasiArray2d {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PersegiPanjang21 [][] ppArray2d = new PersegiPanjang21[3][2];

        for (int i = 0; i < ppArray2d.length; i++) {
            for (int j = 0; j < ppArray2d[i].length; j++) {
                ppArray2d[i][j] = new PersegiPanjang21();
            }
        }

        for (int i = 0; i < ppArray2d.length; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            ppArray2d[i][0].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray2d[i][1].lebar = sc.nextInt();
        }

        for (int i = 0; i < ppArray2d.length; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.println("Panjang: "+ ppArray2d[i][0].panjang +", lebar: "+ ppArray2d[i][1].lebar);
        }
    }
}
