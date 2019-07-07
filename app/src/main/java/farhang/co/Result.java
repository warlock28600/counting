package farhang.co;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.InterruptedIOException;

public class Result extends AppCompatActivity {

    TextView tx1,tx2,tx3,tx4,tx_Totalincome,tx_Totalcost,tx_payment,tx_frontpayment;
    Button Bt_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Bt_return=findViewById(R.id.Bt_return);
        tx1=findViewById(R.id.tx1);
        tx2=findViewById(R.id.tx2);
        tx3=findViewById(R.id.tx3);
        tx4=findViewById(R.id.tx4);
        tx_Totalincome=findViewById(R.id.tx_Totalincome);
        tx_Totalcost=findViewById(R.id.tx_Totalcost);
        tx_payment=findViewById(R.id.tx_payment);
        tx_frontpayment=findViewById(R.id.tx_frontpayment);

   Bundle bundle=getIntent().getExtras();
   int tm=bundle.getInt("totalmoney");
   int fp=bundle.getInt("frontpercent");
   int ip=bundle.getInt("incompercent");
   int Tm=bundle.getInt("totalmonth");


   //محاسبه پول پیش
        int front_payment=percent(tm,fp);
    //محاسبه اقساط
        int a = tm-front_payment;
        int b =percent(a,ip);
        int c=b * Tm;
        int d = c+a;
        int month_payment=d/Tm;
    // محاسبه مبلغ تمام شده
        int total_cost=d+front_payment;
     //   محاسبه سود فروش
        int income=c;


        tx_Totalincome.setText(Integer.toString(income));
        tx_Totalcost.setText(Integer.toString(total_cost));
        tx_payment.setText(Integer.toString(month_payment));
        tx_frontpayment.setText(Integer.toString(front_payment));



        Bt_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Result.this,mainmeno.class);
                startActivity(intent);
            }
        });
    }
    public int percent (int a , int b) {
        int c = a / 100;
        int d = c * b;
        return d;
    }


}
