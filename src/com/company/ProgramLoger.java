package com.company;

public class ProgramLoger {

    private static ProgramLoger programLoger; //экземпляр класса
    private static String logFile = "This is log file \n\n";

    public static synchronized ProgramLoger getProgramLoger(){ //возвращает экземлпляр класса
        if (programLoger == null){
            programLoger = new ProgramLoger(); //если нул, тогда создаем новый экземпляр
        }
        return programLoger; //возвращаем
    }
    private ProgramLoger(){ //пустой конструктор

    }

    public void addLogInfo (String logInfo){ //метод
        logFile += logInfo + "\n";
    }

    public void showLogFile(){
        System.out.println(logFile);
    }
}
