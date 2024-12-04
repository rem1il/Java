package Bubble;

import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов массива: ");
        int size = scanner.nextInt();

        BubbleArray array = new BubbleArray(size); // использован BubbleArray

        array.fillArray(scanner);
        System.out.println("Массив до сортировки:");
        array.printArray();

        array.bubbleSort();
        System.out.println("Массив после сортировки:");
        array.printArray();
    }
}

class BubbleArray {
    private int[] array;
    private int size;

    public BubbleArray(int size) {
        this.size = size;
        this.array = new int[size];
    }

    public void fillArray(Scanner scanner) {
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void bubbleSort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
