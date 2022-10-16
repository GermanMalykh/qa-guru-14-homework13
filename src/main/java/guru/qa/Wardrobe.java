package guru.qa;

import java.util.ArrayList;
import java.util.List;

public class Wardrobe {
    List<String> clothes = new ArrayList<>();
    void addNewClothes(String item) {
        if (!clothes.contains(item)) {
            clothes.add(item);
        }
    }
    void removeClothes(String item) {
        clothes.remove(item);
    }
    void searchClothes(String itemName) {
        for (int i = 0; i < clothes.size(); i++) {
            if (clothes.get(i).contains(itemName)) {
                System.out.println(itemName + " в гардеробе");
            }
        }
    }
}