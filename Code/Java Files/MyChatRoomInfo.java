import java.util.*;


public class MyChatRoomInfo
{
    // This class is just a data structure to hold information about a
    // chat room.  It needs its own source file because it's used by both
    // the MyChatRoomsDialog class and the MyChatClient class

    String name;
    String creatorName;
    boolean priv;
    boolean invited;
    boolean roomOwner;
    Vector userNames;

    MyChatRoomInfo()
    {
	name = "";
	creatorName = "";
	priv = false;
	invited = false;
	roomOwner = false;
	userNames = new Vector();
    }
}
