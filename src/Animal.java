public abstract class Animal {
    private float maxDistanceRun;
    private float maxDistanceSwim;

    public Animal (float maxDistanceRun, float maxDistanceSwim){
        this.maxDistanceRun = maxDistanceRun;
        this.maxDistanceSwim = maxDistanceSwim;
    }
    public void runDist(float requiredDistance){
        if (requiredDistance > maxDistanceRun){
            System.out.println("Не может пробежать дальше " + requiredDistance);
            System.out.println("Максимально может пробежать: " + maxDistanceRun);
        } else {
            System.out.println("Расстояние бегом " + requiredDistance + " пройдено");
        }
        System.out.println();
    }
    public void swimDist(float requiredDistane){
        if (requiredDistane > maxDistanceSwim){
            System.out.println("Не может проплыть " + requiredDistane);
            System.out.println("Максимум может проплыть "+ maxDistanceSwim);
        }else {
            System.out.println("Расстояние " + requiredDistane + " преодалено вплавь");
        }
        System.out.println();
    }

}
