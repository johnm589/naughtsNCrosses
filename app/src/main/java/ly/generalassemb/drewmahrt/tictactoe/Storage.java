package ly.generalassemb.drewmahrt.tictactoe;

import java.util.ArrayList;


/**
 * Created by John on 4/22/16.
 */
public class Storage {
    //This is where i store things.

    //hackky booleans to keep disable persistnace
     public static boolean check=true;
     public static boolean check2=true;
      public static boolean check3=true;
     public static boolean check4=true;
     public static boolean check5=true;
     public static boolean check6=true;
    public static boolean check7=true;
    public static boolean check8=true;
    public static boolean check9=true;

//global boolean
    public static  boolean playerTurn = true;
    //global last winner
    public static String lastWinner = "";

    static ArrayList<String> toDoArray = new ArrayList<>();

    //store player name
    public static String player1;
    public static String player2;

}
