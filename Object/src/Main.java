public class Main {
    public static void main (String[] args ){
        Tree myFavortiteOakTree = new Tree(125,12,TreeType.oak);
        Tree myFavortiteMapleTree = new Tree(90,30,TreeType.maple);
       // System.out.print(myFavortiteOakTree.treeType);

        myFavortiteMapleTree.announceTallTree();

        if(myFavortiteOakTree.heightFT >100){
            System.out.println("Thats a tall " + myFavortiteOakTree.treeType + " tree");
        }
        if(myFavortiteMapleTree.heightFT >100){
            System.out.println("Thats a tall " + myFavortiteMapleTree.treeType + " tree");
        }
    }
}
