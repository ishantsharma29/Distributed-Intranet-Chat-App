
public class MyChatMessage
{
    public String messageFor;
    public String messageFrom;
    public String text;

    public MyChatMessage(String whoFor, String whoFrom, String info)
    {
	messageFor = whoFor;
	messageFrom = whoFrom;
	text = info;
    }
}

