package classProperty;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //kedi nesnesi
        Cat cat1 = new Cat();

        cat1.name = "Tarcin";
        cat1.color="yellow";
        cat1.age= 3;
        cat1.hungry =2;

        System.out.println("Kedinin ismi: " + cat1.name + "\nKedinin yaşı: " + cat1.age + "\nKedinin rengi: " + cat1.color);
        System.out.println("Kedinin açlık durumu: " + cat1.hungry);

        cat1.eatFood(3);

        System.out.println("Kedinin açlık durumu: " + cat1.hungry);

        //bilgisayar nesnesi
        Computer asus = new Computer();

        asus.brand = "asus";
        asus.price = 2.130;
        asus.processor_name = "Intel(R) Core i5-5200";
        asus.processor_ghz = 3.40;
        asus.ram = 4;

        asus.io_method("\nBilgisayar I_O methodlarını uygular..");
        System.out.println("Sistem Özellikleri"
                + "\nMarka: " + asus.brand
                + "\nFiyat: " + asus.price
                + "\nİşlemci modeli: " + asus.processor_name
                + "\nİşlemci Dönüş Hızı: " + asus.processor_ghz
                + "\nRAM: " + asus.ram);

        //üniversite nesnesi
        university uni_1 = new university();
        Scanner input = new Scanner(System.in);

        System.out.print("\nÜniversite adını giriniz: ");
        uni_1.name = input.nextLine();
        System.out.print("Bölüm adını giriniz: ");
        uni_1.department = input.nextLine();
        System.out.print("Öğrenim süresini giriniz: ");
        uni_1.years = input.nextInt();

        input.close();

        uni_1.io_university_info(uni_1.name, uni_1.department, uni_1.years);

        System.exit(0);

    }
}