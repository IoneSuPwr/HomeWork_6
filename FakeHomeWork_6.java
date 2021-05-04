package main.java.pack_6;

public class FakeHomeWork_6 {
    public static void main(String[] args) {
        Cat firstCat = new Cat("Sammy");
        Cat secondCat = new Cat("Vasya");
        Dog firstDog = new Dog("Grom");
        Dog secondDog = new Dog("Sharik");
        Dog thirdDog = new Dog("Klik");
        Dog fourDog = new Dog("Hatiko");

        firstCat.run(170);
        firstCat.swim(15);
        secondCat.run(300);
        firstDog.run(500);
        firstDog.swim(30);
        secondDog.swim(15);

        Cat.getCount();
        Dog.getCount();
        Animal.getCount();
    }
}
