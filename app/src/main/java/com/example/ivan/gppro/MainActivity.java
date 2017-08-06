package com.example.ivan.gppro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {
    private Spinner spinner, spinner2;
    private EditText et1, et2, et3;
    private TextView tv3,tv4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        tv3 = (TextView) findViewById(R.id.tv3);


        spinner = (Spinner) findViewById(R.id.spinner);
        String[] opciones = {"Motor 1 al 3", "Motor 4", "Motor 5", "Motor 6"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        spinner.setAdapter(adapter);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        String[] opciones2 = {"Muy Bajo", "Bajo", "Medio", "Alto", "Muy Alto"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones2);
        spinner2.setAdapter(adapter1);

    }


    public void salir(View v) {
    finish();
        System.exit(0);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;


    }

    public void operar(View view) {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        String valor3 = et3.getText().toString();


        double motor1 = 0.400;

        double motor4 = 0.370;
        double motor5 = 0.340;
        double motor6 = 0.320;

        double nivelmuybajo = 0.350;
        double nivelbajo = 0.375;
        double nivelmedio = 0.400;
        double nivelalto = 0.425;
        double nivelmuyalto = 0.455;
        double km;
        int vueltas;
        int pits;
        if(valor1.matches("")) {
            km = 0;


            }


        else {

            km = Double.parseDouble(valor1);

        }

        if(valor2.matches("")) {
            vueltas = 0;

        }
        else {
            vueltas = Integer.parseInt(valor2);
        }
        if(valor3.matches("")){
            pits = 0;

        }
        else {
            pits = Integer.parseInt(valor3);
        }
            String selec = spinner.getSelectedItem().toString();
            String selec2 = spinner2.getSelectedItem().toString();
            //Motor 1 al 3
        Formulas formulas = new Formulas(motor1, motor4, motor5, motor6, nivelmuybajo, nivelbajo, nivelmedio, nivelalto, nivelmuyalto, km, vueltas, pits).invoke();
            double fin = formulas.getFin();
            double fin2 = formulas.getFin2();
            double fin3 = formulas.getFin3();
            double fin4 = formulas.getFin4();
            double fin5 = formulas.getFin5();
            double finmotor4 = formulas.getFinmotor4();
            double fin2motor4 = formulas.getFin2motor4();
            double fin3motor4 = formulas.getFin3motor4();
            double fin4motor4 = formulas.getFin4motor4();
            double fin5motor4 = formulas.getFin5motor4();
            double finmotor5 = formulas.getFinmotor5();
            double fin2motor5 = formulas.getFin2motor5();
            double fin3motor5 = formulas.getFin3motor5();
            double fin4motor5 = formulas.getFin4motor5();
            double fin5motor5 = formulas.getFin5motor5();
            double finmotor6 = formulas.getFinmotor6();
            double fin2motor6 = formulas.getFin2motor6();
            double fin3motor6 = formulas.getFin3motor6();
            double fin4motor6 = formulas.getFin4motor6();
            double fin5motor6 = formulas.getFin5motor6();


            if (selec.equals(("Motor 1 al 3")) && (selec2.equals("Muy Bajo"))) {

                fin=Math.round(fin*100.00)/100.0;

                if(km==0 |pits==0 | vueltas==0)
                    tv3.setText("Datos introducidos incorrectamente");
                else
                // int suma = nro1 + nro2;
                //  String resu = String.valueOf(suma);
                tv3.setText("El combustible es:" + fin);
            } else if (selec.equals(("Motor 1 al 3")) && (selec2.equals("Bajo"))) {
                fin2=Math.round(fin2*100.00)/100.0;
                if(km==0 |pits==0 | vueltas==0)
                    tv3.setText("Datos introducidos incorrectamente");
                else
                tv3.setText("El combustible es: " + fin2);
            } else if (selec.equals(("Motor 1 al 3")) && (selec2.equals("Medio"))) {
                fin3=Math.round(fin3*100.00)/100.0;
                if(km==0 |pits==0 | vueltas==0)
                    tv3.setText("Datos introducidos incorrectamente");
                else
                tv3.setText("El combustible es: " + fin3);

            } else if (selec.equals(("Motor 1 al 3")) && (selec2.equals("Alto"))) {
                fin4=Math.round(fin4*100.00)/100.0;
                if(km==0 |pits==0 | vueltas==0)
                    tv3.setText("Datos introducidos incorrectamente");
                else
                tv3.setText("El combustible es: " + fin4);
            } else if (selec.equals(("Motor 1 al 3")) && (selec2.equals("Muy Alto"))) {
                fin5=Math.round(fin5*100.00)/100.0;
                if(km==0 |pits==0 | vueltas==0)
                    tv3.setText("Datos introducidos incorrectamente");
                else
                tv3.setText("El combustible es: " + fin5);
            }


            if (selec.equals(("Motor 4")) && (selec2.equals("Muy Bajo"))) {
                finmotor4=Math.round(finmotor4*100.00)/100.0;
                if(km==0 |pits==0 | vueltas==0)
                    tv3.setText("Datos introducidos incorrectamente");
                else
                tv3.setText("El combustible  es:" + finmotor4);
            } else if (selec.equals(("Motor 4")) && (selec2.equals("Bajo"))) {
                fin2motor4=Math.round(fin2motor4*100.00)/100.0;
                if(km==0 |pits==0 | vueltas==0)
                    tv3.setText("Datos introducidos incorrectamente");
                else
                tv3.setText("El combustible es:" + fin2motor4);
            } else if (selec.equals(("Motor 4")) && (selec2.equals("Medio"))) {
                fin3motor4=Math.round(fin3motor4*100.00)/100.0;
                if(km==0 |pits==0 | vueltas==0)
                    tv3.setText("Datos introducidos incorrectamente");
                else
                tv3.setText("El combustible es: " + fin3motor4);

            } else if (selec.equals(("Motor 4")) && (selec2.equals("Alto"))) {
                fin4motor4=Math.round(fin4motor4*100.00)/100.0;
                if(km==0 |pits==0 | vueltas==0)
                    tv3.setText("Datos introducidos incorrectamente");
                else
                tv3.setText("El combustible es :" + fin4motor4);
            } else if (selec.equals(("Motor 4")) && (selec2.equals("Muy Alto"))) {
                fin5motor4=Math.round(fin5motor4*100.00)/100.0;
                if(km==0 |pits==0 | vueltas==0)
                    tv3.setText("Datos introducidos incorrectamente");
                else
                tv3.setText("El combustible es: " + fin5motor4);
            }

            if (selec.equals(("Motor 5")) && (selec2.equals("Muy Bajo"))) {

                finmotor5=Math.round(finmotor5*100.00)/100.0;
                // int suma = nro1 + nro2;
                //  String resu = String.valueOf(suma);
                if(km==0 |pits==0 | vueltas==0)
                    tv3.setText("Datos introducidos incorrectamente");
                else
                tv3.setText("El combustible  es:" + finmotor5);
            } else if (selec.equals(("Motor 5")) && (selec2.equals("Bajo"))) {
                fin2motor5=Math.round(fin2motor5*100.00)/100.0;
                if(km==0 |pits==0 | vueltas==0)
                    tv3.setText("Datos introducidos incorrectamente");
                else
                tv3.setText("El combustible es: " + fin2motor5);
            } else if (selec.equals(("Motor 5")) && (selec2.equals("Medio"))) {
                fin3motor5=Math.round(fin3motor5*100.00)/100.0;
                if(km==0 |pits==0 | vueltas==0)
                    tv3.setText("Datos introducidos incorrectamente");
                else
                tv3.setText("El combustible  es: " + fin3motor5);

            } else if (selec.equals(("Motor 5")) && (selec2.equals("Alto"))) {
                fin4motor5=Math.round(fin4motor5*100.00)/100.0;
                if(km==0 |pits==0 | vueltas==0)
                    tv3.setText("Datos introducidos incorrectamente");
                else
                tv3.setText("El combustible  es: " + fin4motor5);
            } else if (selec.equals(("Motor 5")) && (selec2.equals("Muy Alto"))) {
                fin5motor5=Math.round(fin5motor5*100.00)/100.0;
                if(km==0 |pits==0 | vueltas==0)
                    tv3.setText("Datos introducidos incorrectamente");
                else
                tv3.setText("El combustible  es: " + fin5motor5);
            }


            if (selec.equals(("Motor 6")) && (selec2.equals("Muy Bajo"))) {
                finmotor6=Math.round(finmotor6*100.00)/100.0;
                if(km==0 |pits==0 | vueltas==0)
                    tv3.setText("Datos introducidos incorrectamente");
                else
                // int suma = nro1 + nro2;
                //  String resu = String.valueOf(suma);
                tv3.setText("El combustible  es:" + finmotor6);
            } else if (selec.equals(("Motor 6")) && (selec2.equals("Bajo"))) {
                fin2motor6=Math.round(fin2motor6*100.00)/100.0;
                if(km==0 |pits==0 | vueltas==0)
                    tv3.setText("Datos introducidos incorrectamente");
                else
                tv3.setText("El combustible es: " + fin2motor6);
            } else if (selec.equals(("Motor 6")) && (selec2.equals("Medio"))) {
                fin3motor6=Math.round(fin3motor6*100.00)/100.0;
                if(km==0 |pits==0 | vueltas==0)
                    tv3.setText("Datos introducidos incorrectamente");
                else
                tv3.setText("El combustible es: " + fin3motor6);

            } else if (selec.equals(("Motor 6")) && (selec2.equals("Alto"))) {
                fin4motor6=Math.round(fin4motor6*100.00)/100.0;
                if(km==0 |pits==0 | vueltas==0)
                    tv3.setText("Datos introducidos incorrectamente");
                else
                tv3.setText("El combustible es: " + fin4motor6);
            } else if (selec.equals(("Motor 6")) && (selec2.equals("Muy Alto"))) {
                fin5motor6=Math.round(fin5motor6*100.00)/100.0;
                if(km==0 |pits==0 | vueltas==0)
                    tv3.setText("Datos introducidos incorrectamente");
                else
                tv3.setText("El combustible es:" + fin5motor6);
            }
        }

    private class Formulas {
            private double motor1;
            private double motor4;
            private double motor5;
            private double motor6;
            private double nivelmuybajo;
            private double nivelbajo;
            private double nivelmedio;
            private double nivelalto;
            private double nivelmuyalto;
            private double km;
            private int vueltas;
            private int pits;
            private double fin;
            private double fin2;
            private double fin3;
            private double fin4;
            private double fin5;
            private double finmotor4;
            private double fin2motor4;
            private double fin3motor4;
            private double fin4motor4;
            private double fin5motor4;
            private double finmotor5;
            private double fin2motor5;
            private double fin3motor5;
            private double fin4motor5;
            private double fin5motor5;
            private double finmotor6;
            private double fin2motor6;
            private double fin3motor6;
            private double fin4motor6;
            private double fin5motor6;

            public Formulas(double motor1, double motor4, double motor5, double motor6, double nivelmuybajo, double nivelbajo, double nivelmedio, double nivelalto, double nivelmuyalto, double km, int vueltas, int pits) {
                this.motor1 = motor1;
                this.motor4 = motor4;
                this.motor5 = motor5;
                this.motor6 = motor6;
                this.nivelmuybajo = nivelmuybajo;
                this.nivelbajo = nivelbajo;
                this.nivelmedio = nivelmedio;
                this.nivelalto = nivelalto;
                this.nivelmuyalto = nivelmuyalto;
                this.km = km;
                this.vueltas = vueltas;
                this.pits = pits;

            }

            public double getFin() {
                return fin;
            }

            public double getFin2() {
                return fin2;
            }

            public double getFin3() {
                return fin3;
            }

            public double getFin4() {
                return fin4;
            }

            public double getFin5() {
                return fin5;
            }

            public double getFinmotor4() {
                return finmotor4;
            }

            public double getFin2motor4() {
                return fin2motor4;
            }

            public double getFin3motor4() {
                return fin3motor4;
            }

            public double getFin4motor4() {
                return fin4motor4;
            }

            public double getFin5motor4() {
                return fin5motor4;
            }

            public double getFinmotor5() {
                return finmotor5;
            }

            public double getFin2motor5() {
                return fin2motor5;
            }

            public double getFin3motor5() {
                return fin3motor5;
            }

            public double getFin4motor5() {
                return fin4motor5;
            }

            public double getFin5motor5() {
                return fin5motor5;
            }

            public double getFinmotor6() {
                return finmotor6;
            }

            public double getFin2motor6() {
                return fin2motor6;
            }

            public double getFin3motor6() {
                return fin3motor6;
            }

            public double getFin4motor6() {
                return fin4motor6;
            }

            public double getFin5motor6() {
                return fin5motor6;
            }

            public Formulas invoke() {
                fin = (motor1 + nivelmuybajo) * (km) * (vueltas) / (pits);
                fin2 = (motor1 + nivelbajo) * (vueltas) * (km) / (pits);
                fin3 = (motor1 + nivelmedio) * (vueltas) * (km) / (pits);
                fin4 = (motor1 + nivelalto) * (vueltas) * (km) / (pits);
                fin5 = (motor1 + nivelmuyalto) * (vueltas) * (km) / (pits);

                //Motor 4

                finmotor4 = (motor4 + nivelmuybajo) * (vueltas) * (km) / (pits);

                fin2motor4 = (motor4 + nivelbajo) * (vueltas) * (km) / (pits);

                fin3motor4 = (motor4 + nivelmedio) * (vueltas) * (km) / (pits);
                fin4motor4 = (motor4 + nivelalto) * (vueltas) * (km) / (pits);

                fin5motor4 = (motor4 + nivelmuyalto) * (vueltas) * (km) / (pits);

                //motor 5
                finmotor5 = (motor5 + nivelmuybajo) * (vueltas) * (km) / (pits);

                fin2motor5 = (motor5 + nivelbajo) * (vueltas) * (km) / (pits);

                fin3motor5 = (motor5 + nivelmedio) * (vueltas) * (km) / (pits);
                fin4motor5 = (motor5 + nivelalto) * (vueltas) * (km) / (pits);

                fin5motor5 = (motor5 + nivelmuyalto) * (vueltas) * (km) / (pits);

                //motor 6
                finmotor6 = (motor6 + nivelmuybajo) * (vueltas) * (km) / (pits);

                fin2motor6 = (motor6 + nivelbajo) * (vueltas) * (km) / (pits);

                fin3motor6 = (motor6 + nivelmedio) * (vueltas) * (km) / (pits);
                fin4motor6 = (motor6 + nivelalto) * (vueltas) * (km) / (pits);

                fin5motor6 = (motor6 + nivelmuyalto) * (vueltas) * (km) / (pits);
                return this;
            }
        }
    }
