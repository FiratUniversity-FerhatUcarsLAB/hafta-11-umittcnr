/*
 * Ad Soyad: [ümitcan çinar]
 * Ogrenci No: [250541009]
 * Tarih: [1/12/2025]
 * Aciklama: Gorev 2 - method çalışma sırası egzersizi
 *
 * Bu program metotların çalışma sırasını kavrmayı ve parametre,argüman değişkenlerini anlamamızı sağlar.
 */

public class Exercise4_2 {

    // Her satirin sonuna calisma sirasi yorumlarini ekleyin.

    public static void main(String[] args) {              //1
        zippo("rattle", 13);                              //2
    }

    public static void baffle(String blimp) {             //5
        System.out.println(blimp);                        //6
        zippo("ping", -5);                                //7
    }

    public static void zippo(String quince, int flag) {   //3,8
        if (flag < 0) {                                   //9
            System.out.println(quince + " zoop");         //10
        } else {                                          //(else bi komut değildir yönlendşrmedir.)
            System.out.println("ik");                     //3
            baffle(quince);                               //4
            System.out.println("boo-wa-ha-ha");           //1
        }
    }
}

/*sorular
1-> sıralama yapıldı
2-> rattle
3->
ik
rattle
ping zoop
boo-wa-ha-ha
4-> 14.satır 2 kere çalışır (3,8 numaralı çalışma sıraları ile)
 */
