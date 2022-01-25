package hell;

import hell.entities.miscellaneous.HeroInventory;
import hell.entities.miscellaneous.ItemCollection;
import hell.implementations.*;
import hell.interfaces.Hero;
import hell.interfaces.InputReader;
import hell.interfaces.Item;
import hell.interfaces.Recipe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        InputReader inputReader = new InputReaderImpl();
        List<Hero> heroes = new ArrayList<>();

        while (!inputReader.readLine().equals("Quit")) {
            Hero currentHero = null;
            HeroInventory currentInventory = new HeroInventory();
            String[] command = inputReader.readLine().split("\\s+");
            switch (command[0]) {
                case "Hero":
                    switch (command[2]) {
                        case "Barbarian" -> currentHero = new Barbarian(command[1], currentInventory);
                        case "Assassin" -> currentHero = new Assassin(command[1], currentInventory);
                        case "Wizard" -> currentHero = new Wizard(command[1], currentInventory);
                    }
                    heroes.add(currentHero);
                    break;
                case "Item":
                    Item item = new ItemImpl(command[1], command[2], Integer.parseInt(command[3]),
                            Integer.parseInt(command[4]), Integer.parseInt(command[5]),
                            Integer.parseInt(command[6]), Integer.parseInt(command[7]));
                    for (Hero hero : heroes) {
                        if (command[2].equals(hero.getName())){
                            hero.addItem(item);
                        }
                    }

                    break;
                case "Recipe":
                    List<String> requiredItems = new ArrayList<>();
                    requiredItems.add(command[8]);
                    requiredItems.add(command[9]);
                    Recipe recipe = new RecipeImpl(command[1], command[2], Integer.parseInt(command[3])
                            , Integer.parseInt(command[4]),Integer.parseInt(command[5]),Integer.parseInt(command[6])
                            , Integer.parseInt(command[7]), requiredItems);
                    for (Hero hero : heroes) {
                        if (command[2].equals(hero.getName())){
                            hero.addRecipe(recipe);
                        }
                    }

                    break;
                case "Inspect":
                    break;
            }

        }
    }
}