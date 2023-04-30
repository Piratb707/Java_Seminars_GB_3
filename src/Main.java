//// Реализация алгоритма сортировки слиянием:

//public class Main {
//    public static void main(String[] args) {
//        int[] arr = {3, 6, 1, 8, 2, 4};
//        System.out.println("Original array: " + Arrays.toString(arr));
//        mergeSort(arr, 0, arr.length - 1);
//        System.out.println("Sorted array: " + Arrays.toString(arr));
//    }
//
//    private static void mergeSort(int[] arr, int l, int r) {
//        if (l < r) {
//            int m = (l + r) / 2;
//            mergeSort(arr, l, m);
//            mergeSort(arr, m + 1, r);
//            merge(arr, l, m, r);
//        }
//    }
//
//    private static void merge(int[] arr, int l, int m, int r) {
//        int n1 = m - l + 1;
//        int n2 = r - m;
//        int[] L = new int[n1];
//        int[] R = new int[n2];
//        for (int i = 0; i < n1; ++i) {
//            L[i] = arr[l + i];
//        }
//        for (int j = 0; j < n2; ++j) {
//            R[j] = arr[m + 1 + j];
//        }
//        int i = 0, j = 0;
//        int k = l;
//        while (i < n1 && j < n2) {
//            if (L[i] <= R[j]) {
//                arr[k] = L[i];
//                i++;
//            } else {
//                arr[k] = R[j];
//                j++;
//            }
//            k++;
//        }
//        while (i < n1) {
//            arr[k] = L[i];
//            i++;
//            k++;
//        }
//        while (j < n2) {
//            arr[k] = R[j];
//            j++;
//            k++;
//        }
//    }
//}

////Удаление четных чисел из списка:
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//        System.out.println("Original list: " + list);
//        list.removeIf(n -> n % 2 == 0);
//        System.out.println("List after removing even numbers: " + list);
//    }
//}

////Поиск минимального, максимального и среднего значения в списке:
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 7, 4));
//        System.out.println("List: " + list);
//        int min = Collections.min(list);
//        int max = Collections.max(list);
//        double avg = list.stream().mapToInt(Integer::intValue).average().orElse(Double.NaN);
//        System.out.println("Minimum: " + min);
//        System.out.println("Maximum: " + max);
//        System.out.println("Average: " + avg);
//    }
//}

