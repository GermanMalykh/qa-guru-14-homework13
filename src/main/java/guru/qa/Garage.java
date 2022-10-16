package guru.qa;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    Map<String, String> parking = new HashMap<>();

    public void addCar(String autoNumber,String Brand){
        parking.put(autoNumber,Brand);
        System.out.println("Автомобиль с номером \"" + autoNumber + "\", марки \"" + Brand + "\", добавлен в гараж");
    }

    public void removeCar(String autoNumber){
        parking.remove(autoNumber);
        System.out.println("Автомобиль с номером \"" + autoNumber + "\", убран из гаража");
    }

    public void showAllCars(){
        for(Map.Entry<String,String> entry : parking.entrySet()){
            System.out.println("В гараже присутствует автомобиль: С номером \"" + entry.getKey() + "\", марки: \"" + entry.getValue()+"\"");
        }
    }
}