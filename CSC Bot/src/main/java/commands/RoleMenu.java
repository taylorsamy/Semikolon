package commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import eventListeners.ReactionEvent;

public class RoleMenu extends Command {

    ReactionEvent reactionEvent;

    public RoleMenu() {
        this.name = "roles";

    }

    @Override
    protected void execute(CommandEvent event) {

        event.reply("Please pick a class", message -> {
            reactionEvent = new ReactionEvent(message.getId());
            event.getJDA().addEventListener(reactionEvent);
        });


    }
}
