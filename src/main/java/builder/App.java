package builder;

import builder.builderss.Director;
import builder.builderss.VisitCardWebsiteBuilder;
import builder.website.Website;

/**
 * Клентский код
 * -
 */
public class App {
    public static void main(String[] args) {
        Director director = new Director();
        director.setWebsiteBuilder(new VisitCardWebsiteBuilder());
        Website website = director.buildWebsite(); // теперь нам не надо в ручную прописывать поля, для получения нужного тиап сайта
        System.out.println(website);
    }
}
