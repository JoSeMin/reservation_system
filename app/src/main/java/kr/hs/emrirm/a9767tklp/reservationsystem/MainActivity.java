package kr.hs.emrirm.a9767tklp.reservationsystem;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    Chronometer chrono;
    Button butStart,butDone;
    RadioButton radioDate, radioTime;
    CalendarView calView;
    TimePicker timePick;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //인플레이션

        chrono = (Chronometer)findViewById(R.id.chrono); //view를 findviewbyid가 반환함(형변환)
        butStart = (Button)findViewById(R.id.but_start);
        butDone = (Button)findViewById(R.id.but_done);
        radioDate = (RadioButton)findViewById(R.id.radio_date);
        radioTime = (RadioButton)findViewById(R.id.radio_time);
        calView = (CalendarView)findViewById(R.id.calender);
        timePick = (TimePicker)findViewById(R.id.time_pick);
        textResult = (TextView)findViewById(R.id.text_result);
        timePick.setVisibility(View.INVISIBLE);
        calView.setVisibility(View.INVISIBLE); //invisible이 화면에 보이지 않게 하는 것
    }
}
