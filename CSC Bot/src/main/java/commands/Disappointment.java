package commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.core.entities.User;

public class Disappointment extends Command {

    public Disappointment() {
        this.name = "disappointment";
    }

    @Override
    protected void execute(CommandEvent event) {
        User sender = event.getAuthor();
        event.reply("<@" + sender.getId() + "> is a huge disappointment");
    }
}
