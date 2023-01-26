public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задание 1");
        for( int i = 0; i <= 10; i = i +1){
            System.out.println(i);
            //Результат задачи 1
        }
    }
    public static void task2() {
        System.out.println("Задание 2");
        for( int i = 10; i >= 0; i = i - 1){
            System.out.println(i);
            //Результат задачи 2
        }
    }
    public static void task3() {
        System.out.println("Задание 3");

        for( int i = 2; i < 17; i = i + 2){
            System.out.println(i);
            //Результат задачи 3
        }

    }
}