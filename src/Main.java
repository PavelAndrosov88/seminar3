import lesson3.Task;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 12, 3, 5, 23, 632, 4, 5, 67, 66, 55, 74, 12, 89,6, 9, 8, 7, 18, 91,2, 77, 14 };
        int[] arr = array;
        array = Task.sortArray(array);
        System.out.println("Начальный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Конечный массив: ");
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
