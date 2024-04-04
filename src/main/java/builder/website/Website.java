package builder.website;

/**
 * Класс который в дальнейшем мы будем билдить
 * - Определить поля
 * - СОздать для них сеттеры
 *
 */
public class Website {
    private int price;
    private Cms cms;
    private String name;

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCms(Cms cms) {
        this.cms = cms;
    }
    @Override
    public String toString() {
        return "Website{" +
                "price=" + price +
                ", cms=" + cms +
                ", name='" + name + '\'' +
                '}';
    }
}
