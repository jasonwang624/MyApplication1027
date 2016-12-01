package com.example.user.myapplication1027;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {
    int tmp,ch=-1;
    boolean chks[] = new boolean[6];
    boolean tmps[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void click1(View v)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(Main5Activity.this);
        builder.setTitle("這是標題AAAA");
        builder.setMessage("這是內文***____******");

        builder.setPositiveButton("確定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Main5Activity.this,"按確定",Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Main5Activity.this,"按取消",Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNeutralButton("略過", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Main5Activity.this,"按略過",Toast.LENGTH_SHORT).show();
            }
        });

        builder.show();
    }
    public void click2(View v)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(Main5Activity.this);
        builder.setTitle("輸入");
        builder.setMessage("請輸入:");
        final EditText ed = new EditText(Main5Activity.this);
        builder.setView(ed);
        builder.setPositiveButton("確定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Main5Activity.this,"輸入為:"+ed.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });

        builder.show();

    }
    public void click3(View v)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(Main5Activity.this);
        builder.setTitle("多選一");
        tmp = ch;
        builder.setSingleChoiceItems(R.array.country, tmp, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                tmp=which;
            }
        });

        builder.setPositiveButton("確定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if(tmp >=0)
                {
                    String[] str = getResources().getStringArray(R.array.country);
                    TextView tv = (TextView) findViewById(R.id.textView);
                    ch = tmp;
                    tv.setText(str[ch]);
                }
            }
        });
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        builder.show();
    }
    public void click4(View v)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(Main5Activity.this);
        builder.setTitle("多選一");

        builder.setItems(R.array.country, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String[] str = getResources().getStringArray(R.array.country);
                TextView tv2 = (TextView) findViewById(R.id.textView2);
                tv2.setText(str[which]);
            }
        });
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        builder.show();
    }
    public void click5(View v)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(Main5Activity.this);
        builder.setTitle("可複選");
        tmps = chks.clone();
        builder.setMultiChoiceItems(R.array.country, tmps, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {

            }
        });
        builder.setPositiveButton("確定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                chks = tmps.clone();
                String[] str = getResources().getStringArray(R.array.country);
                TextView tv3 = (TextView) findViewById(R.id.textView3);
                StringBuilder sb = new StringBuilder();
                for(int i=0;i<=5;i++)
                {
                    if(chks[i])
                    {
                        sb.append(str[i]+",");
                    }
                }
                tv3.setText(sb);
            }
        });
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                tmps = chks.clone();
                dialog.dismiss();
            }
        });
        builder.show();
    }
    public void click6(View v)
    {
        Intent it = new Intent(Main5Activity.this,Main6Activity.class);
        startActivity(it);
    }
    public void click7(View v)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(Main5Activity.this);
        builder.setTitle("自定");
        builder.setView(R.layout.layout1);
        builder.setPositiveButton("確定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Main5Activity.this,"按確定",Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Main5Activity.this,"按取消",Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNeutralButton("略過", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Main5Activity.this,"按略過",Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
    }
    public void click8(View v)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(Main5Activity.this);
        builder.setTitle("自定");
        LayoutInflater inflater = LayoutInflater.from(Main5Activity.this);
        View myview = inflater.inflate(R.layout.layout1,null);
        Button btn = (Button) myview.findViewById(R.id.button17);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main5Activity.this, "Click!",Toast.LENGTH_SHORT).show();
            }
        });

        builder.setView(myview);
        builder.setPositiveButton("確定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Main5Activity.this,"按確定",Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Main5Activity.this,"按取消",Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNeutralButton("略過", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Main5Activity.this,"按略過",Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
    }
    public void click9(View v)
    {
        final ProgressDialog pd = new ProgressDialog(Main5Activity.this);
        pd.setTitle("工作中");
        pd.setMessage("請稍候....");
        pd.show();
        new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        pd.dismiss();
                    }
                });
            }
        }.start();
    }
}
