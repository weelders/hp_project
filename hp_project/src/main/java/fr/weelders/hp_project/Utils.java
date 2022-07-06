package fr.weelders.hp_project;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Utils
{
    /*--------------------------------------------*/
    /*--COLORS--*/
    /*--------------------------------------------*/
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_RED = "\u001B[31m";

    /*--------------------------------------------*/
    /*--FUNCTIONS--*/
    /*--------------------------------------------*/
    public static String convertLongToTimeString(long time)
    {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date(time));
    }
    public static void consoleLog(String tag, String msg)
    {
        long now = Instant.now().toEpochMilli();
        System.out.println(convertLongToTimeString(now)+ANSI_YELLOW+" --- "+tag+" --- "+ANSI_GREEN+msg+ANSI_RESET);
    }
    public static void consoleLog(String tag)
    {
        long now = Instant.now().toEpochMilli();
        System.out.println(convertLongToTimeString(now)+ANSI_YELLOW+" --- "+tag+" --- "+ANSI_RESET);
    }
}
