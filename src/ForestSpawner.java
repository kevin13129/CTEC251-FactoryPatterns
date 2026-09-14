public class ForestSpawner extends EnemySpawner {

    @Override
    protected Enemy createEnemy(String type) {

        if (type.equals("goblin")) {
            return new Goblin();
        }

        if (type.equals("wolf")) {
            return new Wolf();
        }

        return null;
    }
}