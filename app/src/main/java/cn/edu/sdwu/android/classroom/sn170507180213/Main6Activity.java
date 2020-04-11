package cn.edu.sdwu.android.classroom.sn170507180213;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_chu4_5);
        //在java中获取字符串资源
        String content=getString(R.string.hello);

        Log.i(Main6Activity.this.toString(),content);

        String sms=getString(R.string.sms);
        sms=String.format(sms,100,"张三");
        Log.i(Main6Activity.this.toString(),sms);
    }
}
