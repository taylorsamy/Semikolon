package utils;

import net.dv8tion.jda.api.entities.Emote;
import net.dv8tion.jda.api.entities.Message;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReactionEventUtils {
    //TODO when !welcome, save message ID to file. on ReactionEventInit, get message ID from file


    public static void addReactions(Message message, Emote... emotes) {
        for (Emote e : emotes) {
            message.addReaction(e).queue();
        }
    }

    public static void saveMessageIdToFile(String id, String path) { //TODO UNTESTED

        File f = new File(path);


            try (FileWriter fw = new FileWriter(f, true)) {
                fw.write(id);
                fw.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }


    }

    public static String loadMessageIdFromFile(String path){ //TODO WTF am I even trying to do?


        return "ID";
    }

}
