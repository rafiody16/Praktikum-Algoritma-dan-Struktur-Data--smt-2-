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

}
