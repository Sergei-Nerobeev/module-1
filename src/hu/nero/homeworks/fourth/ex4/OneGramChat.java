package hu.nero.homeworks.fourth.ex4;

import java.util.Scanner;

public class OneGramChat
{
  private User currentUser;

  public void startChat()
  {

    System.out.println("Введите пожалуйста команду из списка: войти, новый, выйти, написать, прочитать, exit");
  }

  public void login(Scanner scanner)
  {
    System.out.println("Введите имя пользователя: ");
    String name = scanner.nextLine();
    System.out.println("Введите пароль:");
    String password = scanner.nextLine();
    if (currentUser == null || !currentUser.name.equals(name) || !currentUser.password.equals(password))
    {
      System.out.println("Неверное имя пользователя или пароль.");
    }
    else
    {
      System.out.println("Вы вошли как: " + currentUser);
    }
  }

  public void createUser(Scanner scanner)
  {
    System.out.println("Введите имя нового пользователя: ");
    String name = scanner
  }
}
