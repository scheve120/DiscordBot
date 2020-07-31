package init;

import init.events.CommandListener;
import init.events.EventActions;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import secrets.AuthKeys;

import javax.security.auth.login.LoginException;


public class Main {

    public static void main(String[] args) throws LoginException {
        JDA initGameactivitybot = new JDABuilder(AuthKeys.getGameactivitybotKey()).build();

        initGameactivitybot.addEventListener(new EventActions());
    }

    private static void initMassageEvents(JDA initBot) {
        initBot.addEventListener(new EventActions());
    }
}