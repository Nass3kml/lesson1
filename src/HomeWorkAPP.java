
public class HomeWorkAPP {
public static void main(String[] args){
Cat[] cats = {
        new Cat(7, "Фрося"),
        new Cat(10,"Барсик"),
        new Cat(15,"Василиск"),
};

Plate plate = new Plate(40);

for (Cat cat : cats){
    cat.eat(plate);
}

plate.increaseFood(80);

for (Cat cat : cats){
    cat.eat(plate);
}

}
}