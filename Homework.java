import java.util.Arrays;

public class Homework {

public static void main(String[] args) {
    System.out.println(isSumBetween10And20(5, 15)); // true
    System.out.println(isSumBetween10And20(7, 15)); // false
    System.out.println(isSumBetween10And20(2, 6)); // false

    System.out.println(isPositive(5)); // true
    System.out.println(isPositive(-3)); // false    

    printString("abcd", 5); // abcdabcdabcdabcdabcd
    
    System.out.println(isLeapYear(2015));
    
    revArray();
    aArray();

    int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
    int x = array[2][3];
}

/**
 * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
 * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
 */
private static boolean isSumBetween10And20(int a, int b) {
    int sum = a + b;
    return (sum <= 20 && sum >= 10);
}

private static boolean isPositive(int x) {
    // проверить, что х положительное
    return x>0;
}

private static void printString(String source, int repeat) {
    for(int i = 0; i < repeat; i++) {
        System.out.println(source);
     }
}

private static boolean isLeapYear(int year) {
    return ((year % 4 == 0 && year % 100 != 0) | year % 400 == 0);
    
}

private static int[] createArray(int len, int initialValue) {
    int[] newArray = new int[len];
    for (int i = 0; i < len; i++) {
        newArray[i] = initialValue;
    }
    return newArray;
}


private static void aArray() {                                                  // задание 2.
    int [] arr = new int [] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    for ( int i = 0; i < arr.length; i++) {
        if (arr[i] < 6)
        arr[i] *= 2;  
    }
    
    System.out.println(Arrays.toString(arr));
}


private static void revArray() {                                                  // задание 1.
    int [] arrr = new int [] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    for ( int i = 0; i < arrr.length; i++) {
        if (arrr[i] == 0)
        arrr[i] = 1;
        else { arrr[i] = 0;
        }
    }
    
    System.out.println(Arrays.toString(arrr));
}



/**
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
 *
 * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
 *
 * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
 * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 * * Также заполнить элементы побочной диагонали
 */

}
