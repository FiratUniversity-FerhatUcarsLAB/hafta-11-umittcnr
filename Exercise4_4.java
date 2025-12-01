/*
 * Ad Soyad: [ümitcan çinar]
 * Ogrenci No: [250541009]
 * Tarih: [1/12/2025]
 * Aciklama: Gorev 4 - bazı ifadelerin Java tarafından nasıl degerlendirildigini görme görevi
 *
 * Bu program bazı ifadelerin Java tarafından nasıl degerlendirildigini daha iyi kavramamızı sağlar.
 */


    public class Exercise4_4 {

        public static int getNumber() {
            return 42;
            /* geTNumber() → yine 42 döndürür
	•	Ama biz bu değeri hiçbir değişkene atamadık ve hiç yazdırmadık
	•	Yani 42, hiçbir yerde gözükmez
	•	Program çalışır, hata vermez, sadece 42 “boşa gider”, yok sayılır */
        }

        public static void sayHello() {
            System.out.println("hello");
            System.out.println(sayHello() + 7); //Operator '+' cannot be applied to 'void', 'int' HATASI ALINIR
        //CUNKU VOİD METOTLARDA DONEN DEGER YOK NEYİ TOPLİCAZ Kİ ?
        }

        public static void main(String[] args) {
            getNumber();
        }

    }


// 1) Donus degerini kullanmayin -> ne oluyor?
// 2) void metodu ifade icinde kullanin -> ne oluyor?
// System.out.println(sayHello() + 7);
// Cevaplarinizi yorum olarak ekleyin.
