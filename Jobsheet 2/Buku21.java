public class Buku21 {

    String judul, pengarang;
    int halaman, stok, harga, total, terjual, diskon, bayar;

    public Buku21() {
        
    }

    public Buku21(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi () {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: " + harga);        
    }

    void terjual (int jml) {
        if (stok > 0) {
            stok -= jml;
            this.terjual += jml;
        } else {
            System.out.println("Stok sudah habis!");
        }
    }

    void restock (int jml) {
        stok += jml;
    }
    
    void gantiHarga (int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal() {
        return  harga * terjual;
    }

    int hitungDiskon() {
        total = hitungHargaTotal();
        if (total > 1500000) {
            return (int) (0.12 * total);
        } else if (total >= 750000) {
            return (int) (0.05 * total);
        } else {
            return 0;
        }
    }

    int hitungHargaBayar() {
        bayar = hitungHargaTotal();
        diskon = hitungDiskon();
        return bayar - diskon;
    }

}
