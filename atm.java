import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String user,pw;
        int right=3,money=1500,select;
        for(int i=right;i>=0;i--)
        {
            System.out.println("Kullanici adinizi Giriniz :");
            user = inp.nextLine();
            System.out.println("Sifre Giriniz :");
            pw = inp.nextLine();

            if (user.equals("mert") && pw.equals("1993"))
            {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select=inp.nextInt();
                    int neww;
                    switch (select)
                    {
                        case 1:
                            System.out.print("Para miktarı : ");
                            neww = inp.nextInt();
                            money += neww;
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                            neww = inp.nextInt();
                            if (neww > money) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                money -= neww;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + money);
                            break;
                    }
                    }while (select!=4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            }
            else
            {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                    break;
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
            }
        }
    }
