
public class Test{


    public static void main(String[] args) throws InterruptedException{

        System.out.println("SABİHA GÖKÇEN HAVALİMANINA HO;GELDİNİZ ");
        
        String sartlar="YURT DISI ÇIKIS KURALLARI...\n"
                       +"HERHANGİ BİR SİYASİ YASAĞINIZIN OLMAMASI GEREKİYOR\n"
                       +"15 TL OLAN HARÇ BEDELİNİ EKSİKSİZ ÖDEMENİZ GEREKİYOR\n"
                       +"GİDECEĞİNİZ ÜLKEYE VİZENİZİN OLMASI GEREKİYOR......";

        String message="YURTDISINA GİTMENİZ İÇİN TÜM SARTLARI SAĞLAMANIZ GEREKİYOR.";


        while (true){

            System.out.println("******************************");
            System.out.println(sartlar);
            System.out.println("******************************");


            Yolcu yolcu=new Yolcu();

            System.out.println("HARÇ BEDELİ KONTROL EDİLİYOR");

            Thread.sleep(3000);

            if (yolcu.YurtDisiHarciKontrol()==false){
                System.out.println(message);
                continue;
            }
            
            System.out.println("SİYASİ YASAK KONTROL EDİLİYOR");
            Thread.sleep(3000);
            if (yolcu.SiyasiYasakKontrol()==true){
                System.out.println(message);
                continue;
            }
            

            System.out.println("VİZE DURUMU KONROL EDİLİYOR");
            Thread.sleep(3000);
            if (yolcu.VizeDurumuKontrol()==false){
                System.out.println(message);
                continue;
            }
            

            System.out.println("İSLEMLERİNİZ TAMAMLANDI YURT DISINA ÇIKABİLİRİSİNİZ İYİ YOLCULUKLAR");
            break;
        }

        
                       

    }






}