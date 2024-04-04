package builder.builderss;

import builder.website.Website;

/**Класс директора, который выдает конкретный продукт, в зависимости от переданного билдера
 * -Определяем поле объекта билдера
 * -Делаем конструктор принимающий билдер
 * -Делаем метод, который будет вызывать у объекта билдера все методы для инициализации полей



 *  Этот класс выдает готовый конечный продукт (вебсайт) исходя из того, какой билдер ему передали.
 *  * Он нужен для того, чтобы мы не возились в клиентском коде с инициализацией каждого поля.
 *  * Мы просто используем готовое решение конкретного билдера
 *  * P.s Если бы в самом коде мы использовали билдер, а не директор, то нам пришлось бы создать билдер и
 *  * так же билдить каждое поле через созданный билдер.
 */
public class Director {
    private WebsiteBuilder websiteBuilder;

    public void setWebsiteBuilder(WebsiteBuilder websiteBuilder) {
        this.websiteBuilder = websiteBuilder;
    }

    public Website buildWebsite() {
        websiteBuilder.buildeCms();
        websiteBuilder.buildeName();
        websiteBuilder.buildePrice();
        return websiteBuilder.getWebsite();
    }
}
