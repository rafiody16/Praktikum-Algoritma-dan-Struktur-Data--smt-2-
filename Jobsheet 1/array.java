import java.util.Scanner;
import java.math.BigDecimal;
public class array {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String mk [] = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking and Problem Solving", "Matematika Dasar",
        "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Kesehatan dan Keselematan Kerja"};
        int bobotSKS [] = {2, 2, 2, 3, 2, 2, 3, 2};
        double [] nilai  = new double[mk.length];

        for (int i = 0; i < mk.length; i++) {
            System.out.print("Masukkan Nilai Angka untuk MK "+ mk[i] +": ");
            nilai[i] = sc.nextDouble();
        }

        int totalSKS = 0;
        for (int i = 0; i < bobotSKS.length; i++) {
            totalSKS += bobotSKS[i];
        }

        double bobotNilai = 0;
        double totalNilai = 0;
        String predikat = " ";
        System.out.println("===========================================================================================================");
        System.out.printf("%-50s | %-15s | %-15s | %-15s\n", "Matkul", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < mk.length; i++) {
            if (nilai[i] > 80) {
                predikat = "A";
                bobotNilai = 4.00;
            } else if (nilai[i] > 73) {
                predikat = "B+";
                bobotNilai = 3.50;
            } else if (nilai[i] > 65) {
                predikat = "B"; 
                bobotNilai = 3.00;
            } else if (nilai[i] > 60) {
                predikat = "C+";
                bobotNilai = 2.50;
            } else if (nilai[i] > 50) {
                predikat = "C";
                bobotNilai = 2.00;
            } else if (nilai[i] > 39) {
                predikat = "D";
                bobotNilai = 1.00;
            } else {
                predikat = "E";
                bobotNilai = 0.00;
            }

            totalNilai += bobotNilai * bobotSKS[i];
            System.out.printf("%-50s | %-15s | %-15s | %-15s\n", mk[i], nilai[i], predikat, bobotNilai);
        }

        System.out.println("===========================================================================================================");
        double ips = totalNilai / totalSKS;
        BigDecimal ipSmt = new BigDecimal(ips);
        System.out.println("IP Semester: "+ ipSmt.setScale(2, BigDecimal.ROUND_HALF_UP));
        System.out.println("Total SKS: "+totalSKS);

    }

}
