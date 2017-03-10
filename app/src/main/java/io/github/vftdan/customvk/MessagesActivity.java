package io.github.vftdan.customvk;

//import android.support.v7.app.AlertController;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import static android.support.v7.recyclerview.R.styleable.RecyclerView;

public class MessagesActivity extends AppCompatActivity {

    android.support.v7.widget.RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);
        recyclerView = (RecyclerView) findViewById(R.id.messagesListRecycler);

    }
}
