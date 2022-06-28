package ua.mani123.Config;

import com.amihaiemil.eoyaml.Yaml;
import com.amihaiemil.eoyaml.YamlMapping;
import com.amihaiemil.eoyaml.YamlPrinter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class IConfig {
    public static YamlMapping config;
    public static YamlMapping lang;

    public static YamlMapping load(String fileName, YamlMapping map) {
        try {
            return Yaml.createYamlInput(
                    new File(fileName)
            ).readYamlMapping();
        } catch (FileNotFoundException e) {
            System.out.println(fileName + " - file not found, creating");
            create(fileName, map);
            return load(fileName, map);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static void create(String fileName, YamlMapping map) {
        try {
            YamlPrinter printer = Yaml.createYamlPrinter(
                    new FileWriter(fileName)
            );
            printer.print(map);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
