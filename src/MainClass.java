/*
Задание для самостоятельной проработки.
Продвинутый уровень.
1) Создайте класс TextTransformer.
Метод:
● String transform(String text) — Переводит текст в верхний регистр. Пример hello→ HELLO
2) Создайте класс InverseTransformer как подкласс TextTransformer. Переопределите метод String
transform(String text) — Производит реверс текста. Пример hello → olleh
3) Создайте класс UpDownTransformer как подкласс TextTransformer. Переопределите метод String
transform(String text) — Каждая нечетная буква большая, четная маленькая. Пример hello → HeLlO
4) Создайте класс TextSaver.
Поля:
● TextTransformer transformer
● File file
Методы:
● void saveTextToFile(String text) — Сначала преобразует одним из трансформеров (поле
transformer) строку, после чего сохранить ее в файл(поле file).
* */


public class MainClass {
    public static void main(String[] args) {
        String string;
        TextTransformer textTransformer = new TextTransformer();
        string = textTransformer.transform("hello");
        System.out.println("to Upper Case: "+string);

        textTransformer = new InverseTransformer();
        string = textTransformer.transform("hello");
        System.out.println("reverse: "+string);

        textTransformer = new UpDownTransformer();
        string = textTransformer.transform("hello");
        System.out.println("up Down transform: "+string);

        new TextSaver(new TextTransformer()).saveTextToFile(string);
    }
}
