package iterator;

/**
 * Интерфейс, который определяет для перебираемого класса метод получения итератора
 * (Можно так же просто использовать интерфейс Iterable из java.util, который
 * так же определяет единственный метод для получения итератора)
 */
public interface Collection {
    public Iterator getIterator();
}