package stratagy;

import java.util.Arrays;

public class Sorter {
    private SortStratagy sortStratagy;

    public void setSortStratagy(SortStratagy sortStratagy) {
        this.sortStratagy = sortStratagy;
    }

    public void executeSort(int[] arr) {
        System.out.println(sortStratagy.getClass() + "\n" +Arrays.toString(arr) );
        sortStratagy.doSort(arr);
        System.out.println(Arrays.toString(arr) + "\n");
    }
}
