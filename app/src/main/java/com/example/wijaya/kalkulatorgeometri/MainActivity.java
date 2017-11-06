package com.example.wijaya.kalkulatorgeometri;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import static java.lang.Math.E;
import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnhitung(View view) {
        Spinner bangun=(Spinner) findViewById(R.id.spinner);
        EditText inp1 = (EditText) findViewById(R.id.input1);
        EditText inp2 = (EditText) findViewById(R.id.input2);
        TextView luas = (TextView) findViewById(R.id.hasilL);
        TextView kel = (TextView) findViewById(R.id.hasilK);


        String angka1=inp1.getText().toString();
        String angka2=inp2.getText().toString();
        int i1=Integer.parseInt(angka1);
        int i2=Integer.parseInt(angka2);

        if(bangun.getSelectedItem().toString().equals("Persegi")) {
            int hasilL=i1*i2;
            String hasilA=String.valueOf(hasilL);
            luas.setText(hasilA);

            int hasilK=(2*i1)+(2*i2);
            String hasilB=String.valueOf(hasilK);
            kel.setText(hasilB);
        }

        else if (bangun.getSelectedItem().toString().equals("Lingkaran")){
            double pi = Math.PI;


            double hasilL= pi*(i1*i1);
            String hasilA=String.valueOf(hasilL);
            luas.setText(hasilA);

            double hasilK= pi*(2*i1);
            String hasilB=String.valueOf(hasilK);
            kel.setText(hasilB);
        }

        else if (bangun.getSelectedItem().toString().equals("Segitiga")){
            double hasilL= (i1*i2)/2;
            String hasilA=String.valueOf(hasilL);
            luas.setText(hasilA);

            double sqrt = (float) Math.sqrt((i1*i1)+(i2*i2));
            double hasilK= i1+i2+sqrt;
            String hasilB=String.valueOf(hasilK);
            kel.setText(hasilB);



        }

    }
}
