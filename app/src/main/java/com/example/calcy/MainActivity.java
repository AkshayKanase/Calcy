package com.example.calcy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edtCalculation;
    private Button btnOne,btnTwo,btnPlus,btnEqual,btnThree;
    private Button btnFour,btnFive,btnMinus,btnSix;
    private Button btnSeven,btnEight,btnNine,btnZero;
    private Button btnClr,btnDivide,btnMulti;
    private String edtAreaString;
    private int result=0;
    int val1,val2;
    private Double divideValue1,divideValue2;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calcy_layout);
        edtCalculation= findViewById(R.id.edtCalcArea);
        btnOne=findViewById(R.id.btnOne);
        btnTwo=findViewById(R.id.btnTwo);
        btnPlus=findViewById(R.id.btnPlus);
        btnEqual=findViewById(R.id.btnEqual);
        btnThree=findViewById(R.id.btnThree);
        btnFour=findViewById(R.id.btnFour);
        btnMinus=findViewById(R.id.btnMinus);
        btnClr=findViewById(R.id.btnClr);
        btnFive=findViewById(R.id.btnFive);
        btnSeven=findViewById(R.id.btnSeven);
        btnSix=findViewById(R.id.btnSix);
        btnEight=findViewById(R.id.btnEight);
        btnNine=findViewById(R.id.btnNine);
        btnZero=findViewById(R.id.btnZero);
        btnMulti=findViewById(R.id.btnMulti);
        btnDivide=findViewById(R.id.btnDivide);

       btnOne.setOnClickListener(new BtnOneClick());
       btnTwo.setOnClickListener(new BtnTwoClick());
       btnPlus.setOnClickListener(new BtnPlusClick());
       btnEqual.setOnClickListener(new BtnEqualClick());
       btnFour.setOnClickListener(new BtnFourClick());
       btnThree.setOnClickListener(new BtnThreeClick());
       btnMinus.setOnClickListener(new BtnMinusClick());
       btnFive.setOnClickListener(new BtnFiveClick());
       btnSix.setOnClickListener(new BtnSixClick());
        btnSeven.setOnClickListener(new BtnSevenClick());
       btnEight.setOnClickListener(new BtnEightClick());
       btnNine.setOnClickListener(new BtnNineClick());
       btnZero.setOnClickListener(new BtnZeroClick());
       btnMulti.setOnClickListener(new BtnMultiClick());
       btnDivide.setOnClickListener(new BtnDivideClick());
       btnClr.setOnClickListener(new BtnClrClick());


    }
    class BtnOneClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
        edtCalculation.setText(edtCalculation.getText().append("1"));


        }
    }

    class BtnTwoClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            edtCalculation.setText(edtCalculation.getText().append("2"));

        }
    }
    class BtnThreeClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            edtCalculation.setText(edtCalculation.getText().append("3"));


        }
    }



    class BtnFourClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            edtCalculation.setText(edtCalculation.getText().append("4"));


        }
    }


    class BtnFiveClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            edtCalculation.setText(edtCalculation.getText().append("5"));

        }
    }
    class BtnSixClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            edtCalculation.setText(edtCalculation.getText().append("6"));

        }
    }
    class BtnSevenClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            edtCalculation.setText(edtCalculation.getText().append("7"));

        }
    }


   class BtnEightClick implements View.OnClickListener{

            @Override
             public void onClick(View view) {
                edtCalculation.setText(edtCalculation.getText().append("8"));

        }
    }
   class BtnNineClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            edtCalculation.setText(edtCalculation.getText().append("9"));

        }
    }
   class BtnZeroClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            edtCalculation.setText(edtCalculation.getText().append("0"));

        }
    }
    class BtnMultiClick implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            val1 = Integer.parseInt(edtCalculation.getText().toString());
            edtCalculation.setText(edtCalculation.getText().append("*"));


        }
    }
    class BtnDivideClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            val1= Integer.parseInt(edtCalculation.getText().toString());
            edtCalculation.setText(edtCalculation.getText().append("/"));


        }

    }
   class BtnPlusClick implements View.OnClickListener{

       @Override
       public void onClick(View view) {
           val1=Integer.parseInt(edtCalculation.getText().toString());
           edtCalculation.setText(edtCalculation.getText().append("+"));


       }

   }
    class BtnMinusClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            val1=Integer.parseInt(edtCalculation.getText().toString());
            edtCalculation.setText(edtCalculation.getText().append("-"));


        }
    }
    class BtnClrClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            edtCalculation.setText("");
            result=0;
            val1=0;
            val2=0;


        }
    }
    class BtnEqualClick implements View.OnClickListener {

            @Override
            public void onClick(View view) {

                edtAreaString = edtCalculation.getText().toString();
                for (int i = 0; i <= edtAreaString.length() - 1; i++) {
                    String secondHalf = "";
                    switch (edtAreaString.charAt(i)) {
                        case '+':
                            secondHalf = edtAreaString.substring(i + 1);
                            val2 = Integer.parseInt(secondHalf);
                            result = val1 + val2;
                            edtCalculation.setText(String.valueOf(result));
                            break;
                        case '-':
                            secondHalf = edtAreaString.substring(i + 1);
                            val2 = Integer.parseInt(secondHalf);
                            result = val1 - val2;
                            edtCalculation.setText(String.valueOf(result));
                            break;
                        case '*':
                            secondHalf = edtAreaString.substring(i + 1);
                            val2 = Integer.parseInt(secondHalf);
                            result = val1 * val2;
                            edtCalculation.setText(String.valueOf(result));
                            break;
                        case '/':
                            secondHalf = edtAreaString.substring(i + 1);
                            val2 = Integer.parseInt(secondHalf);
                            result= val1 / val2;
                            edtCalculation.setText(String.valueOf(result));
                            break;
                    }

                }


            }
        }
    }
