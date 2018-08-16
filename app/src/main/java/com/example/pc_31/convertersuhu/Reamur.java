package com.example.pc_31.convertersuhu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class Reamur extends AppCompatActivity {
    EditText celcius,kelvin,farenheit,reamur; //Deklarasi variable
    Button btn_konversi,btn_clear; //deklarasi varaibel
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reamur);

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
            int nreamur = Integer.parseInt(reamur.getText().toString());
            double ncelcius = (1.25*nreamur)+273;
            double nkelvin = 1.25*nreamur;
            double nfarenheit = (nreamur*2.25)+32;
            celcius.setText(String.valueOf(ncelcius)+("°C"));
            farenheit.setText(String.valueOf(nfarenheit)+("°F"));
            kelvin.setText(String.valueOf(nkelvin)+("°K"));

        }catch (Exception e){

            e.printStackTrace();
        }
    }
}