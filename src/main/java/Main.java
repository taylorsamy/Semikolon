import com.jagrosh.jdautilities.command.CommandClientBuilder;
import com.jagrosh.jdautilities.commons.waiter.EventWaiter;
import commands.guilds.csc.Disappointment;
import commands.Ping;
import commands.guilds.csc.Welcome;
import commands.guilds.dsc.Interests;
import eventListeners.ReactionEvent;
import eventListeners.UserJoinEvent;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


import javax.security.auth.login.LoginException;

public class  Main extends ListenerAdapter {



    public static void main(String[] args) throws LoginException {
        EventWaiter waiter = new EventWaiter();
        CommandClientBuilder client = new CommandClientBuilder();
        ReactionEvent welcomeEvent = new ReactionEvent("619982868323762206");


        client.useDefaultGame();
        client.setOwnerId("127899667584385024");
        client.setPrefix("!");
        client.addCommands(
                new Ping(),
                new Welcome(),
                new Disappointment(),
                new Interests()
        );




        JDA api = new JDABuilder(AccountType.BOT)
                .setToken(args[0])
                .setStatus(OnlineStatus.ONLINE)
                .addEventListeners(waiter, welcomeEvent, new UserJoinEvent(), client.build())
                .build();
    }

}
