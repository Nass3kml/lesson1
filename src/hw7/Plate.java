package hw7;

public class Plate {
    private int food;
    public Plate(int food){
        this.food = food;
    }

    public void decreaseFood(int appetite){
        if (!hasEnoughFoodFor(appetite)) {
            System.out.println("У котиков аппетит больше, чем еды в тарелке");
        }else {
            food = food - appetite;
        }
    }
    public boolean hasEnoughFoodFor(int appetite) {
        return appetite < food;
    }

    public void increaseFood(int countOfFood) {
        food += countOfFood;
    }
}
