public class Gudang21 {

    Barang21[] tumpukan;
    int size, top;

    public Gudang21(int kapasitas)
    {
        size = kapasitas;
        tumpukan = new Barang21[size];
        top = -1;
    }

    public boolean cekKosong()
    {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh()
    {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang21 brg)
    {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang "+ brg.nama +" berhasil ditambahkan ke gudang.");
        } else {
            System.out.println("Gagal! Tumpukan barang di gudang sudah penuh");
        }
    }

    public Barang21 ambilBarang()
    {
        if (!cekKosong()) {
            Barang21 delete = tumpukan[top];
            top--;
            System.out.println("Barang "+ delete.nama +" berhasil diambil dari gudang");
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public Barang21 lihatBarangTeratas() 
    {
        if (!cekKosong()) {
            Barang21 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public void tampilkanBarang() 
    {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukkan barang di gudang: ");
            for (int i = 0; i <= top; i++) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, 
                    tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }

    public Barang21 lihatBarangTerbawah() 
    {
        if (!cekKosong()) {
            Barang21 barangTeratas = tumpukan[0];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public Barang21 cariBarang(String input) {
        if (!cekKosong()) {
            for (int i = 0; i <= top; i++) {
                String kode = Integer.toString(tumpukan[i].kode);
                if (tumpukan[i].nama.equalsIgnoreCase(input) || kode.equalsIgnoreCase(input)) {
                    System.out.printf("Barang dengan kode %d dan nama %s ditemukan di Gudang\n", tumpukan[i].kode,
                            tumpukan[i].nama);
                    return tumpukan[i];
                }
            }
            System.out.println("Barang tidak ditemukan di Gudang");
            return null;
        } else {
            System.out.println("Tumpukan Barang di Gudang kosong");
            return null;
        }
    }
    
}
