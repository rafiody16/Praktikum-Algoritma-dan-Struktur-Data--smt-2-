public class Segitiga21 {

    public int alas;
    public int tinggi;

    public Segitiga21(int a, int t){
        alas = a;
        tinggi = t;
    }

    public double hitungLuas(){
        return 0.5 * alas * tinggi;
    }

    public double hitungKeliling(){
        return Math.sqrt(alas * alas + tinggi * tinggi);
    }
    
}
