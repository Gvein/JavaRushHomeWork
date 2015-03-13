package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //Напишите тут ваш код
    public String dogName = null;
    public int dogHeight = 0;
    public String dogColor = null;

    public Dog(String name)
    {
        this.dogName = name;

    }

    public Dog(String name ,int height)
    {
        this.dogName = name;
        this.dogHeight = height;

    }

    public Dog(String name, int height, String color)
    {
        this.dogName = name;
        this.dogHeight = height;
        this.dogColor = color;
    }

}
