import java.util.Enumeration;
import java.util.HashMap;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Miguel Angel on 10/03/2017.
 */
public class I18Manager {
    private static I18Manager singletonI18Maneger = null;
    private HashMap<String, ResourceBundle> readerManager = new HashMap<>();

    private I18Manager(){}

    public static I18Manager getInstance()
    {
        if(singletonI18Maneger == null)
            singletonI18Maneger = new I18Manager();

        return singletonI18Maneger;
    }

    public void readDocuments(String document, String language) {

        if (!readerManager.containsKey(language)) {
            readerManager.put(language, ResourceBundle.getBundle(document, Locale.forLanguageTag(language)));
        }

        ResourceBundle rb = readerManager.get(language);
        Enumeration<String> keys = rb.getKeys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            String value = rb.getString(key);
            System.out.println(key + ": " + value);
        }
    }
}
