package com.example.cafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int cont= 0;
    int preco =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void mais(View view){
        TextView quantidade = findViewById(R.id.quant);
        cont ++;
        preco = 3 * cont;
        quantidade.setText("" + cont);
        TextView total = findViewById(R.id.total);
        total.setText("Valor total" + preco);

    }
    public void menos(View view){
        TextView quant = findViewById(R.id.quant);
        cont --;
        preco = 3* cont;
        quant.setText("" + cont );
        TextView total = findViewById(R.id.total);
        total.setText("Valor total" + preco );


    }

}
