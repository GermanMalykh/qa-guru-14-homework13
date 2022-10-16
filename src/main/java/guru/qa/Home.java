package guru.qa;

public class Home {
    public static void main(String[] args) {
        Wardrobe wardrobe = new Wardrobe();

        System.out.println("--ГАРДЕРОБНАЯ--");
        wardrobe.addNewClothes("Шапка");
        wardrobe.addNewClothes("Пальто");
        wardrobe.addNewClothes("Перчатки");
        wardrobe.searchClothes("Пальто");
        wardrobe.removeClothes("Шапка");
        System.out.println();

        System.out.println("--ХОЛОДИЛЬНИК--");
        Fridge fridge = new Fridge();
        fridge.addProducts("Яблоко");
        fridge.addProducts("Молоко");
        fridge.addProducts("Колбаса");
        fridge.addProducts("Сыр");
        fridge.removeProducts("Колбаса");
        fridge.searchProducts("Колбаса");
        fridge.searchProducts("Молоко");
        System.out.println();

        System.out.println("--ГАРАЖ--");
        Garage garage = new Garage();
        garage.addCar("Р333ОК35", "Mercedes");
        garage.addCar("М444ОК36", "BMW");
        garage.addCar("Т555ОК37", "Rolls-Royce");
        garage.showAllCars();
        garage.removeCar("Р333ОК35");
        garage.showAllCars();
    }
}