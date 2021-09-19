package com.pd.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;

    private Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        rv = (RecyclerView) findViewById( R.id.rview );

        mAdapter = new Adapter( mgetData() );
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager( getApplicationContext() );
        rv.setLayoutManager( layoutManager );
        rv.setItemAnimator( new DefaultItemAnimator() );
        rv.setAdapter( mAdapter );
    }

    private ArrayList mgetData() {

        ArrayList<getnsetm> myarraylist = new ArrayList<>();

        getnsetm add_a = new getnsetm();

        add_a.setText_gs( "Note-check-123" );
        add_a.setImage_gs( R.drawable.coin1 );
        myarraylist.add( add_a );

        add_a = new getnsetm();
        add_a.setText_gs( "aadsa" );
        add_a.setImage_gs( R.drawable.coin1 );
        myarraylist.add( add_a );

        add_a = new getnsetm();
        add_a.setText_gs( "asdad" );
        add_a.setImage_gs( R.drawable.coin1 );
        myarraylist.add( add_a );

        add_a = new getnsetm();
        add_a.setText_gs( "coin-check-121" );
        add_a.setImage_gs( R.drawable.coin1 );
        myarraylist.add( add_a );

        add_a = new getnsetm();
        add_a.setText_gs( "coin-new-2" );
        add_a.setImage_gs( R.drawable.coin1 );
        myarraylist.add( add_a );


        return myarraylist;
    }
}