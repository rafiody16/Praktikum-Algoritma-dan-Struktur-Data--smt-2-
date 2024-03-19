import java.util.Scanner;

public class MainPangkat21 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("==================================");
        System.out.print("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();

        Pangkat21 [] png = new Pangkat21[elemen];

        for (int i = 0; i < elemen; i++) {
            png [i] = new Pangkat21();
            System.out.print("Masukkan nilai yang ingin dipangkatkan: ");
            int nilai = sc.nextInt();
            System.out.print("Masukkan nilai pangkat: ");
            int pangkat = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("Hasil Pangkat - BRUTE FORCE");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari "
            + png[i].nilai +" pangkat "
            + png[i].pangkat +" adalah "
            + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }

        System.out.println("Hasil Pangkat - DIVIDE AND CONQUER");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari "
            + png[i].nilai +" pangkat "
            + png[i].pangkat +" adalah "
            + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }

        sc.close();

    }
    
}
