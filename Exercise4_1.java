/*
 * Ad Soyad: [ümitcan çinar]
 * Ogrenci No: [250541009]
 * Tarih: [1/12/2025]
 * Aciklama: Gorev 1 - method çalıştırma egzersizi
 *
 * Bu program metotların çalışmasını kavramayı, parametrelerin sıralarına göre alınan argümanları sıralamayı öğretir.
 */
public class Exercise4_1 {
    public static void main(String[] args) {
       printAmerican("pazartesi ", 22 , " haziran ", 2025);
       printEuropan(22 , " haziran ", 2025 , " pazartesi ");
    }
    public static void printAmerican(String gun,int tarih,String ay,int yil){
        System.out.println(gun + tarih + ay + yil);
    }
    public static void printEuropan(int tarih,String ay,int yil,String gun){
        System.out.println(tarih + ay + yil + gun);
    }
}
