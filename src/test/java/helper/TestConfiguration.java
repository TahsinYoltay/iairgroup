package helper;


import com.esotericsoftware.yamlbeans.YamlReader;

import java.io.File;
import java.io.FileReader;
import java.util.Map;
import java.util.Properties;


public class TestConfiguration {
    public static Properties properties = new Properties();

    /**
     * get yaml value
     *
     * @param propertyName
     * @return
     */
    public static String getProperty(String propertyName) {
        String propertyValue = properties.getProperty(propertyName);
        if (propertyValue == null || propertyValue.equals("")) {
            propertyValue = System.getenv(propertyName);
        }
        return propertyValue;
    }

    /**
     * load yaml file
     *
     * @param sourcePropertiesFilePath
     * @throws Exception
     */
    public static void loadAPropertiesFile(String sourcePropertiesFilePath) throws Exception {
        if (!(sourcePropertiesFilePath == null)) {
            File file = new File(sourcePropertiesFilePath);
            if (!file.exists() || file.isDirectory()) {
                throw new Exception("Cannot find the file: '" + sourcePropertiesFilePath + "'");
            }

            // We may want to ADD to any properties set elsewhere
            if (properties == null) {
                properties = new Properties();
            }
            YamlReader reader = new YamlReader(new FileReader(sourcePropertiesFilePath));
            // TODO: identify the return type of object and replace it with an appropriately parameterised Map
            Object object = reader.read();
            iterateOverAMap((Map) object, null);
        }
    }

    /**
     * @param map
     * @param baseKey
     */
    private static void iterateOverAMap(Map map, String baseKey) {
        for (Object o : map.entrySet()) {
            Map.Entry entry = (Map.Entry) o;
            String key = (String) entry.getKey();
            if (baseKey != null) {
                key = baseKey + "." + key;
            }
            if (entry.getValue() instanceof String) {
                String value = (String) entry.getValue();
                properties.setProperty(key, value);
            } else {
                iterateOverAMap((Map) entry.getValue(), key);
            }
        }
    }
}