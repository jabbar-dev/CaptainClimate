package com.example.captainclimate;

import static com.android.volley.Request.Method.GET;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = "LOG MSG";
    RequestQueue requestQueue;
      TextView uname;
      TextView pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        uname =  (TextView) findViewById(R.id.txtUsername);
        pass = (TextView) findViewById(R.id.txtPassword);
    }

    public void loginEvent(View view) {

//        final TextView textView = (TextView) findViewById(R.id.registerLabel);
    show();




    }
    JSONObject jsonObject;
    JSONArray array;

    public void show()
    {
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://captainclimate.herokuapp.com/api/captains";
        StringRequest stringRequest = new StringRequest(GET, url, new Response.Listener() {
            @Override
            public synchronized void onResponse(Object response)
            {
                try {
                    jsonObject = new JSONObject(response.toString());
                    array = jsonObject.getJSONArray("captains");
                    for (int i = 0; i < array.length(); i++) {
                        JSONObject objects = array.getJSONObject(i);

                        if((objects.get("username").equals(uname.getText().toString()))&&
                        (objects.get("password").equals(pass.getText().toString())))
                        {
                            Toast.makeText(LoginActivity.this, "Logged In", Toast.LENGTH_SHORT).show();
                           // Log.d(TAG, "onResponse: "+"Validated");
                            break;
                        }


                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                }
//                Log.d(TAG, "onResponse: " + response.toString());
//                 data[0] = response.toString();
//                Log.d(TAG, "onResponse: "+data[0]);;
            }
        }, new Response.ErrorListener() {
            @Override
            public synchronized void onErrorResponse(VolleyError error) {
            }
        });

// Add the request to the RequestQueue.
        queue.add(stringRequest);

    }

}