package hu.nero.homeworks.fourth.ex4;

public class Message
{
  private String text;
  private String inMessage;
  private String outMessage;
  private String from;
  private String to;

  public Message(String text, String inMessage, String outMessage, String from, String to)
  {
    this.text = text;
    this.inMessage = inMessage;
    this.outMessage = outMessage;
    this.from = from;
    this.to = to;
  }
}
