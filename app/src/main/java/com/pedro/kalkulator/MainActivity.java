package com.pedro.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText editText1 ,editText2;
    Button hitung;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupView();
        Setuplistener();



    }

    private void setupView(){
        editText1 = findViewById(R.id.nilai1);
        editText2 = findViewById(R.id.nilai2);
        hitung = findViewById(R.id.botton1);
        textView = findViewById(R.id.hasil);
    }

    private void pesan (String message){
        Toast.makeText(getApplicationContext(), message , Toast.LENGTH_SHORT).show();
    }

    private void  Setuplistener(){
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (validate()){
                    int value1 = Integer.parseInt(editText1.getText().toString());
                    int value2 = Integer.parseInt(editText2.getText().toString());

                    textView.setText(
                            nilai(value1 , value2)
                    );
                }else {
                    pesan("Mohon Inpukan Nilai Dengan Benar");
                }
                }


        });
    }

    private Boolean validate(){

        if (editText1.getText().toString().equals("") || editText1.getText() == null){
            return false;
        }

        else if (editText2.getText().toString().equals("") || editText2.getText() == null){
            return false;
        }

        return true;
    }


    private String nilai (int value1 , int value2){
    int nilai = value1 + value2;
    return String.valueOf(nilai);
    }



//tutup Akhir
}