package day18;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20); //создаем новое дерево с корнем
        int[] treeOfLife = {14, 23, 11, 16, 22, 27, 5, 15, 18, 24, 150, 8};
        for (int j : treeOfLife) {
            root.addNode(new Node(j)); //добавляем в дерево новые элементы из массива
        }
        System.out.println(root);
        dfs(root);

    }

    public static void dfs(Node node) {
        if (node == null) {
            return;
        }
        dfs(node.getLeftSon());
        System.out.print(node.getValue() + " ");
        dfs(node.getRightSon());
    }
}
