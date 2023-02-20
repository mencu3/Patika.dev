import java.util.Scanner;
public class KullaniciGiris {
    public static void main(String[] args) {
        String newpass,userName,password;
        int deger;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanici adini giriniz:");
        userName = inp.nextLine();

        System.out.print("şifre  giriniz:");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş yaptınız!");
        }
        {
            System.out.println("giriş başarısız yeni şifre oluşturulsun mu \n 1-Evet\n 2-Hayır");
            deger=inp.nextInt();
            if (deger==1)
            {
                System.out.println("yeni şifre giriniz");
                inp.nextLine();
                newpass=inp.nextLine();

                if (newpass.equals("java123"))
                {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                else
                {
                    System.out.println("Şifre oluşturuldu");
                }
            }
            else
            {
                System.out.println("şifreniz değiştirilmedi");
            }
        }

    }
}
