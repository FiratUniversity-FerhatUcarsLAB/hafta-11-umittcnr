/*
 * Ad Soyad: [ümitcan çinar]
 * Ogrenci No: [250541009]
 * Tarih: [1/12/2025]
 * Aciklama: Gorev 6 - Bu egzersizde metot tanımları üzerinde kendimizi geliştiriyoruz
 */

public class Exercise4_6 {

    public static double multadd(double a, double b, double c) {
        return a*b+c;
    }

    public static double xpSum(double x) {
        // e^(-x) terimini hesaplayalım. Bu terim iki yerde kullanılıyor.
        double exp_neg_x = Math.exp(-x);

        // İfadenin ilk kısmı: x * e^(-x)
        double term1 = x * exp_neg_x;

        // İfadenin ikinci kısmı: (1 - e^(-x))
        double term2 = 1.0 - exp_neg_x;

        // İki terimin toplamı: term1 + term2
        return term1 + term2;
    }


    public static void main(String[] args) {
        double sonuc1= multadd(Math.cos(Math.PI/4),1/2,Math.sin(Math.PI/4));
        double sonuc2= multadd(1,Math.log(10),Math.log(20));
        System.out.printf("sonuc1 =%.2f %n" , sonuc1);
        System.out.printf("sonuc2 =%.2f %n" , sonuc2);
        double x_value = 2.5;
        double result = xpSum(x_value);
        System.out.println("x = " + x_value + " için sonuç: " + result);
    }
}
