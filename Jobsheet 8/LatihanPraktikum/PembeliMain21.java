package LatihanPraktikum;

import java.util.Scanner;

public class PembeliMain21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();
        Queue21 antri = new Queue21(jumlah);

        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.next();
                    System.out.print("No.Hp: ");
                    int noHp = sc.nextInt();
                    Pembeli21 nb = new Pembeli21(nama, noHp);
                    sc.nextLine();
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Pembeli21 data = antri.Dequeue();
                    if (!"".equals(data.nama) && data.noHp != 0) {
                        System.out.println("Antrian yang keluar: "+ data.nama +" "+ data.noHp);
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.daftarPembeli();
                    break;
                case 5:
                    antri.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan nama yang dicari: ");
                    String namaCari = sc.next();
                    antri.peekPosition(namaCari);
                    break;
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);

        sc.close();

    }

    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan: ");
        System.out.println("1. Antrian Baru\n2. Antrian Keluar\n3. Cek antrian terdepan\n4. Tampil data pembeli\n5. Cek antrian paling belakang\n6. Cari antrian");
        System.out.println("------------------------------");
    }
    
}
