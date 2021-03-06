package eventListeners;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.MessageReaction;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.events.message.react.MessageReactionRemoveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import utils.GuildUtils;

public class ReactionEvent extends ListenerAdapter {

    //ID of the message to listen to
    private String messageID;

    public ReactionEvent(String messageID) {
        this.messageID = messageID;
    }

    //TODO abstract out all this junk so that this one class can be used for multiple messages. Maybe use a map of some sort?
    //current thought is to have a map and a method that adds an emote and role to said map, then just add roles dynamically when needed. Could have
    //a different map for each guild

    //TODO later on, maybe have a command to update this from the front end, make it also edit the message to show the new roles

    @Override
    public void onMessageReactionAdd(MessageReactionAddEvent event) {
        if (event.getGuild().getId().equals(GuildUtils.CSC_GUILD_ID)) {
            MessageReaction.ReactionEmote emote = event.getReactionEmote();
            
            Guild guild = event.getGuild();
            if (event.getMessageId().equals(messageID)) {
                if (!event.getUser().isBot()) {
                    if (emote.isEmote()) {
                        switch (emote.getName()) {
                            case "1501":
                                Role comp1501 = event.getGuild().getRoleById(535910836351401985L);
                                guild.addRoleToMember(event.getMember(), comp1501).queue();
                                break;
                            case "1502":
                                Role comp1502 = event.getGuild().getRoleById(536081237740093441L);
                                guild.addRoleToMember(event.getMember(), comp1502).queue();
                                break;
                            case "2511":
                                Role comp2511 = event.getGuild().getRoleById(536081302613655553L);
                                guild.addRoleToMember(event.getMember(), comp2511).queue();
                                break;
                            case "1505":
                                Role math1505 = event.getGuild().getRoleById(536081372582772745L);
                                guild.addRoleToMember(event.getMember(), math1505).queue();
                                break;
                            case "2521":
                                Role comp2521 = event.getGuild().getRoleById(619559249843978280L);
                                guild.addRoleToMember(event.getMember(), comp2521).queue();
                                break;
                            case "2531":
                                Role comp2531 = event.getGuild().getRoleById(619560422130974740L);
                                guild.addRoleToMember(event.getMember(), comp2531).queue();
                                break;
                            case "2541":
                                Role comp2541 = event.getGuild().getRoleById(619560954656718869L);
                                guild.addRoleToMember(event.getMember(), comp2541).queue();
                                break;
                            case "jpns1105":
                                Role jpns1105 = event.getGuild().getRoleById(619561574843285504L);
                                guild.addRoleToMember(event.getMember(), jpns1105).queue();
                        }
                    }
                }
            }
        }
    }

    @Override
    public void onMessageReactionRemove(MessageReactionRemoveEvent event) {
        if (event.getGuild().getId().equals(GuildUtils.CSC_GUILD_ID)) {
            MessageReaction.ReactionEmote emote = event.getReactionEmote();
            Guild guild = event.getGuild();
            if (emote.isEmote()) {
                switch (emote.getName()) {
                    case "1501":
                        Role comp1501 = event.getGuild().getRoleById(535910836351401985L);
                        guild.removeRoleFromMember(event.getMember(), comp1501).queue();
                        break;
                    case "1502":
                        Role comp1502 = event.getGuild().getRoleById(536081237740093441L);
                        guild.removeRoleFromMember(event.getMember(), comp1502).queue();
                        break;
                    case "2511":
                        Role comp2511 = event.getGuild().getRoleById(536081302613655553L);
                        guild.removeRoleFromMember(event.getMember(), comp2511).queue();
                        break;
                    case "1505":
                        Role math1505 = event.getGuild().getRoleById(536081372582772745L);
                        guild.removeRoleFromMember(event.getMember(), math1505).queue();
                        break;
                    case "2521":
                        Role comp2521 = event.getGuild().getRoleById(619559249843978280L);
                        guild.removeRoleFromMember(event.getMember(), comp2521).queue();
                        break;
                    case "2531":
                        Role comp2531 = event.getGuild().getRoleById(619560422130974740L);
                        guild.removeRoleFromMember(event.getMember(), comp2531).queue();
                        break;
                    case "2541":
                        Role comp2541 = event.getGuild().getRoleById(619560954656718869L);
                        guild.removeRoleFromMember(event.getMember(), comp2541).queue();
                        break;
                    case "jpns1105":
                        Role jpns1105 = event.getGuild().getRoleById(619561574843285504L);
                        guild.removeRoleFromMember(event.getMember(), jpns1105).queue();

                }
            }
        }

    }
}
