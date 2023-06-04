import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }


    public static void task1() {
        System.out.println("Задача 1");

        int[] integers = new int[3];
        double[] fractions = {1.57, 7.654, 9.986};
        char[] notes = {'C', 'D', 'E', 'F', 'G', 'A', 'B' };

    }

    public static void task2() {
        System.out.println("Задача 2");

        int[] integers = new int[3];
        double[] fractions = {1.57, 7.654, 9.986};
        char[] notes = {'C', 'D', 'E', 'F', 'G', 'A', 'B' };

        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;

        for (int i = 0; i < integers.length - 1; i++) {
            System.out.printf(integers[i] + ", ");
        }
        System.out.println(integers[integers.length - 1]);


        for (int i = 0; i < fractions.length - 1; i++) {
            System.out.printf(fractions[i] + ", ");
        }
        System.out.println(fractions[fractions.length - 1]);


        for (int i = 0; i < notes.length - 1; i++) {
            System.out.printf(notes[i] + ", ");
        }
        System.out.println(notes[notes.length - 1]);

    }

    public static void task3() {
        System.out.println("Задача 3");

        int[] integers = {1, 2, 3};
        double[] fractions = {1.57, 7.654, 9.986};
        char[] notes = {'C', 'D', 'E', 'F', 'G', 'A', 'B' };

        for (int i = integers.length - 1; i > 0; i--) {
            System.out.printf(integers[i] + ", ");
        }
        System.out.println(integers[0]);


        for (int i = fractions.length - 1; i > 0; i--) {
            System.out.printf(fractions[i] + ", ");
        }
        System.out.println(fractions[0]);


        for (int i = notes.length - 1; i > 0; i--) {
            System.out.printf(notes[i] + ", ");
        }
        System.out.println(notes[0]);


    }

    public static void task4() {
        System.out.println("Задача 4");

        int[] integers = {1, 2, 3};
        int[] eventNumbers = new int[integers.length];

        for (int i = 0; i < integers.length; i++) {
            int number = integers[i];
            if (number % 2 != 0) {
                number = number + 1;
                eventNumbers[i] = number;
            } else {
                eventNumbers[i] = number;
            }
        }
        System.out.println(Arrays.toString(eventNumbers));
        // for (int k = 0; k < eventNumbers.length - 1; k++) {
        //     System.out.printf(eventNumbers[k] + ", ");
        //  }
        // System.out.println(eventNumbers[eventNumbers.length - 1]);
    }
}
