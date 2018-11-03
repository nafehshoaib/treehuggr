package io.treehugger.mock_data;


import java.util.ArrayList;
import java.util.List;

import lecho.lib.hellocharts.model.PointValue;

public class Mock {
	public static List<PointValue> stressValues = new ArrayList<>();
	public static void init() {
		for (float i = 0; i < 25; i++) {
			stressValues.add(new PointValue(i, (float)Math.random()));
		}
	}
}
