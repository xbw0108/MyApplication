package cn.edu.sdwu.android.classroom.sn170507180213;

import android.app.WallpaperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //加载界面
        setContentView(R.layout.layout_chu4_1);

        //1)获取普通界面组件,通过id找按钮
        Button button=(Button) findViewById(R.id.button1);
        ImageView imageView=(ImageView) findViewById(R.id.ch4_iv);

        //3)调用事件源的  方法注册事件监听器
        button.setOnClickListener(new MyClickListener());

        //使用内部匿名类注册监听器
        imageView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                //设置壁纸
                WallpaperManager wallpaperManager=(WallpaperManager) getSystemService(WALLPAPER_SERVICE);
                try{
                    wallpaperManager.setResource(R.raw.img);
                }catch (Exception e){
                    Log.e(Main2Activity.class.toString(),e.toString());
                }

                return false;
            }
        });


    }
    //2)实现事件监听类
    class MyClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Log.i(Main2Activity.class.toString(),"button click");

        }


    }
}
