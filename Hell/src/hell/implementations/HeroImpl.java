package hell.implementations;

import hell.entities.miscellaneous.HeroInventory;
import hell.entities.miscellaneous.ItemCollection;
import hell.interfaces.Hero;
import hell.interfaces.Item;
import hell.interfaces.Recipe;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public abstract class HeroImpl implements Hero {

    protected String name;
    private int strength;
    private int agility;
    private int intelligence;
    private int hitPoints;
    private int damage;
    HeroInventory inventory;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public long getStrength() {
        return this.strength;
    }

    @Override
    public long getAgility() {
        return this.agility;
    }

    @Override
    public long getIntelligence() {
        return this.intelligence;
    }

    @Override
    public long getHitPoints() {
        return this.hitPoints;
    }

    @Override
    public long getDamage() {
        return this.damage;
    }

    @Override
    public Collection<Item> getItems() {
        Collection<Item> extractedItems = new ArrayList<>();
        Field fieldToFind = null;
        Field[] fields = HeroInventory.class.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(ItemCollection.class)) {
                fieldToFind = field;
                break;
            }
        }
        try {
            Map<String, Item> extractedField = (Map<String, Item>) fieldToFind.get(inventory);
            extractedItems = extractedField.values();
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }
        return extractedItems;
    }

    @Override
    public void addItem(Item item) {
        inventory.addCommonItem(item);
    }

    @Override
    public void addRecipe(Recipe recipe) {
        inventory.addRecipeItem(recipe);
    }
}