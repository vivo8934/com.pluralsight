package com.company;

public class InvalidStatementException extends Exception{

   public InvalidStatementException(String reason, String statement){
            super(reason + " : " + statement);
    }
    public InvalidStatementException(String reason, String statement, Throwable caause){
        super(reason + " : " + statement, caause);
    }
}
