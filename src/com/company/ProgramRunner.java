package com.company;

public class ProgramRunner {
    public static void main(String[] args) {
       ProgramLoger.getProgramLoger().addLogInfo("Firsh log...");
       ProgramLoger.getProgramLoger().addLogInfo("Second log...");
       ProgramLoger.getProgramLoger().addLogInfo("Third log...");

       ProgramLoger.getProgramLoger().showLogFile();
    }
}
