public class Tree {
    double heightFT;
    double trunkDiameterInches;
    TreeType treeType;


    /*Tree is classified as a construter
     * Using the key word we put the information into it*/
    Tree(double heightFT, double trunkDiameterInches, TreeType treeType) {
        this.heightFT = heightFT;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
        /*Acessing the tree we are creating */

    }

    void grow() {
        this.heightFT = this.heightFT + 10;
        this.trunkDiameterInches = this.trunkDiameterInches + 1;
    }

    void announceTallTree() {
        if (this.heightFT > 100) {
            System.out.println("Thats a tall " + this.treeType + " tree");
        }
    }
}
