package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    //Напишите тут ваш код
    public int centerX = 0;
    public int centerY = 0;
    public int radius = 0;
    public int width = 0;
    public String color = null;

    public void initialize(int x, int y, int R)
    {
        this.centerX = x;
        this.centerY = y;
        this.radius = R;

    }

    public void initialize(int x, int y, int R, int W)
    {
        this.centerX = x;
        this.centerY = y;
        this.radius = R;
        this.width = W;
    }

    public void initialize(int x, int y, int R, int W, String C)
    {
        this.centerX = x;
        this.centerY = y;
        this.radius = R;
        this.width = W;
        this.color = C;
    }
}
