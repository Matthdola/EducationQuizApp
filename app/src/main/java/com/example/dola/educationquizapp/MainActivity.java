package com.example.dola.educationquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    int totalQuiz = 15;
    int currentQiuz = 0;
    float score = 0;
    boolean responseGiven = false;

    @BindView(R.id.current_quiz) TextView CurrentQuizTextView;
    @BindView(R.id.total_quiz) TextView TotalQuizTextView ;

    @BindView(R.id.status_container) LinearLayout statusContainer;

    @BindView(R.id.welcome_container) LinearLayout welcome_container ;

    @BindView(R.id.quizapp_start_screen) LinearLayout startbtn_container;

    @BindView(R.id.final_container) LinearLayout finalContainer;

    @BindView(R.id.question_1) LinearLayout quiz1Container ;
    @BindView(R.id.question_2) LinearLayout quiz2Container ;
    @BindView(R.id.question_3) LinearLayout quiz3Container ;
    @BindView(R.id.question_4) LinearLayout quiz4Container ;
    @BindView(R.id.question_5) LinearLayout quiz5Container ;
    @BindView(R.id.question_6) LinearLayout quiz6Container ;
    @BindView(R.id.question_7) LinearLayout quiz7Container ;
    @BindView(R.id.question_8) LinearLayout quiz8Container ;
    @BindView(R.id.question_9) LinearLayout quiz9Container ;
    @BindView(R.id.question_10) LinearLayout quiz10Container ;
    @BindView(R.id.question_11) LinearLayout quiz11Container ;
    @BindView(R.id.question_12) LinearLayout quiz12Container ;
    @BindView(R.id.question_13) LinearLayout quiz13Container ;
    @BindView(R.id.question_14) LinearLayout quiz14Container ;
    @BindView(R.id.question_15) LinearLayout quiz15Container ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        statusContainer.setVisibility(View.GONE);
        hideAllQuizContainer();
    }


    /**
     * Update the counter of the actual quiz
     */
    void updateCurrentQuizStatus(){
        TotalQuizTextView.setText(String.format("%s", totalQuiz));
        CurrentQuizTextView.setText(String.format("%s", ++currentQiuz));
    }


    /**
     *  This method verify that tha user give it firstname and lastname
     *  And then start the quiz page to allow the user to start.
     */
    public void startQuiz(View view)
    {
        welcome_container.setVisibility(View.GONE);

        startbtn_container.setVisibility(View.GONE);

        responseGiven = true;
        displayNextQuiz(view);
        statusContainer.setVisibility(View.VISIBLE);

        finalContainer.setVisibility(View.GONE);
    }

    /**
     *  This method display the next quiz
     */
    void displayNextQuiz(View view){
         if (!responseGiven){
            Toast.makeText(this, R.string.give_anwser_msg, Toast.LENGTH_SHORT).show();
            return;
        }

        hideAllQuizContainer();
        switch (currentQiuz){
            case 0:
                quiz1Container.setVisibility(View.VISIBLE);
                break;

            case 1:
                quiz2Container.setVisibility(View.VISIBLE);
                break;

            case 2:
                quiz3Container.setVisibility(View.VISIBLE);
                break;

            case 3:
                quiz4Container.setVisibility(View.VISIBLE);
                break;

            case 4:
                quiz5Container.setVisibility(View.VISIBLE);
                break;

            case 5:
                quiz6Container.setVisibility(View.VISIBLE);
                break;

            case 6:
                quiz7Container.setVisibility(View.VISIBLE);
                break;

            case 7:
                quiz8Container.setVisibility(View.VISIBLE);
                break;

            case 8:
                quiz9Container.setVisibility(View.VISIBLE);
                break;

            case 9:
                quiz10Container.setVisibility(View.VISIBLE);
                break;

            case 10:
                quiz11Container.setVisibility(View.VISIBLE);
                break;

            case 11:
                quiz12Container.setVisibility(View.VISIBLE);
                break;

            case 12:
                quiz13Container.setVisibility(View.VISIBLE);
                break;

            case 13:
                quiz14Container.setVisibility(View.VISIBLE);
                break;

            case 14:
                quiz15Container.setVisibility(View.VISIBLE);
                break;
            default:
                break;
        }

        responseGiven = false;
        updateCurrentQuizStatus();
    }



    /**
     * Hide all unnecessary elements
     *
     * */
    private void hideAllQuizContainer()
    {
        quiz1Container.setVisibility(View.GONE);
        quiz2Container.setVisibility(View.GONE);
        quiz3Container.setVisibility(View.GONE);
        quiz4Container.setVisibility(View.GONE);
        quiz5Container.setVisibility(View.GONE);
        quiz6Container.setVisibility(View.GONE);
        quiz7Container.setVisibility(View.GONE);
        quiz8Container.setVisibility(View.GONE);
        quiz9Container.setVisibility(View.GONE);
        quiz10Container.setVisibility(View.GONE);
        quiz11Container.setVisibility(View.GONE);
        quiz12Container.setVisibility(View.GONE);
        quiz13Container.setVisibility(View.GONE);
        quiz14Container.setVisibility(View.GONE);
        quiz15Container.setVisibility(View.GONE);
    }

    /**
     * Hide Counter container
     */
    void hideCounterContainer()
    {
        statusContainer.setVisibility(View.GONE);
    }

    /**
     * Display a final container to thank the user to use our application.
     */
    private  void displayFinalThanksContainer()
    {
        hideAllQuizContainer();
        hideCounterContainer();
        LinearLayout thankContainer = findViewById(R.id.final_container);
        thankContainer.setVisibility(View.VISIBLE);

        TextView username = findViewById(R.id.username_in_thank);

        username.setText(String.format("The score of evaluation of your children status in the school is  %s / %s", score, totalQuiz));

        currentQiuz = 0;
    }

    /**
     * These methods allow to
     */

    public void quest1Answer(View view)
    {
        responseGiven = true;
        if (view.getId() == R.id.quest_1_a){
            score++;

        } else if (view.getId() == R.id.quest_1_b){
            score += 0.2;

        }else if (view.getId() == R.id.quest_1_c){
            score += 0.5;

        }else if (view.getId() == R.id.quest_1_d){
            score += 0;
        }
    }

    public void quest2Answer(View view)
    {
        responseGiven = true;
        if (view.getId() == R.id.quest_2_a){
            score += 1;

        } else if (view.getId() == R.id.quest_2_b){
            score += 0;

        } else if (view.getId() == R.id.quest_2_c){
            score += 0.25;

        } else if (view.getId() == R.id.quest_2_d){
            score += 0;

        }
    }

    public void quest3Answer(View view)
    {
        responseGiven = true;
        if (view.getId() == R.id.quest_3_a){
            score += 1;

        } else if (view.getId() == R.id.quest_3_b){
            score += 0.5;

        } else if (view.getId() == R.id.quest_3_c){
            score += 0.2;

        } else if (view.getId() == R.id.quest_3_d){
            score += 0;
        }

    }


    public void quest4Answer(View view)
    {
        responseGiven = true;
        if (view.getId() == R.id.quest_4_a){
            score += 0.5;

        } else if (view.getId() == R.id.quest_4_b){
            score += 0;

        } else if (view.getId() == R.id.quest_4_c){
            score += 0.2;

        } else if (view.getId() == R.id.quest_4_d){
            score += 1;
        }
    }


    public void quest5Answer(View view)
    {
        responseGiven = true;
        if (view.getId() == R.id.quest_5_a){
            score += 0.25;

        } else if (view.getId() == R.id.quest_5_b){
            score += 0.2;

        }else if (view.getId() == R.id.quest_5_c){
            score += 0;

        }else if (view.getId() == R.id.quest_5_d){
            score += 0;

        }else if (view.getId() == R.id.quest_5_e){
            score += 1;

        }
    }


    public void quest6Answer(View view)
    {
        responseGiven = true;
        if (view.getId() == R.id.quest_6_a){
            score += 0.5;

        } else if (view.getId() == R.id.quest_6_b){
            score += 0.75;

        }else if (view.getId() == R.id.quest_6_c){
            score += 1;

        }else if (view.getId() == R.id.quest_6_d){
            score += 0.25;

        }
    }


    public void quest7Answer(View view)
    {
        responseGiven = true;
        if (view.getId() == R.id.quest_7_a){
            score += 0.5;

        } else if (view.getId() == R.id.quest_7_b){
            score += 0.25;

        }else if (view.getId() == R.id.quest_7_c){
            score += 1;

        }else if (view.getId() == R.id.quest_7_d){
            score += 0;

        }

    }


    public void quest8Answer(View view)
    {
        responseGiven = true;
        if (view.getId() == R.id.quest_8_a){
            score += 0;

        } else if (view.getId() == R.id.quest_8_b){
            score += 0.25;

        }else if (view.getId() == R.id.quest_8_c){
            score += 0.75;

        }else if (view.getId() == R.id.quest_8_d){
            score += 1;

        }

    }


    public void quest9Answer(View view)
    {
        responseGiven = true;
        if (view.getId() == R.id.quest_9_a){
            score += 0.25;

        } else if (view.getId() == R.id.quest_9_b){
            score += 0.25;

        }else if (view.getId() == R.id.quest_9_c){
            score += 0.25;

        }else if (view.getId() == R.id.quest_9_d){
            score += 0.25;

        }
    }


    public void quest10Answer(View view)
    {
        responseGiven = true;
        if (view.getId() == R.id.quest_10_a){
            score += 0.25;

        } else if (view.getId() == R.id.quest_10_b){
            score += 0.25;

        }else if (view.getId() == R.id.quest_10_c){
            score += 1;

        }else if (view.getId() == R.id.quest_10_d){
            score += 0.75;

        }
    }


    public void quest11Answer(View view)
    {
        responseGiven = true;
        if (view.getId() == R.id.quest_11_a){
            score += 0;

        } else if (view.getId() == R.id.quest_11_b){
            score += 0.5;

        }else if (view.getId() == R.id.quest_11_c){
            score += 0.25;

        }else if (view.getId() == R.id.quest_11_d){
            score += 0.25;

        }

    }


    public void quest12Answer(View view)
    {
        responseGiven = true;
        if (view.getId() == R.id.quest_12_a){
            score += 0.25;

        } else if (view.getId() == R.id.quest_12_b){
            score += 0.5;

        }else if (view.getId() == R.id.quest_12_c){
            score += 0.5;

        }else if (view.getId() == R.id.quest_12_d){
            score += 0;

        }else if (view.getId() == R.id.quest_12_e){
            score += 0.25;

        }

    }


    public void quest13Answer(View view)
    {
        responseGiven = true;
        if (view.getId() == R.id.quest_13_a){
            score += 0.5;

        } else if (view.getId() == R.id.quest_13_b){
            score += 1;

        }else if (view.getId() == R.id.quest_13_c){
            score += 0.75;

        }else if (view.getId() == R.id.quest_13_d){
            score += 0.5;

        }

    }

    public void quest14Answer(View view)
    {
        responseGiven = true;
        if (view.getId() == R.id.quest_14_a){
            score += 0.75;

        } else if (view.getId() == R.id.quest_14_b){
            score += 1;

        }else if (view.getId() == R.id.quest_14_c){
            score += 0.25;

        }else if (view.getId() == R.id.quest_14_d){
            score += 0;

        }
    }

    /**
     * To submit the quiz after answer question and get the score
     */
    public void submitQuiz(View view)
    {
        EditText nbOfBrotherEdit = findViewById(R.id.quest_15_a);
        if (nbOfBrotherEdit.getText().toString().isEmpty()){
            Toast.makeText(this, R.string.missingbrothermsg, Toast.LENGTH_SHORT).show();
            return;
        }

        int nbOfBrother = Integer.parseInt(nbOfBrotherEdit.getText().toString());
        if (nbOfBrother < 4){
            score += 1;
        }

        String resultMsg = String.format("Your score is %s / %s \n", score, totalQuiz );
        if (score < 7){
            resultMsg += getString(R.string.risque_child_msg);

        } else  if (score < 10){
            resultMsg += getString(R.string.average_child_msg);
        } else {
            resultMsg += getString(R.string.promise_child_msg);
        }

        Toast.makeText(this, resultMsg, Toast.LENGTH_SHORT).show();

        displayFinalThanksContainer();
    }

    public void quitApp(View view){
        finish();
    }
}
