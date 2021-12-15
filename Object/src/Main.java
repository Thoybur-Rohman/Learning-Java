import java.awt.*;

public class Main {
    public static void main (String[] args ){
        /*Used to make an instance of the class
        * Lesson 1 - Making a tree
        *
        Tree myFavortiteOakTree = new Tree(125,12,TreeType.oak);
        Tree myFavortiteMapleTree = new Tree(90,30,TreeType.maple);
        *
        System.out.print(myFavortiteOakTree.treeType);
        *
        myFavortiteMapleTree.announceTallTree();
        myFavortiteOakTree.announceTallTree();
        *
        System.out.println(Tree.Trunk_Color);
        Tree.announceTree(); */
        Color myTrunkColor = Tree.Trunk_Color;
        Color myDefaultWhite = Color.WHITE;
        Color myDefaultBlue = Color.BLUE;
        Color brighterBlue = myDefaultBlue.brighter();
        brighterBlue.brighter();



    }
}
