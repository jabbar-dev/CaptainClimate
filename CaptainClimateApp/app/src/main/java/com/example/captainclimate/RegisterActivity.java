package com.example.captainclimate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class RegisterActivity extends AppCompatActivity {

    TextView username;
    TextView name;
    TextView password;
    TextView institution;
    TextView age;
    TextView email;
    TextView repass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().hide();
        username = (TextView) findViewById(R.id.txtUname);
        name = (TextView) findViewById(R.id.txtFullName);
        password = (TextView) findViewById(R.id.textSignUpPass);
        institution = (TextView) findViewById(R.id.textInstitute);
        age = (TextView) findViewById(R.id.txtAge);
        email = (TextView) findViewById(R.id.txtEmail);
        repass = (TextView) findViewById(R.id.txtRePass);

    }


    public void ClickSignUp(View view) {
        String postUrl = "https://captainclimate.herokuapp.com/api/captains";
        RequestQueue requestQueue = Volley.newRequestQueue(this);

        JSONObject postData = new JSONObject();
        try {

            postData.put("email", email.getText().toString());
            postData.put("username", username.getText().toString());
            postData.put("name", name.getText().toString());
            postData.put("password", password.getText().toString());
            postData.put("completedTasks", 0);
            postData.put("institution", institution.getText().toString());
            postData.put("age", 20);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, postUrl, postData, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                email.setText("");
                username.setText("");
                name.setText("");
                password.setText("");
                institution.setText("");
                age.setText("");
                repass.setText("");

                Toast.makeText(RegisterActivity.this, "Registered Successfully Go Back To LogIn", Toast.LENGTH_SHORT).show();

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
                Toast.makeText(RegisterActivity.this, "Not Registered please check Entries", Toast.LENGTH_SHORT).show();

            }

        });

        requestQueue.add(jsonObjectRequest);

    }

    public void goBackClick(View view) {

        Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
        startActivity(intent);
        this.finish();
    }
}