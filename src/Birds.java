public class Birds extends Animals {

    private String habitat;

    public Birds(String name, int age, String habitat) {
        super(name, age);
        setHabitat(habitat);
    }

    public final void setHabitat(String habitat) {
        if (habitat == null || habitat.isBlank()) {
            this.habitat = "Unknown";
        } else {
            this.habitat = habitat;
        }
    }

    public final void hunt() {
        System.out.println("Я охочусь на насекомых.");
    }

    public final String getHabitat() {
        return habitat;
    }

    @Override
    public final void eat() {
        System.out.println("Клевать");
    }

    @Override
    public final void sleep() {
        System.out.println("Я сплю.");
    }

    @Override
    public void move() {

    }
}
