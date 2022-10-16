package guru.qa;

import java.util.HashSet;
import java.util.Set;

public class Fridge {
    public Set<String> products = new HashSet<>();

    void addProducts(String product){
        products.add(product);
    }

    void removeProducts(String product){
        products.remove(product);
    }

    void searchProducts(String product){
        for (String subject: products) {
            if (subject.contains(product)){
                System.out.println(product + " есть в холодильнике");
            }
        }
        if (!products.contains(product)){
            System.out.println("Продукта \""+product +"\", нет в холодильнике");
        }
    }
}