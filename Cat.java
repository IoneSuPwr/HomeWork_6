package main.java.pack_6;

public class Cat extends Animal {
    private static final int RUN_LIMIT = 200;
    private static int counter = 0;
    private final String name;

    public Cat(String name) {
        counter++;
        this.name = name;
    }

    @Override
    void  run(int length) {
        if ((length >= 0) && (length <= RUN_LIMIT)) {
            System.out.printf("Кот %s пробежал %d м. \n", name, length);
        } else {
            System.out.printf("Кот может пробежать только %d м.\n", RUN_LIMIT);
        }
    }

    @Override
    void swim(int length) {
        System.out.println("Кот не умееет плавать");
    }

    public static void getCount() {
        System.out.printf("Создано котов: %d\n", counter);
    }


}
