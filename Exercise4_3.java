/*
 * Ad Soyad: [ümitcan çinar]
 * Ogrenci No: [250541009]
 * Tarih: [1/12/2025]
 * Aciklama: Gorev 3 - Stack diyagramı olluşturma görevi
 *
 * Bu program stack diyagramları sayesinde paramtre aergüman yapısını ve sırasını daha iyi kavramamızı sağlar.
 */

public class Exercise4_1 {


        public static void zoop() {
            baffle();
            System.out.print("You wugga");
            baffle();
        }

        public static void main(String[] args) {
            System.out.print("No, I ");
            zoop();
            System.out.print(" I ");
            baffle();
        }

        public static void baffle() {
            System.out.print("wug");
            ping();
        }

        public static void ping() {
            System.out.println(".");
        }
    
}
 /*
 main go to zoop (firstly print "No.I")
 zoop go to baffle (firstly print "wug")
 baffle go to ping
 ping print (".")
 and come back zoop , it print ("You wugga")
 zoop go to baffle
 baffle print ("wug") and go to ping
 ping print (".")
 and come back to main it print ("I")
 main go to baffle and it print ("wug")
 and baffle go to ping and it print (".")
  */

/* tam çıktı
No, I wug.
you wuggawug.
 I wug.
 */

