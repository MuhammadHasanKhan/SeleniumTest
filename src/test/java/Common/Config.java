package Common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    String baseUrl;
    String email;
    String invalidEmail;
    String firstName;
    String lastName;
    String password;
    String invalidPassword;
    String address;
    String city;
    String code;
    String number;

    public static Properties fileUtil() throws IOException {
        File src = new File("src/Values.properties");
        FileInputStream file = new FileInputStream(src);
        Properties properties = new Properties();
        properties.load(file);
        return properties;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getEmail() {
        return email;
    }

    public String getInvalidEmail() {
        return invalidEmail;
    }

    public String getFirstname() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getInvalidPassword() {
        return invalidPassword;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getCode() {
        return code;
    }

    public String getNumber() {
        return number;
    }

    public Config() throws IOException {
        this.baseUrl = fileUtil().getProperty("baseurl");
        this.email = fileUtil().getProperty("email");
        this.firstName = fileUtil().getProperty("firstname");
        this.lastName = fileUtil().getProperty("lastname");
        this.password = fileUtil().getProperty("password");
        this.address = fileUtil().getProperty("address");
        this.city = fileUtil().getProperty("city");
        this.code = fileUtil().getProperty("code");
        this.number = fileUtil().getProperty("number");
        this.invalidEmail = fileUtil().getProperty("invalidemail");
        this.invalidPassword = fileUtil().getProperty("invalidpassword");
    }
}
