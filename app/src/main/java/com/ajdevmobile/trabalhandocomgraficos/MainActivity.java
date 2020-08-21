package com.ajdevmobile.trabalhandocomgraficos;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;


import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.jjoe64.graphview.series.PointsGraphSeries;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private GraphView graphView;
    private List<Chuva> chuvas = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        graphView = findViewById(R.id.graph);


        Chuva chuva1 = new Chuva(2,10,20, 12);
        chuvas.add( chuva1 );

        Chuva chuva2 = new Chuva(3,05,20,16);
        chuvas.add( chuva2 );

        Chuva chuva3 = new Chuva(5,05,20, 20);
        chuvas.add( chuva3 );

        Chuva chuva4 = new Chuva(10,02,20, 28);
        chuvas.add( chuva4 );

        Chuva chuva5 = new Chuva(28,02,20, 60);
        chuvas.add( chuva5 );






        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[]{
                    new DataPoint(1,5),
                    new DataPoint(2,10),
                    new DataPoint(3,20),
                    new DataPoint(4,15)


         });

            graphView.setTitle("Chuvas");
            series.setColor(Color.GREEN);
            series.setThickness(10);
            graphView.setTitleTextSize(60);
            graphView.setTitleColor(Color.BLACK);


            //graphView.getViewport().setScrollable(true);
            //graphView.getViewport().setScalable(true);

            graphView.addSeries(series);

    }


    private void configuraGraficoLinear(){


        for(Chuva chuva: chuvas){

            LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {
                    new DataPoint(chuva.getDia(), chuva.getChuvamm()),

            });


            graphView.setTitle("Chuvas");
            series.setColor(Color.BLUE);
            series.setThickness(10);
            graphView.setTitleTextSize(60);
            graphView.setTitleColor(Color.BLUE);


            //graphView.getViewport().setScrollable(true);
            //graphView.getViewport().setScalable(true);

            graphView.addSeries(series);

        }

    }


    private void configuraGraficoBar(){


        for(Chuva chuva: chuvas){

            BarGraphSeries<DataPoint> series = new BarGraphSeries<>(new DataPoint[] {
                    new DataPoint(chuva.getDia(), chuva.getChuvamm()),

            });


            graphView.setTitle("Chuvas");
            series.setColor(Color.BLUE);
            //series.setThickness(10);
            graphView.setTitleTextSize(60);
            graphView.setTitleColor(Color.BLUE);


            //graphView.getViewport().setScrollable(true);
            //graphView.getViewport().setScalable(true);

            graphView.addSeries(series);

        }

    }

    private void configuraGraficoPoints(){


        for(Chuva chuva: chuvas){

            PointsGraphSeries<DataPoint> series = new PointsGraphSeries<>(new DataPoint[] {
                    new DataPoint(chuva.getDia(), chuva.getChuvamm()),

            });


            graphView.setTitle("Chuvas");
            series.setColor(Color.BLUE);
            //series.setThickness(10);
            graphView.setTitleTextSize(60);
            graphView.setTitleColor(Color.BLUE);


            //graphView.getViewport().setScrollable(true);
            //graphView.getViewport().setScalable(true);

            graphView.addSeries(series);

        }

    }



}