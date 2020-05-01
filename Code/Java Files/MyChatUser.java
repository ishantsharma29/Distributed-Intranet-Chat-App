

public class MyChatUser
{
    // This object keeps all the relevant information about a user for either
    // the server or the client

    protected int id;
    protected String name;
    protected String password;
    protected String additional;
    private String chatroomName;      // Used by the client
    private MyChatChatRoom chatroom; // Used by the server

    MyChatUser(MyChatServer server)
    {
	// This constructor will be used by the server, since it automatically
	// assigns a new user Id

	id = server.getUserId();
	name = "newuser" + id;
	password = "";
	additional = "";
	chatroomName = "";
	chatroom = null;
    }

    MyChatUser(int i, String nm, String pw, String add)
    {
	// This constructor will be used by the client, with information
	// supplied by the server

	id = i;
	name = nm;
	password = pw;
	additional = add;
	chatroomName = "";
	chatroom = null;
    }

    public void setChatRoom(MyChatChatRoom newRoom)
    {
	// Used by the server to set the user's chat room
	chatroom = newRoom;
    }

    public void setChatRoomName(String newRoomName)
    {
	// Used by the client to set the user's chat room name
	chatroomName = newRoomName;
    }

    public String getChatRoomName()
    {
	if (chatroom != null)
	    return (chatroom.name);
	else
	    return (chatroomName);
    }

    public MyChatChatRoom getChatRoom()
    {
	return (chatroom);
    }
}
