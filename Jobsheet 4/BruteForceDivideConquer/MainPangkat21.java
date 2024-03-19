import java.util.Scanner;

public class MainPangkat21 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("==================================");
        System.out.print("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();

        Pangkat21 [] png = new Pangkat21[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai yang ingin dipangkatkan: ");
            int nilai = sc.nextInt();
            System.out.print("Masukkan nilai pangkat: ");
            int pangkat = sc.nextInt();
            png [i] = new Pangkat21(nilai, pangkat);
            System.out.println();
            sc.nextLine();
        }

        System.out.println("Main Menu");
        System.out.println("1. Hasil Pangkat BF\n2. Hasil Pangkat DC");
        System.out.print("Pilih: ");
        int pilih = sc.nextInt();

        switch (pilih) {
            case 1:
                System.out.println("Hasil Pangkat - BRUTE FORCE");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari "
                    + png[i].nilai +" pangkat "
                    + png[i].pangkat +" adalah "
                    + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            
            case 2:
                System.out.println("Hasil Pangkat - DIVIDE AND CONQUER");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari "
                    + png[i].nilai +" pangkat "
                    + png[i].pangkat +" adalah "
                    + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
        
            default:
                break;
        }

        sc.close();

    }
    
}
