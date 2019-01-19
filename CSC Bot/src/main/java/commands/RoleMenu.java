package commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import eventListeners.ReactionEvent;
import net.dv8tion.jda.core.entities.Emote;

public class RoleMenu extends Command {

    private ReactionEvent reactionEvent;

    public RoleMenu() {
        this.name = "roles";
        this.ownerCommand = true;

    }

    @Override
    protected void execute(CommandEvent event) {

        Emote comp1501 = event.getGuild().getEmoteById(536076160220528640L);
        Emote comp1502 = event.getGuild().getEmoteById(536076678322061312L);
        Emote comp2511 = event.getGuild().getEmoteById(536078381796818961L);
        Emote math1505 = event.getGuild().getEmoteById(536080017017405441L);

        event.reply("Please pick classes that you are currently enrolled in. The choices are" +
                "\nCOMP-1501 <:1501:536076160220528640>" +
                "\nCOMP-1502 <:1502:536076678322061312>" +
                "\nCOMP-2511 <:2511:536078381796818961>" +
                "\nMATH-1505 <:1505:536080017017405441>", message -> {
            message.addReaction(comp1501).queue();
            message.addReaction(comp1502).queue();
            message.addReaction(comp2511).queue();
            message.addReaction(math1505).queue();
            reactionEvent = new ReactionEvent(message.getId());
            event.getJDA().addEventListener(reactionEvent);
        });


    }
}
