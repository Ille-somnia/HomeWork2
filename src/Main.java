public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);

        var weight1 = 78.2;
        var weight2 = 82.7;
        var result = weight1 + weight2;
        System.out.println("Общая масса двух бойцов составляет " + result + " кг!");

        result = weight2 % weight1;
        System.out.println(result);

        var generalWorkHours = 640;
        var manHours = 8;
        var personCount = generalWorkHours / manHours;
        System.out.println("Всего работников в компании - " + personCount + " человек.");

        personCount = personCount + 94;
        var properHours = manHours * personCount;
        System.out.println("Если в компании работает " + personCount + " человек, то всего " + properHours + " часа работы может быть поделено между сотрудниками.");

            }
}