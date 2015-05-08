import java.util.IllegalFormatException;

/**
 * Created by rch1 on 5/3/15.
 */
public class BSTNode {

    int data;
    BSTNode left,right;

    public BSTNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
    public static BSTNode search(BSTNode root, int target){
        BSTNode ptr = root;
        while (ptr != null){
            if(target == ptr.data){
                return ptr;
            }
            if(target < ptr.data){
                ptr = ptr.left;
            }else {
                ptr = ptr.right;
            }
        }
        return null;
    }
    public static BSTNode insert(BSTNode root, int target){
        BSTNode ptr = root,prev = null;
        boolean left = false;
        while (ptr != null ){
            if(target == ptr.data){
                throw new IllegalArgumentException();
            }
            prev = ptr;
            if(target < ptr.data){
                ptr = ptr.left;left = true;
            }else {
                ptr = ptr.right; left = false;
            }
        }
        BSTNode temp = new BSTNode(target);
        if(root == null){
            return temp;
        }
        if(left){
            prev.left = temp;
        }else {
            prev.right = temp;
        }

        return root;

    }
    public static void main(String[] args) {

        BSTNode node1 = new BSTNode(10);

        insert(node1,23);
        insert(node1,21);
        insert(node1,19);
        System.out.println("inserting..."+insert(node1,3).data);

        System.out.println("Searching...."+search(node1,19).data);


    }
}
