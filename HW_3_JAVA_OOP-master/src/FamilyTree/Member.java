package FamilyTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Базовый абстрактный класс для описания члена семьи, реализующий
 * интерфейс TreeNode и включающий в себя
 * базовый функционал производных классов.
 */
public abstract class Member implements TreeNode {
    private String fullName;
    private TreeNode spouse;
    private List<TreeNode> parents;
    private List<TreeNode> children;

    {
        parents = new ArrayList<>();
        children = new ArrayList<>();
    }

    /**
     * Конструктор с одним параметром
     *
     * @param fullName имя и фамилия члена семьи
     */
    public Member(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Конструктор с двумя параметрами.
     *
     * @param fullName имя и фамилия члена семьи
     * @param parent   родитель члена семьи
     */
    public Member(String fullName, TreeNode parent) {
        this.fullName = fullName;
        this.setParent(parent);
    }

    /**
     * Конструктор с тремя аргументами
     *
     * @param fullName имя и фамилия члена семьи
     * @param parent1  первый родитель члена семьи
     * @param parent2  второй родитель члена семьи
     */
    public Member(String fullName, TreeNode parent1, TreeNode parent2) {
        this(fullName, parent1);
        this.setParent(parent2);
    }

    /**
     * Дает доступ к приватному полю: имя и фамилия члена семьи
     *
     * @return возвращаемый тип - строка.
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Метод предоставляет доступ к супруге
     *
     * @return возвращает объект интерфейса TreeNode
     */
    public TreeNode getSpouse() {
        return spouse;
    }

    /**
     * Устанавливает связь "супруг - супруга" между объектами
     *
     * @param spouse супруг/супругв
     */
    @Override
    public void setSpouse(TreeNode spouse) {
        this.spouse = spouse;
        if (((Person) spouse).getSpouse() == null) {
            spouse.setSpouse(this);
        }
    }

    @Override
    public List<TreeNode> getParent() {
        return parents;
    }

    @Override
    public void setParent(TreeNode parent) {
        if (parents.size() < 2) {
            parents.add(parent);
        } else {
            System.out.println("Не может быть более 2-х родителей");
        }
        parent.addChild(this);
    }

    @Override
    public List<TreeNode> getChildren() {
        return children;
    }

    @Override
    public void addChild(TreeNode child) {
        children.add(child);
        if (!(child.getParent().contains(this))) {
            child.setParent(this);
        }
    }

    @Override
    public boolean isSibling(TreeNode person) {
        for (TreeNode parent1 : this.getParent()) {
            for (TreeNode parent2 : this.getParent()) {
                if (!(parent1 == null) && parent1.equals(parent2)) {
                    return true;
                }
            }
        }
        return false;
    }
}

