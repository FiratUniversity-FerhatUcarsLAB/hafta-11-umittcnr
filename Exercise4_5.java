/*
 * Ad Soyad: [ümitcan çinar]
 * Ogrenci No: [250541009]
 * Tarih: [1/12/2025]
 * Aciklama: Gorev 5 - Bu egzersizde programın ¸cagrı yıgını (stack) davranısını anlamanız
bekleniyor.
 */


public class Exercise4_1 {

    public static void zoop(String fred, int bob) {
        System.out.println(fred);
        if (bob == 5) {
            ping("not ");
        } else {
            System.out.println("!");
        }
    }

    public static void main(String[] args) {
        int bizz = 5;
        int buzz = 2;
        zoop("just for", bizz);
        clink(2 * buzz);
    }

    public static void clink(int fork) {
        System.out.print("It's ");
        zoop("breakfast ", fork);
    }

    public static void ping(String strangStrung) {
        System.out.println("any " + strangStrung + "more ");
    }
}
/*
main start and go to zoop
zoop print "just for"
"any " + "not" + "more " and go back to main
main go to clink
clink is print "It's " and go to zoop and zoop is print "breakfast "(ZOOP İKİNCİ KEZ ÇAĞRILDI)
"!"
main finish
 */

/* tam çıktı
just for
any not more
It's breakfast
!
 */
