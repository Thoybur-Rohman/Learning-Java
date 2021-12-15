import java.awt.*;

public class Tree {
    private double heightFT;
    private double trunkDiameterInches;
    private TreeType treeType;
    protected static Color Trunk_Color = new Color(102, 51, 0);

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
            System.out.println("Thats a tall " +
                    this.treeType + " tree");
        }
    }

    static void announceTree() {
        System.out.println("Look out for that " +
                Trunk_Color + " tree");
    }

    public double getHeightFt() {
            return heightFT;
    }
    public double getTrunkDiameterInches() {
        return trunkDiameterInches;
    }
    public void settTrunkDiameterInches(double trunkDiameterInches) {
        this.trunkDiameterInches = trunkDiameterInches;
    }

    public TreeType getTreeType(){
        return treeType;
    }


}
