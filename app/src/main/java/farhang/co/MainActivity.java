package farhang.co;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bt_equal;

    EditText tx_totalmoney,tx_totalmonth,tx_incompercent,tx_frontpercent;
    TextView tx1,tx2,tx3,tx4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_equal=findViewById(R.id.bt_equal);
        tx_totalmoney=findViewById(R.id.tx_totalmoney);
        tx_frontpercent=findViewById(R.id.tx_frontpercent);
        tx_incompercent=findViewById(R.id.tx_incompercent);
        tx_totalmonth=findViewById(R.id.tx_totalmonth);
        tx1=findViewById(R.id.tx1);
        tx2=findViewById(R.id.tx2);
        tx3=findViewById(R.id.tx3);
        tx4=findViewById(R.id.tx4);

        bt_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            // تبدیل ورودی ها به int
                int e=Integer.valueOf(String.valueOf(tx_totalmoney));
                int f=Integer.parseInt(String.valueOf(tx_frontpercent));
                int g =Integer.parseInt(String.valueOf(tx_incompercent));
                int h =Integer.parseInt(String.valueOf(tx_totalmonth));
                //محاسبه  بیش برداخت
                int moneyfront=percent(e,f);
                //محاسبه سود
                int i=e-moneyfront;
                int incomepercent=percent(i,g);
                int income=incomepercent*h;
                // کل هزینه
                int totalcost=income+moneyfront;
                // محاسبه اقساط
                int rest_cost=i+income;
                int payment=rest_cost/h;
                //moneyfront
                //income
                //totalcost
                //payment

                // استارت resuult Activiti
                Intent intent = new Intent(MainActivity.this, Result.class);
                    intent.putExtra(  "front",moneyfront);
                    intent.putExtra("income",income);
                    intent.putExtra("totalcost",totalcost);
                    intent.putExtra("payment",payment);
                startActivity(intent);




            }
        });




        }


// فانکشن محاسبه درصد پیش پرداخت
// a=total , b=percent
    public int percent (int a , int b) {
    int c = a/100;
    int d=c*b;
    return d;


    }




}









