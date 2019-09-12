package commands.guilds.csc;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.entities.User;
import utils.GuildUtils;

public class Disappointment extends Command {

    public Disappointment() {
        this.name = "disappointment";
        //this.cooldown = 60;
    }

    @Override
    protected void execute(CommandEvent event) {

        if (event.getGuild().getId().equals(GuildUtils.CSC_GUILD_ID)) {

            String[] args = event.getArgs().split(" ");
            String test = args[0].replaceAll("[^\\d.]", "");

            User sender = event.getAuthor();
            try {
                User u = event.getGuild().getMemberById(test).getUser();
                if (u.getName().equals("Semikolon")) {
                    event.reply("<@" + sender.getId() + "> is a big meanie!");
                } else if (u == event.getAuthor()) {
                    event.reply("<@" + sender.getId() + "> is a little confused....");
                } else {
                    event.reply("<@" + sender.getId() + "> thinks <@" + u.getId() + "> is a huge disappointment");
                }
            } catch (IllegalArgumentException e) {
                event.reply("<@" + sender.getId() + "> is a huge disappointment");
            }


        }
    }
}
