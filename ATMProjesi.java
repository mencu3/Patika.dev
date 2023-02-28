import java.util.Scanner;

public class ATMProjesi {
    public static void main(String[] args) {
          Scanner input =  new Scanner(System.in);
          String userName,password;
          int right=3;
          int balance = 1500;
          int select;
          int price;
          while (right>0){
              System.out.print("Kullanıcı adınız:");
              userName = input.nextLine();

              System.out.print("Şifreniz:");
              password = input.nextLine();
              if (userName.equals("patika") && password.equals("dev123")){
                  System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz.");
                  do {
                      System.out.println("""
                              1-Para yatırma
                              2-Para çekme
                              3-Bakiye sorgulama
                              4-Çıkış Yap""");
                      System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz:");
                      select = input.nextInt();
                      switch (select){
                          case 1 -> {
                              System.out.print("Para miktari :");
                              price = input.nextInt();
                              balance+=price;
                              System.out.println("Hesabınıza başarıyla para yüklendi!");
                              System.out.println("Bakiyeniz:" + balance + "\nAna menüye yönlendiriliyorsunuz...");
                          }
                          case 2 -> {
                              System.out.print("Para miktarı:");
                              price = input.nextInt();
                              if (price > balance) {
                                  System.out.println("Bakiye yetersiz!");
                              } else {
                                  balance-=price;
                              }
                              System.out.println("Hesabınızdan" + price + "TL çekildi.");
                              System.out.println("Bakiyeniz:" + balance + "\nAna menüye yönlendiriliyorsunuz...");
                          }
                          case 3 -> System.out.println("Bakiyeniz:" + balance + "\nAna menüye yönlendiriliyorsunuz...");

                      }
              }while (select!=4);
                  System.out.println("Çıkış yaptınız.");
                  break;
          }else {
                  right--;
                  System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz!");
                  switch (right){
                      case 0 -> System.out.println("Hesabınız bloke olmuştur , lütfen banka ile iletişime geçiniz.");
                      default -> System.out.println("Kalan hakkınız:" + right);
                  }
              }
    }
}}
