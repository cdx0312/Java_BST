import java.util.ArrayList;

/**
 * Created by cdxu0 on 2017/7/6.
 */
public class TestBST {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");
        prinTree(tree);

        System.out.println("\nthe number of nodes is " + tree.getSize());

        System.out.println("\nIs Peter in the true ?  " + tree.search("Peter"));

        System.out.println("A path from the root to Peter is: ");
        ArrayList<BST.TreeNode<String>> path = tree.path("Peter");
        for (int i = 0; path != null && i < path.size(); i++)
            System.out.print(path.get(i).element + " ");

        Integer[] numbers = {2, 4, 3, 1, 8, 5, 6, 7};
        BST<Integer> intTree = new BST<>(numbers);
        System.out.print("\nInorder sorted:");
        intTree.inorder();

        System.out.println("\nAfter delete George: ");
        tree.delete("George");
        prinTree(tree);

        System.out.println("\nAfter delete Adam: ");
        tree.delete("Adam");
        prinTree(tree);
    }

    public static void prinTree(BST tree) {
        System.out.println("\nInorder sorted: ");
        tree.inorder();
        System.out.println("\nPreorder sorted: ");
        tree.preorder();
        System.out.println("\nPostorder sorted: ");
        tree.postorder();
    }
}
