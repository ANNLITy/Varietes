public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
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
        frog = frog + 4;
        System.out.println(frog);
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalBoxersWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("общий вес двух бойцов  " +  totalBoxersWeight  + " кг");
        var weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("разница в весе " + weightDifference + " кг" );
        var weightDifference2 = secondBoxerWeight % firstBoxerWeight;
        System.out.println("разница в весе " + weightDifference2 + " кг");
        var allWorkTime = 640;
        var oneWorkerWorkTime = 8;
        var numberOfWorkers = allWorkTime / oneWorkerWorkTime;
        System.out.println("Всего работников в компании - " + numberOfWorkers + " человек");
        var newWorkers = 94;
        var newNumberOfWorkers = numberOfWorkers + newWorkers;
        System.out.println("Новое число работников " + newNumberOfWorkers + " человек" );
        var newWorkTime = allWorkTime / newNumberOfWorkers;
        System.out.println("Если в команде работает " + newNumberOfWorkers + " человек" + " то всего " + newWorkTime + " часов работы может быть поделено между сотрудниками");




    }
}