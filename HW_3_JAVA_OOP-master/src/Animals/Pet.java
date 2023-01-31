package Animals;

import FamilyTree.Person;

/**
 * Абстрактный базовый класс, представляет собой домашних питомцев,
 * определяет состояние и поведение, реализует методы интерфейса Animal
 */
public abstract class Pet implements Animal {
    private final String name;
    private Person owner;

    /**
     * Конструктор с одним параметром
     *
     * @param name имя питомца
     */
    public Pet(String name) {
        this.name = name;
    }

    /**
     * Конструктор с двумя параметром
     *
     * @param name  имя питомца
     * @param owner хозяин питомца
     */
    public Pet(String name, Person owner) {
        this(name);
        this.owner = owner;
    }

    /**
     * Дает доступ к приватному полю "имя"
     *
     * @return озвращает имя питомца
     */
    public String getName() {
        return name;
    }

    @Override
    public void callReply(Person person) {
        System.out.printf("Бежит навстречу к %s\n", person.getFullName());
    }

    @Override
    public String toString() {
        return String.format("Кличка: %s, Хозяин: %s\n", name, owner.getFullName());
    }
}
