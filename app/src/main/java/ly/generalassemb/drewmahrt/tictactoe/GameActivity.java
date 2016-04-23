package ly.generalassemb.drewmahrt.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {




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


        //Populate array

        Storage.toDoArray.add("");
        Storage.toDoArray.add("");
        Storage.toDoArray.add("");
        Storage.toDoArray.add("");
        Storage.toDoArray.add("");
        Storage.toDoArray.add("");
        Storage.toDoArray.add("");
        Storage.toDoArray.add("");
        Storage.toDoArray.add("");




//keep persistance views
            textView.setText(Storage.toDoArray.get(0));
            textView2.setText(Storage.toDoArray.get(1));
            textView3.setText(Storage.toDoArray.get(2));
            textView4.setText(Storage.toDoArray.get(3));
            textView5.setText(Storage.toDoArray.get(4));
            textView6.setText(Storage.toDoArray.get(5));
            textView7.setText(Storage.toDoArray.get(6));
            textView8.setText(Storage.toDoArray.get(7));
            textView9.setText(Storage.toDoArray.get(8));

//Keep persistance with ability to click
        textView.setEnabled(Storage.check);
        textView2.setEnabled(Storage.check2);
        textView3.setEnabled(Storage.check3);
        textView4.setEnabled(Storage.check4);
        textView5.setEnabled(Storage.check5);
        textView6.setEnabled(Storage.check6);
        textView7.setEnabled(Storage.check7);
        textView8.setEnabled(Storage.check8);
        textView9.setEnabled(Storage.check9);




        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Storage.check = false;

                textView.setEnabled(Storage.check);

                if(Storage.playerTurn){
                    textView.setText("X");
                    Storage.playerTurn = false;
                    showView.setText(player1 + "s" + " turn!");
                    Storage.toDoArray.add(0, "x");


                }else{
                    textView.setText("O");
                    Storage.playerTurn = true;
                    showView.setText(player2 + "s" + " turn!");
                    Storage.toDoArray.add(0, "O");

                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Storage.check2 = false;

                textView2.setEnabled(Storage.check2);

                if(Storage.playerTurn){
                    textView2.setText("X");
                    Storage.playerTurn = false;
                    showView.setText(player1 + "s" + " turn!");
                    Storage.toDoArray.add(1, "x");


                }else{
                    textView2.setText("O");
                    Storage.playerTurn = true;
                    showView.setText(player2 + "s" + " turn!");
                    Storage.toDoArray.add(1, "O");

                }
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Storage.check3 = false;

                textView3.setEnabled(Storage.check3);
                if(Storage.playerTurn){
                    textView3.setText("X");
                    Storage.playerTurn = false;
                    showView.setText(player1 + "s" + " turn!");
                    Storage.toDoArray.add(2, "x");


                }else{
                    textView3.setText("O");
                    Storage.playerTurn = true;
                    showView.setText(player2 + "s" + " turn!");
                    Storage.toDoArray.add(2, "O");

                }
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Storage.check4 = false;

                textView4.setEnabled(Storage.check4);

                if(Storage.playerTurn){
                    textView4.setText("X");
                    Storage.playerTurn = false;
                    showView.setText(player1 + "s" + " turn!");
                    Storage.toDoArray.add(3, "x");



                }else{
                    textView4.setText("O");
                    Storage.playerTurn = true;
                    showView.setText(player2 + "s" + " turn!");
                    Storage.toDoArray.add(3, "O");


                }
            }
        });
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Storage.check5 = false;

                textView5.setEnabled(Storage.check5);

                if(Storage.playerTurn){
                    textView5.setText("X");
                    Storage.playerTurn = false;
                    showView.setText(player1 + "s" + " turn!");
                    Storage.toDoArray.add(4, "x");


                }else {
                    textView5.setText("O");
                    Storage.playerTurn = true;
                    showView.setText(player2 + "s" + " turn!");
                    Storage.toDoArray.add(4, "O");


                }
            }
        });
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Storage.check6 = false;

                textView6.setEnabled(Storage.check6);

                if(Storage.playerTurn){
                    textView6.setText("X");
                    Storage.playerTurn = false;
                    showView.setText(player1 + "s" + " turn!");
                    Storage.toDoArray.add(5, "x");


                }else{
                    textView6.setText("O");
                    Storage.playerTurn = true;
                    showView.setText(player2 + "s" + " turn!");
                    Storage.toDoArray.add(5, "O");


                }
            }
        });
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Storage.check7 = false;

                textView7.setEnabled(Storage.check7);

                if(Storage.playerTurn){
                    textView7.setText("X");
                    Storage.playerTurn = false;
                    showView.setText(player1 + "s" + " turn!");
                    Storage.toDoArray.add(6, "x");


                }else{
                    textView7.setText("O");
                    Storage.playerTurn = true;
                    showView.setText(player2 + "s" + " turn!");
                    Storage.toDoArray.add(6, "O");


                }
            }
        });
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Storage.check8 = false;

                textView8.setEnabled(Storage.check8);

                if(Storage.playerTurn){
                    textView8.setText("X");
                    Storage.playerTurn = false;
                    showView.setText(player1 + "s" + " turn!");
                    Storage.toDoArray.add(7, "x");


                }else{
                    textView8.setText("O");
                    Storage.playerTurn = true;
                    showView.setText(player2 + "s" + " turn!");
                    Storage.toDoArray.add(7, "O");


                }
            }
        });
        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Storage.check9 = false;

                textView9.setEnabled(Storage.check9);
                if(Storage.playerTurn){
                    textView9.setText("X");
                    Storage.playerTurn = false;
                    showView.setText(player1 + "s" + " turn!");
                    Storage.toDoArray.add(8, "x");


                }else{
                    textView9.setText("O");
                    Storage.playerTurn = true;
                    showView.setText(player2 + "s" + " turn!");
                    Storage.toDoArray.add(8, "O");

                }
            }
        });
    }
}
