package ua.mani123.Console;

import net.dv8tion.jda.api.JDA;

import java.util.Scanner;

public class IConsoleExecutor {
    static public boolean start(JDA jda){
        Scanner scanner = new Scanner(System.in);
        switch (scanner.next()){
            case "stop" -> {
                jda.shutdown();
                System.out.println("Bot is offline");
                return false;
            }
            case "status" -> System.out.println("Bot is online: "+ jda.getStatus().isInit());
            default -> System.out.println("Cmd not found");
        }
        return true;
    }
}
