package FamilyTree;

import java.util.List;

/**
 * Интерфейс, представляющий узел структуры данных "Семейное древо".
 *  Включает обязательные к реализации методы."
 */
public interface TreeNode {
    /**
     * Метод возвращает список родителей: мать и отец.
     *
     * @return озвращаемый тип - список объектов интерфейса TreeNode
     */
    public List<TreeNode> getParent();

    /**
     * Метод возвращает список детей
     *
     * @return возвращаемый тип - список объектов интерфейса TreeNode
     */

    public List<TreeNode> getChildren();

    /**
     * Метод устанавливает родителя
     *
     * @param parent объект интерфейса, устанавливается в качестве родителя
     */

    public void setParent(TreeNode parent);

    /**
     * Метод устанавливает между объектами связь типа "супруг - супруга".
     *
     * @param spouse супруг/супругв
     */
    public void setSpouse(TreeNode spouse);

    /**
     * Метод устанавливает ребенка
     *
     * @param child Метод устанавливает ребенка
     */
    public void addChild(TreeNode child);

    /**
     * Метод проверяет кровное родство между людьми
     * @param person объект, с кем проверяется родство
     * @return возвращает true или false
     */
    public boolean isSibling(TreeNode person);
}
