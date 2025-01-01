package ru.netology.graphics.image;

import java.io.IOException;

public class ImageToAsciiArtConverter implements TextGraphicsConverter {
    /**
     * Конвертация изображения, переданного как урл, в текстовую графику.
     *
     * @param url урл изображения
     * @return текст, представляющий собой текстовую графику переданного изображения
     * @throws IOException ошибка конвертации
     * @throws BadImageSizeException Если соотношение сторон изображения слишком большое
     */
    @Override
    public String convert(String url) throws IOException, BadImageSizeException {
        return "";
    }

    /**
     * Устанавливает максимальную ширину результирующего изображения в "текстовых пикселях".
     * Если исходное изображение имеет характеристики, превышающие максимальные, оно сжимается
     * с сохранением пропорций.
     *
     * @param width максимальная ширина текстовых картинок
     */
    @Override
    public void setMaxWidth(int width) {

    }

    /**
     * Устанавливает максимальную высоту результирующего изображения в "текстовых пикселях".
     * Если исходное изображение имеет характеристики, превышающие максимальные, оно сжимается
     * с сохранением пропорций.
     *
     * @param height максимальная высота текстовых картинок
     */
    @Override
    public void setMaxHeight(int height) {

    }

    /**
     * Устанавливает максимально допустимое соотношение сторон исходного изображения.
     * Если исходное изображение имеет характеристики, превышающие максимальные,
     * при конвертации выбрасывается исключение.
     *
     * @param maxRatio максимально допустимое соотношение сторон
     */
    @Override
    public void setMaxRatio(double maxRatio) {

    }

    /**
     * Устанавливает символьную цветовую схему, которую будет использовать конвертер
     *
     * @param schema символьная цветовая схема
     */
    @Override
    public void setTextColorSchema(TextColorSchema schema) {

    }
}
