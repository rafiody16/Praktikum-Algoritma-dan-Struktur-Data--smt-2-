public class Bola21 extends BangunRuang21 {

    int jari2;

    public Bola21(int jari2){
        this.jari2 = jari2;
    }

    public void LuasPermukaan(){
        double lp = 4 * Math.PI * jari2 * jari2;
        System.out.println("Luas Permukaan Bola: "+lp);
    }

    public void Volume(){
        double vol = 3.0/4.0 * Math.PI * jari2 * jari2 * jari2;
        System.out.println("Volume Bola: "+vol);
    }
    
}
