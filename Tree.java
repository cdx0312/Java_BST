/**
 * Created by cdxu0 on 2017/7/6.
 */
public interface Tree<E> extends Iterable<E> {
    //return true if the element is in the tree
    public boolean search(E e);
    //insert element e into binary tree.
    //return true if successfully
    public boolean insert(E e);
    //delete the specific element from tree
    //return true if successfully
    public boolean delete(E e);
    //Inorder traversal from the tree;
    public void inorder();
    //Postorder traversal
    public void postorder();
    //Preorder traversal
    public void preorder();
    //return the number of the element in the tree
    public int getSize();
    //return true if the tree is empty
    public boolean isEmpty();
    //delete all the elements in the tree
    public void clear();
}
