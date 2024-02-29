import java.util.Scanner;

public class ArrayLat2 {

    public static void main(String[] args) {

        double totalIPK = 0;
        double rata2IPK = 0;
        double mhsDiatasRT2 = 0;
        Scanner sc = new Scanner(System.in);
        Mahasiswa21[] arrMahasiswa = new Mahasiswa21[3];

        for (int i = 0; i < arrMahasiswa.length; i++) {
            System.out.println("Masukkan data mahasiswa ke- "+(i + 1));
            System.out.print("Masukkan nama: ");
            String nama = sc.nextLine();
            System.out.print("Masukkan nim: ");
            String nim = sc.nextLine();
            System.out.print("Masukkan jenis kelamin: ");
            char jk = sc.nextLine().charAt(0);
            System.out.print("Masukkan IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            arrMahasiswa[i] = new Mahasiswa21(nama, nim, jk, ipk);
            totalIPK += ipk;
            rata2IPK = totalIPK / arrMahasiswa.length;
            if (mhsDiatasRT2 < ipk) {
                mhsDiatasRT2 = ipk;
            }
        }

        System.out.println();

        for (int i = 0; i < arrMahasiswa.length; i++) {
            System.out.println("Data Mahasiswa ke- "+(i+1));
            arrMahasiswa[i].tampilData();
        }
        System.out.println("Rata-rata IPK: "+rata2IPK);
        System.out.println("IPK Terbesar: "+mhsDiatasRT2);

    }
    
}
