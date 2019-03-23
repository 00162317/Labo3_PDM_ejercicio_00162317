package com.example.mostrardatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import com.example.mostrardatos.utils.AppConstants;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText exportarUsername=(EditText)findViewById(R.id.username),
                exportarPassword=(EditText)findViewById(R.id.password),
                exportarEmail=(EditText)findViewById(R.id.email),
        exportarGenero=(EditText)findViewById(R.id.genero);

        Button btn =(Button) findViewById(R.id.btnSend);


        btn.setOnClickListener(v->{
            Intent intent1 = new Intent(MainActivity.this, Main2Activity.class);
            String nickname = exportarUsername.getText().toString();
            String contra = exportarPassword.getText().toString();
            String correo=exportarEmail.getText().toString();
            String gender=exportarGenero.getText().toString();

            intent1.putExtra(AppConstants.TEXT_KEY,nickname);
            intent1.putExtra(AppConstants.TEXT_KEY_TWO,contra);
            intent1.putExtra(AppConstants.TEXT_KEY_THREE,correo);
            intent1.putExtra(AppConstants.TEXT_KEY_FOUR,gender);

            startActivity(intent1);

        });
    }
}
