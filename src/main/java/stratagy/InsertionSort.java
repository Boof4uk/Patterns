package stratagy;

public class InsertionSort implements SortStratagy{
    @Override
    public void doSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            // Перемещаем элементы массива, которые больше key, на одну позицию вперед
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
