import java.util.Scanner;

public class BukuMain21 {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku21 data = new PencarianBuku21();
        int jumBuku = 5;

        System.out.println("-------------------------");
        System.out.println("Masukkan data buku secara urut dari KodeBuku terkecil: ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("-----------");
            System.out.print("Kode Buku \t: ");
            int kodeBuku = s.nextInt();
            System.out.print("Judul Buku \t: ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t\t: ");
            int stock = s.nextInt();

            Buku21 m = new Buku21(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }

        System.out.println("-------------------------");
        System.out.println("Data Keseluruhan Mahasiswa: ");
        System.out.println("-------------------------");
        System.out.println("Data Keseluruhan Buku: ");
        data.tampil();

        System.out.println("___________________________");
        System.out.println("___________________________");
        System.out.println("Pencarian Data: ");
        System.out.println("Masukkan kode buku yang dicari: ");
        System.out.print("Kode Buku: ");
        int cari = s.nextInt();
        System.out.println("Menggunakan sequential search");
        int posisi = data.FindSeqSearch(cari);
        data.Tampilposisi(cari, posisi);
        data.tampilData(cari, posisi);

        //pertanyaan no.3 percobaan 1
        Buku21 dataBuku21 = data.findBuku(cari);
        dataBuku21.tampilDataBuku();

        s.close();
        s1.close();
    }
    
}
