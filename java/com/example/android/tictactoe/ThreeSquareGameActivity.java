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

public class ThreeSquareGameActivity extends AppCompatActivity implements View.OnClickListener {

    /*initialize player turn buttons/player turn count*/
    private boolean player_x = true;
    private int play_count = 0;

    /*initialize all button and textview variables
    * Also initialize/define board condition as integer value*/
    Button b1; Button b2; Button b3;
    Button b4; Button b5; Button b6;
    Button b7; Button b8; Button b9;

    Button resetButton;
    TextView scoreWinnerTextView; TextView scoreDetailsTextView;
    TextView playerOneTextView; TextView playerTwoTextView;
    private int[] boardCondition = new int[9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /* Set the content of the activity to use three_square_game.xml file */
        setContentView(R.layout.three_square_game);

        //Call String intent from MainActivity
        Intent intent = getIntent();
        String p_one_name = intent.getStringExtra("player_one_name");
        String p_two_name = intent.getStringExtra("player_two_name");

        /*Assign views to all button variables created above*/
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
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

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);

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
            * Note that all of the 4 things done above are for all 9 buttons
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
                        if (play_count == 9) {
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
            * Which are 3 horizontal rows, 3 vertical columns and 2 diagonals
            * If determined update text views to display winner and details
            * e.g. Player X wins, First Row*/
            private void getWinner(){

                //To determine first horizontal row state
                if(boardCondition[0] == boardCondition[1] && boardCondition[0] == boardCondition[2]){
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
                if(boardCondition[3] == boardCondition[4] && boardCondition[3] == boardCondition[5]){
                    if(boardCondition[3] == 1){
                        setScoreWinner("Player X Wins");
                        setScoreDetails("Second Row");
                        enableGameButtons(false);
                    }
                    else if(boardCondition[3] == 0){
                        setScoreWinner("Player O Wins");
                        setScoreDetails("Second Row");
                        enableGameButtons(false);
                    }
                }
                ///To determine third horizontal row state
                if(boardCondition[6] == boardCondition[7] && boardCondition[6] == boardCondition[8]){
                    if(boardCondition[6] == 1){
                        setScoreWinner("Player X Wins");
                        setScoreDetails("Third Row");
                        enableGameButtons(false);
                    }
                    else if(boardCondition[6] == 0){
                        setScoreWinner("Player O Wins");
                        setScoreDetails("Third Row");
                        enableGameButtons(false);
                    }
                }

                //To determine first vertical column state
                if(boardCondition[0] == boardCondition[3] && boardCondition[0] == boardCondition[6]){
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
                if(boardCondition[1] == boardCondition[4] && boardCondition[1] == boardCondition[7]){
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

                //To determine third vertical column state
                if(boardCondition[2] == boardCondition[5] && boardCondition[2] == boardCondition[8]){
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

                //To determine first diagonal state
                if(boardCondition[0] == boardCondition[4] && boardCondition[0] == boardCondition[8]){
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
                if(boardCondition[2] == boardCondition[4] && boardCondition[2] == boardCondition[6]){
                    if(boardCondition[2] == 1){
                        setScoreWinner("Player X Wins");
                        setScoreDetails("Second Diagonal");
                        enableGameButtons(false);
                    }
                    else if(boardCondition[2] == 0){
                        setScoreWinner("Player O Wins");
                        setScoreDetails("Second Diagonal");
                        enableGameButtons(false);
                    }
                }

    }
    /*Define enableGameButtons method to enable/disable game buttons
    * When the need arises*/
    private void enableGameButtons(boolean state){

        b1.setEnabled(state);
        b2.setEnabled(state);
        b3.setEnabled(state);
        b4.setEnabled(state);
        b5.setEnabled(state);
        b6.setEnabled(state);
        b7.setEnabled(state);
        b8.setEnabled(state);
        b9.setEnabled(state);
    }
    /*Reset text view, game buttons, board state to initial values
    * Also set text view to display Game Over, Try Again.
    * Make toast to display Board Reset*/
    private void resetBoard(){

        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");

        enableGameButtons(true);

        getBoardState();

        setScoreWinner("Game Over");
        setScoreDetails("Try Again");

        Toast.makeText(this, "Board Reset", Toast.LENGTH_SHORT).show();
    }
    //Set text view to display score winner and player turn
    private void setScoreWinner(String text) {
        scoreWinnerTextView.setText(text);
    }

    //Set text view to display score winner details and player turn
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
