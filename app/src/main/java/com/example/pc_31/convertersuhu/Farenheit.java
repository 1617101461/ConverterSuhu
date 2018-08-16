package com.example.pc_31.convertersuhu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Farenheit extends AppCompatActivity {
    EditText celcius,kelvin,farenheit,reamur; //Deklarasi variable
    Button btn_konversi,btn_clear; //deklarasi varaibel
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farenheit);

        celcius = (EditText)findViewById(R.id.edtxt_celcius);
        kelvin = (EditText)findViewById(R.id.edtxt_kelvin);
        farenheit = (EditText)findViewById(R.id.edtxt_farenheit);
        reamur = (EditText)findViewById(R.id.edtxt_reamur);
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
            int nfarenheit = Integer.parseInt(farenheit.getText().toString());
            double nkelvin = (nfarenheit-32)*0.5555555556+273;
            double ncelcius = (nfarenheit-32)*0.5555555555;
            double nreamur = (nfarenheit-32)*0.4444444444;
            kelvin.setText(String.valueOf(nkelvin)+("°K"));
            celcius.setText(String.valueOf(ncelcius)+("°C"));
            reamur.setText(String.valueOf(nreamur)+("°R"));

        }catch (Exception e){

            e.printStackTrace();
        }
    }
}
