package com.sflin.demo;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.sflin.csstextview.CSSTextView;

public class MainActivity extends AppCompatActivity {

    private CSSTextView mCSSTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        mCSSTextView = (CSSTextView) findViewById(R.id.css_text_view);
        //1.设置一段文字内容（必须要先设置一段文字）
        mCSSTextView.setText("这是一个基于TextView扩展控件,实现了可对一段文字内容，设置不同的字体大小,字体样式,字体样式以及设置点击事件");
        //2.设置文字整体的字体大小
        mCSSTextView.setTextSize(14);
        //3.设置文字整体的字体颜色
        mCSSTextView.setTextColor(Color.BLACK);
        //4.开始设置指定字体的颜色，大小，样式，点击事件
        mCSSTextView.setTextArrColor("这是",Color.GREEN);
        mCSSTextView.setTextArrSize("一个",12);
        //Typeface.NORMAL、Typeface.BOLD、Typeface.ITALIC、Typeface.BOLD_ITALIC(四种样式)
        mCSSTextView.setTextArrStyle("基于", Typeface.BOLD);
        //设置点击事件
        mCSSTextView.setTextClick("TextView", new CSSTextView.OnClickSpan() {
                    @Override
                    public void onClick(String text) {
                        Toast.makeText(MainActivity.this,"我是"+text,Toast.LENGTH_SHORT).show();
                    }
                });
        mCSSTextView.setTextArrColorSizeStyle("实现了可对一段文字内容",Color.BLUE,16,Typeface.ITALIC);

        //对一段文字中的相同内容设置不同颜色，可以用开始位置来区分
        mCSSTextView.setTextArrColor("字体",Color.RED,36);
        mCSSTextView.setTextArrColor("字体",Color.YELLOW,41);
        mCSSTextView.setTextArrColor("字体",Color.BLUE,46);

        mCSSTextView.setTextArrColorSizeStyle("设置点击事件", Color.GREEN, 18, Typeface.BOLD_ITALIC,
                new CSSTextView.OnClickSpan() {
                    @Override
                    public void onClick(String text) {
                        Toast.makeText(MainActivity.this,"我是"+text,Toast.LENGTH_SHORT).show();
                    }
                });

        mCSSTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"我是整段文字",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
