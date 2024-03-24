public record MainHotel21() {

    public static void main(String[] args) {

        HotelService21 list = new HotelService21();
        Hotel21 h1 = new Hotel21("Oyo", "Malang", 25000, (byte) 3);
        Hotel21 h2 = new Hotel21("Airi", "Surabaya", 10000, (byte) 4);
        Hotel21 h3 = new Hotel21("Santika", "Jakarta", 19000, (byte) 5);
        Hotel21 h4 = new Hotel21("RedDoorz", "Jember", 23000, (byte) 2);
        Hotel21 h5 = new Hotel21("Mercure", "Bogor", 21000, (byte) 3);

        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);

        System.out.println("Data Hotel sebelum di sorting: ");
        list.tampilAll();

        System.out.println("Data harga hotel asc bubble sort: ");
        list.bubbleSortHrg();
        list.tampilAll();

        System.out.println("Data rating hotel desc bubble sort: ");
        list.bubbleSortRtg();
        list.tampilAll();

        System.out.println("Data harga hotel asc selection sort: ");
        list.selectionSortHrg();
        list.tampilAll();

        System.out.println("Data rating hotel desc selection sort: ");
        list.selectionSortRtg();
        list.tampilAll();
    }
    
}
