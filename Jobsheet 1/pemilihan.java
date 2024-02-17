import java.util.Scanner;

public class pemilihan {
    public static void main(String[] args) {

        boolean valid = true;
        String predikat;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("PROGRAM MENGHITUNG NILAI AKHIR");
        System.out.println("================================");

        System.out.print("Masukkan Nilai Tugas (0-100): ");
        Double nilaiTugas = sc.nextDouble();
        if (nilaiTugas > 100 || nilaiTugas < 0) {
                 valid = false;
        }

        System.out.print("Masukkan Nilai Kuis (0-100): ");
        Double nilaiKuis = sc.nextDouble();
        if (nilaiKuis > 100 || nilaiKuis < 0) {
                valid = false;
        }

        System.out.print("Masukkan Nilai UTS (0-100): ");
        Double nilaiUTS = sc.nextDouble();
        if (nilaiUTS > 100 || nilaiUTS < 0) {
                valid = false;
        }
        System.out.print("Masukkan Nilai UAS (0-100): ");
        Double nilaiUAS = sc.nextDouble();
            if (nilaiTugas > 100 || nilaiTugas < 0) {
                valid = false;
            }

        System.out.println("==============================");

        Double nilaiAkhir = (nilaiTugas * 0.2) + (nilaiKuis * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
        
        if (nilaiAkhir > 80) {
            predikat = "A";
        } else if (nilaiAkhir > 73) {
            predikat = "B+";
        } else if (nilaiAkhir > 65) {
            predikat = "B";
        } else if (nilaiAkhir > 60) {
            predikat = "C+";
        } else if (nilaiAkhir > 50) {
            predikat = "C";
        } else if (nilaiAkhir > 39) {
            predikat = "D";
        } else {
            predikat = "E";
        }

        if (valid = false) {
            System.out.println("Nilai Tidak Valid!");
        } else {
            System.out.println("Nilai Akhir: "+nilaiAkhir);
            System.out.println("Predikat Nilai: "+predikat);
            System.out.println("=============================");
            if (predikat == "D" || predikat == "E") {
                System.out.println("Anda Tidak Lulus!");
            } else {
                System.out.println("Selamat Anda Lulus!");
            }
        }

        System.out.println("==============================");

    }
    
}