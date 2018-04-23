package com.nogami.hvm.upeuasistenciaqr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.nogami.hvm.R;
import com.nogami.hvm.dao.AsistenciaDao;
import com.nogami.hvm.utils.ListaAsisAdapter;

public class ListarAsistenciaActivity extends AppCompatActivity {

    AsistenciaDao dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_asistencia);

        ListView lista=(ListView)findViewById(R.id.idListaAsis);
        dao=new AsistenciaDao(this);

        ListaAsisAdapter adapter=new ListaAsisAdapter(this,dao.listarAsistenciaArray());
        lista.setAdapter(adapter);
    }
}
