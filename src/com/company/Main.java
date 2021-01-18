package com.company;

public class Main {

    public static void main(String[] args) {
    //    System.out.println("Hello World!");
        Number number = new Number ();
        number.setaByte((byte) 127);
        System.out.println("Byte: "+ number.getaByte());
        number.setaShort((short) 32767);
        System.out.println("Short: "+ number.getaShort());
        number.setAnInt(122232767);
        System.out.println("Int: "+ number.getAnInt());
        number.setaLong(888888855555532767L);
        System.out.println("Long: "+ number.getaLong());
        number.setaFloat(6.555555266932767F);
        System.out.println("Float: "+ number.getaFloat());
        number.setaDouble(26.67);
        System.out.println("Double: "+ number.getaDouble());
        number.setaChar('D');
        System.out.println("Char: "+ number.getaShort());
        number.setaBoolean(true);
        System.out.println("Boolean: "+ number.isaBoolean());


    }
}
