package cn.edu.sdwu.android.classroom.sn170507180213;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_chu4_4);
    }
    public void toast1(View view){
        Toast.makeText(this,"toast1",Toast.LENGTH_LONG).show();
    }
}
