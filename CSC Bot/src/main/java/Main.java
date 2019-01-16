import com.jagrosh.jdautilities.command.CommandClientBuilder;
import com.jagrosh.jdautilities.commons.waiter.EventWaiter;
import commands.Ping;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.entities.Game;
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
            new Ping()
        );



        JDA api = new JDABuilder(AccountType.BOT)
                .setToken("NTM0ODgxMjMyNjM5NjIzMTc4.DyACrA.QhZIvgiF3G_h4jnt68S4iz2aogc")
                .setStatus(OnlineStatus.ONLINE)
                .addEventListener(waiter)
                .addEventListener(client.build())
                .build();
    }

}
