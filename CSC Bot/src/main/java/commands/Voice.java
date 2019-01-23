package commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.core.entities.VoiceChannel;
import net.dv8tion.jda.core.managers.AudioManager;

public class Voice extends Command {

    public Voice() {
        this.name = "voice";
        this.ownerCommand = true;
    }

    @Override
    protected void execute(CommandEvent event) {
        VoiceChannel channel = event.getGuild().getVoiceChannelById(492045394772230144L);
        AudioManager audioManager = event.getGuild().getAudioManager();
        audioManager.openAudioConnection(channel);
        audioManager.closeAudioConnection();

    }
}