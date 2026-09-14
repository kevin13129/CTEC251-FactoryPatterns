public class Slime extends Enemy {

    public Slime(EquipmentFactory equipmentFactory) {
        super(equipmentFactory);
    }

    @Override
    public void attack() {
        System.out.println(
                "Goblin attacks with " +
                        weapon.getDescription() +
                        " wearing " +
                        armor.getDescription()
        );
    }
}