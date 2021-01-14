package ca.dal.cs.csci3130.a1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // take value of button
        Button square_button = (Button)findViewById(R.id.squareButton);
        square_button.setOnClickListener(this);
    }

    public void onClick(View v) {
        // take number from the user
        EditText number = (EditText)findViewById(R.id.numberEditField);

        if (number.getText().length() !=0) {
            //change the value into integer and then sqaure of that value and then shows on the alert box
            int num = Integer.parseInt(number.getText().toString());
            int result = (int) Math.pow(num, 2);

            //alert square box that shows the answer
            AlertDialog.Builder alert_answer = new AlertDialog.Builder(this);
            // change the integer value into string value
            alert_answer.setMessage("Answer is --> " + String.valueOf(result));
            alert_answer.setPositiveButton("ok", null);
            alert_answer.create();
            alert_answer.show();
        }
        else {
            //alert square box that shows the answer
            AlertDialog.Builder alert_answer = new AlertDialog.Builder(this);
            // change the integer value into string value
            alert_answer.setMessage("Please Enter Integer Number");
            alert_answer.setPositiveButton("ok", null);
            alert_answer.create();
            alert_answer.show();
        }
    }
}