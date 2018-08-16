package com.example.pc_31.convertersuhu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Celcius extends AppCompatActivity {
    EditText celcius,kelvin,farenheit,reamur; //Deklarasi variable
    Button btn_konversi,btn_clear; //deklarasi varaibel
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celcius);

        celcius = (EditText)findViewById(R.id.edtxt_celcius);
        farenheit = (EditText)findViewById(R.id.edtxt_farenheit);
        reamur = (EditText)findViewById(R.id.edtxt_reamur);
        kelvin = (EditText)findViewById(R.id.edtxt_kelvin);
        btn_konversi = (Button)findViewById(R.id.button);
        btn_clear = (Button)findViewById(R.id.btn_clear);
    }
    public void clearKolom(View view) {
        celcius.setText("");
        farenheit.setText("");
        reamur.setText("");
        kelvin.setText("");

    }
    public void konversisuhu (View view){
        try{
            int ncelcius = Integer.parseInt(celcius.getText().toString());
            double nkelvin = ncelcius+273;
            double nfarenheit = ncelcius*1.8+32;
            double nreamur = 0.8*ncelcius;
            kelvin.setText(String.valueOf(nkelvin)+("°K"));
            farenheit.setText(String.valueOf(nfarenheit)+("°F"));
            reamur.setText(String.valueOf(nreamur)+("°R"));

        }catch (Exception e){

            e.printStackTrace();
        }
    }
    }
