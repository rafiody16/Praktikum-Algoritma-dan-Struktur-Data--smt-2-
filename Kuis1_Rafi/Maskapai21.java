/**
 * Maskapai21
 */
public class Maskapai21 {

    public String nomor, tujuan;
    public int tiket, tersedia, terdaftar;

    public Maskapai21(){

    }

    public Maskapai21(String nomor, String tujuan, int tiket, int tersedia, int terdaftar){
        this.nomor = nomor;
        this.tujuan = tujuan;
        this.tiket = tiket;
        this.tersedia = tersedia;
        this.terdaftar = terdaftar;
    }

    public void tampil(){
        System.out.println("Nomor Maskapai: "+nomor);
        System.out.println("Tujuan Maskapai: "+tujuan);
        System.out.println("Harga Tiket: "+tiket);
        System.out.println("Jumlah Kursi: "+tersedia);
        System.out.println("Penumpang Terdaftar: "+terdaftar);
    }

    public int hitungSisaKursi(){
        int sisaKursi = tersedia - terdaftar;
        return sisaKursi;
    }

    public void cariMaskapaiPalingSepi(Maskapai21[] arrMaskapai) {
        int maskapaiPalingSepi = arrMaskapai[0].hitungSisaKursi();
        Maskapai21 cariMaskapaiPalingSepi = arrMaskapai[0];

        for (int i = 1; i < arrMaskapai.length; i++) {
            int sisaKursi = arrMaskapai[i].hitungSisaKursi();
            if (sisaKursi > maskapaiPalingSepi) {
                maskapaiPalingSepi = sisaKursi;
                cariMaskapaiPalingSepi = arrMaskapai[i];
            }
        }

        System.out.println("Maskapai Paling Sepi:");
        cariMaskapaiPalingSepi.tampil();
        System.out.println("Sisa Kursi: " + maskapaiPalingSepi);
    }

    public void daftarMaskapai(Maskapai21[] arrMaskapai21){
        for (int i = 0; i < arrMaskapai21.length; i++) {
            for (int j = i + 1; j < arrMaskapai21.length; j++) {
                if (arrMaskapai21[i].tiket < arrMaskapai21[j].tiket) {
                    Maskapai21 daftar = arrMaskapai21[i];
                    arrMaskapai21[i] = arrMaskapai21[j];
                    arrMaskapai21[j] = daftar;
                }
            }
        }
        System.out.println("Daftar Maskapai (berdasarkan harga desc):");
        for (int i = 0; i < arrMaskapai21.length; i++) {
            System.out.println("Maskapai: " + arrMaskapai21[i].nomor + ", Harga: " + arrMaskapai21[i].tiket);
        }
    }


}