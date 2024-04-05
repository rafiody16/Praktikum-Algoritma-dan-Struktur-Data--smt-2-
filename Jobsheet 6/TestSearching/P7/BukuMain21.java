import java.util.Scanner;

public class BukuMain21 {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku21 data = new PencarianBuku21();
        int jumBuku = 5;

        // System.out.println("-------------------------");
        // System.out.println("Masukkan data buku secara urut dari KodeBuku terkecil: ");
        // for (int i = 0; i < jumBuku; i++) {
        //     System.out.println("-----------");
        //     System.out.print("Kode Buku \t: ");
        //     int kodeBuku = s.nextInt();
        //     System.out.print("Judul Buku \t: ");
        //     String judulBuku = s1.nextLine();
        //     System.out.print("Tahun Terbit \t: ");
        //     int tahunTerbit = s.nextInt();
        //     System.out.print("Pengarang \t: ");
        //     String pengarang = s1.nextLine();
        //     System.out.print("Stock \t\t: ");
        //     int stock = s.nextInt();

        //     Buku21 m = new Buku21(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
        //     data.tambah(m);
        // }

        System.out.println("-------------------------");
        System.out.println("Data Keseluruhan Mahasiswa: ");
        System.out.println("-------------------------");
        System.out.println("Data Keseluruhan Buku: ");
        data.tampil();

        System.out.println("___________________________");
        System.out.println("___________________________");
        System.out.println("Pencarian Data: ");
        System.out.println("1. Pencarian Berdasarkan Kode Buku\n2. Pencarian Berdasarkan Judul Buku");
        System.out.print("Pilih: ");
        int pilih = s.nextInt();
        switch (pilih) {
            case 1:
                System.out.println("___________________________");
                System.out.println("Data Kode Buku Sesudah dilakukan sorting: ");
                data.bubbleSortKodeBuku();
                data.tampil();
                System.out.println("___________________________");
                System.out.print("Kode Buku: ");
                String cari = s1.nextLine();
                System.out.println("Menggunakan sequential search");
                int posisi = data.FindSeqSearch(cari);
                data.Tampilposisi(cari, posisi);
                data.tampilData(cari, posisi);

                //pertanyaan no.3 percobaan 1
                // Buku21 dataBuku21 = data.findBuku(cari);
                // dataBuku21.tampilDataBuku();

                 System.out.println("___________________________");
                 System.out.println("Menggunakan Binary Search");
                 posisi = data.FindBinarySearch(cari, 0, data.listBk.length - 1);
                 data.Tampilposisi(cari, posisi);
                 data.tampilData(cari, posisi);
                break;

            case 2:
                System.out.println("___________________________");
                System.out.println("Data Judul Buku Sesudah dilakukan sorting: ");
                data.bubbleSortJudulBuku();
                data.tampil();
                System.out.println("___________________________");
                System.out.print("Judul Buku: ");
                String cariJdl = s1.nextLine();
                System.out.println("Menggunakan sequential search");
                int posisiJdl = data.FindSeqSearch(cariJdl);
                data.Tampilposisi(cariJdl, posisiJdl);
                data.tampilData(cariJdl, posisiJdl);
                System.out.println("___________________________");
                System.out.println("Menggunakan Binary Search");
                posisi = data.FindBinarySearch(cariJdl, 0, data.listBk.length - 1);
                data.Tampilposisi(cariJdl, posisiJdl);
                data.tampilData(cariJdl, posisiJdl);
                break;    
        
            default:
                break;
        }


        s.close();
        s1.close();
    }
    
}
