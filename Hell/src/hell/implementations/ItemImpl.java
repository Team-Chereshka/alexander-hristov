package hell.implementations;

import hell.interfaces.Item;

public class ItemImpl implements Item {

    private final String name;
    private final int strengthBonus;
    private final int agilityBonus;
    private final int intelligenceBonus;
    private final int hitPointsBonus;
    private final int damageBonus;

    public ItemImpl(String name, String heroName, int strengthBonus, int agilityBonus, int intelligenceBonus,
                    int hitPointsBonus, int damageBonus){
        this.name = name;
        this.strengthBonus = strengthBonus;
        this.agilityBonus = agilityBonus;
        this.intelligenceBonus = intelligenceBonus;
        this.hitPointsBonus = hitPointsBonus;
        this.damageBonus = damageBonus;
    }

    public ItemImpl(String name, int strengthBonus, int agilityBonus, int intelligenceBonus,
                    int hitPointsBonus, int damageBonus){
        this.name = name;
        this.strengthBonus = strengthBonus;
        this.agilityBonus = agilityBonus;
        this.intelligenceBonus = intelligenceBonus;
        this.hitPointsBonus = hitPointsBonus;
        this.damageBonus = damageBonus;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getStrengthBonus() {
        return strengthBonus;
    }

    @Override
    public int getAgilityBonus() {
        return agilityBonus;
    }

    @Override
    public int getIntelligenceBonus() {
        return intelligenceBonus;
    }

    @Override
    public int getHitPointsBonus() {
        return hitPointsBonus;
    }

    @Override
    public int getDamageBonus() {
        return damageBonus;
    }
}
