public class Kerucut21 {

    public int jari2, tinggi, gPelukis;

    public Kerucut21(int r, int t, int s){
        jari2 = r;
        tinggi = t;
        gPelukis = s;
    }

    public double LPKerucut(){
        return 3.14 * jari2 * (jari2 + gPelukis);
    }

    public double VolKerucut(){
        return 1/3 * 3.14 * jari2 * jari2 * tinggi;
    }
    
}
