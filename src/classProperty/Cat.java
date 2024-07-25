package classProperty;

class Cat {
    String name;
    String color;
    int age;
    int hungry;

    //void anahtar kelimesi methodumuzun herhangi bir değer döndürmeyeceğini belirtiyor.
    void eatFood(int foodVal) {

        this.hungry += foodVal;
    }
}
