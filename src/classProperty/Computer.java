package classProperty;

class Computer {
    String brand = "bilgisayar markası girilmedi";//default deger
    String processor_name = "İşlemci markası girilmedi";//default deger
    double processor_ghz = 0.0;//default deger
    double price = 0.0;//default deger
    int ram = 0;//default deger

    void io_method(String value) {

        System.out.println(value);
    }
}
