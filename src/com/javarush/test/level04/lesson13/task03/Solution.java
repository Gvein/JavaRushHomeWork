package com.javarush.test.level04.lesson13.task03;

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код

      //  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      //  String s1 = reader.readLine();
      // int n1 = Integer.parseInt(s1);
       // String s2 = reader.readLine();
       // int n2 = Integer.parseInt(s2);
       // String s3 = reader.readLine();
       // int n3 = Integer.parseInt(s3);
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                for (int k = 0; k < 10; k++)
                {
                    System.out.print(8);
                }
            }
        }


    }
}
