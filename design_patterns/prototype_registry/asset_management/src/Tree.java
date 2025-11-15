public class Tree implements Asset{
    private final String type;
    private final int height;


    public Tree(String type, int height){
        this.type = type;
        this.height = height;
    }

    public Tree(Tree tree){
        this.type = tree.type;
        this.height = tree.height;
    }

    public int getHeight() {
        return height;
    }

    public String getType() {
        return type;
    }

    @Override
    public Tree clone() {
        return new Tree(this);
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) return true;

        if(!(compared instanceof Tree)){
            return false;
        }

        Tree comparedTree = (Tree) compared;
        return comparedTree.type.equals(this.type) && comparedTree.height == this.height;
    }
}
