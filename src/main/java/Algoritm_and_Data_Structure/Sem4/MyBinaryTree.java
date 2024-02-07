package Algoritm_and_Data_Structure.Sem4;

public class MyBinaryTree {
    public MyBinaryTree() {
    }

    Node root;
    static class Node<K,V>{
        K key;
        V value;

         Node parent;
         Node leftChild;
         Node rightChild;

        public Node(K key, V value, Node parent, Node leftChild, Node rightChild) {
            this.key = key;
            this.value = value;
            this.parent = parent;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }
    }
}
