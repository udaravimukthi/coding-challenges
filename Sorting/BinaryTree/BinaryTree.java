public class BinaryTree {
    //root of Binary tree
    NOde root;

    //constructors
    BinaryTree(int key){
        root = new Node(key);
    }

    BinaryTree(){
        root = null;
    }

    public static void main (String args[]){
        BinaryTree tree = new BinaryTree();
        
        //create root
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);

    }
}
