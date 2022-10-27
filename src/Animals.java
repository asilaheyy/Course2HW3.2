public abstract class Animals {

    private String name;
    private int age;

    public Animals(String name, int age) {
        setName(name);
        if (age <= 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public final void setName(String name) {
        if (name == null || name.isBlank()) {
            this.name = "Pet";
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void eat();


    public abstract void sleep();


    public abstract void move();

}


