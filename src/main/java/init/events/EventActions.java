package init.events;

import net.dv8tion.jda.api.entities.GuildChannel;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.events.message.priv.PrivateMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.List;

public class EventActions extends ListenerAdapter {

    public void displayMessage(){

    }

    public void onReady(ReadyEvent event) {
        System.out.println("[UCPlugin] JDA is ready! Bot should be online.");
        GuildChannel channelGeneral = event.getJDA().getGuildChannelById("707518752111198261");
        List<User> users = event.getJDA().getUsers();

        for (User member : users) {
            System.out.println(member);
        }

    }

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String message = event.getMessage().getContentRaw();

        System.out.println("message = " + message);
    }

    @Override
    public void onGuildMemberJoin(GuildMemberJoinEvent event) {
        event.getUser().isBot();
    }

    public void onPrivateMessageReceived(PrivateMessageReceivedEvent event) {

    }


}
