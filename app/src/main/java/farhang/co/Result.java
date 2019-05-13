package farhang.co;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    TextView tx1,tx2,tx3,tx4,tx_Totalincome,tx_Totalcost,tx_payment,tx_frontpayment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tx1=findViewById(R.id.tx1);
        tx2=findViewById(R.id.tx2);
        tx3=findViewById(R.id.tx3);
        tx4=findViewById(R.id.tx4);
        tx_Totalincome=findViewById(R.id.tx_Totalincome);
        tx_Totalcost=findViewById(R.id.tx_Totalcost);
        tx_payment=findViewById(R.id.tx_payment);
        tx_frontpayment=findViewById(R.id.tx_frontpayment);




    }
}
