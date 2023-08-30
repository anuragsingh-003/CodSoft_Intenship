package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.DecimalFormat;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormatSymbols;

public class MainActivity extends AppCompatActivity {
    Spinner spinner1,spinner2;
    TextView txtview1,txtview2,txtview3,txtview4,txtview5;
    Button btn1;
    EditText edit1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner1=findViewById(R.id.spinner1);
        spinner2=findViewById(R.id.spinner2);
        txtview1=findViewById(R.id.head);
        txtview2=findViewById(R.id.enteramount);
        edit1=findViewById(R.id.number);
        txtview3=findViewById(R.id.from);
        txtview4=findViewById(R.id.to);
        txtview5=findViewById(R.id.ans);
        btn1=findViewById(R.id.convert);

        String[] from={"USD","IndianRupee"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        spinner1.setAdapter(ad);


        String[] to={" IndianRupee" , "SriLankanRupee", "NepaleseRupee","BangladeshiTaka"};
        ArrayAdapter add = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        spinner2.setAdapter(add);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double calculate;
                Double amount = Double.parseDouble(edit1.getText().toString());

                if(spinner1.getSelectedItem().toString()=="USD" && spinner2.getSelectedItem().toString()=="IndianRupee"){
                    calculate = amount*82.61;
                    txtview5.setText(calculate.toString());

                }
                else if(spinner1.getSelectedItem().toString()=="USD" && spinner2.getSelectedItem().toString()=="SriLankanRupee"){
                    calculate = amount*323.329;
                    txtview5.setText(calculate.toString());
                }
                else if(spinner1.getSelectedItem().toString()=="USD" && spinner2.getSelectedItem().toString()=="NepaleseRupee"){
                    calculate = amount*132.36;
                    txtview5.setText(calculate.toString());

                }

                else if(spinner1.getSelectedItem().toString()=="IndianRupee" && spinner2.getSelectedItem().toString()=="IndianRupee"){
                    calculate = amount*1;
                    txtview5.setText(calculate.toString());

                }
                else if(spinner1.getSelectedItem().toString()=="IndianRupee" && spinner2.getSelectedItem().toString()=="SriLankanRupee"){
                    calculate = amount*3.89;
                    txtview5.setText(calculate.toString());

                }
                else if(spinner1.getSelectedItem().toString()=="IndianRupee" && spinner2.getSelectedItem().toString()=="NepaleseRupee"){
                    calculate = amount*1.60;
                    txtview5.setText(calculate.toString());

                }
                else if(spinner1.getSelectedItem().toString()=="IndianRupee" && spinner2.getSelectedItem().toString()=="BangladeshiTaka"){
                    calculate = amount*1.32;
                    txtview5.setText(calculate.toString());

                }
                else if(spinner1.getSelectedItem().toString()=="USD" && spinner2.getSelectedItem().toString()=="BangladeshiTaka"){
                    calculate = amount*109.40;
                    txtview5.setText(calculate.toString());

                }
                else{
                    Toast.makeText(MainActivity.this, "ERROR", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}