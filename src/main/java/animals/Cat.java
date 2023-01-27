package animals;

import help.OwnColor;

public class Cat extends Animal{ //наследование

    public Cat(int age, String name, OwnColor color) {
        super(age, name, color);
    }
    @Override //переопредение метода который в классе родителя
    public void Say() {
        System.out.println("Мяу");
    }

    public void playWithMouse() {
        System.out.println("Я играю с мышкой");
    }
}
