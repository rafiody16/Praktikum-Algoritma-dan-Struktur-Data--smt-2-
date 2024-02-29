public class ArraySegitiga21 {

    public static void main(String[] args) {
        
        Segitiga21[] arrSegitiga = new Segitiga21[4];

        arrSegitiga[0] = new Segitiga21(10, 4);
        arrSegitiga[1] = new Segitiga21(20, 10);
        arrSegitiga[2] = new Segitiga21(15, 6);
        arrSegitiga[3] = new Segitiga21(25, 10);

        for (int i = 0; i < arrSegitiga.length; i++) {
            System.out.println("Segitiga ke-"+i+" Memiliki Luas: "+ arrSegitiga[i].hitungLuas()+
            " dan Keliling: "+ arrSegitiga[i].hitungKeliling());
        }

    }
    
}
