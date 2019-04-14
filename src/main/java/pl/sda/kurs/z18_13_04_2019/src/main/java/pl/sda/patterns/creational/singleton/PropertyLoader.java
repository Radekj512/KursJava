package pl.sda.patterns.creational.singleton;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

//DONE read connection.properties from the file
class PropertyLoader {

    private Properties properties = new Properties();
    private Path connection = Paths.get("src", "main", "resources", "connection.properties");
    public PropertyLoader(){
        load();
    }
    public void load() {
        try (InputStream readFile = Files.newInputStream(connection)) {
            properties.load(readFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Properties getProperties() {
        return properties;
    }

    public String getDb() {
        return properties.getProperty("db");
    }

    public String getPassword() {
        return properties.getProperty("password");
    }

    public String getUser() {
        return properties.getProperty("user");
    }

    public String getAddress() {
        return properties.getProperty("address");
    }


}
