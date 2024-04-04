package builder.builderss;

import builder.website.Cms;

/** Класс конкретной реализации билдера.
 * Зная ее, мы можем запросить конечный продукт у директора
 * -Реализуем методы интерфейса билдера. В каждом указываем конкретное значение
 * для каждой данного билда.
 */

public class EnterpriseWebsiteBuilder extends WebsiteBuilder{
    @Override
    void buildeName() {
        website.setName("Enterprise");
    }

    @Override
    void buildeCms() {
        website.setCms(Cms.ALPHRESSO);
    }

    @Override
    void buildePrice() {
        website.setPrice(100000);
    }
}
