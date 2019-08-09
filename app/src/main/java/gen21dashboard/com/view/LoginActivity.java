package gen21dashboard.com.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import gen21dashboard.com.R;

public class LoginActivity extends AppCompatActivity {

    private Button btnSingin2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        inisiasi();

        onClickbtnSingin2();
    }

    private void inisiasi() {

        btnSingin2 = (Button) findViewById(R.id.btn_singin2);

    }


    private void onClickbtnSingin2() {

        btnSingin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent gotoHome = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(gotoHome);
                finish();
            }
        });
    }
}
