package utils;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ReactionEventUtilsTest {

    @Test
    public void saveMessageIdToFile() {
        String serverId = GuildUtils.DSC_GUILD_ID;
        String messageId = "12345678";
        Map<Long, Long> emoteRoles = new HashMap<>();
        emoteRoles.put(536076160220528640L,535910836351401985L);
        emoteRoles.put(536076678322061312L,536081237740093441L);

        ReactionEventUtils.saveMessageIdToFile("src/main/resources/reactionData.json", serverId, messageId, emoteRoles);

    }

    @Test
    public void loadMessageIdFromFile() {
        ReactionEventUtils.loadMessageIdFromFile("src/main/resources/reactionData.json");
    }
}