public class MainShowroom21 {

    public static void main(String[] args) {
        int[] arrAcc = { 6816, 3921, 4360, 4058, 6255, 3700, 4180, 4180 };
        int[] arrPwr = { 728, 575, 657, 609, 703, 553, 609, 631 };

        System.out.println("Merk                     Tipe    Top Acceleration   Top Power\n" +
        "BMW M2 Coupe             2016    6816               728\n" +
        "Ford Fiesta ST           2014    3921               575\n" +
        "Nissan 370Z              2009    4360               657\n" +
        "Subaru BRZ               2014    4058               609\n" +
        "Subaru Impreza WRX STI   2013    6255               703\n" +
        "Toyota AE86 Trueno       1986    3700               553\n" +
        "Toyota 86/GT86           2014    4180               609\n" +
        "Volkswagen Golf GTI      2014    4180               631\n");

        Showroom21 rslt = new Showroom21();

        int maxAcc = rslt.upTopAcc(arrAcc, 0, arrAcc.length - 1);
        System.out.println("Nilai Top Acceleration Terbesar: "+ maxAcc);
        int minAcc = rslt.minTopAcc(arrAcc, 0, arrAcc.length - 1);
        System.out.println("Nilai Top Acceleration Terkecil: "+ minAcc);
        double avgPower = rslt.avgPower(arrPwr);
        System.out.println("Rata2 Top Power: "+avgPower);
    }
    
}
