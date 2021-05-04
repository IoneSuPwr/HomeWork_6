package main.java.pack_6;

public class Dog extends Animal {
    private static final int RUN_LIMIT = 500;
    private static final int SWIM_LIMIT = 10;
    private static int counter = 0;
    private final String name;

    public Dog(String name) {
        counter++;
        this.name = name;
    }

    @Override
    void  run(int length) {
        if ((length >= 0) && (length <= RUN_LIMIT)) {
            System.out.printf("Пёс %s пробежал %d м. \n", name, length);
        } else {
            System.out.printf("Пёс может пробежать только %d м.\n", RUN_LIMIT);
        }
    }

    @Override
    void swim(int length) {
        if ((length >= 0) && (length <= SWIM_LIMIT)) {
            System.out.printf("Пёс %s проплыл %d м. \n", name, length);
        } else {
            System.out.printf("Пёс может проплыть только %d м.\n", SWIM_LIMIT);
        }
    }


    public static void getCount() {
        System.out.printf("Создано псов =): %d\n", counter);
    }


}

