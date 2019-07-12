package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployeeInfo;
    ArrayList<EmployeeInfo> employeeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployeeInfo = findViewById(R.id.listViewEmployeeInfo);
        employeeList = new ArrayList<>();

        employeeList.add(new EmployeeInfo("John", "Software Technical Leader", 3400.0f));
        employeeList.add(new EmployeeInfo("Mary", "Programmer", 2200.0f));

        CustomAdapter adapter = new CustomAdapter(this, R.layout.layout, employeeList);
        lvEmployeeInfo.setAdapter(adapter);
    }
}
