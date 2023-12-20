package hu.nero.homeworks.fourth.ex4;

public class User
{
  String name;
  String password;
  private String[] text;

  public User(String name, String[] text)
  {
    this.name = name;
    this.password = password;
    this.text = new String[100];
  }
}
