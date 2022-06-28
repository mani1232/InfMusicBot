package ua.mani123;

import com.amihaiemil.eoyaml.YamlMapping;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.utils.Compression;
import ua.mani123.Commands.ICommand;
import ua.mani123.Config.IConfig;
import ua.mani123.Config.IConfigsMappings;
import ua.mani123.Console.IConsoleColors;
import ua.mani123.Console.IConsoleExecutor;

import javax.security.auth.login.LoginException;

public class IMusicBot {
    public static void main(String[] args) {
        try {
            // Load config.yml
            IConfig.config = (IConfig.load("config.yml", IConfigsMappings.getConfigMappings()));
            IConfig.lang = (IConfig.load("lang.yml", IConfigsMappings.getLangMappings()));
            // Discord bot init
            JDA jda = JDABuilder.createDefault(IConfig.config.string("bot-token")).addEventListeners(
                             new ICommand()
                    ).setActivity(Activity.playing("Minecraft"))
                    .setCompression(Compression.ZLIB)
                    .setStatus(OnlineStatus.DO_NOT_DISTURB)
                    .build();
            // Console init
            boolean isWorking;
            do {
                isWorking = IConsoleExecutor.start(jda);
            } while (isWorking);

        } catch (LoginException e) {
            System.out.println(
                    IConsoleColors.RED
                    + e.getMessage() + " pls enter valid bot token"
                    + IConsoleColors.RESET);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
