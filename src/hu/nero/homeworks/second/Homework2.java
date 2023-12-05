package hu.nero.homeworks.second;

import java.util.Random;

public class Homework2 {
    public static void main(String[] args) {
		    ex1();
				ex2();
				ex3();
    }
    public static void ex1() {
        int[][] arrayOfNumbers = new int[10][10];
        arrayOfNumbers[0] = new int[]{131, 2, 3, 4, 5, 6, 7, 8, 9, 102};
        arrayOfNumbers[1] = new int[]{1, 20, 3, 4, 5, 6, 7, 8, 93, 10};
        arrayOfNumbers[2] = new int[]{1, 2, 31, 4, 5, 6, 7, 81, 9, 10};
        arrayOfNumbers[3] = new int[]{1, 2, 3, 45, 5, 6, 77, 8, 9, 10};
        arrayOfNumbers[4] = new int[]{1, 2, 3, 4, 57, 67, 7, 8, 9, 10};
        arrayOfNumbers[5] = new int[]{1, 2, 3, 4, 533, 68, 7, 8, 9, 10};
        arrayOfNumbers[6] = new int[]{1, 2, 3, 40, 5, 6, 72, 8, 9, 10};
        arrayOfNumbers[7] = new int[]{1, 2, 30, 4, 5, 6, 7, 83, 9, 10};
        arrayOfNumbers[8] = new int[]{1, 20, 3, 4, 5, 6, 7, 8, 901, 10};
        arrayOfNumbers[9] = new int[]{10, 2, 3, 4, 5, 6, 7, 8, 9, 101};

		    int leftUpToRightDownSum = 0;
		    for (int i = 0; i < arrayOfNumbers.length; i++) {
				    leftUpToRightDownSum += arrayOfNumbers[i][i];
		    }
		    System.out.println("Сумма по диагонали слева: " + leftUpToRightDownSum);

		    int leftDownToRightUpSum = 0;
		    for (int i = 0; i < arrayOfNumbers.length; i++) {
				    leftDownToRightUpSum += arrayOfNumbers[i][arrayOfNumbers.length - 1 - i];
		    }
		    System.out.println("Сумма по диагонали справа: " + leftDownToRightUpSum);
    }
    public static void ex2() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		    for (int i = 0, j = numbers.length - 1; i < j; i++, j--) {
				    int temp = numbers[i];
				    numbers[i] = numbers[j];
				    numbers[j] = temp;
		    }
		    System.out.print("Массив в обратном порядке: ");
		    for (int number : numbers) {
				    System.out.print(number + " ");
		    }
    }

    public static void ex3() {
		   	Random random = new Random(1);
		    int attempts = 0;
		    int number = random.nextInt(1000);
		    while (number != 999) {
				    number = random.nextInt(1000);
				    attempts++;
		    }
		    System.out.println("Число 999 сгенерировано с " + attempts + " попытки.");
    }


    public static void ex4() {
        //Создать пакет shop. Внутри пакета:
        //Создать класс Item (вещь). У вещи есть вес и наименование.
        //Создать класс Worker (работник). У работника есть: имя, возраст, пол(М/Ж), набор вещей.
        //Работник умеет хвастаться своими вещами: брать по очереди вещь, и кричать:
        //{Имя работника}: смотрите какая у меня вещь - {имя вещи}.
        //Создать класс Shop (магазин). У которого есть работники.
        //Магазин умеет печатать своих работников:
        //{Имя работника}: {возраст} лет, {мужчина или женщина}, список вещей: {набор вещей работника}
        //Создать класс Runner. В классе Runner:
        //Создать 4 вещи: молот (1000гр), отвертка(50гр), тетрадь(30гр), ручка(10гр)
        //Создать 2 работников:
        //-Василий,30 лет, мужчина, обладатель молота и отвертки.
        //-Марьяна,25 лет, женщина, обладательница тетради и ручки.
        //Создать магазин с работниками выше.
        //Вызвать у магазина печать.
        //Вызвать у каждого работника магазина хвастовство его вещами (достать работника из магазина).
    }

    public static void ex5() {
        //Создать пакет office.
        //Создать класс офис, в котором есть босс, менеджер, секретарь, охранник.
        //Босс обладает именем. Умеет подгонять менеджера - "{Имя менеджера}" быстрее!
        //Менеджер обладает именем. Умеет кричать - "я ничего не успеваю, помогите!".
        //Секретарь умеет просить менеджера и босса успокоится, а охранника подождать:
        //"{Имя босса} не волнуйтесь, {имя менеджера} все успеет. {имя охранника} - подождите!"
        //Охранник обладает именем. Просит выдать ему аванс.
        //В офисе есть метод рабочий день:
        //--Босс начинает подгонять менеджера
        //--Менеджер кричит.
        //--Охранник просит аванс
        //--Секретарша всех успокаивает, и просит подождать
        // Создать класс Runner, в котором:
        //Создать босса (Петр Николаевич), Менеджера (Володя), охранника (Петрович)
        //Секретаря.
        //Создать офис
        // Запустить рабочий день в офисе.
    }
}
