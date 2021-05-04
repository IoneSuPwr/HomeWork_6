package main.java.pack_6;

public abstract class Animal {
    private static int counter = 0;

    public Animal() {
        counter++;
    }

    abstract void run(int length);
    abstract void swim(int length);

    public static void getCount() {
        System.out.printf("Создано животных: %d\n", counter);

    }

}
