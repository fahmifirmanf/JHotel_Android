package id.ac.ui.jhotel_android_fahmiff;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;
import com.android.volley.VolleyError;
import org.json.JSONException;
import org.json.JSONObject;
import com.android.volley.Request;

//import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText Fullname = (EditText) findViewById(R.id.inputName);
        final EditText Email = (EditText) findViewById(R.id.inputEmail);
        final EditText Password = (EditText) findViewById(R.id.inputPass);
        final Button regisButton = (Button) findViewById(R.id.buttonRegister);

        regisButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                final String fullname = Fullname.getText().toString();
                final String email = Email.getText().toString();
                final String password = Password.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String> () {
                    @Override
                    public void onResponse(String response) {
                        try{
                            JSONObject jsonResponse = new JSONObject(response);
                            if(jsonResponse!=null) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this);
                                builder.setMessage("Registration Success")
                                        .create()
                                        .show();
                            }
                        } catch (JSONException e) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this);
                            builder.setMessage("Registration Failed.")
                                    .create()
                                    .show();
                        }
                    }
                };
                RegisterRequest registerRequest = new RegisterRequest(fullname,email,password,responseListener);
                RequestQueue queue = Volley.newRequestQueue(RegisterActivity.this);
                queue.add(registerRequest);
            }
        });
    }
}
