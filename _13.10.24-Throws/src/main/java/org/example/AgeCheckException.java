package org.example;

public class AgeCheckException extends Exception{
    public AgeCheckException(String message){
        super(message);
    }

    @Override
    public String toString() {
        return "Bu AgeCheck sınıfına ait bir exceptiondır...";
    }
}
