import java.util.Scanner;

public class Maskapai21Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Maskapai21[] arrMaskapai21 = new Maskapai21[5];

        for (int i = 0; i < arrMaskapai21.length; i++) {
            System.out.println("Masukkan data maskapai ke-"+(i+1));
            System.out.print("Nomor: ");
            String nomor = sc.nextLine();
            System.out.println("Tujuan: ");
            String tujuan = sc.nextLine();
            System.out.println("Harga Tiket: ");
            int tiket = sc.nextInt();
            System.out.println("Jumlah Kursi: ");
            int tersedia = sc.nextInt();
            System.out.println("Penumpang Terdaftar: ");
            int terdaftar = sc.nextInt();
            arrMaskapai21[i] = new Maskapai21(nomor, tujuan, tiket, tersedia, terdaftar);
            sc.nextLine();
            System.out.println();
        }

        for (int i = 0; i < arrMaskapai21.length; i++) {
            arrMaskapai21[i].tampil();
            System.out.println("Sisa Kursi: " + arrMaskapai21[i].hitungSisaKursi());
            System.out.println();
        }

        Maskapai21 maskapai = new Maskapai21();
        maskapai.cariMaskapaiPalingSepi(arrMaskapai21);
        System.out.println();
        maskapai.daftarMaskapai(arrMaskapai21);

        sc.close();
    }
    
}
