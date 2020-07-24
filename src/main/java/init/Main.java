package init;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import secrets.AuthKeys;

import javax.security.auth.login.LoginException;

@SpringBootApplication
public class Main {

    public static void main(String[] args) throws LoginException {
        JDA jdaBuilder = new JDABuilder(AuthKeys.DiscordAuth()).build();
        SpringApplication.run(com.DiscordHelper.DiscordHelper.DiscordHelperApplication.class, args);

    }
}