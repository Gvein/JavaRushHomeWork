package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    //Напишите тут ваш код
    private String friendName = null;
    private int friendAge = 0;
    private String friendSex = null;
    public void initialize(String name)
    {
        this.friendName = name;
    }

    public void initialize(String name, int age)
    {
    this.friendName = name;
    this.friendAge = age;
    }

    public void initialize(String name, int age, String sex)
    {
        this.friendName = name;
        this.friendAge = age;
        this.friendSex = sex;
    }

}
