package commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

public class Disappointment extends Command {

    public Disappointment() {
        this.name = "disappointment";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("<@243546389043216384> is a huge disappointment");
    }
}
