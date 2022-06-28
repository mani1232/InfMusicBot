package ua.mani123.Commands;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.interactions.commands.build.Commands;

public class ICommandsRegister {
    public ICommandsRegister(JDA jda) {
        jda.updateCommands().addCommands(
                Commands.slash("help", "Get help about bot"),
                Commands.slash("play", "Report bugs and another problems")
        ).queue();
    }
}