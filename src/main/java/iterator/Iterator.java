package iterator;

/**
 * Определяем интерфейс Итератор или используем готовый из java.util
 * -Определяем метод hasNext()
 * -определяем метод next()
 */
public interface Iterator {
    public boolean hasNext();
    public Object next();
}
