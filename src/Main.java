public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();

    }

    public static void task1() {
        System.out.println("Задание 1");
        for (int i = 0; i <= 10; i = i + 1) {
            System.out.println(i);
            //Результат задачи 1
        }
    }

    public static void task2() {
        System.out.println("Задание 2");
        for (int i = 10; i >= 0; i = i - 1) {
            System.out.println(i);
            //Результат задачи 2
        }
    }

    public static void task3() {
        System.out.println("Задание 3");

        for (int i = 2; i < 17; i = i + 2) {
            System.out.println(i);
            //Результат задачи 3
        }

    }

    public static void task4() {
        System.out.println("Задание 4");
        for (int i = 10; i > -10; i = i - 1) {
            System.out.println(i);
        }
    }
    // Результат задачи 4

    public static void task5() {
        System.out.println("Задание 4");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
            // Результат задачи 5
        }
    }

    public static void task6() {
        System.out.println("Задание 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
    }

    // Результат задачи 6
    public static void task7() {
        System.out.println("Задание 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
            //Резульат задачи 7
        }
    }

    public static void task8() {
        System.out.println("Задание 8");
        int b = 29000;
        int totalB = 0;
        for (int a = 1; a <= 12; a++) {
            totalB = b + totalB;
            System.out.println("Месяц " + a + " ,сумма накоплений равнa " + totalB + " рублей");
            //Результат задачи 8
        }
    }

    public static void task9() {
        System.out.println("Задание 9");
        int b = 29000;
        int totalB = 0;
        for (int a = 1; a <= 12; a++) {
            totalB = totalB + totalB/100;
        totalB = b + totalB;
            System.out.println("Месяц " + a + " ,сумма накоплений равнa " + totalB + " рублей");
            //Резульат задачи 9
        }
    }
    public static void task10() {
        System.out.println("Zadanie 10");
        int i = 2;
        for (int a = 1; a <= 10; a = a + 1) {
            i = 2 * a;
            System.out.println("2*" + a + "=" + i);
            //Результат задачи 10
        }

    }
}