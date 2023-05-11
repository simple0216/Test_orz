package com.example.test_orz;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends MainActivity {

    private TextView tv;
    private Button btn1,btnCancel;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.notice);
        tv = (TextView)findViewById(R.id.textView71);

        final SpannableStringBuilder style = new SpannableStringBuilder();

        //设置文字
        style.append("可爱的她，对你有点心动，正在尝试联系你~");

        UnderlineSpan underlineSpan = new UnderlineSpan();

        //设置部分文字点击事件
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Toast.makeText(LoginActivity.this, "她", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void updateDrawState(TextPaint paint) {
                paint.setColor(Color.parseColor("#81A5E8"));
                // 设置下划线 true显示、false不显示
                paint.setUnderlineText(false);
                // paint.setStrikeThruText(true);
            }

        };
        style.setSpan(clickableSpan, 3, 5, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv.setText(style);

        //改变部分文字颜色
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#81A5E8"));
        style.setSpan(foregroundColorSpan, 3, 5, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        tv.setMovementMethod(LinkMovementMethod.getInstance());
        tv.setText(style);
        tv.setHighlightColor(Color.parseColor("#00000000"));
    }


}
