public class Cat {
    private boolean isFull;
    private int appetite;
    private String name;
    public Cat (int appetite, String name){
        isFull = false;
        this.appetite = appetite;
        this.name = name;
    }

    public void eat(Plate plate){
        if (plate.hasEnoughFoodFor(appetite) && !isFull){
            System.out.println(name + " поел");
            plate.decreaseFood(appetite);
            isFull = true;
        }else if (!plate.hasEnoughFoodFor(appetite)){
            System.out.println("Недостаточно еды для " + name);
        }else if (isFull){
         System.out.println("Котик " + name + " уже сыт");
        }
    }
}
