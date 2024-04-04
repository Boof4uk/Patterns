package builder.builderss;

import builder.website.Cms;

/** Класс конкретной реализации билдера.
 * Зная ее, мы можем запросить конечный продукт у директора
 * -Реализуем методы интерфейса билдера. В каждом указываем конкретное значение
 * для каждой данного билда.
 */

public class VisitCardWebsiteBuilder extends WebsiteBuilder{
    @Override
    void buildeName() {
        website.setName("Visit card");
    }

    @Override
    void buildeCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildePrice() {
        website.setPrice(500);
    }
}
