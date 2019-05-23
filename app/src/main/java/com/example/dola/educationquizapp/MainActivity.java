package com.example.dola.educationquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private int totalQuiz = 13;
    private int currentQiuz = 0;

    private TextView CurrentQuizTextView, TotalQuizTextView ;
    private EditText nameEdiText, surnameEditText;
    private String name, surname;
    private String[] responses = new String[13];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEdiText = findViewById(R.id.name_edit);

        surnameEditText = findViewById(R.id.surname_edit);

        TotalQuizTextView = findViewById(R.id.total_quiz);
        CurrentQuizTextView = findViewById(R.id.current_quiz);


        LinearLayout statusContainer = findViewById(R.id.status_container);

        statusContainer.setVisibility(View.GONE);
        hideAllQuizContainer();
    }


    /**
     * Update the counter of the actual quiz
     */
    void updateCurrentQuizStatus(){
        TotalQuizTextView.setText("" + totalQuiz);
        CurrentQuizTextView.setText("" + ++currentQiuz);
    }


    /**
     *  This method verify that tha user give it firstname and lastname
     *  And then start the quiz page to allow the user to start.
     * @param view
     */
    public void startQuiz(View view)
    {
        name = nameEdiText.getText().toString();
        surname = surnameEditText.getText().toString();
        if (name.isEmpty() || surname.isEmpty()){
            Toast.makeText(this, "Please give us your firstname and lastname", Toast.LENGTH_LONG).show();
            return;
        }

        LinearLayout welcome_container = findViewById(R.id.welcome_container);
        welcome_container.setVisibility(View.GONE);
        LinearLayout startbtn_container = findViewById(R.id.quizapp_start_screen);
        startbtn_container.setVisibility(View.GONE);

        displayNextQuiz();
        LinearLayout statusContainer = findViewById(R.id.status_container);
        statusContainer.setVisibility(View.VISIBLE);

        LinearLayout finalContainer = findViewById(R.id.final_container);
        finalContainer.setVisibility(View.GONE);
    }

    /**
     *  This method display the next quiz
     */
    void displayNextQuiz(){
        LinearLayout quizContainer;

        hideAllQuizContainer();
        switch (currentQiuz){
            case 0:
                quizContainer = findViewById(R.id.question_1);
                quizContainer.setVisibility(View.VISIBLE);
                break;

            case 1:
                quizContainer = findViewById(R.id.question_2);
                quizContainer.setVisibility(View.VISIBLE);
                break;

            case 2:
                quizContainer = findViewById(R.id.question_3);
                quizContainer.setVisibility(View.VISIBLE);
                break;

            case 3:
                quizContainer = findViewById(R.id.question_4);
                quizContainer.setVisibility(View.VISIBLE);
                break;

            case 4:
                quizContainer = findViewById(R.id.question_5);
                quizContainer.setVisibility(View.VISIBLE);
                break;
            case 5:
                quizContainer = findViewById(R.id.question_6);
                quizContainer.setVisibility(View.VISIBLE);
                break;

            case 6:
                quizContainer = findViewById(R.id.question_7);
                quizContainer.setVisibility(View.VISIBLE);
                break;
            case 7:
                quizContainer = findViewById(R.id.question_8);
                quizContainer.setVisibility(View.VISIBLE);
                break;

            case 8:
                quizContainer = findViewById(R.id.question_9);
                quizContainer.setVisibility(View.VISIBLE);
                break;
            case 9:
                quizContainer = findViewById(R.id.question_10);
                quizContainer.setVisibility(View.VISIBLE);
                break;

            case 10:
                quizContainer = findViewById(R.id.question_11);
                quizContainer.setVisibility(View.VISIBLE);
                break;
            case 11:
                quizContainer = findViewById(R.id.question_12);
                quizContainer.setVisibility(View.VISIBLE);
                break;

            case 12:
                quizContainer = findViewById(R.id.question_13);
                quizContainer.setVisibility(View.VISIBLE);
                break;
            default:
                break;
        }
        updateCurrentQuizStatus();
    }



    /**
     * Hide all unecessary elements
     *
     * */
    private void hideAllQuizContainer()
    {
        LinearLayout quiz1Container = findViewById(R.id.question_1);
        LinearLayout quiz2Container = findViewById(R.id.question_2);
        LinearLayout quiz3Container = findViewById(R.id.question_3);
        LinearLayout quiz4Container = findViewById(R.id.question_4);
        LinearLayout quiz5Container = findViewById(R.id.question_5);
        LinearLayout quiz6Container = findViewById(R.id.question_6);
        LinearLayout quiz7Container = findViewById(R.id.question_7);
        LinearLayout quiz8Container = findViewById(R.id.question_8);
        LinearLayout quiz9Container = findViewById(R.id.question_9);
        LinearLayout quiz10Container = findViewById(R.id.question_10);
        LinearLayout quiz11Container = findViewById(R.id.question_11);
        LinearLayout quiz12Container = findViewById(R.id.question_12);
        LinearLayout quiz13Container = findViewById(R.id.question_13);


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
    }

    /**
     * Hide Counter container
     */
    void hideCounterContainer()
    {
        LinearLayout statusContainer = findViewById(R.id.status_container);
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
        username.setText(name + " " + surname);

        currentQiuz = 0;
    }

    /*
     Catch each quiz answer
     */

    public void quest1Answer(View view)
    {
        if (view.getId() == R.id.quest1_answer_a_container){
            responses[0] = getResources().getString(R.string.quest_1_a);

        } else if (view.getId() == R.id.quest1_answer_b_container){
            responses[0] = getResources().getString(R.string.quest_1_b);

        }else if (view.getId() == R.id.quest1_answer_c_container){
            responses[0] = getResources().getString(R.string.quest_1_c);

        }else if (view.getId() == R.id.quest1_answer_d_container){
            responses[0] = getResources().getString(R.string.quest_1_d);
        }
        displayNextQuiz();

    }

    public void quest2Answer(View view)
    {
        if (view.getId() == R.id.quest2_answer_a_container){
            responses[1] = getResources().getString(R.string.quest_2_a);

        } else if (view.getId() == R.id.quest2_answer_b_container){
            responses[1] = getResources().getString(R.string.quest_2_b);

        }else if (view.getId() == R.id.quest2_answer_c_container){
            responses[1] = getResources().getString(R.string.quest_2_c);

        }else if (view.getId() == R.id.quest2_answer_d_container){
            responses[1] = getResources().getString(R.string.quest_2_d);

        }
        displayNextQuiz();

    }

    public void quest3Answer(View view)
    {
        if (view.getId() == R.id.quest3_answer_a_container){
            responses[2] = getResources().getString(R.string.quest_3_a);

        } else if (view.getId() == R.id.quest3_answer_b_container){
            responses[2] = getResources().getString(R.string.quest_3_b);

        }else if (view.getId() == R.id.quest3_answer_c_container){
            responses[2] = getResources().getString(R.string.quest_3_c);

        }else if (view.getId() == R.id.quest3_answer_d_container){
            responses[2] = getResources().getString(R.string.quest_3_d);
        }
        displayNextQuiz();
    }


    public void quest4Answer(View view)
    {
        if (view.getId() == R.id.quest4_answer_a_container){
            responses[3] = getResources().getString(R.string.quest_4_a);

        } else if (view.getId() == R.id.quest4_answer_b_container){
            responses[3] = getResources().getString(R.string.quest_4_b);

        }else if (view.getId() == R.id.quest4_answer_c_container){
            responses[3] = getResources().getString(R.string.quest_4_c);

        }else if (view.getId() == R.id.quest4_answer_d_container){
            responses[3] = getResources().getString(R.string.quest_4_d);
        }
        displayNextQuiz();

    }


    public void quest5Answer(View view)
    {
        if (view.getId() == R.id.quest5_answer_a_container){
            responses[4] = getResources().getString(R.string.quest_5_a);
        } else if (view.getId() == R.id.quest5_answer_b_container){
            responses[4] = getResources().getString(R.string.quest_5_b);

        }else if (view.getId() == R.id.quest5_answer_c_container){
            responses[4] = getResources().getString(R.string.quest_5_c);

        }else if (view.getId() == R.id.quest5_answer_d_container){
            responses[4] = getResources().getString(R.string.quest_5_d);

        }else if (view.getId() == R.id.quest5_answer_e_container){
            responses[4] = getResources().getString(R.string.quest_5_e);

        }
        displayNextQuiz();

    }


    public void quest6Answer(View view)
    {
        if (view.getId() == R.id.quest6_answer_a_container){
            responses[5] = getResources().getString(R.string.quest_6_a);

        } else if (view.getId() == R.id.quest6_answer_b_container){
            responses[5] = getResources().getString(R.string.quest_6_b);

        }else if (view.getId() == R.id.quest6_answer_c_container){
            responses[5] = getResources().getString(R.string.quest_6_c);

        }else if (view.getId() == R.id.quest6_answer_d_container){
            responses[5] = getResources().getString(R.string.quest_6_d);

        }
        displayNextQuiz();

    }


    public void quest7Answer(View view)
    {
        if (view.getId() == R.id.quest7_answer_a_container){
            responses[6] = getResources().getString(R.string.quest_7_a);

        } else if (view.getId() == R.id.quest7_answer_b_container){
            responses[6] = getResources().getString(R.string.quest_7_b);

        }else if (view.getId() == R.id.quest7_answer_c_container){
            responses[6] = getResources().getString(R.string.quest_7_c);

        }else if (view.getId() == R.id.quest7_answer_d_container){
            responses[6] = getResources().getString(R.string.quest_7_d);

        }

        displayNextQuiz();

    }


    public void quest8Answer(View view)
    {
        if (view.getId() == R.id.quest8_answer_a_container){
            responses[7] = getResources().getString(R.string.quest_8_a);

        } else if (view.getId() == R.id.quest8_answer_b_container){
            responses[7] = getResources().getString(R.string.quest_8_b);

        }else if (view.getId() == R.id.quest8_answer_c_container){
            responses[7] = getResources().getString(R.string.quest_8_c);

        }else if (view.getId() == R.id.quest8_answer_d_container){
            responses[7] = getResources().getString(R.string.quest_8_d);

        }
        displayNextQuiz();

    }


    public void quest9Answer(View view)
    {
        if (view.getId() == R.id.quest9_answer_a_container){
            responses[8] = getResources().getString(R.string.quest_9_a);

        } else if (view.getId() == R.id.quest9_answer_b_container){
            responses[8] = getResources().getString(R.string.quest_9_b);

        }else if (view.getId() == R.id.quest9_answer_c_container){
            responses[8] = getResources().getString(R.string.quest_9_c);

        }else if (view.getId() == R.id.quest9_answer_d_container){
            responses[8] = getResources().getString(R.string.quest_9_d);

        }
        displayNextQuiz();
    }


    public void quest10Answer(View view)
    {
        if (view.getId() == R.id.quest10_answer_a_container){
            responses[9] = getResources().getString(R.string.quest_10_a);

        } else if (view.getId() == R.id.quest10_answer_b_container){
            responses[9] = getResources().getString(R.string.quest_10_b);

        }else if (view.getId() == R.id.quest10_answer_c_container){
            responses[9] = getResources().getString(R.string.quest_10_c);

        }else if (view.getId() == R.id.quest10_answer_d_container){
            responses[9] = getResources().getString(R.string.quest_10_d);

        }
        displayNextQuiz();

    }


    public void quest11Answer(View view)
    {
        if (view.getId() == R.id.quest11_answer_a_container){
            responses[10] = getResources().getString(R.string.quest_11_a);

        } else if (view.getId() == R.id.quest11_answer_b_container){
            responses[10] = getResources().getString(R.string.quest_11_b);

        }else if (view.getId() == R.id.quest11_answer_c_container){
            responses[10] = getResources().getString(R.string.quest_11_c);

        }else if (view.getId() == R.id.quest11_answer_d_container){
            responses[10] = getResources().getString(R.string.quest_11_d);

        }
        displayNextQuiz();

    }


    public void quest12Answer(View view)
    {
        if (view.getId() == R.id.quest12_answer_a_container){
            responses[11] = getResources().getString(R.string.quest_12_a);

        } else if (view.getId() == R.id.quest12_answer_b_container){
            responses[11] = getResources().getString(R.string.quest_12_b);

        }else if (view.getId() == R.id.quest12_answer_c_container){
            responses[11] = getResources().getString(R.string.quest_12_c);

        }else if (view.getId() == R.id.quest12_answer_d_container){
            responses[11] = getResources().getString(R.string.quest_12_d);

        }else if (view.getId() == R.id.quest12_answer_e_container){
            responses[11] = getResources().getString(R.string.quest_12_e);

        }
        displayNextQuiz();

    }


    public void quest13Answer(View view)
    {
        if (view.getId() == R.id.quest13_answer_a_container){
            responses[12] = getResources().getString(R.string.quest_13_a);

        } else if (view.getId() == R.id.quest13_answer_b_container){
            responses[12] = getResources().getString(R.string.quest_13_b);

        }else if (view.getId() == R.id.quest13_answer_c_container){
            responses[12] = getResources().getString(R.string.quest_13_b);

        }else if (view.getId() == R.id.quest13_answer_d_container){
            responses[12] = getResources().getString(R.string.quest_13_d);

        }

        displayFinalThanksContainer();
    }





}
