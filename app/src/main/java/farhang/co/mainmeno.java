package farhang.co;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mainmeno extends AppCompatActivity {
     Button Bt_buy,Bt_loan,Bt_extra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmeno);
        Bt_buy=findViewById(R.id.Bt_buy);
        Bt_loan=findViewById(R.id.Bt_loan);
        Bt_extra=findViewById(R.id.Bt_extera);

        Bt_buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mainmeno.this,MainActivity.class);
                startActivity(intent);
            }
        });




    }
}
