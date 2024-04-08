package templateMethod;

public class App {
    public static void main(String[] args) {
        WebsiteTemplate newsWebsite = new NewsWebsite();
        WebsiteTemplate sportsWebsite = new SportsWebsite();

        newsWebsite.showContent();
        System.out.println("\n");
        sportsWebsite.showContent();
    }
}
