package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //Напишите тут ваш код
    public String dogName = null;
    public int dogHigh = 0;
    public String dogColor = null;

    public void initialize(String name)
    {
        this.dogName = name;

    }

    public void initialize(String name, int high)
    {
        this.dogName = name;
        this.dogHigh = high;
    }
    public void initialize(String name, int high, String color)
    {
        this.dogName = name;
        this.dogHigh = high;
        this.dogColor = color;

    }
}
