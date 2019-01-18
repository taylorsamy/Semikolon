package eventListeners;

import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.MessageReaction;
import net.dv8tion.jda.core.entities.Role;
import net.dv8tion.jda.core.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import net.dv8tion.jda.core.managers.GuildController;

public class ReactionEvent extends ListenerAdapter {

    private String messageID;

    public ReactionEvent(String messageID) {
        this.messageID = messageID;
    }


    @Override
    public void onMessageReactionAdd(MessageReactionAddEvent event) {
        MessageReaction reaction = event.getReaction();
        MessageReaction.ReactionEmote emote = reaction.getReactionEmote();
        MessageChannel channel = event.getChannel();
        GuildController guild = new GuildController(event.getGuild());
        if (event.getMessageId().equals(messageID)) {

            channel.sendMessage(event.getMember().getEffectiveName() + " reacted with " + emote.getName()).queue();

            if (emote.isEmote()) {
                channel.sendMessage(emote.getId()).queue();

                for (Role role : event.getGuild().getRoles()) {
                    System.out.println(role.getName() + " " + role.getId());
                }

                Role comp1501 = event.getGuild().getRoleById(535910836351401985L);

                guild.addRolesToMember(event.getMember(), comp1501).queue();


            }
        }
    }
}
