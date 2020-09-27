package com.example.segundacalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

     String operator = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Calc(View view) {
        EditText edt = findViewById(R.id.editText);
        String valor;
        String tag = view.getTag().toString();
        if(tag.equals("1")){
            valor = edt.getText().toString();
            edt.setText(valor + "1");
        }
        else if(tag.equals("2")){
            valor = edt.getText().toString();
            edt.setText(valor + "2");
        }
        else if(tag.equals("3")){
            valor = edt.getText().toString();
            edt.setText(valor + "3");
        }
        else if(tag.equals("4")){
            valor = edt.getText().toString();
            edt.setText(valor + "4");
        }
        else if(tag.equals("5")){
            valor = edt.getText().toString();
            edt.setText(valor + "5");
        }
        else if(tag.equals("6")){
            valor = edt.getText().toString();
            edt.setText(valor + "6");
        }
        else if(tag.equals("7")){
            valor = edt.getText().toString();
            edt.setText(valor + "7");
        }
        else if(tag.equals("8")){
            valor = edt.getText().toString();
            edt.setText(valor + "8");
        }
        else if(tag.equals("9")){
            valor = edt.getText().toString();
            edt.setText(valor + "9");
        }
        else if(tag.equals("0")){
            valor = edt.getText().toString();
            edt.setText(valor + "0");
        }
        else if(tag.equals("+")){
            valor = edt.getText().toString();
            operator = tag;
            edt.setText(valor + "+");
        }
        else if(tag.equals("-")){
            valor = edt.getText().toString();
            operator = tag;
            edt.setText(valor + "-");
        }
        else if(tag.equals("*")){
            valor = edt.getText().toString();
            operator = tag;
            edt.setText(valor + "*");
        }
        else if(tag.equals("/")){
            valor = edt.getText().toString();
            operator = tag;
            edt.setText(valor + "/");
        }
        else if(tag.equals(".")){
            valor = edt.getText().toString();
            edt.setText(valor + ".");
        }
         if(tag.equals("C")){
            edt.setText(null);
        }
         if(tag.equals("back")){
             valor = edt.getText().toString();
             int tam = valor.length();
             String substring = valor.substring(0,tam-1);
             edt.setText(substring);

        }
        else if(tag.equals("=")){
            valor = edt.getText().toString();
            double resp = 0;
            if(operator.equals("+")){
               String[] parte = valor.split("\\+");
               double num1 = Double.parseDouble(parte[0]);
                double num2 = Double.parseDouble(parte[1]);
                resp = num1+num2;
            }
            else if(operator.equals("-")){
                String[] parte = valor.split("\\-");
                double num1 = Double.parseDouble(parte[0]);
                double num2 = Double.parseDouble(parte[1]);
                resp = num1-num2;
            }
            else if(operator.equals("*")){
                String[] parte = valor.split("\\*");
                double num1 = Double.parseDouble(parte[0]);
                double num2 = Double.parseDouble(parte[1]);
                resp = num1*num2;
            }
            else if(operator.equals("/")){
                String[] parte = valor.split("\\/");
                double num1 = Double.parseDouble(parte[0]);
                double num2 = Double.parseDouble(parte[1]);
                resp = num1/num2;
            }

            edt.setText(""+resp);
        }


    }
}