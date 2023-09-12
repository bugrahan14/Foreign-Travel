import java.util.Scanner;

public class Yolcu implements Yurt_disi_kurallari {


    private int harc;
    private boolean siyasiyasak;
    private boolean vizedurumu;


    public Yolcu(){

        Scanner scanner=new Scanner(System.in);

        System.out.print("LÜTFEN HARÇ MİKTARINI GİRİNİZ");
        this.harc=scanner.nextInt();
        scanner.nextLine();

        System.out.println("HERHANGİ BİR SİYASİ YASĞINIZ BULUNUYOR MU ? ( EVET YA DA HAYIR) ŞEKLİNDE CEVAP VERİNİZ");

        String cevap=scanner.nextLine();

        if (cevap.equals("evet")){

            this.siyasiyasak=true;
        }
        else{
            this.siyasiyasak = false;
        }

        System.out.println("VİZENİZ BULUNUYOR MU ( EVET YA DA HAYIR ŞEKLİNDE CEVAP VERİNİZ)");
        String cevap2=scanner.nextLine();

        if (cevap2.equals("evet")){

            this.vizedurumu=true;
        }
        else{
            this.vizedurumu=false;
        }





    }
    @Override
    public boolean YurtDisiHarciKontrol() {

        if (this.harc<15){
            System.out.println("LÜTFEN YURTDIŞI HARÇ ÜCRETİNİ TAM YATIRINIZ");
            return false;
        }
        else{
            System.out.println("YURT DI;I HARÇ ÜCRETİ TAMAMLANDI:):):):):):)"); 
            return true;
        }
    }
    @Override
    public boolean SiyasiYasakKontrol() {

        if (this.siyasiyasak==true){

            System.out.println("SİYASİ YASAĞINIZ BULUNUYOR YURT DI;INA ÇIKAMAZSINIZ");
            return false;
        }
        else{
            System.out.println("SİYASİ YASĞINIZ BULUMAMAKTADIR ");
            return true;
        }
    }
    @Override
    public boolean VizeDurumuKontrol() {
        if (this.vizedurumu==true){
            System.out.println("VİZENİZ BULUNMAKTADIR");
            return  true;
        }
        else{
            System.out.println("VİZE İSLEMLERİNİZDE SORUN BULUNMAKTADIR");
            return   false ;
        }
    }



    
}
