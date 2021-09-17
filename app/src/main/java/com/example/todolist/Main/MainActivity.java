package com.example.todolist.Main;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;

import com.example.todolist.R;
import com.example.todolist.addEdit.AddEditActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private RecyclerView main_rcv;
    private FloatingActionButton main_fab;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_delete, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_rcv = findViewById(R.id.main_rcv);
        main_fab = findViewById(R.id.main_fab);

        main_fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //과제, 힌트: intent 를 이용해보기
                //fab=floatActionButton
                //add 버튼을 눌렀을 때 AddEditActivity 로 화면전환이 되도록ㄱㄱ,레이아웃은 안짰으니
                //빈 화면으로 전환될듯
                Intent intent = new Intent(getApplicationContext(), AddEditActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.menu_delete_all:
                //Todo: 전체삭제
            case R.id.menu_delete_selected:
                //Todo:선택삭제
        }

        return super.onOptionsItemSelected(item);
    }

}