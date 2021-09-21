package com.mycompany.newclass;

public class NewClass 
{
    public static void main(String[] args) 
    {
        Helper h1 = new Helper();
        Helper h2 = new Helper();
        Helper h3 = new Helper();
        h1.age = 5;
        h2.age = 15;
        System.out.println("The age is " + h1.getAge());
        System.out.println("The age is " + h2.getAge());
        System.out.println("The age is " + h3.getAge());
    }
}
class Helper
{
    public int age;
    public static int cude(int side){return side*side*side;}
    public int getAge(){return age;}
}