package commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

public class Ping extends Command {

    public Ping() {
        this.name = "ping";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("Pong!");
    }
}
