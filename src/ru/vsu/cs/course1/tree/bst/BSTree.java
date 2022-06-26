package ru.vsu.cs.course1.tree.bst;

import ru.vsu.cs.course1.tree.BinaryTree;

//Интерфейс для двоичного дерева поиска (BinarySearchTree) с реализацией по умолчанию многих типичных для таких деревьев методов

public interface BSTree<T extends Comparable<? super T>> extends BinaryTree<T> {

    //Поиск TreeNode по значению

    default BinaryTree.TreeNode<T> getNode(T value) {
        return BSTreeAlgorithms.getNode(getRoot(), value);
    }

    //Поиск знаяения, равного значению (не обязательного того же самого)

    default T get(T value) {
        BinaryTree.TreeNode<T> valueNode = getNode(value);
        return (valueNode == null) ? null : valueNode.getValue();
    }

    //Проверка, содержится ли значение value (или равное value) в дереве

    default boolean contains(T value) {
        return getNode(value) != null;
    }

    // Добавление элемента в дерево (возвращать старое значение нажно для эффективной реализации словаря Map из стандартной библиотеки)

    T put(T value);

    //Удаление значения из дерева (возвращать старое значение нажно для эффективной реализации словаря Map из стандартной библиотеки)

    T remove(T value);

    //Очистка дерева (удаление всех элементов)

    void clear();

    //Размер дерева

    int size();

    //Поиск минимального TreeNode

    default BinaryTree.TreeNode<T> getMinNode() {
        return BSTreeAlgorithms.getMinNode(getRoot());
    }

    //Поиск минимального значение

    default T getMin() {
        BinaryTree.TreeNode<T> minNode = getMinNode();
        return (minNode == null) ? null : minNode.getValue();
    }

    //Поиск максимального TreeNode

    default BinaryTree.TreeNode<T> getMaxNode() {
        return BSTreeAlgorithms.getMaxNode(getRoot());
    }

    //Поиск максимального значение

    default T getMax() {
        BinaryTree.TreeNode<T> minNode = getMinNode();
        return (minNode == null) ? null : minNode.getValue();
    }

    //Поиск TreeNode с наибольшим значением, меньшим или равным value

    default BinaryTree.TreeNode<T> getFloorNode(T value) {
        return BSTreeAlgorithms.getFloorNode(getRoot(), value);
    }

    //Поиск наибольшего значения, меньшего или равного value

    default T getFloor(T value) {
        BinaryTree.TreeNode<T> floorNode = getFloorNode(value);
        return (floorNode == null) ? null : floorNode.getValue();
    }

    //Поиск TreeNode с наименьшим значением, большим или равным value

    default BinaryTree.TreeNode<T> getCeilingNode(T value) {
        return BSTreeAlgorithms.getCeilingNode(getRoot(), value);
    }

    //Поиск наименьшего значения, меньше или равного value

    default T getCeiling(T value) {
        BinaryTree.TreeNode<T> ceilingNode = getCeilingNode(value);
        return (ceilingNode == null) ? null : ceilingNode.getValue();
    }
}
