package Controller;

import java.util.ArrayList;




public class OracleController {
	private Object[] scenarioViewData;
	private Object[][] customValue;
	
	public OracleController(Object[] scenarioViewData, Object[][] customValue){
		this.scenarioViewData = scenarioViewData;
		this.customValue = customValue;
		dataSender();
	}
	
	public void dataSender(){
		
	}
	
}
