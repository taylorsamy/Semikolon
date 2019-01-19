package eventListeners;

import net.dv8tion.jda.core.entities.MessageReaction;
import net.dv8tion.jda.core.entities.Role;
import net.dv8tion.jda.core.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.core.events.message.react.MessageReactionRemoveEvent;
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
        GuildController guild = new GuildController(event.getGuild());
        if (event.getMessageId().equals(messageID)) {

            if (emote.isEmote()) {
                switch (emote.getName()) {
                    case "1501":
                        Role comp1501 = event.getGuild().getRoleById(535910836351401985L);
                        guild.addRolesToMember(event.getMember(), comp1501).queue();
                        break;
                    case "1502":
                        Role comp1502 = event.getGuild().getRoleById(536081237740093441L);
                        guild.addRolesToMember(event.getMember(), comp1502).queue();
                        break;
                    case "2511":
                        Role comp2511 = event.getGuild().getRoleById(536081302613655553L);
                        guild.addRolesToMember(event.getMember(), comp2511).queue();
                        break;
                    case "1505":
                        Role math1505 = event.getGuild().getRoleById(536081372582772745L);
                        guild.addRolesToMember(event.getMember(), math1505).queue();
                        break;
                }
            }
        }
    }

    @Override
    public void onMessageReactionRemove(MessageReactionRemoveEvent event) {
        MessageReaction.ReactionEmote emote = event.getReactionEmote();
        GuildController guild = new GuildController(event.getGuild());

        if (emote.isEmote()) {
            switch (emote.getName()) {
                case "1501":
                    Role comp1501 = event.getGuild().getRoleById(535910836351401985L);
                    guild.removeRolesFromMember(event.getMember(), comp1501).queue();
                    break;
                case "1502":
                    Role comp1502 = event.getGuild().getRoleById(536081237740093441L);
                    guild.removeRolesFromMember(event.getMember(), comp1502).queue();
                    break;
                case "2511":
                    Role comp2511 = event.getGuild().getRoleById(536081302613655553L);
                    guild.removeRolesFromMember(event.getMember(), comp2511).queue();
                    break;
                case "1505":
                    Role math1505 = event.getGuild().getRoleById(536081372582772745L);
                    guild.removeRolesFromMember(event.getMember(), math1505).queue();
                    break;
            }
        }

    }
}
