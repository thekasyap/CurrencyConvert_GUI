package com.example.pbl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText entamnt;
    Button btnconv;
    TextView convamnt;


    countryitem countryItem;
    String clickedcouname;

    countryitem countryItemto;
    String clickedcounameto;


    private ArrayList<countryitem> countrylist;
    private countryadapter madapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inlistcountry();

        btnconv=findViewById(R.id.button);
        entamnt=findViewById(R.id.amnttxt);
        convamnt=findViewById(R.id.convamnt);

        Spinner spinnerCountries = findViewById(R.id.spcount);
        Spinner spinnerCountriesto = findViewById(R.id.spcount_to);

        madapter= new countryadapter(this,countrylist);
        spinnerCountries.setAdapter(madapter);
        spinnerCountriesto.setAdapter(madapter);

        spinnerCountries.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {

                countryItem = (countryitem) parent.getItemAtPosition(position);
                clickedcouname =countryItem.getCountryname();
                Toast.makeText(MainActivity.this, clickedcouname +" Selected",Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinnerCountriesto.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                countryItemto = (countryitem) parent.getItemAtPosition(position);
                clickedcounameto =countryItemto.getCountryname();
                Toast.makeText(MainActivity.this, clickedcounameto +" Selected",Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        btnconv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double ttlconvamnt ;
                Double amnt =Double.parseDouble(entamnt.getText().toString());


                if(clickedcouname.equals("USA") && clickedcounameto.equals("Pakistan")){
                    ttlconvamnt=amnt *170.15;
                    String tot = String.format("%.2f", ttlconvamnt);
                    convamnt.setText(""+tot);
                }

                if(clickedcouname.equals("USA") && clickedcounameto.equals("India")){
                    ttlconvamnt=amnt *81.59;
                    String tot = String.format("%.2f", ttlconvamnt);
                    convamnt.setText(""+tot);
                }
                if(clickedcouname.equals("USA") && clickedcounameto.equals("China")){
                    ttlconvamnt=amnt *7.25;
                    String tot = String.format("%.2f", ttlconvamnt);
                    convamnt.setText(""+tot);
                }
                if(clickedcouname.equals("USA") && clickedcounameto.equals("Russia")){
                    ttlconvamnt=amnt *61.68;
                    String tot = String.format("%.2f", ttlconvamnt);
                    convamnt.setText(""+tot);
                }
                if(clickedcouname.equals("India") && clickedcounameto.equals("Pakistan")){
                    ttlconvamnt=amnt *2.72;
                    String tot = String.format("%.2f", ttlconvamnt);
                    convamnt.setText(""+tot);
                }
                if(clickedcouname.equals("India") && clickedcounameto.equals("USA")){
                    ttlconvamnt=amnt *0.012;
                    String tot = String.format("%.2f", ttlconvamnt);
                    convamnt.setText(""+tot);
                }
                if(clickedcouname.equals("India") && clickedcounameto.equals("Russia")){
                    ttlconvamnt=amnt *0.75;
                    String tot = String.format("%.2f", ttlconvamnt);
                    convamnt.setText(""+tot);
                }
                if(clickedcouname.equals("India") && clickedcounameto.equals("China")){
                    ttlconvamnt=amnt *0.089;
                    String tot = String.format("%.2f", ttlconvamnt);
                    convamnt.setText(""+tot);
                }

                if(clickedcouname.equals("Pakistan") && clickedcounameto.equals("India")){
                    ttlconvamnt=amnt *0.37;
                    String tot = String.format("%.2f", ttlconvamnt);
                    convamnt.setText(""+tot);
                }
                if(clickedcouname.equals("Pakistan") && clickedcounameto.equals("USA")){
                    ttlconvamnt=amnt *0.0045;
                    String tot = String.format("%.2f", ttlconvamnt);
                    convamnt.setText(""+tot);
                }
                if(clickedcouname.equals("Pakistan") && clickedcounameto.equals("Russia")){
                    ttlconvamnt=amnt *0.28;
                    String tot = String.format("%.2f", ttlconvamnt);
                    convamnt.setText(""+tot);
                }
                if(clickedcouname.equals("Pakistan") && clickedcounameto.equals("China")){
                    ttlconvamnt=amnt *0.033;
                    String tot = String.format("%.2f", ttlconvamnt);
                    convamnt.setText(""+tot);
                }

                if(clickedcouname.equals("Russia") && clickedcounameto.equals("Pakistan")){
                    ttlconvamnt=amnt *3.61;
                    String tot = String.format("%.2f", ttlconvamnt);
                    convamnt.setText(""+tot);
                }
                if(clickedcouname.equals("Russia") && clickedcounameto.equals("USA")){
                    ttlconvamnt=amnt *0.016;
                    String tot = String.format("%.2f", ttlconvamnt);
                    convamnt.setText(""+tot);
                }
                if(clickedcouname.equals("Russia") && clickedcounameto.equals("India")){
                    ttlconvamnt=amnt *1.33;
                    String tot = String.format("%.2f", ttlconvamnt);
                    convamnt.setText(""+tot);
                }
                if(clickedcouname.equals("Russia") && clickedcounameto.equals("China")){
                    ttlconvamnt=amnt *0.12;
                    String tot = String.format("%.2f", ttlconvamnt);
                    convamnt.setText(""+tot);
                }

                if(clickedcouname.equals("China") && clickedcounameto.equals("Pakistan")){
                    ttlconvamnt=amnt *30.64;
                    String tot = String.format("%.2f", ttlconvamnt);
                    convamnt.setText(""+tot);
                }
                if(clickedcouname.equals("China") && clickedcounameto.equals("USA")){
                    ttlconvamnt=amnt *1.14;
                    String tot = String.format("%.2f", ttlconvamnt);
                    convamnt.setText(""+tot);
                }
                if(clickedcouname.equals("China") && clickedcounameto.equals("Russia")){
                    ttlconvamnt=amnt *8.50;
                    String tot = String.format("%.2f", ttlconvamnt);
                    convamnt.setText(""+tot);
                }
                if(clickedcouname.equals("China") && clickedcounameto.equals("India")){
                    ttlconvamnt=amnt *11.27;
                    String tot = String.format("%.2f", ttlconvamnt);
                    convamnt.setText(""+tot);
                }

            }
        });
    }

    private void inlistcountry(){
        countrylist= new ArrayList<>();
        countrylist.add(new countryitem("Pakistan",R.drawable.pak));
        countrylist.add(new countryitem("India",R.drawable.in));
        countrylist.add(new countryitem("China",R.drawable.china));
        countrylist.add(new countryitem("Russia",R.drawable.russ));
        countrylist.add(new countryitem("USA",R.drawable.usa));

    }
}