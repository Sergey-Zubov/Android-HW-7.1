package com.szubov.android_hw_71;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTextViewValues;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        mTextViewValues = findViewById(R.id.textViewValues);

        findViewById(R.id.btnActionAddition).setOnClickListener(this);
        findViewById(R.id.btnActionChangeOfSign).setOnClickListener(this);
        findViewById(R.id.btnActionDivision).setOnClickListener(this);
        findViewById(R.id.btnActionEqually).setOnClickListener(this);
        findViewById(R.id.btnActionMultiplication).setOnClickListener(this);
        findViewById(R.id.btnActionPercent).setOnClickListener(this);
        findViewById(R.id.btnActionSubtraction).setOnClickListener(this);
        findViewById(R.id.btnActionReset).setOnClickListener(this);
        findViewById(R.id.btnPoint).setOnClickListener(this);
        findViewById(R.id.btnOne).setOnClickListener(this);
        findViewById(R.id.btnTwo).setOnClickListener(this);
        findViewById(R.id.btnThree).setOnClickListener(this);
        findViewById(R.id.btnFour).setOnClickListener(this);
        findViewById(R.id.btnFive).setOnClickListener(this);
        findViewById(R.id.btnSix).setOnClickListener(this);
        findViewById(R.id.btnSeven).setOnClickListener(this);
        findViewById(R.id.btnEight).setOnClickListener(this);
        findViewById(R.id.btnNine).setOnClickListener(this);
        findViewById(R.id.btnZero).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActionAddition:
                mTextViewValues.setText(R.string.btn_action_addition);
                break;
            case R.id.btnActionChangeOfSign:
                mTextViewValues.setText(R.string.btn_action_change_of_sign);
                break;
            case R.id.btnActionDivision:
                mTextViewValues.setText(R.string.btn_action_division);
                break;
            case R.id.btnActionEqually:
                mTextViewValues.setText(R.string.btn_action_equally);
                break;
            case R.id.btnActionMultiplication:
                mTextViewValues.setText(R.string.btn_action_multiplication);
                break;
            case R.id.btnActionPercent:
                mTextViewValues.setText(R.string.btn_action_percent);
                break;
            case R.id.btnActionSubtraction:
                mTextViewValues.setText(R.string.btn_action_subtraction);
                break;
            case R.id.btnActionReset:
                mTextViewValues.setText(R.string.text_view_action_reset);
                break;
            case R.id.btnPoint:
                mTextViewValues.setText(R.string.btn_point);
                break;
            case R.id.btnOne:
                mTextViewValues.setText(R.string.btn_one);
                break;
            case R.id.btnTwo:
                mTextViewValues.setText(R.string.btn_two);
                break;
            case R.id.btnThree:
                mTextViewValues.setText(R.string.btn_three);
                break;
            case R.id.btnFour:
                mTextViewValues.setText(R.string.btn_four);
                break;
            case R.id.btnFive:
                mTextViewValues.setText(R.string.btn_five);
                break;
            case R.id.btnSix:
                mTextViewValues.setText(R.string.btn_six);
                break;
            case R.id.btnSeven:
                mTextViewValues.setText(R.string.btn_seven);
                break;
            case R.id.btnEight:
                mTextViewValues.setText(R.string.btn_eight);
                break;
            case R.id.btnNine:
                mTextViewValues.setText(R.string.btn_nine);
                break;
            case R.id.btnZero:
                mTextViewValues.setText(R.string.btn_zero);
                break;
        }
    }
}