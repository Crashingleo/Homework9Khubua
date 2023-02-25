public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public  static void task1()
    {
        System.out.println();
        int[] arr = generateRandomArray();
        int payment = 0;
        for (int i = 0; i < arr.length; i++) {
            payment = payment + arr[i];

        }
        System.out.println("Сумма трат за месяц составила " + payment + " рублей");
    }
    public  static void task2()
    {
        System.out.println("task 2");
        int[] arr = generateRandomArray();
        int MinPayment = 220000;
        int MaxPayment = 90000;
        for (int i = 0; i < arr.length-1; i++) {

            if (MinPayment > arr[i])
                MinPayment = arr[i];
            if (MaxPayment < arr[i])
                MaxPayment = arr[i];
        }
        System.out.println("Минимальная сумма трат за день составила " + MinPayment + " рублей");
        System.out.println("Максимальная сумма трат за день составиоа " + MaxPayment + " рублей");

    }
    public  static void task3()
    {
        System.out.println("task 3");
        int[] arr = generateRandomArray();
        int payment = 0;
        for (int i = 0; i < arr.length; i++) {
           payment = payment + arr[i];
        }
        double averagePayment = (double) payment / arr.length;
        System.out.println("Средняя трата за день составила " + averagePayment + " рублей");
    }
    public  static void task4()
    {
        System.out.println("task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i > -1; i--)
        {
            System.out.print(reverseFullName[i]);
        }


    }
    public  static void task5()
    {
        System.out.println();
    }
}