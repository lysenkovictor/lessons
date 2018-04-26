package utils;
import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config.properties"})
public interface BaseConfig extends Config{

    String locale();
    String login();
    String password();
    String incorrectPassword();
    String incorrectLogin();

}
