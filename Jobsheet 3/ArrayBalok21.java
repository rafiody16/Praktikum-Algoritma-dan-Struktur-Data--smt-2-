public class ArrayBalok21 {

    public static void main(String[] args) {
        
        Balok21[] blArray = new Balok21[3];

        blArray[0] = new Balok21(100, 30, 12);
        blArray[1] = new Balok21(120, 40, 15);
        blArray[2] = new Balok21(210, 50, 25);

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume balok ke "+ i +": "+ blArray[i].hitungVolume());
        }

    }
    
}
