import com.jagrosh.jdautilities.command.CommandClientBuilder;
import com.jagrosh.jdautilities.commons.waiter.EventWaiter;
import commands.Ping;
import commands.RoleMenu;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import javax.security.auth.login.LoginException;

public class Main extends ListenerAdapter {
    public static void main(String[] args) throws LoginException {
        EventWaiter waiter = new EventWaiter();
        CommandClientBuilder client = new CommandClientBuilder();

        client.useDefaultGame();
        client.setOwnerId("127899667584385024");
        client.setPrefix("!");
        client.addCommands(
                new Ping(),
                new RoleMenu()
        );



        JDA api = new JDABuilder(AccountType.BOT)
                .setToken(args[0])
                .setStatus(OnlineStatus.ONLINE)
                .addEventListener(waiter)
                .addEventListener(client.build())
                .build();
    }

}
