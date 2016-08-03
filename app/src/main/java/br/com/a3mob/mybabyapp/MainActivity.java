package br.com.a3mob.mybabyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.google.firebase.crash.FirebaseCrash;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //teste1 Will
        // teste #1 alteracao Gustavo
        // teste #3 alteracao Gustavo
        // teste #3 alteraçao Thiago - tentativa 4
        FirebaseCrash.report(new Exception("teste erro"));
    }
}
