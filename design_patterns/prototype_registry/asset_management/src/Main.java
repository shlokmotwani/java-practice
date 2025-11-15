import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       AssetCache cache = AssetCache.getInstance();
       Tree smallTreeClone = (Tree) cache.getAsset("Small Tree");
       Enemy strongEnemyClone = (Enemy) cache.getAsset("Strong Enemy");

        System.out.println(smallTreeClone == cache.getAsset("Small Tree"));
        System.out.println(strongEnemyClone == cache.getAsset("Strong Enemy"));
    }
}