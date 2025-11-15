import java.util.HashMap;

public class AssetCache {
    private static final AssetCache INSTANCE = new AssetCache();
    private final HashMap<String, Asset> registry;

    private AssetCache(){
        this.registry = new HashMap<>();
        this.registry.put("Small Tree", new Tree("Small Pine Tree", 10));
        this.registry.put("Long Tree", new Tree("Long Pine Tree", 50));
        this.registry.put("Burnt Tree", new Tree("Burnt Pine Tree", 30));
        this.registry.put("Weak Enemy", new Enemy("Weak Enemy", 5));
        this.registry.put("Strong Enemy", new Enemy("Strong Enemy", 20));
        this.registry.put("Dragon", new Enemy("Dragon", 30));
    }

    public static AssetCache getInstance(){
        return INSTANCE;
    }

    public void addAsset(String key, Asset asset){
        this.registry.put(key, asset.clone());
    }

    public Asset getAsset(String key){
        if(!this.registry.containsKey(key)){
            return null;
        }
        return this.registry.get(key).clone();
    }
}
