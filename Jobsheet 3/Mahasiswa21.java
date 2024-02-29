public class Mahasiswa21 {

    public String nama, nim;
    public char jk;
    public double ipk;

    public Mahasiswa21(String nama, String nim, char jk, double ipk){
        this.nama = nama;
        this.nim = nim;
        this.jk = jk;
        this.ipk = ipk;
    }

    public void tampilData(){
        System.out.println("Nama: "+nama);
        System.out.println("NIM: "+nim);
        System.out.println("Jenis Kelamin: "+jk);
        System.out.println("Nilai IPK: "+ipk);
    }
    
}
