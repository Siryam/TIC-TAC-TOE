package com.example.android.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

import static com.example.android.tictactoe.R.id.player_one_et;

public class MainActivity extends AppCompatActivity {

    /*Initialize integer value for board game choice*/
    int gameChoice;
    boolean player_x;
    ImageView imageResourceX;
    ImageView imageResourceO;

    /*Inflate/initialize the layout*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       /* Set the content of the activity to use activity_main.xml file */
        setContentView(R.layout.activity_main);

    }

    /*Activate the {@playGame} method when play button is clicked*/
    public void playGame(View view){

            //Create and Call EditText views objects into the Strings inputted
            EditText editTextPlayer1 = (EditText) findViewById(player_one_et);
            String player_one_name = "" + editTextPlayer1.getText().toString();

            EditText editTextPlayer2 = (EditText) findViewById(R.id.player_two_et);
            String player_two_name = "" + editTextPlayer2.getText().toString();

            /*Call game choice state integer value/boolean player_x or o value
             from radiobutton selected*/
            if((gameChoice == 3) && (player_x == true)){
                /*Go to 3 board game Activity*/
                /*Choose player x for player one*/
                /*Make a toast to display board game size chosen*/
                Toast.makeText(this, "Play 3 Board Game", Toast.LENGTH_SHORT).show();
                /*Call intent and migrate to ThreeSquareGameActivity*/
                Intent intent = new Intent(MainActivity.this, ThreeSquareGameActivity.class);
                //Adding edit text values with intent to transfer
                intent.putExtra("player_one_name", player_one_name);
                intent.putExtra("player_two_name", player_two_name);

                //Adding boolean value with intent to transfer
                intent.putExtra("player_x", true);
                //Call intent to open three square game activity
                startActivity(intent);
            }
            else if((gameChoice == 3) && (player_x == false)){
                /*Go to 3 board game Activity*/
                /*Choose player o for player one*/
                /*Make a toast to display board game size chosen*/
            Toast.makeText(this, "Play 3 Board Game", Toast.LENGTH_SHORT).show();
                /*Call intent and migrate to ThreeSquareGameActivity*/
            Intent intent = new Intent(MainActivity.this, ThreeSquareGameActivity.class);
            //Adding edit text values with intent to transfer
            intent.putExtra("player_one_name", player_one_name);
            intent.putExtra("player_two_name", player_two_name);

            //Adding boolean value with intent to transfer
            intent.putExtra("player_x", false);
            //Call intent to open three square game activity
            startActivity(intent);
        }
            else if((gameChoice == 5) && (player_x == true)){
                /*Go to 5 board game Activity*/
                /*Choose player x for player one*/
                /*Make a toast to display board game size chosen*/
                Toast.makeText(this, "Play 5 Board Game", Toast.LENGTH_SHORT).show();
                /*Call intent and migrate to FiveSquareGameActivity*/
                Intent intent = new Intent(MainActivity.this, FiveSquareGameActivity.class);
                //Adding edit text values with intent to transfer
                intent.putExtra("player_one_name", player_one_name);
                intent.putExtra("player_two_name", player_two_name);

                //Adding boolean value with intent to transfer
                intent.putExtra("player_x", true);
                //Call intent to open five square game activity
                startActivity(intent);
            }
            else if((gameChoice == 5) && (player_x == false)){
                /*Go to 5 board game Activity*/
                /*Choose player o for player one*/
                /*Make a toast to display board game size chosen*/
                Toast.makeText(this, "Play 5 Board Game", Toast.LENGTH_SHORT).show();
                /*Call intent and migrate to FiveSquareGameActivity*/
                Intent intent = new Intent(MainActivity.this, FiveSquareGameActivity.class);
                //Adding edit text values with intent to transfer
                intent.putExtra("player_one_name", player_one_name);
                intent.putExtra("player_two_name", player_two_name);

                //Adding boolean value with intent to transfer
                intent.putExtra("player_x", false);
                //Call intent to open five square game activity
                startActivity(intent);
            }
    }
        /*Determine which radio button is selected. Call the {@chooseBoardGameRButtonClicked}
        * method and set gameChoice to reflect corresponding integer values*/
    public void chooseBoardGameRButtonClicked(View view){
            /*Check radio button states*/
        boolean cBGRButtonChecked = ((RadioButton) view).isChecked();

        switch(view.getId()){
                /*Assign integer no 3 to radiobutton 3 checked state*/
            case R.id.three_board_game:
                if(cBGRButtonChecked)
                    gameChoice = 3;
                break;
                /*Assign integer no 5 to radio button 5 checked state*/
            case R.id.five_board_game:
                if(cBGRButtonChecked)
                    gameChoice = 5;
                break;
        }
    }

    /*Determine which radio button is selected. Call the {@chooseXOrO}
        * method and set boolean variable to reflect corresponding boolean values*/
    public void chooseXOrO(View view){
            /*Check radio button states*/
        boolean cXORButtonChecked = ((RadioButton) view).isChecked();

        switch(view.getId()){
                /*Assign integer no 3 to radiobutton 3 checked state*/
            case R.id.choose_x:
                if(cXORButtonChecked)
                    player_x = true;
                break;
                /*Assign integer no 5 to radio button 5 checked state*/
            case R.id.choose_o:
                if(cXORButtonChecked)
                    player_x = false;
                break;
        }
    }
}

