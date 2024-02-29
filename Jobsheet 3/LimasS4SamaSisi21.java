public class LimasS4SamaSisi21 extends BangunRuang21{

    public int sisi, tinggi;

    public LimasS4SamaSisi21(int sisi, int tinggi){
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    public void LuasPermukaan(){
        double diagonal = Math.sqrt(Math.pow(sisi, 2) + Math.pow(sisi / 2, 2));
        double lp = 2 * sisi * diagonal + Math.pow(sisi, 2);
        System.out.println("Luas Permukaan Limas Segi 4 sama Sisi: "+lp);
    }

    public void Volume(){
        double vol = (sisi * sisi) * tinggi / 3;
        System.out.println("Volume Limas Segi 4 sama Sisi: "+vol);
    }
    
}
