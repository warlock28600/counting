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

        Bundle  bundle = new Bundle();

        bundle.getInt("front");


/*


        int moneyfront= (int) getIntent().getExtras().getInt("front");
        int income=getIntent().getExtras().getInt("income");
        int totalcost=getIntent().getExtras().getInt("totalcost");
        int payment=getIntent().getExtras().getInt("payment");
        // تبدیل دیتا به String
        String totalincome=String.valueOf(income);
        String Totalcost=String.valueOf(totalcost);
        String mpayment=String.valueOf(payment);
        String Forontpament=String.valueOf(moneyfront);


        tx_frontpayment.setText(Forontpament);
        tx_payment.setText(mpayment);
        tx_Totalcost.setText(Totalcost);
        tx_Totalincome.setText(totalincome);

*/


    }
}
