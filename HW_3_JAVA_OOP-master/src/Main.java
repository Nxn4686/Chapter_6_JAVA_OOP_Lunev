import Animals.Dog;
import FamilyTree.Person;
import FamilyTree.TreeNode;

public class Main {
    public static void main(String[] args) {
        TreeNode dad = new Person("Dad");
        TreeNode mom = new Person("Mom");
        dad.setSpouse(mom);

        TreeNode son = new Person("son", dad, mom);
        TreeNode daughter = new Person("daughter", dad, mom);

        TreeNode grandpa = new Person("grandpa");
        dad.setParent(grandpa);

        System.out.println(grandpa.getChildren());
        System.out.println(dad.getChildren());
        System.out.println(dad.getParent());
        System.out.println(mom.getChildren());
        System.out.println(mom.getParent());
        System.out.println(son.getParent());
        System.out.println(daughter.getParent());
        System.out.println(((Person) dad).getSpouse());


        Dog dog = new Dog("Jack", (Person) dad);
        dog.callReply((Person) mom);
        dog.voice();
        System.out.println(dog);
        ((Person) dad).callPet(dog);

        System.out.println(daughter.isSibling(son));


    }
}