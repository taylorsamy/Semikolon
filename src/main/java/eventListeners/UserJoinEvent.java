package eventListeners;


import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import utils.GuildUtils;


public class UserJoinEvent extends ListenerAdapter {

    @Override
    public void onGuildMemberJoin(GuildMemberJoinEvent event) {



            if (event.getGuild().getId().equals(GuildUtils.DSC_GUILD_ID)) {

                Guild dsc = event.getGuild();
                String name = event.getMember().getNickname() == null ? event.getMember().getUser().getName() : event.getMember().getNickname();

                System.out.println(name);

                Role memberRole = event.getGuild().getRoleById(619978818907799563L);

                dsc.addRoleToMember(event.getMember(), memberRole).queue();
            }
    }

}
