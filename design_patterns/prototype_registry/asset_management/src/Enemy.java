public class Enemy implements Asset{
    private final String type;
    private final int attackStrength;

    public Enemy(String type, int attackStrength){
        this.type = type;
        this.attackStrength = attackStrength;
    }

    public Enemy(Enemy enemy){
        this.type = enemy.type;
        this.attackStrength = enemy.attackStrength;
    }

    @Override
    public Enemy clone() {
        return new Enemy(this);
    }

    @Override
    public boolean equals(Object compared) {
        if(!(compared instanceof Enemy)){
            return false;
        }

        Enemy comparedEnemy = (Enemy) compared;
        if(comparedEnemy.type.equals(this.type) && comparedEnemy.attackStrength == this.attackStrength){
            return true;
        }
        return false;
    }
}
