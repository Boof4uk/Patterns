package iterator;

/**
 * Класс , чьи элементы требуется перебирать
 * -имплементируем интерфейс, который позволяет получить итератор (у нас свой, но
 * можно использовать просто интерфейс Iterable из java.util)
 * -реализуем метод по получению итератора
 * -создаем внутренний класс конкретного итератора и в нем реализуем логику перебора
 * (смотри описание ниже)
 */
public class JavaDeveloper implements  Collection{
    private String name;
    private String[] skills;

    public JavaDeveloper(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }

    /**
     * Вложенный класс конкретного итератора
     * -нужно имплементировать интерфейс, который определяет всего 2 метода
     * hasnext() и next(). Мы создали свой, но можно использовать из java.util
     * -создаем поле index, которое будет являться счетчиком перебранных элементов
     * -реализуем метод hasnext(): сравниваем в нем количество перебранных элементов с количеством
     * элементов в нашем объекте(коллекции)
     * -реализуем метод next(): возвращаем элемент с индексом, который находится в index
     * И ОБЯЗАТЕЛЬНО делаем посткремент++, чтобы индекс после выдачи увеличился
     */
    private class SkillIterator implements Iterator {
        private int index = 0;
        @Override
        public boolean hasNext() {
            if (index < skills.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return skills[index++];
        }
    }

}
