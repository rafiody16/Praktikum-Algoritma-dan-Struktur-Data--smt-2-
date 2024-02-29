import java.util.Scanner;

public class ArrayLat1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        BangunRuang21[] arrBangunRuang21 = new BangunRuang21[3];

        for (int i = 0; i < arrBangunRuang21.length; i++) {
            if (i == 0) {
                System.out.println("Kerucut");
                System.out.print("Masukkan jari-jari: ");
                int jari2 = sc.nextInt();
                System.out.print("Masukkan sisi miring: ");
                int SisiMiring = sc.nextInt();
                arrBangunRuang21[i] = new Kerucut21(jari2, SisiMiring);
            }
            if (i == 1) {
                arrBangunRuang21[i] = new BangunRuang21();
                System.out.println("Bola");
                System.out.print("Masukkan jari-jari: ");
                int jari2 = sc.nextInt();
                arrBangunRuang21[i] = new Bola21(jari2);
            }
            if (i == 2) {
                arrBangunRuang21[i] = new BangunRuang21();
                System.out.println("Limas Segi 4 Sama Sisi");
                System.out.print("Masukkan sisi: ");
                int sisi = sc.nextInt();
                System.out.print("Masukkan tinggi: ");
                int tinggi = sc.nextInt();
                arrBangunRuang21[i] = new LimasS4SamaSisi21(sisi, tinggi);
            }
            arrBangunRuang21[i].LuasPermukaan();
            arrBangunRuang21[i].Volume();
        }

    }
    
}
