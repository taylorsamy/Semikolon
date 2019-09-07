package commands.guilds.dsc;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.core.entities.Emote;
import utils.GuildUtils;
import utils.ReactionEventUtils;

public class Interests extends Command {

    public Interests() {
        this.name = "interests";
        this.ownerCommand = true;
        this.hidden = true;

    }

    @Override
    protected void execute(CommandEvent event) {
        if (event.getGuild().getId().equals(GuildUtils.DSC_GUILD_ID)) {

            //get Emotes

            Emote vr = event.getGuild().getEmoteById(619989964406652949L);
            Emote web = event.getGuild().getEmoteById(619989964280692742L);
            Emote projMgmt = event.getGuild().getEmoteById(619989964461047808L);
            Emote mobile = event.getGuild().getEmoteById(619989963743821824L);
            Emote machineLearning = event.getGuild().getEmoteById(619989964280561684L);
            Emote desktopDevelopment = event.getGuild().getEmoteById(619989963907530752L);
            Emote database = event.getGuild().getEmoteById(619989963324391454L);
            Emote cloudComputing = event.getGuild().getEmoteById(619989963064475659L);
            Emote ai = event.getGuild().getEmoteById(619989963001430060L);

            event.reply("Welcome everyone,\n" +
                    "This is the official Discord guild for the MRU Google Student Developer Club!" +
                    "Blah blah blah insert something insightful and stuff about us here " +
                    "Below, you can select the concepts you are interested in to have a role automagically applied!" +
                    " Using these roles you can see who shares interests with you and who to ask for help if you need it!\n" +
                    "Web Development <:Web:619989964280692742>\n" +
                    "Virtual and Augmented Reality <:VR_and_AR:619989964406652949>\n" +
                    "Project Management <:projectmanagement:619989964461047808>\n" +
                    "Machine Learning <:machinelearning:619989964280561684>\n" +
                    "Desktop Development <:Desktop_Development:619989963907530752>\n" +
                    "Databases <:database:619989963324391454>\n" +
                    "Cloud Computing <:Cloud:619989963064475659>\n" +
                    "Artificial Intelligence <:AI:619989963001430060>\n" +
                    "React with the appropriate emojis to gain that role! If you want an interest role added, contact the executive team!", message -> {
                ReactionEventUtils.addReactions(message, vr, web, projMgmt, machineLearning, mobile, database, desktopDevelopment, cloudComputing, ai);
            });

        }
    }

//<:Web:619989964280692742>
//<:VR_and_AR:619989964406652949>
//<:projectmanagement:619989964461047808>
//<:Mobile:619989963743821824>
//<:machinelearning:619989964280561684>
//<:Desktop_Development:619989963907530752>
//<:database:619989963324391454>
//<:Cloud:619989963064475659>
//<:AI:619989963001430060>
}
