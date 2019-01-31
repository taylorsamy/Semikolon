package commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

import java.time.temporal.ChronoUnit;

public class Ping extends Command {

    public Ping() {
        this.name = "ping";
    }

    @Override

    //JDA-Utilities example retrieved from
    //https://github.com/JDA-Applications/JDA-Utilities/blob/master/examples/src/main/java/com/jagrosh/jdautilities/examples/command/PingCommand.java
    protected void execute(CommandEvent event) {
        event.reply("Ping: ...", m -> {
            long ping = event.getMessage().getCreationTime().until(m.getCreationTime(), ChronoUnit.MILLIS);
            m.editMessage("Ping: " + ping + "ms | Websocket: " + event.getJDA().getPing() + "ms").queue();
        });
    }
}
