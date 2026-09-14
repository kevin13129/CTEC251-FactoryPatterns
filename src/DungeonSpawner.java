public class DungeonSpawner extends EnemySpawner {

    @Override
    protected Enemy createEnemy(String type) {

        if (type.equals("skeleton")) {
            return new Skeleton(new MageEquipmentFactory());
        }

        if (type.equals("slime")) {
            return new Slime(new MageEquipmentFactory());
        }

        return null;
    }
}