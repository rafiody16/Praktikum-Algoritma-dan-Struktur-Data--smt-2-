public class DaftarMahasiswaBerprestasi21 {

    public Mahasiswa21 listMhs[] = new Mahasiswa21[5];
    public int idx;

    public void tambah(Mahasiswa21 m)
    {
        if (idx < listMhs.length) 
        {
            listMhs[idx] = m;
            idx++;
        }
        else
        {
            System.out.println("Data sudah penuh!!");
        }
    }

    public void tampil()
    {
        for (Mahasiswa21 m : listMhs) {
            m.tampil();
            System.out.println("------------------------");
        }
    }

    public void bubbleSort()
    {
        for (int i = 0; i < listMhs.length-1; i++) {
            for (int j = 1; j < listMhs.length-i; j++) {
                if (listMhs[j].ipk > listMhs[j-1].ipk) {
                    Mahasiswa21 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }
    
}
