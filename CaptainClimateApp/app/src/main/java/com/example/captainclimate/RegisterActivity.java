package com.example.captainclimate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class RegisterActivity extends AppCompatActivity {

    TextView username = (TextView) findViewById(R.id.txtUname);
    TextView name = (TextView) findViewById(R.id.txtFullName);
    TextView password = (TextView) findViewById(R.id.textSignUpPass);
    TextView institution = (TextView) findViewById(R.id.textInstitute);
    TextView age = (TextView) findViewById(R.id.txtAge);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().hide();
    }


    public void ClickSignUp(View view) {
        String postUrl = "https://captainclimate.herokuapp.com/api/captains";
        RequestQueue requestQueue = Volley.newRequestQueue(this);

        JSONObject postData = new JSONObject();
        try {
            postData.put("username", username.getText().toString());
            postData.put("name", name.getText().toString());
            postData.put("password", password.getText().toString());
            postData.put("completedTasks", 0);
            postData.put("institution", institution.getText().toString());
            postData.put("age", Integer.parseInt(age.getText().toString()));

        } catch (JSONException e) {
            e.printStackTrace();
        }

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, postUrl, postData, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                System.out.println(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });

        requestQueue.add(jsonObjectRequest);

    }

}