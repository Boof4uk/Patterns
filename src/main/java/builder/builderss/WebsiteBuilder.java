package builder.builderss;

import builder.website.Website;

/**
 * Интерфейс билдера, для дальнейших его реализаций(готовых сборок)
 * -Определяем поле объекта, который требуется билдить
 * -Получаем объект через конструктор
 * -Определяем абстрактные методы для установки значений полей объекта.
 * Реализацию этих методов оставляем для конкретных билдеров.


 * Теперь в клиентском классе нам достаточно знать только название конкретного билдера
 * чтобы получить у директора конечный продукт. Нам не нужно волноваться о том, какие поля
 * нам надо иницилизировать у вебсайта. Билдер все знает
 */
public abstract class WebsiteBuilder {
    Website website;

    WebsiteBuilder() {
        website = new Website();
    }
    abstract void buildeName();
    abstract void buildeCms();
    abstract void buildePrice();

    public Website getWebsite() {
        return website;
    }

}


