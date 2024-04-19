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
    
}
