package ua.mani123.Config;

import com.amihaiemil.eoyaml.Yaml;
import com.amihaiemil.eoyaml.YamlMapping;

public class IConfigsMappings {

    public static YamlMapping getConfigMappings(){
        return Yaml.createYamlMappingBuilder()
                .add("bot-token", "TOKEN")
                .add("default-embed-color", "#FF0000")
                .build();
    }

    public static YamlMapping getLangMappings(){
        return Yaml.createYamlMappingBuilder()
                .add("cmd-not-found", "This cmd not found")
                .build();
    }

}
