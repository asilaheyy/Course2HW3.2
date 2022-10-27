public class NonFlyingBirds extends Birds {

    private String moving;

    public final void toWalk() {
        System.out.println("Я не могу летать.");
    }

    @Override
    public final void move() {
        System.out.println("Я хожу.");
    }

    public NonFlyingBirds(String name, int age, String habitat, String moving) {
        super(name, age, habitat);
        setMoving(moving);
    }

    public final void setMoving(String moving) {
        if (moving == null || moving.isBlank()) {
            this.moving = "Unknown";
        } else {
            this.moving = moving;
        }
    }

    public String getMoving() {
        return moving;
    }

    @Override
    public String toString() {
        return getName() + ". Птица." +
                " Возраст - " + getAge() + " лет." +
                " Среда обитания - " + getHabitat() +
                ". Тип передвижения - " + getMoving() + ". Класс " + getClass();
    }
}
