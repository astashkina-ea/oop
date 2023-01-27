package animals;

import help.OwnColor;

public class Dog extends Animal{ //наследование
    public Dog(int age, String name, OwnColor color) {
        super(age, name, color); //super позволяет обратиться к классу родителя и выполнить такой же конструктор как у класса родителя
    }
    @Override //переопредение метода который в классе родителя - полиморфизм
    public void Say() {
        System.out.println("Гав");
    }

    public void aport() {
        System.out.println("Я несу палку");
    }

}
