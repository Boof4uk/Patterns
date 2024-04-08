package templateMethod;
/**
 * Подкласс реализующий свое доп поведение
 */
public class NewsWebsite extends WebsiteTemplate{
    @Override
    public void showSpecificContent() {
        System.out.println("НОВОСТНОЙ КОНТЕНТ");
    }
}
