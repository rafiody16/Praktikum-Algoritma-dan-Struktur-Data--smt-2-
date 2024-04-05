public class PencarianBuku21{

    Buku21 listBk[] = new Buku21[5];
    int idx;

    PencarianBuku21()
    {
        listBk[4] = new Buku21("23D", "Filsafat", "Enzo Ali", 2004, 250);
        listBk[3] = new Buku21("15F", "Fisika", "Reynaldi", 2005, 101);
        listBk[2] = new Buku21("12A", "Geologi", "Simanjuntak", 2019, 120);
        listBk[1] = new Buku21("10B", "Biologi", "Lucas Enembe", 2005, 105);
        listBk[0] = new Buku21("47E", "Logaritma", "I Made Andika", 2004, 210);
    }

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

    public int FindSeqSearch(String cari)
    {
        int posisi = 2;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku.equals(cari)) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(String x, int pos)
    {
        if (pos != -1) {
            System.out.println("Data: "+ x +" ditemukan pada indeks "+ pos);
        } else {
            System.out.println("Data: "+ x +" tidak ditemukan");
        }
    }

    public void tampilData(String x, int pos)
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

    public Buku21 findBuku(String kodeBuku)
    {
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku.equals(kodeBuku)) {
                return listBk[i];
            }
        }
        return null;
    }

    public int FindBinarySearch(String cari, int left, int right)
    {
        int mid;
        if (right >= left) {
            mid = left + (right - left) / 2;
            int compareResult = cari.compareTo(listBk[mid].kodeBuku);
            if (compareResult == 0) {
                return mid;                 
            } else if (compareResult > 0) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public int FindSeqSearchbyJudul(String cari)
    {
        int count = -1;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].judulBuku.equalsIgnoreCase(cari)) {
                count = i;
                break;
            }
        }
        return count;
    }

    public int FindBinarySearchbyJudul(String cari, int left, int right)
    {
        int mid;
        if (right >= left) {
            mid = (right + left) / 2;
            if (listBk[mid].judulBuku.equalsIgnoreCase(cari)) {
                return mid;
            } else if (listBk[mid].judulBuku.compareToIgnoreCase(cari) < 0) {
                return FindBinarySearchbyJudul(cari, left, mid - 1);
            } else {
                return FindBinarySearchbyJudul(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public void bubbleSortKodeBuku()
    {
        for (int i = 0; i < listBk.length - 1; i++) {
            for (int j = 1; j < listBk.length - i; j++) {
                if (listBk[j].kodeBuku.compareTo(listBk[j - 1].judulBuku) < 0) {
                    Buku21 tmp = listBk[j];
                    listBk[j] = listBk[j - 1];
                    listBk[j - 1] = tmp;
                }
            }
        }
    }

    public void bubbleSortJudulBuku()
    {
        for (int i = 0; i < listBk.length - 1; i++) {
            for (int j = 1; j < listBk.length - i; j++) {
                if (listBk[j].judulBuku.compareToIgnoreCase(listBk[j - 1].judulBuku) < 0) {
                    Buku21 tmp = listBk[j];
                    listBk[j] = listBk[j - 1];
                    listBk[j - 1] = tmp;
                }
            }
        }
    }

}
