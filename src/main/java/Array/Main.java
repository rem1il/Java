import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Array array = new Array(100);
        array.fillArray();
        System.out.println("Массив после заполнения случайными числами:");
        array.printArray();

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите число для поиска: ");
        int numberToSearch = scanner.nextInt();
        boolean isFound = array.findElement(numberToSearch);
        System.out.println(isFound ? "Число найдено." : "Число не найдено.");

        System.out.print("\nВведите число для удаления: ");
        int numberToDelete = scanner.nextInt();
        array.deleteElement(numberToDelete);
        System.out.println("Массив после удаления элемента:");
        array.printArray();
    }
}

class Array {
    private int[] array;
    private int size;

    public Array(int size) {
        this.size = size;
        this.array = new int[size];
    }

    public void fillArray() {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(101);
        }
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public boolean findElement(int number) {
        for (int i = 0; i < size; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }

    public void deleteElement(int number) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == number) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[size - 1] = 0;
        }
    }
}
