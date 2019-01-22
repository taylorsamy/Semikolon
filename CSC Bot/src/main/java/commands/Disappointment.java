package commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.core.entities.User;

public class Disappointment extends Command {

    public Disappointment() {
        this.name = "disappointment";
        //this.cooldown = 60;
    }

    @Override
    protected void execute(CommandEvent event) {

        String[] args = event.getArgs().split(" ");
        String test = args[0].replaceAll("[^\\d.]", "");

        User sender = event.getAuthor();
        try {
            User u = event.getGuild().getMemberById(test).getUser();
            event.reply("<@" + sender.getId() + "> thinks <@" + u.getId() + "> is a huge disappointment");
        } catch (IllegalArgumentException e) {
            event.reply("<@" + sender.getId() + "> is a huge disappointment");
        }




    }
}
