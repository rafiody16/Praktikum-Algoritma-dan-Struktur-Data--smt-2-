import java.util.Scanner;

public class MainFaktorial21 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.print("Masukkan jumlah elemen: ");
        int iJml = sc.nextInt();

        Faktorial21[] fk = new Faktorial21[10];
        for (int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial21();
            System.out.print("Masukkan nilai data ke-"+(i+1)+" : ");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("Hasil - Brute Force");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil perhitungan faktorial menggunakan brute force adalah "
            + fk[i].faktorialBF(fk[i].nilai));
        }

        System.out.println("Hasil - Divide and Conquer");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil perhitungan faktorial menggunakan divide and conquer adalah "
            + fk[i].faktorialDC(fk[i].nilai));
        }

        sc.close();
    }
    
}
