package gen21dashboard.com.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import gen21dashboard.com.R;

public class GetStartedActivity extends AppCompatActivity {

    private Button btnSignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);

        inisiasi();

        onClickbtnSignin();
    }

    private void inisiasi() {

        btnSignin = (Button) findViewById(R.id.btn_signin);

    }

    private void onClickbtnSignin() {

        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent gotologin = new Intent(GetStartedActivity.this, LoginActivity.class);
                startActivity(gotologin);
                finish();

            }
        });

    }
}
