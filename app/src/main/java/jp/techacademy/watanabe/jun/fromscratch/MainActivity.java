package jp.techacademy.watanabe.jun.fromscratch;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Human human = new Human("渡辺",23, "ノストラダムスの大予言");
            human.say();
            human.think();
        }

}