
package chatty.gui.components.textpane;

import chatty.User;
import chatty.gui.Highlighter.Match;
import chatty.util.StringUtil;
import chatty.util.api.Emoticons;
import java.util.List;

/**
 *
 * @author tduva
 */
public class UserNotice extends Message {
    
    public final String type;
    public final User user;
    public final String attachedMessage;
    public final Emoticons.TagEmotes emotes;
    public final String fullMessage;
    
    public UserNotice(String type, User user, String text, String message,
            Emoticons.TagEmotes emotes, String id, List<Match> highlightMatches) {
        super(id, text, highlightMatches);
        this.type = type;
        this.user = user;
        this.attachedMessage = message;
        this.emotes = emotes;
        if (StringUtil.isNullOrEmpty(message)) {
            this.fullMessage = String.format("[%s] %s", type, text);
        } else {
            this.fullMessage = String.format("[%s] %s [%s]", type, text, message);
        }
    }
    
}
