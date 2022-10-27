public class Herbivorous extends Mammals {
    private String foodType;

    public Herbivorous(String name,
                       int age,
                       String habitat,
                       int speed,
                       String foodType) {
        super(name, age, habitat, speed);
        setFoodType(foodType);
    }

    public final void setFoodType(String foodType) {
        if (foodType == null || foodType.isBlank()) {
            this.foodType = "Unknown";
        } else {
            this.foodType = foodType;
        }
    }

    public String getFoodType() {
        return foodType;
    }

    public final void toGraze() {
        System.out.println("Я пасщусь.");
    }

    @Override
    public final void eat() {
        System.out.println("Я ем растения.");
    }

    @Override
    public final void sleep() {
        super.sleep();
    }

    @Override
    public final void move() {
        System.out.println("Я могу ходить/плавать.");
    }

    @Override
    public String toString() {
        return getName() + ". Млекопитающее." +
                " Возраст - " + getAge() + " лет." +
                " Среда обитания - " + getHabitat() +
                ". Скорость передвижения - " + getSpeed() + " км/ч." +
                " Тип пищи - " + getFoodType() + ". Класс " + getClass();
    }
}
