package com.qcm.mohamed.evaluation;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    private TextView infoTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    infoTextView =(TextView) findViewById(R.id.infoTextView);
        String nom=SharedPrefManager.getInstance(this).getNom();
        String prenom=SharedPrefManager.getInstance(this).getPrenom();
        int cin=SharedPrefManager.getInstance(this).getCIN();
        String email=SharedPrefManager.getInstance(this).getEmail();
        infoTextView.setText(infoTextView.getText()+ " Votre nom: " +nom +" Votre prenom: "+prenom+" Votre Email: "+email+
                " Votre Cin: "+cin);
    }
}
