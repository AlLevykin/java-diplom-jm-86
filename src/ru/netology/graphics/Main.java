package ru.netology.graphics;

import ru.netology.graphics.image.EightBitColorSchema;
import ru.netology.graphics.image.ImageToAsciiArtConverter;
import ru.netology.graphics.image.TextGraphicsConverter;
import ru.netology.graphics.server.GServer;

import java.io.File;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        TextGraphicsConverter converter = new ImageToAsciiArtConverter(); // Создайте тут объект вашего класса конвертера
        converter.setTextColorSchema(new EightBitColorSchema("#$@%*+-."));
        converter.setMaxHeight(300);
        converter.setMaxWidth(300);

        GServer server = new GServer(converter); // Создаём объект сервера
        server.start(); // Запускаем

        // Или то же, но с выводом на экран:
        //String url = "https://raw.githubusercontent.com/netology-code/java-diplom/main/pics/simple-test.png";
        //String imgTxt = converter.convert(url);
        //System.out.println(imgTxt);
    }
}
