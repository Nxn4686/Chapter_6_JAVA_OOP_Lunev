package Animals;

import FamilyTree.Person;

/**
 * Класс "Домашний кот", производный от класса Pet
 */
public class Cat extends Pet {
    /**
     * Конструктор с одним параметром, вызывает конструктор
     * родительского класса Pet
     *
     * @param name имя кота
     */
    public Cat(String name) {
        super(name);
    }

    /**
     * Конструктор с двумя параметрами, вызывает конструктор родительского класса Pet
     * @param name имя кота
     * @param owner хозяин кота
     */

    public Cat(String name, Person owner) {
        super(name, owner);
    }

    /**
     * Метод описывает, какой голос издает кот
     */
    @Override
    public void voice() {
        System.out.println("Мяу-Мяу");
    }
}
