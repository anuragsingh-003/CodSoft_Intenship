package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    TextView textView1, textView2;
    MaterialButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btndot, btnequal, btnmulltiply, btndivide, btnadd, btnminus, btnAC, btnC, btnopen, btnclose;
    String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView2 = findViewById(R.id.text_view_result);
        textView1 = findViewById(R.id.text_view_solution);
        btn0 = findViewById(R.id.btn_zero);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        btnequal = findViewById(R.id.btn_equal);
        btndot = findViewById(R.id.btn_dot);
        btnmulltiply = findViewById(R.id.btn_multiply);
        btndivide = findViewById(R.id.btn_divide);
        btnadd = findViewById(R.id.btn_add);
        btnminus = findViewById(R.id.btn_minus);
        btnAC = findViewById(R.id.btn_AC);
        btnC = findViewById(R.id.btn_C);
        btnopen = findViewById(R.id.btn_open_bracket);
        btnclose = findViewById(R.id.btn_close_bracket);


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = textView1.getText().toString();
                textView1.setText(data + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = textView1.getText().toString();
                textView1.setText(data + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = textView1.getText().toString();
                textView1.setText(data + "2");
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = textView1.getText().toString();
                textView1.setText(data + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = textView1.getText().toString();
                textView1.setText(data + "4");
            }
        } );

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = textView1.getText().toString();
                textView1.setText(data + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = textView1.getText().toString();
                textView1.setText(data + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = textView1.getText().toString();
                textView1.setText(data + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = textView1.getText().toString();
                textView1.setText(data + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = textView1.getText().toString();
                textView1.setText(data + "9");
            }
        });

        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText("");
                textView2.setText("");
            }
        });

        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = textView1.getText().toString();
                textView1.setText(data + ".");
            }
        });

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = textView1.getText().toString();
                textView1.setText(data + "+");
            }
        });

        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = textView1.getText().toString();
                textView1.setText(data + "-");
            }
        });


        btnmulltiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = textView1.getText().toString();
                textView1.setText(data + "*");
            }
        });
        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = textView1.getText().toString();
                textView1.setText(data + "/");
            }
        });
        btnopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = textView1.getText().toString();
                textView1.setText(data + "(");
            }
        });
        btnclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = textView1.getText().toString();
                textView1.setText(data + ")");
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = data.substring(0,data.length()-1);
                textView1.setText(data);
            }
        });


        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = textView1.getText().toString();
                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);

                String finalResult = "";

                Scriptable scriptable = rhino.initStandardObjects();
                finalResult = rhino.evaluateString(scriptable, data, "Javsscript", 1, null).toString();

                textView2.setText(finalResult);

            }
        });

    }
}

