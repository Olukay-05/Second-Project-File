package inheritance;

public class Fish extends Animal{

    private int gills;
    private int eyes;
    private int fins;


    public Fish(String name, int brain, int body, int size, int weight, int gills, int eyes, int fins) {
        super(name, brain, body, size, weight);

        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    public void rest(){

    }

    private void moveBackFin(){

    }

    private void moveMuscles(){

    }

    public void swim(){
        moveBackFin();
        moveMuscles();
        System.out.println("Fish can swim");
    }

    @Override
    public void move(int speed) {
        super.move(speed);
        swim();
    }
}
