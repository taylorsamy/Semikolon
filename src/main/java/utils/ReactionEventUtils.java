package utils;

import net.dv8tion.jda.core.entities.Emote;
import net.dv8tion.jda.core.entities.Message;

public class ReactionEventUtils {
    //TODO when !welcome, save message ID to file. on ReactionEventInit, get message ID from file


    public static void addReactions(Message message, Emote... emotes) {
        for (Emote e : emotes) {
            message.addReaction(e).queue();
        }
    }

}
