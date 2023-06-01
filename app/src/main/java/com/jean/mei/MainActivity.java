package com.jean.mei;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.jean.mei.activities.ClienteActivity;
import com.jean.mei.activities.ProdutoActivity;

public class MainActivity extends AppCompatActivity {

    private CardView cardViewHome, cardViewCliente,  cardViewProduto, cardViewNotas, cardViewVendas, cardViewSair;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardViewCliente = findViewById(R.id.card_cli);
        cardViewCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ClienteActivity.class);
                startActivity(intent);
            }
        });

        cardViewProduto = findViewById(R.id.card_prod);
        cardViewProduto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ProdutoActivity.class));
            }
        });

        cardViewSair = findViewById(R.id.card_sair);
        cardViewSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }
}