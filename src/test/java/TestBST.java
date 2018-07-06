import Tree.BST;

public class TestBST {
    public static void main(String[] args) {
        BST<String> tree = new BST<String>();
        tree.insert("Anh");
        tree.insert("Bình");
        tree.insert("Cảnh");
        tree.insert("Dung");
        tree.insert("Giang");
        tree.insert("Hà");
        tree.insert("Kiên");

        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}
