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

    public int totalQuiz = 13;
    public int currentQiuz = 0;

    TextView CurrentQuizTextView, TotalQuizTextView ;
    EditText nameEdiText, surnameEditText;
    String name, surname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEdiText = findViewById(R.id.name_edit);

        surnameEditText = findViewById(R.id.surname_edit);

        TotalQuizTextView = findViewById(R.id.total_quiz);
        CurrentQuizTextView = findViewById(R.id.current_quiz);


        LinearLayout statusContainer = findViewById(R.id.status_container);

        LinearLayout userContainer = findViewById(R.id.user_container);

        statusContainer.setVisibility(View.GONE);
        userContainer.setVisibility(View.GONE);
        hideAllQuizContainer();
    }


    /**
     * Update the counter of the actual quiz
     */
    void updateCurrentQuizStatus(){
        currentQiuz++;
        TotalQuizTextView.setText("" + totalQuiz);
        CurrentQuizTextView.setText("" + currentQiuz);
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

        displayQuiz1(view);
        LinearLayout statusContainer = findViewById(R.id.status_container);
        statusContainer.setVisibility(View.VISIBLE);

        LinearLayout userContainer = findViewById(R.id.user_container);
        userContainer.setVisibility(View.GONE);


        LinearLayout finalContainer = findViewById(R.id.final_container);
        finalContainer.setVisibility(View.GONE);

        //TextView username = findViewById(R.id.username);
        //username.setText(name + " " + surname);

        updateCurrentQuizStatus();
    }


    /**
     * Display the  quiz 1
     * @param view
     */
    public void displayQuiz1(View view)
    {
        hideAllQuizContainer();
        LinearLayout quiz1Container = findViewById(R.id.question_1);
        quiz1Container.setVisibility(View.VISIBLE);
    }


    /**
     * Display the  quiz 2
     * @param view
     */
    public void displayQuiz2(View view)
    {
        hideAllQuizContainer();
        LinearLayout quiz1Container = findViewById(R.id.question_2);
        quiz1Container.setVisibility(View.VISIBLE);
        updateCurrentQuizStatus();
    }

    /**
     * Display the  quiz 3
     * @param view
     */
    public void displayQuiz3(View view)
    {
        hideAllQuizContainer();
        LinearLayout quiz1Container = findViewById(R.id.question_3);
        quiz1Container.setVisibility(View.VISIBLE);
        updateCurrentQuizStatus();
    }

    /**
     * Display the  quiz 4
     * @param view
     */
    public void displayQuiz4(View view)
    {
        hideAllQuizContainer();
        LinearLayout quiz1Container = findViewById(R.id.question_4);
        quiz1Container.setVisibility(View.VISIBLE);
        updateCurrentQuizStatus();
    }


    /**
     * Display the  quiz 5
     * @param view
     */
    public void displayQuiz5(View view)
    {
        hideAllQuizContainer();
        LinearLayout quiz1Container = findViewById(R.id.question_5);
        quiz1Container.setVisibility(View.VISIBLE);
        updateCurrentQuizStatus();
    }

    /**
     * Display the  quiz 6
     * @param view
     */
    public void displayQuiz6(View view)
    {
        hideAllQuizContainer();
        LinearLayout quiz1Container = findViewById(R.id.question_6);
        quiz1Container.setVisibility(View.VISIBLE);
        updateCurrentQuizStatus();
    }

    /**
     * Display the  quiz 7
     * @param view
     */
    public void displayQuiz7(View view)
    {
        hideAllQuizContainer();
        LinearLayout quiz1Container = findViewById(R.id.question_7);
        quiz1Container.setVisibility(View.VISIBLE);
        updateCurrentQuizStatus();
    }

    /**
     * Display the  quiz 8
     * @param view
     */
    public void displayQuiz8(View view)
    {
        hideAllQuizContainer();
        LinearLayout quiz1Container = findViewById(R.id.question_8);
        quiz1Container.setVisibility(View.VISIBLE);
        updateCurrentQuizStatus();
    }

    /**
     * Display the  quiz 9
     * @param view
     */
    public void displayQuiz9(View view)
    {
        hideAllQuizContainer();
        LinearLayout quiz1Container = findViewById(R.id.question_9);
        quiz1Container.setVisibility(View.VISIBLE);
        updateCurrentQuizStatus();
    }

    /**
     * Display the  quiz 10
     * @param view
     */
    public void displayQuiz10(View view)
    {
        hideAllQuizContainer();
        LinearLayout quiz1Container = findViewById(R.id.question_10);
        quiz1Container.setVisibility(View.VISIBLE);
        updateCurrentQuizStatus();
    }

    /**
     * Display the  quiz 11
     * @param view
     */
    public void displayQuiz11(View view)
    {
        hideAllQuizContainer();
        LinearLayout quiz1Container = findViewById(R.id.question_11);
        quiz1Container.setVisibility(View.VISIBLE);
        updateCurrentQuizStatus();
    }

    /**
     * Display the  quiz 12
     * @param view
     */
    public void displayQuiz12(View view)
    {
        hideAllQuizContainer();
        LinearLayout quiz1Container = findViewById(R.id.question_12);
        quiz1Container.setVisibility(View.VISIBLE);
        updateCurrentQuizStatus();
    }

    /**
     * Display the thirdthen quiz
     * @param view
     */
    public void displayQuiz13(View view)
    {
        hideAllQuizContainer();
        LinearLayout quiz1Container = findViewById(R.id.question_13);
        quiz1Container.setVisibility(View.VISIBLE);
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

        LinearLayout userContainer = findViewById(R.id.user_container);
        userContainer.setVisibility(View.GONE);

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
     Catch each quiz anwser
     */

    public void quest1AnswerA(View view)
    {
        displayQuiz2(view);
    }

    public void quest1AnswerB(View view)
    {
        displayQuiz2(view);
    }

    public void quest1AnswerC(View view)
    {
        displayQuiz2(view);
    }

    public void quest1AnswerD(View view)
    {
        displayQuiz3(view);
    }

    public void quest2AnswerA(View view)
    {
        displayQuiz3(view);
    }

    public void quest2AnswerB(View view)
    {
        displayQuiz3(view);
    }

    public void quest2AnswerC(View view)
    {
        displayQuiz3(view);
    }

    public void quest2AnswerD(View view)
    {
        displayQuiz3(view);
    }

    public void quest3AnswerA(View view)
    {
        displayQuiz4(view);
    }

    public void quest3AnswerB(View view)
    {
        displayQuiz4(view);
    }

    public void quest3AnswerC(View view)
    {
        displayQuiz4(view);
    }

    public void quest3AnswerD(View view)
    {
        displayQuiz4(view);
    }


    public void quest4AnswerA(View view)
    {
        displayQuiz5(view);
    }

    public void quest4AnswerB(View view)
    {
        displayQuiz5(view);
    }

    public void quest4AnswerC(View view)
    {
        displayQuiz5(view);
    }

    public void quest4AnswerD(View view)
    {
        displayQuiz5(view);
    }

    public void quest5AnswerA(View view)
    {
        displayQuiz6(view);
    }

    public void quest5AnswerB(View view)
    {
        displayQuiz6(view);
    }

    public void quest5AnswerC(View view)
    {
        displayQuiz6(view);
    }

    public void quest5AnswerD(View view)
    {
        displayQuiz6(view);
    }

    public void quest5AnswerE(View view)
    {
        displayQuiz6(view);
    }

    public void quest6AnswerA(View view)
    {
        displayQuiz7(view);
    }

    public void quest6AnswerB(View view)
    {
        displayQuiz7(view);
    }

    public void quest6AnswerC(View view)
    {
        displayQuiz7(view);
    }

    public void quest6AnswerD(View view)
    {
        displayQuiz7(view);
    }


    public void quest7AnswerA(View view)
    {
        displayQuiz8(view);
    }

    public void quest7AnswerB(View view)
    {
        displayQuiz8(view);
    }


    public void quest7AnswerC(View view)
    {
        displayQuiz8(view);
    }

    public void quest7AnswerD(View view)
    {
        displayQuiz8(view);
    }

    public void quest8AnswerA(View view)
    {
        displayQuiz9(view);
    }

    public void quest8AnswerB(View view)
    {
        displayQuiz9(view);
    }

    public void quest8AnswerC(View view)
    {
        displayQuiz9(view);
    }

    public void quest8AnswerD(View view)
    {
        displayQuiz9(view);
    }


    public void quest9AnswerA(View view)
    {
        displayQuiz10(view);
    }

    public void quest9AnswerB(View view)
    {
        displayQuiz10(view);
    }

    public void quest9AnswerC(View view)
    {
        displayQuiz10(view);
    }

    public void quest9AnswerD(View view)
    {
        displayQuiz10(view);
    }


    public void quest10AnswerA(View view)
    {
        displayQuiz11(view);
    }

    public void quest10AnswerB(View view)
    {
        displayQuiz11(view);
    }

    public void quest10AnswerC(View view)
    {
        displayQuiz11(view);
    }

    public void quest10AnswerD(View view)
    {
        displayQuiz11(view);
    }

    public void quest11AnswerA(View view)
    {
        displayQuiz12(view);
    }

    public void quest11AnswerB(View view)
    {
        displayQuiz12(view);
    }


    public void quest11AnswerC(View view)
    {
        displayQuiz12(view);
    }

    public void quest11AnswerD(View view)
    {
        displayQuiz12(view);
    }

    public void quest12AnswerA(View view)
    {
        displayQuiz13(view);
    }

    public void quest12AnswerB(View view)
    {
        displayQuiz13(view);
    }

    public void quest12AnswerC(View view)
    {
        displayQuiz13(view);
    }

    public void quest12AnswerD(View view)
    {
        displayQuiz13(view);
    }

    public void quest12AnswerE(View view)
    {
        displayQuiz13(view);
    }

    public void quest13AnswerA(View view)
    {
        displayFinalThanksContainer();
    }

    public void quest13AnswerB(View view)
    {
        displayFinalThanksContainer();
    }

    public void quest13AnswerC(View view)
    {
        displayFinalThanksContainer();
    }

    public void quest13AnswerD(View view)
    {
        displayFinalThanksContainer();
    }

}
