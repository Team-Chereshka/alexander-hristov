package hell.implementations;

import hell.entities.miscellaneous.HeroInventory;

public class Barbarian extends HeroImpl{

    public Barbarian (String name, HeroInventory inventory){
        this.name = name;
        this.inventory = inventory;
    }

    @Override
    public String getName() {
        return "Barbarian";
    }

    @Override
    public long getStrength() {
        return 90;
    }

    @Override
    public long getAgility() {
        return 25;
    }

    @Override
    public long getIntelligence() {
        return 10;
    }

    @Override
    public long getHitPoints() {
        return 350;
    }

    @Override
    public long getDamage() {
        return 150;
    }
}
