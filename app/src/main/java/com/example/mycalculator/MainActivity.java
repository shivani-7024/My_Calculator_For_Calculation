//package com.example.mycalculator;
//
//import androidx.appcompat.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import com.google.android.material.button.MaterialButton;
//import org.mozilla.javascript.*;
//
//public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//
//    TextView textviewResult, textviewSolution;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        textviewResult = findViewById(R.id.textview_result);
//        textviewSolution = findViewById(R.id.textview_solution);
//
//        MaterialButton btn_c = findViewById(R.id.btn_c);
//        MaterialButton btn_0 = findViewById(R.id.btn_0);
//        MaterialButton btn_1 = findViewById(R.id.btn_1);
//        MaterialButton btn_2 = findViewById(R.id.btn_2);
//        MaterialButton btn_3 = findViewById(R.id.btn_3);
//        MaterialButton btn_4 = findViewById(R.id.btn_4);
//        MaterialButton btn_5 = findViewById(R.id.btn_5);
//        MaterialButton btn_6 = findViewById(R.id.btn_6);
//        MaterialButton btn_7 = findViewById(R.id.btn_7);
//        MaterialButton btn_8 = findViewById(R.id.btn_8);
//        MaterialButton btn_9 = findViewById(R.id.btn_9);
//        MaterialButton btn_open_small_blacket = findViewById(R.id.btn_open_small_blacket);
//        MaterialButton btn_close_small_blacket = findViewById(R.id.btn_close_small_blacket);
//        MaterialButton btn_divide = findViewById(R.id.btn_divide);
//        MaterialButton btn_equal = findViewById(R.id.btn_equal_to);
//        MaterialButton btn_mul = findViewById(R.id.btn_multiply);
//        MaterialButton btn_ac = findViewById(R.id.btn_AC);
//        MaterialButton btn_add = findViewById(R.id.btn_add);
//        MaterialButton btn_dot = findViewById(R.id.btn_dot);
//        MaterialButton btn_sub = findViewById(R.id.btn_subtract);
//
//        btn_c.setOnClickListener(this);
//        btn_0.setOnClickListener(this);
//        btn_1.setOnClickListener(this);
//        btn_2.setOnClickListener(this);
//        btn_3.setOnClickListener(this);
//        btn_4.setOnClickListener(this);
//        btn_5.setOnClickListener(this);
//        btn_6.setOnClickListener(this);
//        btn_7.setOnClickListener(this);
//        btn_8.setOnClickListener(this);
//        btn_9.setOnClickListener(this);
//        btn_open_small_blacket.setOnClickListener(this);
//        btn_close_small_blacket.setOnClickListener(this);
//        btn_divide.setOnClickListener(this);
//        btn_equal.setOnClickListener(this);
//        btn_mul.setOnClickListener(this);
//        btn_ac.setOnClickListener(this);
//        btn_add.setOnClickListener(this);
//        btn_dot.setOnClickListener(this);
//        btn_sub.setOnClickListener(this);
//    }
//
//    @Override
//    public void onClick(View view) {
//        MaterialButton button = (MaterialButton) view;
//        String btn_txt = button.getText().toString();
//        String dataToCollect = textviewSolution.getText().toString();
//
//
//        if (btn_txt.equals("AC")) {
//            textviewSolution.setText("");
//            textviewResult.setText("0");
//            dataToCollect = dataToCollect.substring(0, dataToCollect.length() - dataToCollect.length());
//
//            return;
//        }
//
//        if (btn_txt.equals("=")) {
//            textviewSolution.setText(textviewResult.getText());
//            return;
//        }
//        if(btn_txt.equals("C")){
//                dataToCollect = dataToCollect.substring(0, dataToCollect.length() - 1);
//
//        }
//        else{
//            dataToCollect = dataToCollect + btn_txt;
//            textviewSolution.setText(dataToCollect);
//        }
//        String finalresult = getResult(dataToCollect);
//
//    }
//    String getResult(String data) {
//        try{
//            Context context = Context.enter();
//            context.setOptimizationLevel(-1);
//            Scriptable scriptable = context.initSafeStandardObjects();
//            String finalresult =  context.evaluateString(scriptable, data, "Javascript", 1, null).toString();
//
//            if(finalresult.endsWith("0")){
//                finalresult = finalresult.replace(".0", "");
//            }
//            return finalresult;
//        }
//        catch (Exception e){
//            return "Error";
//        }
//    }
//}




package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import org.mozilla.javascript.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textviewResult, textviewSolution;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textviewResult = findViewById(R.id.textview_result);
        textviewSolution = findViewById(R.id.textview_solution);

        MaterialButton btn_c = findViewById(R.id.btn_c);
        MaterialButton btn_0 = findViewById(R.id.btn_0);
        MaterialButton btn_1 = findViewById(R.id.btn_1);
        MaterialButton btn_2 = findViewById(R.id.btn_2);
        MaterialButton btn_3 = findViewById(R.id.btn_3);
        MaterialButton btn_4 = findViewById(R.id.btn_4);
        MaterialButton btn_5 = findViewById(R.id.btn_5);
        MaterialButton btn_6 = findViewById(R.id.btn_6);
        MaterialButton btn_7 = findViewById(R.id.btn_7);
        MaterialButton btn_8 = findViewById(R.id.btn_8);
        MaterialButton btn_9 = findViewById(R.id.btn_9);
        MaterialButton btn_open_small_blacket = findViewById(R.id.btn_open_small_blacket);
        MaterialButton btn_close_small_blacket = findViewById(R.id.btn_close_small_blacket);
        MaterialButton btn_divide = findViewById(R.id.btn_divide);
        MaterialButton btn_equal = findViewById(R.id.btn_equal_to);
        MaterialButton btn_mul = findViewById(R.id.btn_multiply);
        MaterialButton btn_ac = findViewById(R.id.btn_AC);
        MaterialButton btn_add = findViewById(R.id.btn_add);
        MaterialButton btn_dot = findViewById(R.id.btn_dot);
        MaterialButton btn_sub = findViewById(R.id.btn_subtract);

        btn_c.setOnClickListener(this);
        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_open_small_blacket.setOnClickListener(this);
        btn_close_small_blacket.setOnClickListener(this);
        btn_divide.setOnClickListener(this);
        btn_equal.setOnClickListener(this);
        btn_mul.setOnClickListener(this);
        btn_ac.setOnClickListener(this);
        btn_add.setOnClickListener(this);
        btn_dot.setOnClickListener(this);
        btn_sub.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        MaterialButton button = (MaterialButton) view;
        String btn_txt = button.getText().toString();
        String dataToCollect = textviewSolution.getText().toString();

//        if (btn_txt.equals("AC")) {
//            textviewSolution.setText("");
//            textviewResult.setText("0");
//        }

        if (btn_txt.equals("AC")) {
            textviewSolution.setText("");
            textviewResult.setText("0");
            dataToCollect = dataToCollect.substring(0, dataToCollect.length() - dataToCollect.length());
            return;
        }

        if (btn_txt.equals("=")) {
            textviewSolution.setText(textviewResult.getText());
            return;
        }
        if(btn_txt.equals("C")){
            if(dataToCollect.length()>0)
            dataToCollect = dataToCollect.substring(0, dataToCollect.length()-1);
//            else if(dataToCollect.length()>=1){
//                dataToCollect = dataToCollect.substring(0, dataToCollect.length());
//                textviewSolution.setText(dataToCollect);
//            }
//            else{
//                textviewSolution.setText(0);
//                textviewResult.setText(0);
//                Toast.makeText(this, "Null Value", Toast.LENGTH_SHORT).show();
//            }
        }
        else{
            dataToCollect = dataToCollect + btn_txt;
        }

        textviewSolution.setText(dataToCollect);

        String finalresult = getResult(dataToCollect);

        if(!finalresult.equals("Error")){
            textviewResult.setText(finalresult);
        }
    }
    String getResult(String data) {
        try{
            Context context = Context.enter();
            context.setOptimizationLevel(-1);
            Scriptable scriptable = context.initSafeStandardObjects();
            String finalresult =  context.evaluateString(scriptable, data, "Javascript", 1, null).toString();

            if(finalresult.endsWith("0")){
                finalresult = finalresult.replace(".0", "");
            }
            return finalresult;

        }
        catch (Exception e){
            return "Error";
        }
    }
}