package temple.edu.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        final Button saveButton = findViewById(R.id.button);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkUserInput();
            }
        });
    }

    private void checkUserInput()
    {
        final EditText view_input_email = findViewById(R.id.view_input_email);
        String email = view_input_email.getText().toString();

        final EditText view_input_name = findViewById(R.id.view_input_name);
        String name = view_input_name.getText().toString();

        final EditText view_input_password = findViewById(R.id.view_input_password);
        String password = view_input_password.getText().toString();

        final EditText view_input_confirm = findViewById(R.id.view_input_confirm);
        String confirmedPassword = view_input_confirm.getText().toString();

        Toast appMessage = new Toast(this.getApplicationContext());

        if(email.isEmpty() || name.isEmpty()
            || password.isEmpty() || confirmedPassword.isEmpty())
        {
            //Log.d("FormActivity", "Must fill all four fields.");
            appMessage = Toast.makeText(this.getApplicationContext(), "Must fill all four fields", Toast.LENGTH_SHORT);
            appMessage.show();
        }
        else if (!(password.equals(confirmedPassword)))
        {
            //Log.d("FormActivity", "Passwords are mismatched.");
            appMessage = Toast.makeText(this.getApplicationContext(), "Passwords are mismatched.", Toast.LENGTH_SHORT);
            appMessage.show();
        }
        else
        {
            //Log.d("FormActivity", "Welcome, "+name+"!");
            appMessage = Toast.makeText(this.getApplicationContext(), "Welcome, "+name+"!", Toast.LENGTH_LONG);
            appMessage.show();
        }
    }
}