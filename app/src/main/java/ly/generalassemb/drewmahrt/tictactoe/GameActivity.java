package ly.generalassemb.drewmahrt.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

public static  boolean playerTurn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        final TextView showView = (TextView)findViewById(R.id.game_message_text);

        Intent i = getIntent();

        final String player1 = i.getStringExtra("player1");
        final String player2 = i.getStringExtra("player2");

        showView.setText("It's " + player1 + "'s " + "turn!");

        final TextView textView = (TextView)findViewById(R.id.textView);
        final TextView textView2 = (TextView)findViewById(R.id.textView2);
        final TextView textView3 = (TextView)findViewById(R.id.textView3);
        final TextView textView4 = (TextView)findViewById(R.id.textView4);
        final TextView textView5 = (TextView)findViewById(R.id.textView5);
        final TextView textView6 = (TextView)findViewById(R.id.textView6);
        final TextView textView7 = (TextView)findViewById(R.id.textView7);
        final TextView textView8 = (TextView)findViewById(R.id.textView8);
        final TextView textView9 = (TextView)findViewById(R.id.textView9);

        textView.setText(Storage.toDoArray.get(0));
        textView2.setText(Storage.toDoArray.get(1));
        textView3.setText(Storage.toDoArray.get(2));
        textView4.setText(Storage.toDoArray.get(3));
        textView5.setText(Storage.toDoArray.get(4));
        textView6.setText(Storage.toDoArray.get(5));
        textView7.setText(Storage.toDoArray.get(6));
        textView8.setText(Storage.toDoArray.get(7));
        textView9.setText(Storage.toDoArray.get(8));



        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setEnabled(false);

                if(playerTurn){
                    textView.setText("X");
                    playerTurn = false;
                    showView.setText(player1 + "s" + " turn!");
                    Storage.toDoArray.add(0, "x");


                }else{
                    textView.setText("O");
                    playerTurn = true;
                    showView.setText(player2 + "s" + " turn!");
                    Storage.toDoArray.add(0, "O");

                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setEnabled(false);

                if(playerTurn){
                    textView2.setText("X");
                    playerTurn = false;
                    showView.setText(player1 + "s" + " turn!");
                    Storage.toDoArray.add(1, "x");


                }else{
                    textView2.setText("O");
                    playerTurn = true;
                    showView.setText(player2 + "s" + " turn!");
                    Storage.toDoArray.add(1, "O");

                }
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView3.setEnabled(false);
                if(playerTurn){
                    textView3.setText("X");
                    playerTurn = false;
                    showView.setText(player1 + "s" + " turn!");
                    Storage.toDoArray.add(2, "x");


                }else{
                    textView3.setText("O");
                    playerTurn = true;
                    showView.setText(player2 + "s" + " turn!");
                    Storage.toDoArray.add(2, "O");

                }
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView4.setEnabled(false);

                if(playerTurn){
                    textView4.setText("X");
                    playerTurn = false;
                    showView.setText(player1 + "s" + " turn!");
                    Storage.toDoArray.add(3, "x");



                }else{
                    textView4.setText("O");
                    playerTurn = true;
                    showView.setText(player2 + "s" + " turn!");
                    Storage.toDoArray.add(3, "O");


                }
            }
        });
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView5.setEnabled(false);

                if(playerTurn){
                    textView5.setText("X");
                    playerTurn = false;
                    showView.setText(player1 + "s" + " turn!");
                    Storage.toDoArray.add(4, "x");


                }else {
                    textView5.setText("O");
                    playerTurn = true;
                    showView.setText(player2 + "s" + " turn!");
                    Storage.toDoArray.add(4, "O");


                }
            }
        });
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView6.setEnabled(false);

                if(playerTurn){
                    textView6.setText("X");
                    playerTurn = false;
                    showView.setText(player1 + "s" + " turn!");
                    Storage.toDoArray.add(5, "x");


                }else{
                    textView6.setText("O");
                    playerTurn = true;
                    showView.setText(player2 + "s" + " turn!");
                    Storage.toDoArray.add(5, "O");


                }
            }
        });
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView7.setEnabled(false);

                if(playerTurn){
                    textView7.setText("X");
                    playerTurn = false;
                    showView.setText(player1 + "s" + " turn!");
                    Storage.toDoArray.add(6, "x");


                }else{
                    textView7.setText("O");
                    playerTurn = true;
                    showView.setText(player2 + "s" + " turn!");
                    Storage.toDoArray.add(6, "O");


                }
            }
        });
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView8.setEnabled(false);

                if(playerTurn){
                    textView8.setText("X");
                    playerTurn = false;
                    showView.setText(player1 + "s" + " turn!");
                    Storage.toDoArray.add(7, "x");


                }else{
                    textView8.setText("O");
                    playerTurn = true;
                    showView.setText(player2 + "s" + " turn!");
                    Storage.toDoArray.add(7, "O");


                }
            }
        });
        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView9.setEnabled(false);
                if(playerTurn){
                    textView9.setText("X");
                    playerTurn = false;
                    showView.setText(player1 + "s" + " turn!");
                    Storage.toDoArray.add(8, "x");


                }else{
                    textView9.setText("O");
                    playerTurn = true;
                    showView.setText(player2 + "s" + " turn!");
                    Storage.toDoArray.add(8, "O");

                }
            }
        });
    }
}
