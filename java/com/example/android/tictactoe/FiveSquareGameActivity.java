package com.example.android.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by user on 01/04/2018.
 */

public class FiveSquareGameActivity extends AppCompatActivity implements View.OnClickListener {

    /*initialize player turn buttons/player turn count*/
    private boolean player_x = true;
    private int play_count = 0;

    /*initialize all button and textview variables
    * Also initialize/define board condition as integer value*/
    Button b1; Button b2; Button b3; Button b4; Button b5;
    Button b6; Button b7; Button b8; Button b9; Button b10;
    Button b11; Button b12; Button b13; Button b14; Button b15;
    Button b16; Button b17; Button b18; Button b19; Button b20;
    Button b21; Button b22; Button b23; Button b24; Button b25;

    Button resetButton;
    TextView scoreWinnerTextView; TextView scoreDetailsTextView;
    TextView playerOneTextView; TextView playerTwoTextView;

    private int[] boardCondition = new int[25];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /* Set the content of the activity to use five_square_game.xml file */
        setContentView(R.layout.five_square_game);

        //Call String intent from MainActivity
        Intent intent = getIntent();
        String p_one_name = intent.getStringExtra("player_one_name");
        String p_two_name = intent.getStringExtra("player_two_name");

        /*Assign views to all button variables created above*/
        b1 = (Button) findViewById(R.id.b1); b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3); b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5); b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7); b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9); b10 = (Button) findViewById(R.id.b10);
        b11 = (Button) findViewById(R.id.b11); b12 = (Button) findViewById(R.id.b12);
        b13 = (Button) findViewById(R.id.b13); b14 = (Button) findViewById(R.id.b14);
        b15 = (Button) findViewById(R.id.b15); b16 = (Button) findViewById(R.id.b16);
        b17 = (Button) findViewById(R.id.b17); b18 = (Button) findViewById(R.id.b18);
        b19 = (Button) findViewById(R.id.b19); b20 = (Button) findViewById(R.id.b20);
        b21 = (Button) findViewById(R.id.b21); b22 = (Button) findViewById(R.id.b22);
        b23 = (Button) findViewById(R.id.b23); b24 = (Button) findViewById(R.id.b24);
        b25 = (Button) findViewById(R.id.b25);

        resetButton = (Button) findViewById(R.id.reset_button);

        /*Assign views to text view variables created above*/
        scoreWinnerTextView = (TextView) findViewById(R.id.score_winner);
        scoreDetailsTextView = (TextView) findViewById(R.id.score_details);
        playerOneTextView = (TextView) findViewById(R.id.p1_name);
        playerTwoTextView = (TextView) findViewById(R.id.p2_name);

        //Get text and display on appropriate text view
        playerOneTextView.setText(p_one_name);
        playerTwoTextView.setText(p_two_name);

        /*Set {@onClickListeners} on all buttons to determine state*/
        resetButton.setOnClickListener(this);

        b1.setOnClickListener(this); b2.setOnClickListener(this); b3.setOnClickListener(this);
        b4.setOnClickListener(this); b5.setOnClickListener(this); b6.setOnClickListener(this);
        b7.setOnClickListener(this); b8.setOnClickListener(this); b9.setOnClickListener(this);
        b10.setOnClickListener(this); b11.setOnClickListener(this); b12.setOnClickListener(this);
        b13.setOnClickListener(this); b14.setOnClickListener(this); b15.setOnClickListener(this);
        b16.setOnClickListener(this); b17.setOnClickListener(this); b18.setOnClickListener(this);
        b19.setOnClickListener(this); b20.setOnClickListener(this); b21.setOnClickListener(this);
        b22.setOnClickListener(this); b23.setOnClickListener(this); b24.setOnClickListener(this);
        b25.setOnClickListener(this);

        /*Call board state to initial condition/get present board state*/
        getBoardState();
    }
    /*create {@onClick} method to determine button state and update same*/
    @Override
    public void onClick(View view) {

            /*Disable reset button during play*/
        boolean resetButtonClicked = false;

            /*Use switch to determine states of each button
            * Also set text value and text color to button clicked
            * Finally, update board condition to corresponding button clicked
            * 1 for x clicked and 0 for o clicked
            * Note that all of the 4 things done above are for all 25 buttons
            * Or all buttons pressed till game is won*/

        switch (view.getId()) {
            case R.id.b1:
                if (player_x) {
                    b1.setText("X");
                    b1.setTextColor(android.graphics.Color.RED);
                    boardCondition[0] = 1;
                }

                else {
                    b1.setText("O");
                    b1.setTextColor(android.graphics.Color.BLACK);
                    boardCondition[0] = 0;
                }
                b1.setEnabled(false);
                break;

            case R.id.b2:
                if (player_x) {
                    b2.setText("X");
                    b2.setTextColor(android.graphics.Color.RED);
                    boardCondition[1] = 1;
                }
                else {
                    b2.setText("O");
                    b2.setTextColor(android.graphics.Color.BLACK);
                    boardCondition[1] = 0;
                }
                b2.setEnabled(false);
                break;

            case R.id.b3:
                if (player_x) {
                    b3.setText("X");
                    b3.setTextColor(android.graphics.Color.RED);
                    boardCondition[2] = 1;
                }
                else {
                    b3.setText("O");
                    b3.setTextColor(android.graphics.Color.BLACK);
                    boardCondition[2] = 0;
                }
                b3.setEnabled(false);
                break;

            case R.id.b4:
                if (player_x) {
                    b4.setText("X");
                    b4.setTextColor(android.graphics.Color.RED);
                    boardCondition[3] = 1;
                }
                else {
                    b4.setText("O");
                    b4.setTextColor(android.graphics.Color.BLACK);
                    boardCondition[3] = 0;
                }
                b4.setEnabled(false);
                break;

            case R.id.b5:
                if (player_x) {
                    b5.setText("X");
                    b5.setTextColor(android.graphics.Color.RED);
                    boardCondition[4] = 1;
                }
                else {
                    b5.setText("O");
                    b5.setTextColor(android.graphics.Color.BLACK);
                    boardCondition[4] = 0;
                }
                b5.setEnabled(false);
                break;

            case R.id.b6:
                if (player_x) {
                    b6.setText("X");
                    b6.setTextColor(android.graphics.Color.RED);
                    boardCondition[5] = 1;
                }
                else {
                    b6.setText("O");
                    b6.setTextColor(android.graphics.Color.BLACK);
                    boardCondition[5] = 0;
                }
                b6.setEnabled(false);
                break;

            case R.id.b7:
                if (player_x) {
                    b7.setText("X");
                    b7.setTextColor(android.graphics.Color.RED);
                    boardCondition[6] = 1;
                }
                else {
                    b7.setText("O");
                    b7.setTextColor(android.graphics.Color.BLACK);
                    boardCondition[6] = 0;
                }
                b7.setEnabled(false);
                break;

            case R.id.b8:
                if (player_x) {
                    b8.setText("X");
                    b8.setTextColor(android.graphics.Color.RED);
                    boardCondition[7] = 1;
                }
                else {
                    b8.setText("O");
                    b8.setTextColor(android.graphics.Color.BLACK);
                    boardCondition[7] = 0;
                }
                b8.setEnabled(false);
                break;

            case R.id.b9:
                if (player_x) {
                    b9.setText("X");
                    b9.setTextColor(android.graphics.Color.RED);
                    boardCondition[8] = 1;
                }
                else {
                    b9.setText("O");
                    b9.setTextColor(android.graphics.Color.BLACK);
                    boardCondition[8] = 0;
                }
                b9.setEnabled(false);
                break;

            case R.id.b10:
                if (player_x) {
                    b10.setText("X");
                    b10.setTextColor(android.graphics.Color.RED);
                    boardCondition[9] = 1;
                }
                else {
                    b10.setText("O");
                    b10.setTextColor(android.graphics.Color.BLACK);
                    boardCondition[9] = 0;
                }
                b10.setEnabled(false);
                break;

            case R.id.b11:
                if (player_x) {
                    b11.setText("X");
                    b11.setTextColor(android.graphics.Color.RED);
                    boardCondition[10] = 1;
                }

                else {
                    b11.setText("O");
                    b11.setTextColor(android.graphics.Color.BLACK);
                    boardCondition[10] = 0;
                }
                b11.setEnabled(false);
                break;

            case R.id.b12:
                if (player_x) {
                    b12.setText("X");
                    b12.setTextColor(android.graphics.Color.RED);
                    boardCondition[11] = 1;
                }
                else {
                    b12.setText("O");
                    b12.setTextColor(android.graphics.Color.BLACK);
                    boardCondition[11] = 0;
                }
                b12.setEnabled(false);
                break;

            case R.id.b13:
                if (player_x) {
                    b13.setText("X");
                    b13.setTextColor(android.graphics.Color.RED);
                    boardCondition[12] = 1;
                }
                else {
                    b13.setText("O");
                    b13.setTextColor(android.graphics.Color.BLACK);
                    boardCondition[12] = 0;
                }
                b13.setEnabled(false);
                break;

            case R.id.b14:
                if (player_x) {
                    b14.setText("X");
                    b14.setTextColor(android.graphics.Color.RED);
                    boardCondition[13] = 1;
                }
                else {
                    b14.setText("O");
                    b14.setTextColor(android.graphics.Color.BLACK);
                    boardCondition[13] = 0;
                }
                b14.setEnabled(false);
                break;

            case R.id.b15:
                if (player_x) {
                    b15.setText("X");
                    b15.setTextColor(android.graphics.Color.RED);
                    boardCondition[14] = 1;
                }
                else {
                    b15.setText("O");
                    b15.setTextColor(android.graphics.Color.BLACK);
                    boardCondition[14] = 0;
                }
                b15.setEnabled(false);
                break;

            case R.id.b16:
                if (player_x) {
                    b16.setText("X");
                    b16.setTextColor(android.graphics.Color.RED);
                    boardCondition[15] = 1;
                }
                else {
                    b16.setText("O");
                    b16.setTextColor(android.graphics.Color.BLACK);
                    boardCondition[15] = 0;
                }
                b16.setEnabled(false);
                break;

            case R.id.b17:
                if (player_x) {
                    b17.setText("X");
                    b17.setTextColor(android.graphics.Color.RED);
                    boardCondition[16] = 1;
                }
                else {
                    b17.setText("O");
                    b17.setTextColor(android.graphics.Color.BLACK);
                    boardCondition[16] = 0;
                }
                b17.setEnabled(false);
                break;

            case R.id.b18:
                if (player_x) {
                    b18.setText("X");
                    b18.setTextColor(android.graphics.Color.RED);
                    boardCondition[17] = 1;
                }
                else {
                    b18.setText("O");
                    b18.setTextColor(android.graphics.Color.BLACK);
                    boardCondition[17] = 0;
                }
                b18.setEnabled(false);
                break;

            case R.id.b19:
                if (player_x) {
                    b19.setText("X");
                    b19.setTextColor(android.graphics.Color.RED);
                    boardCondition[18] = 1;
                }
                else {
                    b19.setText("O");
                    b19.setTextColor(android.graphics.Color.BLACK);
                    boardCondition[18] = 0;
                }
                b19.setEnabled(false);
                break;

            case R.id.b20:
                if (player_x) {
                    b20.setText("X");
                    b20.setTextColor(android.graphics.Color.RED);
                    boardCondition[19] = 1;
                }
                else {
                    b20.setText("O");
                    b20.setTextColor(android.graphics.Color.BLACK);
                    boardCondition[19] = 0;
                }
                b20.setEnabled(false);
                break;

            case R.id.b21:
                if (player_x) {
                    b21.setText("X");
                    b21.setTextColor(android.graphics.Color.RED);
                    boardCondition[20] = 1;
                }
                else {
                    b21.setText("O");
                    b21.setTextColor(android.graphics.Color.BLACK);
                    boardCondition[20] = 0;
                }
                b21.setEnabled(false);
                break;

            case R.id.b22:
                if (player_x) {
                    b22.setText("X");
                    b22.setTextColor(android.graphics.Color.RED);
                    boardCondition[21] = 1;
                }
                else {
                    b22.setText("O");
                    b22.setTextColor(android.graphics.Color.BLACK);
                    boardCondition[21] = 0;
                }
                b22.setEnabled(false);
                break;

            case R.id.b23:
                if (player_x) {
                    b23.setText("X");
                    b23.setTextColor(android.graphics.Color.RED);
                    boardCondition[22] = 1;
                }
                else {
                    b23.setText("O");
                    b23.setTextColor(android.graphics.Color.BLACK);
                    boardCondition[22] = 0;
                }
                b23.setEnabled(false);
                break;

            case R.id.b24:
                if (player_x) {
                    b24.setText("X");
                    b24.setTextColor(android.graphics.Color.RED);
                    boardCondition[23] = 1;
                }
                else {
                    b24.setText("O");
                    b24.setTextColor(android.graphics.Color.BLACK);
                    boardCondition[23] = 0;
                }
                b24.setEnabled(false);
                break;

            case R.id.b25:
                if (player_x) {
                    b25.setText("X");
                    b25.setTextColor(android.graphics.Color.RED);
                    boardCondition[24] = 1;
                }
                else {
                    b25.setText("O");
                    b25.setTextColor(android.graphics.Color.BLACK);
                    boardCondition[24] = 0;
                }
                b25.setEnabled(false);
                break;

            case R.id.reset_button:
                resetButtonClicked = true;

                break;

            default:
                break;
        }
            /*Call resetBoard method*/
        if(resetButtonClicked){
            resetBoard();
        }
                    /*Switch player turn state from PLAYER X to PLAYER O
                    * Update play_count by 1*/
        else {
            play_count++;
            player_x = !player_x;

                        /*Update text view with details of player turn and
                        * display game state if game is a draw
                        * Also disable button played to avoid changing its state
                        * And disable game button until button is reset*/
            if (player_x) {
                setScoreWinner("Player X");
                setScoreDetails("Your Turn");
            } else {
                setScoreWinner("Player O");
                setScoreDetails("Your Turn");
            }
            if (play_count == 25) {
                setScoreWinner("Game Drawn");
                setScoreDetails("Try Again");
                enableGameButtons(false);
            }

                        /* call getWinner method*/
            getWinner();
        }

    }
    /* define getWinner method
    * By determining which of the 8 possible states gives a Win
    * Which are 5 horizontal rows, 5 vertical columns and 2 diagonals
    * If determined update text views to display winner and details
    * e.g. Player X wins, First Row*/
    private void getWinner(){

        //To determine first horizontal row state
        if((boardCondition[0] == boardCondition[1]) &&
                (boardCondition[0] == boardCondition[2]) &&
                (boardCondition[0] == boardCondition[3]) &&
                (boardCondition[0] == boardCondition[4])) {
            if(boardCondition[0] == 1){
                setScoreWinner("Player X Wins");
                setScoreDetails("First Row");
                enableGameButtons(false);
            }
            else if(boardCondition[0] == 0){
                setScoreWinner("Player O Wins");
                setScoreDetails("First Row");
                enableGameButtons(false);
            }
        }
        //To determine second horizontal row state
        if((boardCondition[5] == boardCondition[6]) &&
                (boardCondition[5] == boardCondition[7]) &&
                (boardCondition[5] == boardCondition[8]) &&
                (boardCondition[5] == boardCondition[9])) {
            if(boardCondition[5] == 1){
                setScoreWinner("Player X Wins");
                setScoreDetails("Second Row");
                enableGameButtons(false);
            }
            else if(boardCondition[5] == 0){
                setScoreWinner("Player O Wins");
                setScoreDetails("Second Row");
                enableGameButtons(false);
            }
        }
        ///To determine third horizontal row state
        if((boardCondition[10] == boardCondition[11]) &&
                (boardCondition[10] == boardCondition[12]) &&
                (boardCondition[10] == boardCondition[13]) &&
                (boardCondition[10] == boardCondition[14])) {
            if(boardCondition[10] == 1){
                setScoreWinner("Player X Wins");
                setScoreDetails("Third Row");
                enableGameButtons(false);
            }
            else if(boardCondition[10] == 0){
                setScoreWinner("Player O Wins");
                setScoreDetails("Third Row");
                enableGameButtons(false);
            }
        }

        //To determine fourth horizontal row state
        if((boardCondition[15] == boardCondition[16]) &&
                (boardCondition[15] == boardCondition[17]) &&
                (boardCondition[15] == boardCondition[18]) &&
                (boardCondition[15] == boardCondition[19])) {
            if(boardCondition[15] == 1){
                setScoreWinner("Player X Wins");
                setScoreDetails("Fourth Row");
                enableGameButtons(false);
            }
            else if(boardCondition[15] == 0){
                setScoreWinner("Player O Wins");
                setScoreDetails("Fourth Row");
                enableGameButtons(false);
            }
        }

        //To determine fifth horizontal row state
        if((boardCondition[20] == boardCondition[21]) &&
                (boardCondition[20] == boardCondition[22]) &&
                (boardCondition[20] == boardCondition[23]) &&
                (boardCondition[20] == boardCondition[24])) {
            if(boardCondition[20] == 1){
                setScoreWinner("Player X Wins");
                setScoreDetails("Fifth Row");
                enableGameButtons(false);
            }
            else if(boardCondition[20] == 0){
                setScoreWinner("Player O Wins");
                setScoreDetails("Fifth Row");
                enableGameButtons(false);
            }
        }

        //To determine first vertical column state
        if((boardCondition[0] == boardCondition[5]) &&
                (boardCondition[0] == boardCondition[10]) &&
                (boardCondition[0] == boardCondition[15]) &&
                (boardCondition[0] == boardCondition[20])) {
            if(boardCondition[0] == 1){
                setScoreWinner("Player X Wins");
                setScoreDetails("First Column");
                enableGameButtons(false);
            }
            else if(boardCondition[0] == 0){
                setScoreWinner("Player O Wins");
                setScoreDetails("First Column");
                enableGameButtons(false);
            }
        }
        //To determine second vertical column state
        if((boardCondition[1] == boardCondition[6]) &&
                (boardCondition[1] == boardCondition[11]) &&
                (boardCondition[1] == boardCondition[16]) &&
                (boardCondition[1] == boardCondition[21])) {
            if(boardCondition[1] == 1){
                setScoreWinner("Player X Wins");
                setScoreDetails("Second Column");
                enableGameButtons(false);
            }
            else if(boardCondition[1] == 0){
                setScoreWinner("Player O Wins");
                setScoreDetails("Second Column");
                enableGameButtons(false);
            }
        }
        ///To determine third vertical column state
        if((boardCondition[2] == boardCondition[7]) &&
                (boardCondition[2] == boardCondition[12]) &&
                (boardCondition[2] == boardCondition[17]) &&
                (boardCondition[2] == boardCondition[22])) {
            if(boardCondition[2] == 1){
                setScoreWinner("Player X Wins");
                setScoreDetails("Third Column");
                enableGameButtons(false);
            }
            else if(boardCondition[2] == 0){
                setScoreWinner("Player O Wins");
                setScoreDetails("Third Column");
                enableGameButtons(false);
            }
        }

        //To determine fourth vertical column state
        if((boardCondition[3] == boardCondition[8]) &&
                (boardCondition[3] == boardCondition[13]) &&
                (boardCondition[3] == boardCondition[18]) &&
                (boardCondition[3] == boardCondition[23])) {
            if(boardCondition[3] == 1){
                setScoreWinner("Player X Wins");
                setScoreDetails("Fourth Column");
                enableGameButtons(false);
            }
            else if(boardCondition[3] == 0){
                setScoreWinner("Player O Wins");
                setScoreDetails("Fourth Column");
                enableGameButtons(false);
            }
        }

        //To determine fifth vertical column state
        if((boardCondition[4] == boardCondition[9]) &&
                (boardCondition[4] == boardCondition[14]) &&
                (boardCondition[4] == boardCondition[19]) &&
                (boardCondition[4] == boardCondition[24])) {
            if(boardCondition[4] == 1){
                setScoreWinner("Player X Wins");
                setScoreDetails("Fifth Column");
                enableGameButtons(false);
            }
            else if(boardCondition[4] == 0){
                setScoreWinner("Player O Wins");
                setScoreDetails("Fifth Column");
                enableGameButtons(false);
            }
        }

        //To determine first diagonal state
        if((boardCondition[0] == boardCondition[6]) &&
                (boardCondition[0] == boardCondition[12]) &&
                (boardCondition[0] == boardCondition[18]) &&
                (boardCondition[0] == boardCondition[24])) {
            if(boardCondition[0] == 1){
                setScoreWinner("Player X Wins");
                setScoreDetails("First Diagonal");
                enableGameButtons(false);
            }
            else if(boardCondition[0] == 0){
                setScoreWinner("Player O Wins");
                setScoreDetails("First Diagonal");
                enableGameButtons(false);
            }
        }

        //To determine second diagonal state
        if((boardCondition[4] == boardCondition[8]) &&
                (boardCondition[4] == boardCondition[12]) &&
                (boardCondition[4] == boardCondition[16]) &&
                (boardCondition[4] == boardCondition[20])) {
            if(boardCondition[4] == 1){
                setScoreWinner("Player X Wins");
                setScoreDetails("Second Diagonal");
                enableGameButtons(false);
            }
            else if(boardCondition[4] == 0){
                setScoreWinner("Player O Wins");
                setScoreDetails("Second Diagonal");
                enableGameButtons(false);
            }
        }

    }
    /*Define enableGameButtons method to enable/disable game buttons
    * When the need arises*/
    private void enableGameButtons(boolean state){

        b1.setEnabled(state); b2.setEnabled(state); b3.setEnabled(state);
        b4.setEnabled(state); b5.setEnabled(state); b6.setEnabled(state);
        b7.setEnabled(state); b8.setEnabled(state); b9.setEnabled(state);
        b10.setEnabled(state); b11.setEnabled(state); b12.setEnabled(state);
        b13.setEnabled(state); b14.setEnabled(state); b15.setEnabled(state);
        b16.setEnabled(state); b17.setEnabled(state); b18.setEnabled(state);
        b19.setEnabled(state); b20.setEnabled(state); b21.setEnabled(state);
        b22.setEnabled(state); b23.setEnabled(state); b24.setEnabled(state);
        b25.setEnabled(state);
    }
    /*Reset text view, game buttons, board state to initial values
    * Also set text view to display Game Over, Try Again.
    * Make toast to display Board Reset*/
    private void resetBoard(){

        b1.setText(""); b2.setText(""); b3.setText(""); b4.setText("");
        b5.setText(""); b6.setText(""); b7.setText(""); b8.setText("");
        b9.setText(""); b10.setText(""); b11.setText(""); b12.setText("");
        b13.setText(""); b14.setText(""); b15.setText(""); b16.setText("");
        b17.setText(""); b18.setText(""); b19.setText(""); b20.setText("");
        b21.setText(""); b22.setText(""); b23.setText(""); b24.setText("");
        b25.setText("");

        enableGameButtons(true);

        getBoardState();

        setScoreWinner("Game Over");
        setScoreDetails("Try Again");

        Toast.makeText(this, "Board Reset", Toast.LENGTH_SHORT).show();
    }
    //Set text view to display score winner and player turn
    private void setScoreWinner(String text){
        scoreWinnerTextView.setText(text);
    }

    //Set texst view to display score winner details and player turn
    private void setScoreDetails(String text){
        scoreDetailsTextView.setText(text);
    }

    //set getBoardState method to initialize boardCondition to -1
    //Reflecting a neutral button state of neither 0 or 1 for O or X
    private void getBoardState(){
        for(int i = 0; i < boardCondition.length; i++){
            boardCondition[i] = -1;
        }
    }

}
