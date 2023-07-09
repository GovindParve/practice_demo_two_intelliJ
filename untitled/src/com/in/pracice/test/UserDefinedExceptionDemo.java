package com.in.pracice.test;

public class UserDefinedExceptionDemo {
    public static void main(String[] args) {
        int no = 15;
        try {
            //throw new MyChechedException("Test Exception Demo");
            //throw new MyChechedException();
            if(no>10)
                throw new MyUnChechedException("Test Uncheched Exception Demo 11");
            //throw new MyUnChechedException();
        }catch (MyUnChechedException e){
            System.out.println("Caucht");
            System.out.println(e.getMessage());
        }
    }
}

class MyChechedException extends Exception{

    public MyChechedException() {
        super();
    }

    public MyChechedException(String message) {
        super(message);
    }
}
class MyUnChechedException extends RuntimeException{

    public MyUnChechedException() {
        super();
    }

    public MyUnChechedException(String message) {
        super(message);
    }
}
