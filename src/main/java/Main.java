import com.jagrosh.jdautilities.command.CommandClientBuilder;
import com.jagrosh.jdautilities.commons.waiter.EventWaiter;
import commands.Disappointment;
import commands.Ping;
import commands.Welcome;
import eventListeners.ReactionEvent;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import javax.security.auth.login.LoginException;

public class  Main extends ListenerAdapter {
    public static void main(String[] args) throws LoginException {
        EventWaiter waiter = new EventWaiter();
        CommandClientBuilder client = new CommandClientBuilder();
       ReactionEvent welcomeEvent = new ReactionEvent("619286757023678501");

        client.useDefaultGame();
        client.setOwnerId("127899667584385024");
        client.setPrefix("!");
        client.addCommands(
                new Ping(),
                new Welcome(),
                new Disappointment()
        );



        JDA api = new JDABuilder(AccountType.BOT)
                .setToken(args[0])
                .setStatus(OnlineStatus.ONLINE)
                .addEventListener(waiter)
                .addEventListener(welcomeEvent)
                .addEventListener(client.build())
                .build();
    }

}
