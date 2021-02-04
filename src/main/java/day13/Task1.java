package day13;

public class Task1 {
    public static void main(String[] args) {
        User stas = new User("Stas");
        User nastya = new User("Nastya");
        User pavel = new User("Pavel");

        stas.sendMessage(nastya, "Привет");
        stas.sendMessage(nastya, "Как дела?");
        nastya.sendMessage(stas, "Привет");
        nastya.sendMessage(stas, "хорошо");
        nastya.sendMessage(stas, "а у тебя?");
        pavel.sendMessage(stas, "Поехали на рабылку?");
        pavel.sendMessage(stas, "Сегодня там клюют большие рыбины");
        pavel.sendMessage(stas, "и русалки");
        stas.sendMessage(pavel, "нет, не могу");
        stas.sendMessage(pavel, "у меня нет удочки");
        stas.sendMessage(pavel, "и есть жена");
        pavel.sendMessage(stas, "ладно, тогда пришлю фотки с рыбалки");

        MessageDatabase.showDialog(stas, pavel);
    }
}
