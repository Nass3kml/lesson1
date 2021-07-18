package hw6;

public class Cat extends Animal {
    public Cat(float maxDistanceRun) {
        super(maxDistanceRun, Integer.MIN_VALUE);}

    @Override
    public void swimDist(float requiredDistance) {
        System.out.println("Кошки плавать не могут\n");
    }
}
