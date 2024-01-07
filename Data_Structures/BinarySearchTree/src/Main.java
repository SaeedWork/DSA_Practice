import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void searchInTree(BST tree, int key){
        if(tree.search(tree.root, key)){
            System.out.println("Data Found in Tree");
        }else{
            System.out.println("Data not found in tree");
        }
    }
    public static void main(String[] args) {

        BST tree1 = new BST();
        int values[] = {6,2,8,3,7,9,4};
        tree1.root = null;
        for(int i = 0; i<values.length; i++){
            tree1.root = tree1.insert(tree1.root, values[i]);
        }
        tree1.inOrderTraversal(tree1.root);
        System.out.println();

        searchInTree(tree1, 3);

        tree1.delete(tree1.root, 7);

        searchInTree(tree1,7);

        tree1.inOrderTraversal(tree1.root);

        System.out.println();

        tree1.printInRange(tree1.root, 2, 8);

        System.out.println();

        tree1.printRootToLeaf(tree1.root, new ArrayList<>());


    }
}