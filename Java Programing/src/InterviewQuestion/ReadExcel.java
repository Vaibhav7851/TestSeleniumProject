package InterviewQuestion;

import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class ReadExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		public Map<String, String> readExcel(String filePath, String fileName, String sheetName, String keyColName,
	            String keyValue) {
	        Map<String, String> colValMap = new HashMap<String, String>();
	        
	        Recordset recordset = null;
	        Connection connection = null;
	        try {

	 

	            Fillo fillo = new Fillo();
	            sheetName = validateSheetName(sheetName);
	            connection = fillo.getConnection("./data/" + filePath + "/" + fileName);
	            String strQuery = "Select * from " + sheetName + " where " + keyColName + "='" + keyValue + "'";
	            recordset = connection.executeQuery(strQuery);
	            while (recordset.next()) {
	                List<String> columns = recordset.getFieldNames();
	                for (String col : columns) {
	                    if (!col.equalsIgnoreCase(keyColName))
	                        colValMap.put(col, recordset.getField(col));
	                }
	            }

	 

	             
	        } catch (FilloException e) {
	            Reporting.getLogger().log(LogStatus.FAIL, "Exception occured while fetching details from excels",
	                    "For details refer "
	                            + new Logger().writeExceptionLogs("Exception while reading excel", getExceptionDetails(e)));
	        }finally {
	            recordset.close();
	            connection.close();
	    }

	 

	        return colValMap;
	}

}
