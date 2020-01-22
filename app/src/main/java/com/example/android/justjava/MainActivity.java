package com.example.android.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] sizeCoffee = {"Tall", "Grande", "Venti", "Trenta"};
    int[] basePriceL = new int[]{4, 5, 6, 7}, basePriceE = new int[]{5, 6, 7, 8}, basePriceC = new int[]{4, 5, 6, 7}, basePriceB = new int[]{5, 6, 7, 8}, basePriceM = new int[]{4, 5, 6, 7};
    int[] quantityL = new int[]{0, 0, 0, 0}, quantityE = new int[]{0, 0, 0, 0}, quantityC = new int[]{0, 0, 0, 0}, quantityB = new int[]{0, 0, 0, 0}, quantityM = new int[]{0, 0, 0, 0};

    int[] currentI = new int[]{0, 0, 0, 0, 0};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spin1 = (Spinner) findViewById(R.id.spin1);
        spin1.setOnItemSelectedListener(this);
        Spinner spin2 = (Spinner) findViewById(R.id.spin2);
        spin2.setOnItemSelectedListener(this);
        Spinner spin3 = (Spinner) findViewById(R.id.spin3);
        spin3.setOnItemSelectedListener(this);
        Spinner spin4 = (Spinner) findViewById(R.id.spin4);
        spin4.setOnItemSelectedListener(this);
        Spinner spin5 = (Spinner) findViewById(R.id.spin5);
        spin5.setOnItemSelectedListener(this);

        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, sizeCoffee);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(aa);
        spin1.setSelection(0);
        spin2.setAdapter(aa);
        spin2.setSelection(0);
        spin3.setAdapter(aa);
        spin3.setSelection(0);
        spin4.setAdapter(aa);
        spin4.setSelection(0);
        spin5.setAdapter(aa);
        spin5.setSelection(0);
    }

    public void decL(View view) {
        quantityL[currentI[0]] -= 1;
        if (quantityL[currentI[0]] < 0) {
            quantityL[currentI[0]] = 0;
            Toast.makeText(this, "Quantity cannot be less than zero!", Toast.LENGTH_SHORT).show();
        }
        TextView QL = (TextView) findViewById(R.id.quantity1);
        QL.setText(""+quantityL[currentI[0]]);
    }

    public void decE(View view) {
        quantityE[currentI[1]] -= 1;
        if (quantityE[currentI[1]] < 0) {
            quantityE[currentI[1]] = 0;
            Toast.makeText(this, "Quantity cannot be less than zero!", Toast.LENGTH_SHORT).show();
        }
        TextView QE = (TextView) findViewById(R.id.quantity2);
        QE.setText(""+quantityE[currentI[1]]);
    }

    public void decC(View view) {
        quantityC[currentI[2]] -= 1;
        if (quantityC[currentI[2]] < 0) {
            quantityC[currentI[2]] = 0;
            Toast.makeText(this, "Quantity cannot be less than zero!", Toast.LENGTH_SHORT).show();
        }
        TextView QC = (TextView) findViewById(R.id.quantity3);
        QC.setText(""+quantityC[currentI[2]]);
    }

    public void decB(View view) {
        quantityB[currentI[3]] -= 1;
        if (quantityB[currentI[3]] < 0) {
            quantityB[currentI[3]] = 0;
            Toast.makeText(this, "Quantity cannot be less than zero!", Toast.LENGTH_SHORT).show();
        }
        TextView QB = (TextView) findViewById(R.id.quantity4);
        QB.setText(""+quantityB[currentI[3]]);
    }

    public void decM(View view) {
        quantityM[currentI[4]] -= 1;
        if (quantityM[currentI[4]] < 0) {
            quantityM[currentI[4]] = 0;
            Toast.makeText(this, "Quantity cannot be less than zero!", Toast.LENGTH_SHORT).show();
        }
        TextView QM = (TextView) findViewById(R.id.quantity5);
        QM.setText(""+quantityM[currentI[4]]);
    }

    public void incL(View view) {
        quantityL[currentI[0]] += 1;
        if (quantityL[currentI[0]] > 20) {
            quantityL[currentI[0]] = 20;
            Toast.makeText(this, "Expected quantity of order exceeded!", Toast.LENGTH_SHORT).show();
        }
        TextView QL = (TextView) findViewById(R.id.quantity1);
        QL.setText(""+quantityL[currentI[0]]);
    }

    public void incE(View view) {
        quantityE[currentI[1]] += 1;
        if (quantityE[currentI[1]] > 20) {
            quantityE[currentI[1]] = 20;
            Toast.makeText(this, "Expected quantity of order exceeded!", Toast.LENGTH_SHORT).show();
        }
        TextView QE = (TextView) findViewById(R.id.quantity2);
        QE.setText(""+quantityE[currentI[1]]);
    }

    public void incC(View view) {
        quantityC[currentI[2]] += 1;
        if (quantityC[currentI[2]] > 20) {
            quantityC[currentI[2]] = 20;
            Toast.makeText(this, "Expected quantity of order exceeded!", Toast.LENGTH_SHORT).show();
        }
        TextView QC = (TextView) findViewById(R.id.quantity3);
        QC.setText(""+quantityC[currentI[2]]);
    }

    public void incB(View view) {
        quantityB[currentI[3]] += 1;
        if (quantityB[currentI[3]] > 20) {
            quantityB[currentI[3]] = 20;
            Toast.makeText(this, "Expected quantity of order exceeded!", Toast.LENGTH_SHORT).show();
        }
        TextView QB = (TextView) findViewById(R.id.quantity4);
        QB.setText(""+quantityB[currentI[3]]);
    }

    public void incM(View view) {
        quantityM[currentI[4]] += 1;
        if (quantityM[currentI[4]] > 20) {
            quantityM[currentI[4]] = 20;
            Toast.makeText(this, "Expected quantity of order exceeded!", Toast.LENGTH_SHORT).show();
        }
        TextView QM = (TextView) findViewById(R.id.quantity5);
        QM.setText(""+quantityM[currentI[4]]);
    }


    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        switch (arg0.getId()) {
            case R.id.spin1:
                TextView QL = (TextView) findViewById(R.id.quantity1);
                QL.setText(""+quantityL[position]);
                currentI[0] = position;
            break;
            case R.id.spin2:
                TextView QE = (TextView) findViewById(R.id.quantity2);
                QE.setText(""+quantityE[position]);
                currentI[1] = position;
            break;
            case R.id.spin3:
                TextView QC = (TextView) findViewById(R.id.quantity3);
                QC.setText(""+quantityC[position]);
                currentI[2] = position;
            break;
            case R.id.spin4:
                TextView QB = (TextView) findViewById(R.id.quantity4);
                QB.setText(""+quantityB[position]);
                currentI[3] = position;
            break;
            case R.id.spin5:
                TextView QM = (TextView) findViewById(R.id.quantity5);
                QM.setText(""+quantityM[position]);
                currentI[4] = position;
            break;
            default:
                Toast.makeText(this,"Error",Toast.LENGTH_LONG).show();
                break;
        }
  }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
    }
}
