import java.util.Scanner;

public class ArrayObjects21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang array: ");
        PersegiPanjang21[] ppArray = new PersegiPanjang21[sc.nextInt()];

        for (int i = 0; i < ppArray.length; i++) {
            ppArray[i] = new PersegiPanjang21();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi panjang ke-" + i);
            System.out.println("Panjang: "+ ppArray[i].panjang +", lebar: "+ ppArray[i].lebar);
        }

    }
    
}
