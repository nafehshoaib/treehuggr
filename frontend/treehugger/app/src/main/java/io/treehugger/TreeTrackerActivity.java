package io.treehugger;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import io.treehugger.mock_data.Mock;
import lecho.lib.hellocharts.model.Line;
import lecho.lib.hellocharts.model.LineChartData;
import lecho.lib.hellocharts.model.PointValue;
import lecho.lib.hellocharts.view.LineChartView;


public class TreeTrackerActivity extends AppCompatActivity {

	LineChartView chart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tree_tracker);
        Mock.init();
		Log.d("ISAIAH", "tree tracker made");
		chart = findViewById(R.id.chart);

		List<PointValue> values = Mock.stressValues;

		//In most cased you can call data model methods in builder-pattern-like manner.
		Line line = new Line(values).setColor(Color.WHITE).setCubic(false);
		List<Line> lines = new ArrayList<Line>();
		lines.add(line);

		LineChartData data = new LineChartData();
		data.setLines(lines);

		chart.setLineChartData(data);
    }
}

