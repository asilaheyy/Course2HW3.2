public class Mammals extends Animals {

    private String habitat;
    private int speed;

    public Mammals(String name, int age, String habitat, int speed) {
        super(name, age);
        setHabitat(habitat);
        setSpeed(speed);
    }

    public final void setHabitat(String habitat) {
        if (habitat == null || habitat.isBlank()) {
            this.habitat = "Unknown";
        } else {
            this.habitat = habitat;
        }
    }

    public String getHabitat() {
        return habitat;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed <= 0) {
            this.speed = 0;
        } else {
            this.speed = speed;
        }
    }

    public final void go() {
        System.out.println("Я гуляю.");
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {
        System.out.println("Я сплю.");
    }

    @Override
    public void move() {
        System.out.println("Ходить/плавать");
    }
}
