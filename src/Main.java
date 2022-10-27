public class Main {
    public static void main(String[] args) {
        Predator tiger = new Predator("Тигр", 15, "джунгли", 50, "мясо");
        System.out.println(tiger);
        Predator bear = new Predator("Медведь", 23, "лес", 30, "мясо");
        System.out.println(bear);
        Predator hyena = new Predator("Гиена", 12, "саванна", 40, "падаль");
        System.out.println(hyena);

        System.out.println(tiger.equals(bear));
        System.out.println(tiger.equals(hyena));
        System.out.println(bear.equals(hyena));


        Herbivorous horse = new Herbivorous("Лошадь", 12, "прерии", 70, "сено");
        System.out.println(horse);
        Herbivorous giraffe = new Herbivorous("Жираф", 17, "саванна", 55, "листья деревьев");
        System.out.println(giraffe);
        Herbivorous gazelle = new Herbivorous("Газель", 8, "пустынные и полупустынные территории", 60, "травянистые растения");
        System.out.println(gazelle);

        System.out.println(horse.equals(gazelle));
        System.out.println(horse.equals(giraffe));
        System.out.println(gazelle.equals(giraffe));


        NonFlyingBirds penquin = new NonFlyingBirds("Пингвин", 9, "Антарктида", "ходьба");
        System.out.println(penquin);
        NonFlyingBirds peafowl = new NonFlyingBirds("Павлин", 5, "Южная Азия", "ходьба");
        System.out.println(peafowl);
        NonFlyingBirds dodo = new NonFlyingBirds("Птица додо", 22, "Маскаренские острова", "ходьба");
        System.out.println(dodo);

        System.out.println(penquin.equals(peafowl));
        System.out.println(penquin.equals(dodo));
        System.out.println(peafowl.equals(dodo));

        FlyingBirds seagull = new FlyingBirds("Чайка", 4, "морские побережья", "полет");
        System.out.println(seagull);
        FlyingBirds albatross = new FlyingBirds("Альбатрос", 2, "морские побережья", "полет");
        System.out.println(albatross);
        FlyingBirds falcon = new FlyingBirds("Сокол", 4, "степи", "полет");
        System.out.println(falcon);

        System.out.println(seagull.equals(albatross));
        System.out.println(seagull.equals(falcon));
        System.out.println(albatross.equals(falcon));


        Amphibians snake = new Amphibians("Уж пресноводный", 3, "побережья озер");
        System.out.println(snake);
        Amphibians frog = new Amphibians("Лягушка", 5, "болота");
        System.out.println(frog);

        System.out.println(snake.equals(frog));
    }
}