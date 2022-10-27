public class Amphibians extends Animals {

    private String habitat;

    public Amphibians(String name, int age, String habitat) {
        super(name, age);
        setHabitat(habitat);
    }


    public final void hunt() {
        System.out.println("Я охочусь в воде и на суше.");
    }

    public String getHabitat() {
        return habitat;
    }

    @Override
    public final void eat() {
        System.out.println("Я ем насекомых/рыбу/млекопитающих/растения.");

    }

    @Override
    public final void sleep() {
        System.out.println("Я впадаю в зимнюю спячку.");

    }

    @Override
    public final void move() {
        System.out.println("Плавать/ползти");

    }

    public final void setHabitat(String habitat) {
        if (habitat == null || habitat.isBlank()) {
            this.habitat = "Unknown";
        } else {
            this.habitat = habitat;
        }
    }

    @Override
    public String toString() {
        return getName() + ". Земноводное." +
                " Возраст - " + getAge() + " лет." +
                " Среда обитания - " + getHabitat() + ". Класс " + getClass();
    }
}
