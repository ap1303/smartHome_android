package com.example.peizhizhang.smarthome;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Are you certain?")
                        .setPositiveButton("Up", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                try {
                                    visitserver serverAsyncTask = new visitserver();
                                    URL url = new URL("http://192.168.100.254:3000/command?item=fence&action=up");
                                    serverAsyncTask.execute(url);
                                } catch (MalformedURLException e) {
                                    e.printStackTrace();
                                }
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                System.out.println("Cancelled");
                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Are you certain?")
                        .setPositiveButton("Down", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                try {
                                    visitserver serverAsyncTask = new visitserver();
                                    URL url = new URL("http://192.168.100.254:3000/command?item=fence&action=down");
                                    serverAsyncTask.execute(url);
                                } catch (MalformedURLException e) {
                                    e.printStackTrace();
                                }
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                System.out.println("Cancelled");
                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Are you certain?")
                        .setPositiveButton("Up", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                try {
                                    visitserver serverAsyncTask = new visitserver();
                                    URL url = new URL("http://192.168.100.254:3000/command?item=garage&action=up");
                                    serverAsyncTask.execute(url);
                                } catch (MalformedURLException e) {
                                    e.printStackTrace();
                                }
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                System.out.println("Cancelled");
                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Are you certain?")
                        .setPositiveButton("Down", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                try {
                                    visitserver serverAsyncTask = new visitserver();
                                    URL url = new URL("http://192.168.100.254:3000/command?item=garage&action=down");
                                    serverAsyncTask.execute(url);
                                } catch (MalformedURLException e) {
                                    e.printStackTrace();
                                }
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                System.out.println("Cancelled");
                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });
    }



}
