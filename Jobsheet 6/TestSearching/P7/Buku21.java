public class Buku21 {

    public int kodeBuku, tahunTerbit, stock;
    public String judulBuku, pengarang;

    public Buku21(int kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock)
    {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }

    public void tampilDataBuku()
    {
        System.out.println("========================");
        System.out.println("Kode Buku: "+ kodeBuku);
        System.out.println("Judul Buku: "+ judulBuku);
        System.out.println("Tahun Terbit: "+ tahunTerbit);
        System.out.println("Pengarang: "+ pengarang);
        System.out.println("Stock: "+ stock);
    }
    
}
