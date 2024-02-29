public class Kerucut21 extends BangunRuang21{

    public int jari2, SisiMiring;

    public Kerucut21(int jari2, int SisiMiring){
        this.jari2 = jari2;
        this.SisiMiring = SisiMiring;
    }

    public void LuasPermukaan(){
        double lp = Math.PI * jari2 * (jari2 + SisiMiring);
        System.out.println("Luas Permukaan Kerucut: "+lp);
    }

    public void Volume(){
        double vol = (1.0/3.0) * Math.PI * Math.pow(jari2, 2) * SisiMiring;
        System.out.println("Volume Kerucut: "+vol);
    }
    
}
