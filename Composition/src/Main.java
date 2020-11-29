/*
inheritance işleminde is a ilişkisi bulunuyor (Yönetici aslında çalışandır ilişkisi vardı.)
Composition = burada sahiplik ilişkisi bulunuyor.(Has a)Bilgisayar monitöre sahiptir.
bilgisayar ekran kartına sahiptir gibi...
eğer parçalar tek başına anlam taşımıyorsa bir araya geldiklerinde anlamlı bütünler oluşturuyorlarsa bilgisayar örneğinde olduğu gibi 
monitor ,kasa (kasanın içindeki anakart),ekran kartı vb....
başka bir örnek vererirsek 
televizyon için televizonda tüm kanalları görmek izleyebilmek için 2018 den önceki televizyonlar için geçerli bu sistem.
televizyon ekranı televizyona ait bir kumanda bir adet decoder ve decoder kumandası diye biliriz
televizyon dan görüntü almak için bunlara ihtiyacınız var decoder tek başına anlam ifade etmiyor,decoder kumandası tek başına anlam ifade etmiyor
ama hepsi bir araya geldiğinde anlamlı bir bütün oluşturuyor.
Bu ve buna benzer yapılar için composition kullanmak mantıklıdır....(Tabiri elimden geldiğince anlaşılır yapmaya çalıştım eksiklerim için özür dilerim)
*/
public class Main {//Burası bizim test alanımızdır.
    public static void main(String[] args) {
        
 
      resolution resolution = new resolution(1920, 1080);
        Monitor monitor = new Monitor("VS197DE", "ASUS", "18.5", resolution);
        
        Kasa kasa = new Kasa("Shadow Blade", "Shadow", "Temperli Cam");
        
        Anakart anakart = new Anakart("B250-PRO","Asus",10,"Windows 10");
        
        Bilgisayar pc = new Bilgisayar(monitor, kasa, anakart);
        
        pc.getKasa().bilgisayari_ac();
        pc.getMonitor().monitoru_kapat();
        pc.getAnakart().isletim_sistemi_yukle("Ubuntu 16.04");
        
       }
    
    
}
