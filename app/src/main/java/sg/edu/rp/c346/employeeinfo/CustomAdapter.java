package sg.edu.rp.c346.employeeinfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<EmployeeInfo> employeeList;

    public CustomAdapter(Context context, int resource, ArrayList<EmployeeInfo> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        employeeList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvJob = rowView.findViewById(R.id.textViewJob);
        TextView tvSalary = rowView.findViewById(R.id.textViewSalary);

        EmployeeInfo currentEmployee = employeeList.get(position);

        tvName.setText(currentEmployee.getName());
        tvJob.setText(currentEmployee.getJob());
        tvSalary.setText(currentEmployee.getSalary() + "");

        return rowView;
    }
}
