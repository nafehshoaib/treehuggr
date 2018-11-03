package io.treehugger.mock_data;


import java.util.ArrayList;

public class Mock {
	public static ArrayList<Tuple<Double, Double>> stressValues = new ArrayList();
	public static void init() {
		for (double i = 0; i < 20; i++) {
			stressValues.add(new Tuple<Double, Double>(i, Math.random()));
		}
	}
}
