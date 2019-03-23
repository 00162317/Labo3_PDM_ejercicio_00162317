package com.example.mostrardatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

import com.example.mostrardatos.utils.AppConstants;

public class Main2Activity extends AppCompatActivity {

    private Button btnShare;

    TextView tvDatos, tvDatosDos, tvDatosTres,tvDatosCuatro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button share = findViewById(R.id.btnShares);
        mostrando();

    }
    private void mostrando(){

        Bundle bundle = getIntent().getExtras();
        String var1, var2, var3, var4;

        var1 = bundle.getString(AppConstants.TEXT_KEY);
        var2 = bundle.getString(AppConstants.TEXT_KEY_TWO);
        var3 = bundle.getString(AppConstants.TEXT_KEY_THREE);
        var4 = bundle.getString(AppConstants.TEXT_KEY_FOUR);

        tvDatos=(TextView)findViewById(R.id.userMostrado);
        tvDatos.setText(var1);

        tvDatosDos=(TextView)findViewById(R.id.passMostrada);
        tvDatosDos.setText(var2+",  "+var3+",  "+var4+",  ");

    }

}
