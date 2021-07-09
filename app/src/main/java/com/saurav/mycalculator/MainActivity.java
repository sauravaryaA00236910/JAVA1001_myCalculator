package com.saurav.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.xml.sax.InputSource;

import java.io.CharArrayReader;

import javax.xml.namespace.QName;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener{

    private float resultTV;
    private float firstValue;
    private float secondValue;
    private String equationTV;
    private Button btnNum0;
    private Button btnNum1;
    private Button btnNum2;
    private Button btnNum3;
    private Button btnNum4;
    private Button btnNum5;
    private Button btnNum6;
    private Button btnNum7;
    private Button btnNum8;
    private Button btnNum9;
    private Button btnDecimal;
    private Button btnAdd;
    private Button btnSubtract;
    private Button btnMultiply;
    private Button btnDivide;
    private Button btnEqual;
    private Button btnClear;
    private TextView displayEditTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTV = 0;
        firstValue = 0;
        secondValue = 0;
        equationTV = "";

        btnNum0 = findViewById(R.id.btnNum0);
        btnNum0.setOnClickListener(this);

        btnNum1 = findViewById(R.id.btnNum1);
        btnNum1.setOnClickListener(this);

        btnNum2 = findViewById(R.id.btnNum2);
        btnNum2.setOnClickListener(this);

        btnNum3 = findViewById(R.id.btnNum3);
        btnNum3.setOnClickListener(this);

        btnNum4 = findViewById(R.id.btnNum4);
        btnNum4.setOnClickListener(this);

        btnNum5 = findViewById(R.id.btnNum5);
        btnNum5.setOnClickListener(this);

        btnNum6 = findViewById(R.id.btnNum6);
        btnNum6.setOnClickListener(this);

        btnNum7 = findViewById(R.id.btnNum7);
        btnNum7.setOnClickListener(this);

        btnNum8 = findViewById(R.id.btnNum8);
        btnNum8.setOnClickListener(this);

        btnNum9 = findViewById(R.id.btnNum9);
        btnNum9.setOnClickListener(this);

        btnDecimal = findViewById(R.id.btnDecimal);
        btnDecimal.setOnClickListener(this);

        btnAdd = findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(this);

        btnSubtract = findViewById(R.id.btnSubtract);
        btnSubtract.setOnClickListener(this);

        btnMultiply = findViewById(R.id.btnMultiply);
        btnMultiply.setOnClickListener(this);

        btnDivide = findViewById(R.id.btnDivide);
        btnDivide.setOnClickListener(this);

        btnEqual = findViewById(R.id.btnEqual);
        btnEqual.setOnClickListener(this);

        btnClear = findViewById(R.id.btnClear);
        btnClear.setOnClickListener(this);

        displayEditTv = findViewById(R.id.displayEditTV);
        displayEditTv.setText(equationTV);

    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btnNum0:
                equationTV += btnNum0.getText().toString();
                displayEditTv.setText(equationTV);
                break;
            case R.id.btnNum1:
                equationTV += btnNum1.getText().toString();
                displayEditTv.setText(equationTV);
                break;
            case R.id.btnNum2:
                equationTV += btnNum2.getText().toString();
                displayEditTv.setText(equationTV);
                break;
            case R.id.btnNum3:
                equationTV += btnNum3.getText().toString();
                displayEditTv.setText(equationTV);
                break;
            case R.id.btnNum4:
                equationTV += btnNum4.getText().toString();
                displayEditTv.setText(equationTV);
                break;
            case R.id.btnNum5:
                equationTV += btnNum5.getText().toString();
                displayEditTv.setText(equationTV);
                break;
            case R.id.btnNum6:
                equationTV += btnNum6.getText().toString();
                displayEditTv.setText(equationTV);
                break;
            case R.id.btnNum7:
                equationTV += btnNum7.getText().toString();
                displayEditTv.setText(equationTV);
                break;
            case R.id.btnNum8:
                equationTV += btnNum8.getText().toString();
                displayEditTv.setText(equationTV);
                break;
            case R.id.btnNum9:
                equationTV += btnNum9.getText().toString();
                displayEditTv.setText(equationTV);
                break;
            case R.id.btnDecimal:
                equationTV += btnDecimal.getText().toString();
                displayEditTv.setText(equationTV);
                break;
            case R.id.btnAdd:
                equationTV += btnAdd.getText().toString();
                displayEditTv.setText(equationTV);
                break;
            case R.id.btnSubtract:
                equationTV += btnSubtract.getText().toString();
                displayEditTv.setText(equationTV);
                break;
            case R.id.btnMultiply:
                equationTV += btnMultiply.getText().toString();
                displayEditTv.setText(equationTV);
                break;
            case R.id.btnDivide:
                equationTV += btnDivide.getText().toString();
                displayEditTv.setText(equationTV);
                break;
            case R.id.btnEqual:
                try{
                    for(int i = 0; i<equationTV.length(); i++){
                        switch (equationTV.charAt(i)){
                            case '+':
                                firstValue = Float.parseFloat(equationTV.substring(0, i));
                                secondValue = Float.parseFloat(equationTV.substring(i+1, equationTV.length()));
                                resultTV = firstValue + secondValue;
                                break;
                            case '-':
                                firstValue = Float.parseFloat(equationTV.substring(0, i));
                                secondValue = Float.parseFloat(equationTV.substring(i+1, equationTV.length()));
                                resultTV = firstValue - secondValue;
                                break;
                            case '*':
                                firstValue = Float.parseFloat(equationTV.substring(0, i));
                                secondValue = Float.parseFloat(equationTV.substring(i+1, equationTV.length()));
                                resultTV = firstValue * secondValue;
                                break;
                            case '/':
                                firstValue = Float.parseFloat(equationTV.substring(0, i));
                                secondValue = Float.parseFloat(equationTV.substring(i+1, equationTV.length()));
                                resultTV = firstValue / secondValue;
                                break;
                        }
                    }
                    displayEditTv.setText(Float.toString(resultTV));
                    equationTV = Float.toString(resultTV);
                }
                catch(Exception e){
                    Log.e("Error", e.getMessage());
                    Toast.makeText(this, "Button doesn't work", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btnClear:
                equationTV = "";
                displayEditTv.setText("");
                break;
            default:
                Toast.makeText(this, "View not implemented", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}