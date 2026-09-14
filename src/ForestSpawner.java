public class ForestSpawner extends EnemySpawner {

    @Override
    protected Enemy createEnemy(String type) {

        if (type.equals("goblin")) {
            return new Goblin(new WarriorEquipmentFactory());
        }

        if (type.equals("wolf")) {
            return new Wolf(new WarriorEquipmentFactory());
        }

        return null;
    }
}