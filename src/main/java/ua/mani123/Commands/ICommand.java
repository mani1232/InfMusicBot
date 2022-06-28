package ua.mani123.Commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import ua.mani123.Config.IConfig;

import java.awt.*;

public class ICommand extends ListenerAdapter {
    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        switch (event.getName()){
            case "help" -> System.out.println("ok");
            case "play" -> System.out.println("ok");
            default -> event.replyEmbeds(new EmbedBuilder()
                    .setTitle(event.getName())
                    .addField(IConfig.lang.string("cmd-not-found"), "", false)
                    .setColor(Color.decode(IConfig.config.string("default-embed-color")))
                    .build()).setEphemeral(true).queue();
        }
    }
}
