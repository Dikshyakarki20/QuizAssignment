package com.example.quizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class QuizActivity extends AppCompatActivity {
    private Button submitButton;
    private int score;
    //private RadioGroup stopradio;
    private RadioGroup Radio_button;
    //private RadioGroup startradio;
    private EditText editText;
    private EditText edittext;
    private CheckBox Componentcheckbox;
    private CheckBox messagecheckbox;
    private CheckBox suppcheckbox;
    private CheckBox remcheckbox;
    private CheckBox excheckbox;
    private CheckBox asyncheckbox;
    private CheckBox vcheckbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        submitButton = findViewById(R.id.submit_button);
        editText = findViewById(R.id.edit_text);
        edittext = findViewById(R.id.edit1_text);
        Componentcheckbox = findViewById(R.id.component_checkbox); //answer
        messagecheckbox = findViewById(R.id.message_checkbox);
        //  stopradio = findViewById(R.id.stop_radio); // answer
        //startradio = findViewById(R.id.start_radio); // answer
        Radio_button = findViewById(R.id.Radio_butto);
        suppcheckbox = findViewById(R.id.support_checkbox);
        remcheckbox = findViewById(R.id.remote_checkbox);
        excheckbox = findViewById(R.id.exit_checkbox);
        asyncheckbox = findViewById(R.id.asyn_checkbox);
        vcheckbox = findViewById(R.id.view_checkbox);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                score = 0;

        if (Radio_button.getCheckedRadioButtonId() == R.id.stop_radio) {
            score += 1;
        }
        String userAnswer = editText.getText().toString();
        if (userAnswer.equalsIgnoreCase("Manifest")) {
            score += 1;
        }
        String usersAnswers = edittext.getText().toString();
        if (usersAnswers.equalsIgnoreCase("Yes")){
            score +=1;
        }
            if (suppcheckbox.isChecked() && remcheckbox.isChecked() && excheckbox.isChecked() && asyncheckbox.isChecked() && vcheckbox.isChecked()) {
                score += 1;
            }
                Intent intent = new Intent(QuizActivity.this, ScoreActivity.class);
                intent.putExtra("SCORE", score+"/8");
                startActivity(intent);

            }
        });


    }
}
