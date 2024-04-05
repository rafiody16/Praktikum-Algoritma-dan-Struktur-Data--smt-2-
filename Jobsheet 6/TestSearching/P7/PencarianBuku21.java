public class PencarianBuku21{

    Buku21 listBk[] = new Buku21[5];
    int idx;

    public void tambah(Buku21 m)
    {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        }
        else {
            System.out.println("Data sudah penuh!");
        }
    }

    public void tampil() 
    {
        for (Buku21 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch(int cari)
    {
        int posisi = 2;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(int x, int pos)
    {
        if (pos != -1) {
            System.out.println("Data: "+ x +" ditemukan pada indeks "+ pos);
        } else {
            System.out.println("Data: "+ x +" tidak ditemukan");
        }
    }

    public void tampilData(int x, int pos)
    {
        if (pos != -1) {
            System.out.println("Kode Buku\t: "+ x);
            System.out.println("Judul\t\t: "+ listBk[pos].judulBuku);
            System.out.println("Tahun\t\t: "+ listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t: "+ listBk[pos].pengarang);
            System.out.println("Stock\t\t: "+ listBk[pos].stock);
        } else {
            System.out.println("Data: "+ x +" tidak ditemukan");
        }
    }

    public Buku21 findBuku(int kodeBuku)
    {
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku == kodeBuku) {
                return listBk[i];
            }
        }
        return null;
    }

    public int FindBinarySearch(int cari, int left, int right)
    {
        int mid;
        if (right >= left) {
            mid = left + (right - left) / 2;
            if (cari == listBk[mid].kodeBuku) {
                return mid;                 
            } else if (listBk[mid].kodeBuku < cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

}
