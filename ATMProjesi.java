package atmprojesi1;
import java.util.*;
public class ATMProjesi1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int hak =3;
        int toplamPara = 1500;
        int secim;
        
        while(hak>0){
            System.out.print("Kullanıcı adını giriniz:");
            userName = input.nextLine();
            System.out.print("Şifrenizi giriniz:");
            password = input.nextLine();
            if(userName.equals("kullanıcıadı") && password.equals("123456")){
                System.out.println("Merhaba. bankamıza hoşgeldiniz.");
                do{
                    System.out.println("LÜTFEN YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ.");
                    System.out.println("1-PARA YATIRMA");
                    System.out.println("2-PARA ÇEKME");
                    System.out.println("3-BAKİYE SORGULA");
                    System.out.println("4-ÇIKIŞ YAP");
                    secim = input.nextInt();
                    
                    switch(secim)
                    {
                        case 1: 
                            System.out.println("Yatırmak istediğiniz para miktarı:");
                            int miktar = input.nextInt();
                            toplamPara += miktar;
                            break;
                        case 2:
                            System.out.println("Çekmek istediğiniz para miktarı:");
                            int miktar1 = input.nextInt();
                            if(miktar1>toplamPara)
                            {
                                System.out.println("Yetersiz Bakiye.");
                            }
                            toplamPara -= miktar1;
                            break;
                        case 3:
                            System.out.println("Mevcut bakiyeniz:" + toplamPara);
                            break;
                        case 4:
                            System.out.println("TEKRAR BEKLERİ<.");
                            
                            
                    }
                }
                while(secim != 4);
         
            }
            else{
                hak--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if(hak==0)
                {
                    System.out.println("Hesabınız bloke edilmiştir. Lütfen müşteri temsilcisi ile ileitişime geçiniz.");
                    
                }
                else{
                    System.out.println("Kalan Hakkınız:" + hak);
                }
            }
        }
    }
    
}
