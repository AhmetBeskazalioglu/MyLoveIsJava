package codetraining.freeexamples;


public class LogLevelsWithRegex {

    public static String message(String logLine) {
        String[] strArr=logLine.split(" ");
        String strNew="";
        for(int i=1;i<strArr.length;i++)
            strNew+=strArr[i]+" ";
        return strNew.trim();

    }

    public static String logLevel(String logLine) {
        String[] strArr=logLine.split("[\\[\\]]");
        return strArr[1].toLowerCase();
    }

    public static String reformat(String logLine) {
        String[] strArr=logLine.split("[\\[\\]\\s\\:]");
        String strNew="";
        for(int i=3;i<strArr.length;i++)
            strNew+=strArr[i]+" ";
        return strNew.trim()+" ("+strArr[1].toLowerCase()+")";

    }

    public static void main(String[] args) {
        String logLine = "INFO [2021-07-01 12:34:56] This is a log message";
        System.out.println("Message: " + message("[ERROR]: Invalid operation"));
        System.out.println("Message: " + message("[WARNING]:  Disk almost full   "));
        System.out.println("Log level: " + logLevel("[ERROR]: Invalid operation"));
        System.out.println("Reformatted: " + reformat("[INFO]: Operation completed"));
    }
}
