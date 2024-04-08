package stratagy;

public class App {
    public static void main(String[] args) {
        int[]arr1 = {3,41,2,6,66,23,995,33};
        int[]arr2 = {1111,4,21,0,662,2123,95,3};
        int[]arr3 = {323,412,12,1116,23466,243,95,313};

        Sorter sorter = new Sorter();

        sorter.setSortStratagy(new BubbleSort());
        sorter.executeSort(arr1);

        sorter.setSortStratagy(new InsertionSort());
        sorter.executeSort(arr2);

        sorter.setSortStratagy(new SelectionSort());
        sorter.executeSort(arr3);

    }
}
