package hell.implementations;

import hell.entities.miscellaneous.HeroInventory;

public class Wizard extends HeroImpl{

    public Wizard(String name, HeroInventory inventory){
        this.name = name;
        this.inventory = inventory;
    }

    @Override
    public String getName() {
        return "Wizard";
    }

    @Override
    public long getStrength() {
        return 25;
    }

    @Override
    public long getAgility() {
        return 25;
    }

    @Override
    public long getIntelligence() {
        return 100;
    }

    @Override
    public long getHitPoints() {
        return 100;
    }

    @Override
    public long getDamage() {
        return 250;
    }
}