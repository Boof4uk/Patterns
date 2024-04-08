package templateMethod;

public class SportsWebsite extends WebsiteTemplate{
    @Override
    public void showSpecificContent() {
        System.out.println("СПОРТИВНЫЙ контент");
    }
}
