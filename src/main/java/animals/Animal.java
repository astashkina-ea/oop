package animals;

import help.OwnColor;

public abstract class Animal {
    private int age;
    private String name;
    private OwnColor color;

    public Animal(int age, String name, OwnColor color) { //Конструктор - это специальный метод, который вызывается при создании нового объекта.
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public void Hello() {
        System.out.println("Привет меня зовут " + name);
    }

    public abstract void Say(); //делаем абстрактным тк каждое животное гооврит по своему

    public void Eat() {
        System.out.println("я ем");
    }

    public void Go() {
        System.out.println("я иду");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OwnColor getColor() {
        return color;
    }

    public void setColor(OwnColor color) {
        this.color = color;
    }
}
