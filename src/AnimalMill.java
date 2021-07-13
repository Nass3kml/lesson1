public class AnimalMill {
    private int animalCount;
    private int dogsCount;
    private int catsCount;

    public AnimalMill(){
        animalCount = 0;
        dogsCount = 0;
        catsCount = 0;
    }
    public Cat newCat(int maxRunLimit){
        Cat cat = new Cat(maxRunLimit);
        animalCount++;
        catsCount++;
        return cat;
    }

    public Dog newDog(int maxRunLimit, int maxSwimLimit){
        Dog dog = new Dog(maxRunLimit, maxSwimLimit);
        animalCount++;
        dogsCount++;
        return dog;
    }

    public int getAnimalCount() {
        return animalCount;
    }
    public int getDogsCount(){
        return dogsCount;
    }
    public int getCatsCount(){
        return catsCount;
    }
}
