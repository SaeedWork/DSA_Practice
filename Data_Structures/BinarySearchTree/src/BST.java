import java.util.ArrayList;

public class BST {

    Node root;
    public class Node{
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
        }
    }

    public void inOrderTraversal(Node root){
        if(root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(" " + root.data);
        inOrderTraversal(root.right);
    }
    
    public void printInRange(Node root, int x, int y){
        if (root == null){
            return;
        }

        if (root.data >= x && root.data <= y){
            printInRange(root.left , x, y);
            System.out.print(" " + root.data);
            printInRange(root.right, x, y);
        } else if (root.data > y) {
            printInRange(root.left, x, y);
        } else if (root.data < x) {
            printInRange(root.right, x , y);
        }
    }

    public Node insert(Node root, int val){
        if (root == null){
            root = new Node(val);
            return root;
        } else if (root.data > val){
            root.left = insert(root.left, val);
        } else if (root.data < val){
            root.right = insert(root.right, val);
        }
        return root;
    }

    public boolean search(Node root, int key){
        if (root == null){
            return false;
        }
        if(root.data > key){
            return search(root.left, key);
        } else if (root.data == key){
            return true;
        }else{
            return search(root.right, key);
        }
    }

    public Node delete(Node root, int val){

        if (root == null){
            System.out.println("Tree has no nodes");
            return root;
        }

        if(root.data > val){
            root.left = delete(root.left, val);
        } else if (root.data < val){
            root.right = delete(root.right, val);
        }
        else {
            //Case 1
            if (root.left == null && root.right == null){
                return null;
            }

            //Case 2
            if (root.left==null){
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            //Case 3
            Node iOS = getInorderSuccessor(root.right);
            root.data = iOS.data;
            root.right = delete(root.right, iOS.data);

        }
        return root;
    }

    public Node getInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }

        return root;
    }

    public void printRootToLeaf(Node root, ArrayList<Integer> path){
        if (root == null){
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null){
            printPath(path);
        }else {
            printRootToLeaf(root.left, path);
            printRootToLeaf(root.right, path);
        }
        path.remove(path.size()-1);
    }
    public void printPath(ArrayList<Integer> path){
        for (int i = 0 ; i<path.size(); i++){
            System.out.print(path.get(i) + "->");
        }
        System.out.println();
    }


}
