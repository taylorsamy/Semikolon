package eventListeners;

import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.MessageReaction;
import net.dv8tion.jda.core.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class ReactionEvent extends ListenerAdapter {

    String messageID;

    public ReactionEvent(String messageID) {
        this.messageID = messageID;
    }


    @Override
    public void onMessageReactionAdd(MessageReactionAddEvent event) {
        MessageReaction reaction = event.getReaction();
        MessageReaction.ReactionEmote emote = reaction.getReactionEmote();
        MessageChannel channel = event.getChannel();
        if (event.getMessageId().equals(messageID)) {
            channel.sendMessage("?").queue();
        }
    }
}
