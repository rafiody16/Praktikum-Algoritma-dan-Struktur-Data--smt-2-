public class Mahasiswa21 {

    public String nama;
    public int thnMasuk, umur;
    public double ipk;
    
    public Mahasiswa21(String n, int t, int u, double i)
    {
        nama = n;
        thnMasuk = t;
        umur = u;
        ipk = i;
    }

    public void tampil()
    {
        System.out.println("Nama: "+ nama);
        System.out.println("Tahun Masuk: "+ thnMasuk);
        System.out.println("Umur: "+ umur);
        System.out.println("IPK: "+ ipk);
    }
    
}
