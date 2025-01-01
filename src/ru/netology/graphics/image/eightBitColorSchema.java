package ru.netology.graphics.image;

public class eightBitColorSchema implements TextColorSchema {
    private final String schema;

    public eightBitColorSchema(String schema) {
        if (schema == null || schema.isEmpty()) {
            this.schema = " ";
            return;
        }

        if (schema.length() > 256) {
            this.schema = schema.substring(0, 255);
            return;
        }

        this.schema = schema;
    }

    @Override
    public char convert(int color) {
        int index = Math.floorDiv((schema.length() - 1) * color, 255);
        return schema.charAt(index);
    }
}
