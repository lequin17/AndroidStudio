package com.example.checklist.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;

import com.example.checklist.R;
import com.example.checklist.RecyclerItemClickListener;
import com.example.checklist.adapter.Adapter;
import com.example.checklist.model.Componentes;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Componentes> listaComponentes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        this.CriarComponentes();

        //Configurar Adapter
        Adapter adapter = new Adapter(listaComponentes);


        //Configurar Recycler
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);

        //evento de clique
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(
                getApplicationContext(),
                recyclerView,
                new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {


                    }

                    @Override
                    public void onLongItemClick(View view, int position) {
                        switch (position){

                            case 0: Intent intent = new Intent(getApplicationContext(), HDActivity.class);
                            startActivity(intent);
                            break;

                            case 1: Intent intent1 = new Intent(getApplicationContext(), TelaActivity.class);
                            startActivity(intent1);
                            break;

                            case 2: Intent intent2 = new Intent(getApplicationContext(), WifiActivity.class);
                            startActivity(intent2);
                            break;

                            case 3: Intent intent3 = new Intent(getApplicationContext(), RedeActivity.class);
                            startActivity(intent3);
                            break;

                            case 4: Intent intent4 = new Intent(getApplicationContext(), RamActivity.class);
                            startActivity(intent4);
                            break;

                            case 5: Intent intent5 = new Intent(getApplicationContext(), TecladoActivity.class);
                            startActivity(intent5);
                            break;

                            case 6: Intent intent6 = new Intent(getApplicationContext(), TouchPadActivity.class);
                            startActivity(intent6);
                            break;

                            case 7: Intent intent7 = new Intent(getApplicationContext(), SaidaP2Activity.class);
                            startActivity(intent7);
                            break;

                            case 8: Intent intent8 = new Intent(getApplicationContext(), WebCamActivity.class);
                            startActivity(intent8);
                            break;

                            case 9: Intent intent9 = new Intent(getApplicationContext(), JackActivity.class);
                            startActivity(intent9);
                            break;

                            case 10: Intent intent10 = new Intent(getApplicationContext(), SistemaActivity.class);
                            startActivity(intent10);
                            break;

                            case 11: Intent intent11 = new Intent(getApplicationContext(), AudioActivity.class);
                            startActivity(intent11);
                            break;

                            case 12: Intent intent12 = new Intent(getApplicationContext(), CoolerActivity.class);
                            startActivity(intent12);
                            break;

                            case 13: Intent intent13 = new Intent(getApplicationContext(), TempAmbienteActivity.class);
                            startActivity(intent13);
                            break;

                            case 14: Intent intent14 = new Intent(getApplicationContext(), TempEstresseActivity.class);
                            startActivity(intent14);
                            break;


                        }


                    }

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    }
                }
        ));
    }

    public void CriarComponentes(){

        Componentes componentes = new Componentes("HD", "", false, false);
        listaComponentes.add(componentes);

        componentes = new Componentes("Tela", "", false, false);
        listaComponentes.add(componentes);

        componentes = new Componentes("Wi-fi", "", false, false);
        listaComponentes.add(componentes);

        componentes = new Componentes("Rede", "", false, false);
        listaComponentes.add(componentes);

        componentes = new Componentes("RAM", "", false, false);
        listaComponentes.add(componentes);

        componentes = new Componentes("Teclado", "", false, false);
        listaComponentes.add(componentes);

        componentes = new Componentes("TouchPad", "", false, false);
        listaComponentes.add(componentes);

        componentes = new Componentes("Saída P2", "", false, false);
        listaComponentes.add(componentes);

        componentes = new Componentes("WebCam", "", false, false);
        listaComponentes.add(componentes);

        componentes = new Componentes("Jack", "", false, false);
        listaComponentes.add(componentes);

        componentes = new Componentes("Sistema", "", false, false);
        listaComponentes.add(componentes);

        componentes = new Componentes("Audio", "", false, false);
        listaComponentes.add(componentes);

        componentes = new Componentes("Cooler", "", false, false);
        listaComponentes.add(componentes);

        componentes = new Componentes("Temp. Ambiente", "", false, false);
        listaComponentes.add(componentes);

        componentes = new Componentes("Temp. Estresse", "", false, false);
        listaComponentes.add(componentes);

    }

}
