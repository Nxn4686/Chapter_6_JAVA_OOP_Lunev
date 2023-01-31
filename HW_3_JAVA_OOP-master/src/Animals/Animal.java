package Animals;
import FamilyTree.Person;

/**
 * Интерфейс, представляющий животных и
 * включающий 2 обязательных к реализайии метода
 */
public interface Animal {
    /**
     * Стандартный метод описывает, какой звук издает животное
     */
    public default void voice(){
        System.out.println("Не издает звуков");
    }

    /**
     * Метод описывает ответное поведение животного при вызове человеком
     * @param person человек, является объектом класса Person
     */
    public void callReply(Person person);
}
