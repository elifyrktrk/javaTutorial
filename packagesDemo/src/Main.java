//built-in > javada böyle bir paket var
import matematik.*;
import java.util.Scanner;//Kullanıcıdan bilgi almaya yarar.

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adınız :");

        String sayi = scanner.nextLine();

        DortIslem dortIslem = new DortIslem();
        dortIslem.topla(6,4);
        Logaritma logaritma = new Logaritma();
    }
}