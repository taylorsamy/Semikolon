package commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import eventListeners.ReactionEvent;
import net.dv8tion.jda.core.entities.Emote;

public class Welcome extends Command {

    private ReactionEvent reactionEvent;

    public Welcome() {
        this.name = "welcome";
        this.ownerCommand = true;

    }

    @Override
    protected void execute(CommandEvent event) {

        Emote comp1501 = event.getGuild().getEmoteById(536076160220528640L);
        Emote comp1502 = event.getGuild().getEmoteById(536076678322061312L);
        Emote comp2511 = event.getGuild().getEmoteById(536078381796818961L);
        Emote math1505 = event.getGuild().getEmoteById(536080017017405441L);

        event.reply("Welcome everyone,\n" +
                "This guild started out as a place for for a handful of 1501 students to hang out. " +
                "It has now grown to become far more than that. Everyone in here is passionate about programming and " +
                "willing to help out anyone who needs a hand. With how much we've grown already, we need to set a few ground rules.\n" +
                "First, **no one in here will complete assignments for you** if you're looking for a place to plagiarise, this isn't it.\n" +
                "Second, **when you ask for help, be prepared to work through the problem.** We will try to push you in the right direction, but the work needs to be yours.\n" +
                "Third, **don't post your code.** Small snippets are fine, but posting entire files or classes isn't\n" +
                "And finally, be respectful. We are a friendly community, and we'd prefer to keep it that way. Please leave personal, non-constructive arguments out of here.");

        event.reply("\n\nNow, a few administrative words, please use your real first name as your nickname here so we know who we're talking to. To do this, type ``/nick <name>`` without the angle brackets ``<>``. \n\n");

        event.reply("\n\nLastly, please click on classes that you are currently enrolled in. This allows someone to ping everyone in a particular class. If anyone wants another class added, ping <@127899667584385024>\n" +
                "The current classes are" +
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
