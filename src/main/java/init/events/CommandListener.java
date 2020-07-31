package init.events;

import init.Main;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class CommandListener extends ListenerAdapter  {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String message = event.getMessage().getContentRaw();

        System.out.println("message = " + message);
        CommandListener.splitText(event);
    }

    private static String[] splitText(GuildMessageReceivedEvent message) {
        return message.getMessage().getContentRaw().split( " ");
    }


}
