package ru.elengaupt.animals;

public class CatDecorator implements Meowable {
    private Cat cat;

    @Override
    public void meow() {
        cat.meow();
        System.out.println("Кот мяукнул 1 раз");
    }

    @Override
    public void meowMany(int count) {
        cat.meowMany(count);
        System.out.println("Кот мяукнул " + count + " раз");
    }
}
