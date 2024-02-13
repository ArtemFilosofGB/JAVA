package Algoritm_and_Data_Structure.homework_3;

public class RedBlackTree {
    private Node root;


    public String printtoString(Node nodePrint) {
        if (nodePrint != null) {
            return "end";
        } else {
            System.out.println("[ " + nodePrint.value + "]");
            if (nodePrint.leftChild != null) printtoString(nodePrint.leftChild);
            if (nodePrint.rightChild != null) printtoString(nodePrint.rightChild);
        }

        return "end";
    }

    public boolean add(int value) {
        if (root != null) {
            boolean result = addNode(root, value);
            root = rebalance(root);
            root.color = Color.BLACK;
            return result;
        } else {
            root = new Node();
            root.color = Color.BLACK;
            root.value = value;
            return true;
        }
    }

    private boolean addNode(Node node, int value) {
        if (node.value == value) {
            return false;
        } else {
            if (node.value > value) {
                if (node.leftChild != null) {
                    boolean result = addNode(node.leftChild, value);
                    node.leftChild = rebalance(node.leftChild);
                    return result;
                } else {
                    node.leftChild = new Node();
                    node.leftChild.color = Color.RED;
                    node.leftChild.value = value;
                    return true;
                }
            } else {
                if (node.rightChild != null) {
                    boolean result = addNode(node.rightChild, value);
                    node.rightChild = rebalance(node.rightChild);
                    return result;
                } else {
                    node.rightChild = new Node();
                    node.rightChild.color = Color.RED;
                    node.rightChild.value = value;
                    return true;

                }
            }
        }
    }


//    private Node rebalance(Node node) {
//        boolean rotationOrColorSwapPerformed = false;
//        while (true) {
//            if (node.rightChild != null && node.rightChild.color == Color.RED &&
//                    (node.leftChild == null || node.leftChild.color == Color.BLACK)) {
//                node = rightSwap(node);
//                rotationOrColorSwapPerformed = true;
//            }
//            if (node.leftChild != null && node.leftChild.color == Color.RED &&
//                    (node.leftChild.leftChild != null && node.leftChild.leftChild.color == Color.RED)) {
//                node = leftSwap(node);
//                rotationOrColorSwapPerformed = true;
//            }
//            if (node.leftChild != null && node.leftChild.color == Color.RED &&
//                    node.rightChild != null && node.rightChild.color == Color.RED) {
//                colorSwap(node);
//                rotationOrColorSwapPerformed = true;
//            }
//            if (!rotationOrColorSwapPerformed) {
//                break;
//            }
//            rotationOrColorSwapPerformed = false;
//        }
//        return node;
//    }
    private Node rebalance(Node node) {
        Node result = node;
        boolean needRebalance;
        do {
            needRebalance = false;
            if (result.rightChild != null && result.rightChild.color == Color.RED &&
                    (result.leftChild == null || result.leftChild.color == Color.BLACK)) {
                needRebalance = true;
                result = rightSwap(result);//правый поворот
            }
            if (result.leftChild != null && result.leftChild.color == Color.RED &&
                    (result.leftChild.leftChild != null && result.leftChild.leftChild.color == Color.RED)) {
                needRebalance = true;
                result = leftSwap(result);//левый поворот
            }
            if (result.leftChild != null && result.leftChild.color == Color.RED &&
                    result.rightChild != null && result.rightChild.color == Color.RED) {
                needRebalance = true;
                colorSwap(result);
            }
        } while (needRebalance);
        return result;
    }

    private Node rightSwap(Node node) {
        Node right = node.rightChild;
        Node betweenChild = right.leftChild;
        right.leftChild = node;
        node.leftChild = betweenChild;
        right.color = node.color;
        node.color = Color.RED;
        return right;
    }

    private Node leftSwap(Node node) {
        Node leftChild = node.leftChild;
        Node betweenChild = leftChild.rightChild;
        leftChild.rightChild = node;
        node.leftChild = betweenChild;
        leftChild.color = node.color;
        node.color = Color.RED;
        return leftChild;
    }


    private void colorSwap(Node node) {
        node.rightChild.color = Color.BLACK;
        node.leftChild.color = Color.BLACK;
        node.color = Color.RED;
    }

    public Node getRoot() {
        return root;
    }


    private class Node {
        private int value;
        private Color color;
        private Node leftChild;
        private Node rightChild;
    }

    private enum Color {
        RED, BLACK
    }
}
