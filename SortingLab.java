/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Comparator;

/**
 *
 * @author priya
 */
public class SortingLab {
    
    // Insertion Sort using Comparable
    public static <E extends Comparable<E>> void insertionSort(E[] list) {
        for (int i = 1; i < list.length; i++) {
            E currentElement = list[i];
            int j = i - 1;

            while (j >= 0 && list[j].compareTo(currentElement) > 0) {
                list[j + 1] = list[j];
                j--;
            }

            list[j + 1] = currentElement;
        }
    }

    // Bubble Sort using Comparator
    public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator) {
        boolean swapped;

        for (int i = 0; i < list.length - 1; i++) {
            swapped = false;

            for (int j = 0; j < list.length - 1 - i; j++) {
                if (comparator.compare(list[j], list[j + 1]) > 0) {
                    E temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    // Main method to test
    public static void main(String[] args) {

        // Test insertionSort
        Integer[] numbers = {5, 2, 9, 1, 3};
        insertionSort(numbers);

        System.out.println("Insertion Sort:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Test bubbleSort
        String[] names = {"John", "Alice", "Bob"};
        bubbleSort(names, (a, b) -> a.compareTo(b));

        System.out.println("\nBubble Sort:");
        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}
