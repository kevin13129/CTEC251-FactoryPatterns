public class SimpleEnemyFactory {

    public Enemy createEnemy(String type) {

        if (type.equals("goblin")) {
            return new Goblin();
        }

        if (type.equals("skeleton")) {
            return new Skeleton();
        }

        return null;
    }
}