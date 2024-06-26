package day13;

import java.util.ArrayList;
import java.util.List;

/*
Класс MessageDatabase должен иметь следующую структуру:
Поля:
- Статическое поле “сообщения” (англ. messages ), которое будет хранить список
из сообщений (объектов класса Message ). Это поле должно
инициализироваться пустым списком. Этот список и есть наша условная “база
данных”, которая хранит все сообщения в соц. сети.
Конструктор:
Нет конструктора. Объекты класса MessageDatabase создаваться не будут (все
методы и поля статические).
Методы:
- public static void sendMessage(User u1, User u2, String text)
- этот метод “отправляет” новое сообщение от пользователя u1 пользователю
u2 с текстом text . Отправка в нашем контексте означает добавление
сообщения в нашу “базу данных”.
- public static List<Message> getMessages() - возвращает список всех
сообщений в “базе данных”.
- public static void showDialog(User u1, User u2) - этот метод
должен вывести цепочку сообщений (диалог) пользователей u1 и u2 . Формат
вывода должен быть таким:
user1: Привет!
user2: Привет, user1!
user1: Как у тебя дела?
user2: Все ок, спасибо :)
* У вас могут быть любые другие сообщения. Где user1 и user2 - имена
пользователей u1 и u2 .
 */
public class MessageDatebase {
    private static List<Message> messages = new ArrayList<>();

 /*   public static void addNewMessage (User sender, User receiver, String text) {
        messages.add(new Message(sender, receiver, text));
    }*/
    public static void sendMessage(User u1, User u2, String text) {
        Message message = new Message(u1, u2, text);
        messages.add(message);
    }

    /*public static List<Message> getMessages() {
        return messages;
    }*/
    public static void showDialog(User u1, User u2){
        for (Message message : messages) {
            if (message.getSender() == u1 && message.getReceiver() == u2 || message.getSender() == u2 && message.getReceiver() == u1){
               System.out.println(message.getSender() + ": " + message.getText());
            }
        }
    }
}
