package utils;

import org.aeonbits.owner.ConfigFactory;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18n {

    protected static BaseConfig baseConfig = ConfigFactory.create(BaseConfig.class, System.getProperties());
    private static I18n i18n = null;
    public final String massageErrorIncorrectLogin;
    public final String baseUrl;
    public final String massageErrorIncorrectPassword;

    private I18n() {
        Locale currentLocale = new Locale(baseConfig.locale());
        ResourceBundle props = ResourceBundle.getBundle("locale", currentLocale);
        massageErrorIncorrectLogin = props.getString("massageErrorIncorrectLogin");
        baseUrl = props.getString("baseUrl");
        massageErrorIncorrectPassword = props.getString("massageErrorIncorrectPassword");
    }

    public static synchronized I18n i18nInstance() {
        if (i18n == null) {
            i18n = new I18n();
        }
        return i18n;
    }


}
