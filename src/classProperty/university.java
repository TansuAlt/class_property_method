package classProperty;

class university {
    String name;
    String department;
    int years;

    void io_university_info(String name, String department, int years) {
        this.name = name;
        this.department = department;
        this.years = years;
        System.out.println("Değişiklikler kaydedildi.");
        System.out.println("Üniversite adı:" + this.name
                + "\nÜniversite bölümü:" + this.department
                + "\nÖğrenim süresi:" + this.years);
    }
}
