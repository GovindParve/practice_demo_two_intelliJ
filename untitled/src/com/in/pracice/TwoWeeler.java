package com.in.pracice;


class Vechle{
    public void show(){
        System.out.println("From parent");
    }

}

public class TwoWeeler extends Vechle {

    public void show(){
        System.out.println("From parent");
    }

    public static void main(String[] args) {
        TwoWeeler obj = new TwoWeeler();
        obj.show();
    }

    public int addtion(int a, int b)
    {
        return a+b;
    }
    public float addtion(float a, float b)
    {
        return a+b;
    }


}







