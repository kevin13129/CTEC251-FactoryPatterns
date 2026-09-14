public class Wolf extends Enemy {

    public Wolf(EquipmentFactory equipmentFactory) {
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