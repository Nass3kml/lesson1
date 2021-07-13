public class HomeWorkAPP {
public static void main(String[] args){
    AnimalMill mill = new AnimalMill();

    Cat cat = mill.newCat(200);
    Dog dog = mill.newDog(500, 10);

    cat.runDist(150);
    cat.swimDist(5);

    dog.runDist(550);
    dog.swimDist(9);

    System.out.println("Всего животных:" + mill.getAnimalCount());
    System.out.println("Создано собак:" + mill.getDogsCount());
    System.out.println("Создано кошек:" + mill.getCatsCount());
}
}