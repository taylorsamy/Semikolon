package commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.core.entities.Member;

public class Disappointment extends Command {

    public Disappointment() {
        this.name = "disappointment";
    }

    @Override
    protected void execute(CommandEvent event) {
        Member sender = event.getMember();
        event.reply("<@" + sender.getUser().getId() + "> is a huge disappointment");
    }
}
