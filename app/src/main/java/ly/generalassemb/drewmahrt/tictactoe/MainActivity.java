package ly.generalassemb.drewmahrt.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button intentButton = (Button)findViewById(R.id.start_game_button);

        final EditText p1 = (EditText)findViewById(R.id.player_one_name);
        final EditText p2 = (EditText)findViewById(R.id.player_two_name);

        p1.setText(Storage.player1);
        p2.setText(Storage.player2);

        TextView tv = (TextView)findViewById(R.id.last_winner_text);
if (Storage.lastWinner != "") {
    tv.setText("The last winner was " + Storage.lastWinner + " !");
}else{
    tv.setText("Let's Play!");
}
        intentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Storage.playerTurn = true;

                String player1 = p1.getText().toString();
                String player2 = p2.getText().toString();

                Intent i = new Intent(MainActivity.this, GameActivity.class);
                i.putExtra("player1", player1);
                i.putExtra("player2", player2);

                startActivity(i);
            }
        });
    }
}
