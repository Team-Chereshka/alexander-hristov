package hell.implementations;

import hell.entities.miscellaneous.HeroInventory;

public class Assassin extends HeroImpl{

    public Assassin(String name, HeroInventory inventory){
        this.name = name;
        this.inventory = inventory;
    }

    @Override
    public String getName() {
        return "Assassin";
    }

    @Override
    public long getStrength() {
        return 25;
    }

    @Override
    public long getAgility() {
        return 100;
    }

    @Override
    public long getIntelligence() {
        return 15;
    }

    @Override
    public long getHitPoints() {
        return 150;
    }

    @Override
    public long getDamage() {
        return 300;
    }
}
