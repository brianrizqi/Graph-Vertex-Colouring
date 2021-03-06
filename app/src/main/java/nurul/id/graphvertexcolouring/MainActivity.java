package nurul.id.graphvertexcolouring;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private Button lv1, lv2, lv3, lv4, lv5, lv6, lv7, lv8, lv9, lv10, lv11, lv12, lv13, lv14, lv15, lv16, lv17, lv18, lv19, lv20;
    Button arrBtn [] = new Button[21];
    Boolean arrLevel[] = new Boolean[21];
    Boolean arrStatus[] = new Boolean[21];
    int currentScore=0,highestScore=0;
    TextView score;

    SharedPreferences sharedPreferences;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.appBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Graph Vertex Colouring");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onBackPressed();
                }
            });
        }

        lv1 = (Button) findViewById(R.id.level1);
        lv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Level1.class);
                startActivity(i);
            }
        });
        lv2 = (Button) findViewById(R.id.level2);
        lv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Level2.class);
                startActivity(i);
            }
        });
        lv3 = (Button) findViewById(R.id.level3);
        lv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Level3.class);
                startActivity(i);
            }
        });
        lv4 = (Button) findViewById(R.id.level4);
        lv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Level4.class);
                startActivity(i);
            }
        });
        lv5 = (Button) findViewById(R.id.level5);
        lv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Level5.class);
                startActivity(i);
            }
        });
        lv6 = (Button) findViewById(R.id.level6);
        lv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Level6.class);
                startActivity(i);
            }
        });
        lv7 = (Button) findViewById(R.id.level7);
        lv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Level7.class);
                startActivity(i);
            }
        });
        lv8 = (Button) findViewById(R.id.level8);
        lv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Level8.class);
                startActivity(i);
            }
        });
        lv9 = (Button) findViewById(R.id.level9);
        lv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Level9.class);
                startActivity(i);
            }
        });
        lv10 = (Button) findViewById(R.id.level10);
        lv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Level10.class);
                startActivity(i);
            }
        });
        lv11 = (Button) findViewById(R.id.level11);
        lv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Level11.class);
                startActivity(i);
            }
        });
        lv12 = (Button) findViewById(R.id.level12);
        lv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Level12.class);
                startActivity(i);
            }
        });
        lv13 = (Button) findViewById(R.id.level13);
        lv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Level13.class);
                startActivity(i);
            }
        });
        lv14 = (Button) findViewById(R.id.level14);
        lv14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Level14.class);
                startActivity(i);
            }
        });
        lv15 = (Button) findViewById(R.id.level15);
        lv15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Level15.class);
                startActivity(i);
            }
        });
        lv16 = (Button) findViewById(R.id.level16);
        lv16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Level16.class);
                startActivity(i);
            }
        });
        lv17 = (Button) findViewById(R.id.level17);
        lv17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Level17.class);
                startActivity(i);
            }
        });
        lv18 = (Button) findViewById(R.id.level18);
        lv18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Level18.class);
                startActivity(i);
            }
        });
        lv19 = (Button) findViewById(R.id.level19);
        lv19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Level19.class);
                startActivity(i);
            }
        });
        lv20 = (Button) findViewById(R.id.level20);
        lv20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Level20.class);
                startActivity(i);
            }
        });

        score = (TextView)findViewById(R.id.nilai);

        arrBtn[1]=lv1;
        arrBtn[2]=lv2;
        arrBtn[3]=lv3;
        arrBtn[4]=lv4;
        arrBtn[5]=lv5;
        arrBtn[6]=lv6;
        arrBtn[7]=lv7;
        arrBtn[8]=lv8;
        arrBtn[9]=lv9;
        arrBtn[10]=lv10;
        arrBtn[11]=lv11;
        arrBtn[12]=lv12;
        arrBtn[13]=lv13;
        arrBtn[14]=lv14;
        arrBtn[15]=lv15;
        arrBtn[16]=lv16;
        arrBtn[17]=lv17;
        arrBtn[18]=lv18;
        arrBtn[19]=lv19;
        arrBtn[20]=lv20;



        //setLevel(arrLevel);
        //arrLevel=getLevel(arrLevel);

        sharedPreferences = getApplicationContext().getSharedPreferences("level",0);

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("level_"+1,true);
        editor.commit();

        highestScore = sharedPreferences.getInt("highestScore",0);
        currentScore = 0;//sharedPreferences.getInt("currentScore",0);

        editor.putInt("currentScore",0);
        editor.commit();

        score.setText("Nilai Tertinggi : "+highestScore);


        for (int i = 1;i<arrLevel.length;i++){
            arrLevel[i]=sharedPreferences.getBoolean("level_"+i,false);
            arrStatus[i]=sharedPreferences.getBoolean("status_"+i,false);

            /*System.out.println(arrLevel[i]);
            System.out.println(sharedPreferences.getBoolean("level_"+i,false));*/
           if (arrLevel[i]==true){
             if (arrStatus[i]==true){
                 arrBtn[i].setBackgroundResource(R.drawable.rectangle_green);
             }
             else {
                 arrBtn[i].setBackgroundResource(R.drawable.rectangle_red);
             }

           }
           else {
               arrBtn[i].setBackgroundResource(R.drawable.rectangle_grey);
               arrBtn[i].setEnabled(false);

           }
        }



    }

   /* public void setLevel(Boolean[] arr){

        SharedPreferences sharedPreferences = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        for (int i = 1; i<arr.length;i++){
            editor.putBoolean("level_"+i,false);
        }
        editor.commit();



    }*/
    public Boolean[]getLevel(Boolean[]arr){
        sharedPreferences = getApplicationContext().getSharedPreferences("level",0);

        for (int i = 1; i<arr.length;i++){
            arr[i]=sharedPreferences.getBoolean("level_"+i,false);
        }
        return arr;
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(MainActivity.this, StartActivity.class);
        startActivity(i);
        finishAffinity();
    }


}
