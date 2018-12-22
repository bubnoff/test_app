package com.example.bubnov.myapplication;
import java.util.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Node n1 = new Node(22);
        Node n2 = new Node(11);
        Node n3 = new Node(22);

        LinkedList s_list = new LinkedList();
        s_list.addInTail(n1);
        s_list.addInTail(n2);
        s_list.addInTail(n3);

        s_list.removeAll(22);
        Log.e("TAG", " - " + s_list.head.value);
        Log.e("TAG", " - " + s_list.head.next);


    }
}


