package example.mvp.mvpapplication.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import example.mvp.mvpapplication.R;
import example.mvp.mvpapplication.interfaces.MainViewOps;

public class MainActivity extends AppCompatActivity implements MainViewOps {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void showLoading(String text) {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void navigate() {

    }
}
