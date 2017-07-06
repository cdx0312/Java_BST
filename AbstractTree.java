/**
 * Created by cdxu0 on 2017/7/6.
 */
public abstract class AbstractTree<E> implements Tree<E>{
    @Override
    public void inorder() {
    }

    @Override
    public void postorder(){
    }

    @Override
    public void preorder(){
    }

    @Override
    public boolean isEmpty() {
        return getSize() == 0;
    }
}
