package Animals;

import FamilyTree.Person;

/**
 * Класс "Собака", производное от класса Pet
 */
public class Dog extends  Pet {
    /**
     * Конструктор с одним параметром, вызывает конструктор родительского класса Pet
     *
     * @param name имя Собаки
     */
    public Dog(String name) {
        super(name);
    }

    /**
     * Конструктор с двумя параметрами,
     * вызывает конструктор родительского класса Pet
     * @param name имя Собаки
     * @param owner хозяин собаки
     */
    public Dog(String name, Person owner) {
        super(name, owner);
    }

    /**
     * метод описывает, какой голос издает собака
     */
    @Override
    public void voice() {
        System.out.println("Гав-гав\n");
    }
}
