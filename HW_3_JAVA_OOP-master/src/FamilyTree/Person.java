package FamilyTree;

import Animals.Animal;
/**
 * Производный класс от Member, наследует все методы и поля,
 * определяет дополнительный функционал
 */
public class Person extends Member {
    /**
     * Конструктор класса Person с тремя параметрами,
     * который вызывает конструктор родительского класса Member
     *
     * @param fullName имя и фамилия члена семьи
     * @param parent1 первый родитель члена семьи
     * @param parent2 второй родитель члена семьи
     */
    public Person(String fullName, TreeNode parent1, TreeNode parent2) {
        super(fullName, parent1, parent2);
    }

    /**
     *Конструктор класса Person с двумя параметрами,
     * который вызывает конструктор родительского класса
     *
     * @param fullName имя и фамилия члена семьи
     * @param parent  родитель члена семьи
     */
    public Person(String fullName, TreeNode parent) {
        super(fullName, parent);
    }

    /**
     * Конструктор класса Person с двумя параметрами,
     * который вызывает конструктор родительского класса
     *
     * @param fullName имя и фамилия члена семьи
     */
    public Person(String fullName) {
        super(fullName);
    }

    @Override
    public String toString() {
        return this.getFullName();
    }

    /**
     * Метод зовет домашнего питомца
     *
     * @param animal объект интерфейса Animal
     */
    public void callPet(Animal animal){
        animal.callReply(this);
    }
}
