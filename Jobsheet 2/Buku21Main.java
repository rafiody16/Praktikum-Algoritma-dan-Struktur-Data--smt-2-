public class Buku21Main {
    
    public static void main(String[] args) {
        Buku21 bk1 = new Buku21();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku21 bk2 = new Buku21("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku21 bukuRafiOdyPrasetyo = new Buku21("Laskar Pelangi", "Andrea Hirata", 
                                            529, 30, 150000);
        bukuRafiOdyPrasetyo.terjual(10);
        bukuRafiOdyPrasetyo.tampilInformasi();
        System.out.println("Total Hasil Penjualan : " + bukuRafiOdyPrasetyo.hitungHargaTotal());
        System.out.println("Anda Mendapatkan Diskon Sebesar : " + bukuRafiOdyPrasetyo.hitungDiskon());
        System.out.println("Total yang harus dibayar : " + bukuRafiOdyPrasetyo.hitungHargaBayar());
    }

}
