package team_uganda.ieltsassistor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //button class taki object nilam 5 tar laagi
    Button calculateScore;
    Button locationFinder;
    Button testGiver;
    Button bookStorage;
    Button tipOfTheDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //object gula findViewByid di initialize/ assign korlam
        calculateScore = (Button) findViewById(R.id.ielts_calculator);
        locationFinder = (Button) findViewById(R.id.ielts_location_finder);
        testGiver = (Button) findViewById(R.id.ielts_mockTest);
        bookStorage = (Button) findViewById(R.id.ielts_rareBooks);
        tipOfTheDay = (Button) findViewById(R.id.ielts_tipOfTheDay);


    }

    public void calculate(View v)
    {
        Toast.makeText(getApplicationContext(), "Going to IeltsCalculator activity", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, IeltsCalculator.class);
        startActivity(intent);
    }
    public void findLoc(View v)
    {
        Toast.makeText(getApplicationContext(), "Going to Exam centre activity", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, ExamCentre.class);
        startActivity(intent);
    }
    public void giveTest(View v)
    {
        Toast.makeText(getApplicationContext(), "Going to Mock Test activity", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MockTest.class);
        startActivity(intent);
    }
    public void bookStore(View v)
    {
        Toast.makeText(getApplicationContext(), "Going to BookStorage activity", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, BookStorage.class);
        startActivity(intent);
    }
    public void findTips(View v)
    {
        Toast.makeText(getApplicationContext(), "egut chairam click krlei tips pop up korto!", Toast.LENGTH_SHORT).show();

    }
}
