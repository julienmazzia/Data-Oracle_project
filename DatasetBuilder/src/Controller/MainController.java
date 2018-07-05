package Controller;

import View.Scenario;

public class MainController {
	
	public static void main(String[] args) {
		Scenario scenario = new Scenario();
		DataSetController DSC = new DataSetController();
		scenario.setVisible(true);
		scenario.AddObs(DSC);
	}
	
	public static void OracleControllerLauncher(DataSetController dataSet){
		OracleController oracle = new OracleController(dataSet);
	}
}
