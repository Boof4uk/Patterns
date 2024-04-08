package stratagy;

/**
 * Очень похоже на State, но стратегию выбирает клиентский код, а не код контекста или состояния
 */
public interface SortStratagy {
    public void doSort(int[] arr);
}
