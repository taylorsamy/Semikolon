package utils;


import jdk.nashorn.internal.parser.JSONParser;
import net.dv8tion.jda.api.entities.Emote;
import net.dv8tion.jda.api.entities.Message;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.json.JSONWriter;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.Scanner;

public class ReactionEventUtils {
    //TODO when !welcome, save message ID to file. on ReactionEventInit, get message ID from file


    public static void addReactions(Message message, Emote... emotes) {
        for (Emote e : emotes) {
            message.addReaction(e).queue();
        }
    }

    public static void saveMessageIdToFile(String path, String serverID, String messageID, Map<Long, Long> roles) { //TODO UNTESTED
        //TODO make a top level array for server ids
//
//        JSONObject serverIdObj = new JSONObject();
//        serverIdObj.put("serverID", serverID);
//        JSONArray array = new JSONArray();
//
//        JSONObject messageIdObj = new JSONObject();
//        messageIdObj.put("messageID", messageID);
//        JSONArray arrayElementOneArray = new JSONArray();
//
//        for (Long l : roles.keySet()) {
//            JSONObject o = new JSONObject();
//            o.put("Emote", l);
//            o.put("Role", roles.get(l));
//            arrayElementOneArray.put(o);
//        }
//
//
//        messageIdObj.put("emoteRoleList", arrayElementOneArray);
//        array.put(messageIdObj);
//        serverIdObj.put("messageArray", array);
//
//        try (FileWriter fw = new FileWriter(path, true)) {
//            fw.write(serverIdObj.toString(2));
//            fw.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }

    public static String loadMessageIdFromFile(String path) { //TODO WTF am I even trying to do?




        return "ID";
    }

}
