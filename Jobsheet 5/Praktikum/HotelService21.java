public class HotelService21 {

    public Hotel21 rooms[] = new Hotel21[5];
    public int idx;

    public void tambah(Hotel21 h)
    {
        if (idx < rooms.length) {
            rooms[idx] = h;
            idx++;
        }
        else
        {
            System.out.println("Data sudah penuh!!");
        }
    }

    public void tampilAll()
    {
        for (Hotel21 h : rooms) {
            System.out.println("Nama: "+ h.nama);
            System.out.println("Kota: "+ h.kota);
            System.out.println("Harga: "+ h.harga);
            System.out.println("Bintang: "+ h.bintang);
            System.out.println("------------------------");
        }
    }

    public void bubbleSortHrg()
    {
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 1; j < rooms.length - i; j++) {
                if (rooms[j].harga < rooms[i].harga) {
                    Hotel21 temp = rooms[j];
                    rooms[j] = rooms[j - 1];
                    rooms[j - 1] = temp;
                }
            }
        }
    }

    public void bubbleSortRtg()
    {
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 1; j < rooms.length - i; j++) {
                if (rooms[j].bintang > rooms[i].bintang) {
                    Hotel21 temp = rooms[j];
                    rooms[j] = rooms[j - 1];
                    rooms[j - 1] = temp;
                }
            }
        }
    }

    public void selectionSortHrg()
    {
        for (int i = 0; i < rooms.length; i++) {
            int idxMin = i;
            for (int j = i+1; j < rooms.length; j++) {
                if (rooms[j].harga < rooms[idxMin].harga) {
                    idxMin = j;
                }
            }
            Hotel21 tmp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = tmp; 
        }
    }

    public void selectionSortRtg()
    {
        for (int i = 0; i < rooms.length; i++) {
            int idxMin = i;
            for (int j = i+1; j < rooms.length; j++) {
                if (rooms[j].bintang > rooms[idxMin].bintang) {
                    idxMin = j;
                }
            }
            Hotel21 tmp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = tmp; 
        }
    }
    
}
