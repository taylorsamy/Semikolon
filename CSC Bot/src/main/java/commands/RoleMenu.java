package commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import eventListeners.ReactionEvent;

public class RoleMenu extends Command {

    ReactionEvent reactionEvent;

    public RoleMenu() {
        this.name = "roles";
        this.ownerCommand = true;

    }

    @Override
    protected void execute(CommandEvent event) {

        event.reply("Please pick a class", message -> {
            message.addReaction("1\u20E3").queue();
            reactionEvent = new ReactionEvent(message.getId());
            event.getJDA().addEventListener(reactionEvent);
        });


    }
}
