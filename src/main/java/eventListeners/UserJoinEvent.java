package eventListeners;

import net.dv8tion.jda.core.entities.Role;
import net.dv8tion.jda.core.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import net.dv8tion.jda.core.managers.GuildController;
import utils.GuildUtils;


public class UserJoinEvent extends ListenerAdapter {

    @Override
    public void onGuildMemberJoin(GuildMemberJoinEvent event) {



            if (event.getGuild().getId().equals(GuildUtils.DSC_GUILD_ID)) {

                GuildController dsc = new GuildController(event.getGuild());
                String name = event.getMember().getNickname() == null ? event.getMember().getUser().getName() : event.getMember().getNickname();

                System.out.println(name);

                Role memberRole = event.getGuild().getRoleById(619978818907799563L);

                dsc.addRolesToMember(event.getMember(), memberRole).queue();
            }
    }

}
