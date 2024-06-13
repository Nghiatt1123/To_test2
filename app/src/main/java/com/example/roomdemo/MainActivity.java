package com.example.roomdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.room.Room;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    UserDao userDao;
    EditText edt_uid, edt_firstname, edt_lastname;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
findViewById(R.id.btn_add).setOnClickListener(this);
MyDatabase db = Room.databaseBuilder(getApplicationContext(),
        MyDatabase.class, "userdb").build();
 userDao = db.userDao();
 edt_uid = findViewById(R.id.editTextText3);
 edt_firstname = findViewById(R.id.editTextText);
 edt_lastname = findViewById(R.id.editTextText2);
    }

    public void addUser (User u) {
        userDao.insertAll(u);
    }

    @Override
    public void onClick(View view) {
    if (view.getId() == R.id.btn_add) {
        int uid = Integer.valueOf(edt_uid.getText().toString());
        String fn = edt_firstname.getText().toString();
        String ln = edt_lastname.getText().toString();
        addUser(new User(uid, fn, ln));
    } else if (view.getId() == R.id.btn_list) {
        List<User> users = userDao.getAll();
        ((TextView)findViewById(R.id.tv_list).setText(users.toString());

    }
    }
}