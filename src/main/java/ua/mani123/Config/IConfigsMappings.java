package ua.mani123.Config;

import com.amihaiemil.eoyaml.Yaml;
import com.amihaiemil.eoyaml.YamlMapping;

public class IConfigsMappings {

    public static YamlMapping getConfigMappings(){
        return Yaml.createYamlMappingBuilder()
                .add("bot-token", Yaml.createYamlScalarBuilder().addLine("TOKEN").buildPlainScalar("Discord bot token"))
                .add("default-embed-color", Yaml.createYamlScalarBuilder().addLine("#FF0000").buildPlainScalar("HEX color for embed"))
                .add("bot-activity", Yaml.createYamlSequenceBuilder()
                        .add(Yaml.createYamlScalarBuilder().addLine("PLAYING").buildPlainScalar("Enter PLAYING, STREAMING, LISTENING, WATCHING, COMPETING"))
                        .add(Yaml.createYamlScalarBuilder().addLine("Minecraft").buildPlainScalar("Custom text"))
                        .build("Edit bot status"))
                .add("bot-status", Yaml.createYamlScalarBuilder().addLine("DO_NOT_DISTURB").buildPlainScalar("Enter DO_NOT_DISTURB, ONLINE, IDLE, INVISIBLE, OFFLINE"))
                .build("Configuration of discord bot");
    }
    public static YamlMapping getLangMappings(){
        return Yaml.createYamlMappingBuilder()
                .add("cmd-not-found", "This cmd not found")
                .build();
    }

}
