package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    //Напишите тут ваш код
    public int X = 0;
    public int Y = 0;
    public int R = 0;
    public int width = 0;
    public String color = null;

    public Circle(int centerX, int centerY,int Radius)
    {
        this.X = centerX;
        this.Y = centerY;
        this.R = Radius;
    }

    public Circle(int centerX, int centerY,int Radius, int circWidth)
    {
        this.X = centerX;
        this.Y = centerY;
        this.R = Radius;
        this.width = circWidth;

    }

    public Circle(int centerX, int centerY,int Radius,int width, String color, int circWidth, String circColor)
    {
        this.X = centerX;
        this.Y = centerY;
        this.R = Radius;
        this.width = circWidth;
        this.color = circColor;
    }


}
