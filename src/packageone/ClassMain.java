package packageone;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedList;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeTest;

public class ClassMain extends Course_Schedule{
	
	@BeforeTest
	public void MethodMain() throws IOException, InterruptedException {
		int Column_Count=0;
		LinkedList<String> Key = new LinkedList<String>();
		LinkedList<String> Value = new LinkedList<String>();
		
		File Excel = new File("C:\\Users\\Satish\\eclipse-workspace\\9_30_to_10_30_batch\\TestDataFolder\\TestDataSheet.xlsx");
		FileInputStream Read_Write = new FileInputStream(Excel);
		
		XSSFWorkbook Wb = new XSSFWorkbook(Read_Write);
		XSSFSheet TestDataSheet = Wb.getSheet("DataSheet");
		
		DataFormatter formatter = new DataFormatter();
		
		int Row_Count = TestDataSheet.getLastRowNum()-TestDataSheet.getFirstRowNum();
		System.out.println(Row_Count);
		
		for(int i=0;i<Row_Count;i++) {
			Column_Count = TestDataSheet.getRow(i).getLastCellNum();
			System.out.println(Column_Count);
			for(int j=0;j<Column_Count;j++) {
				Key.add(formatter.formatCellValue(TestDataSheet.getRow(i).getCell(j)));
			}
		}
		System.out.println(Key);
		
		for(int i=1;i<=Row_Count;i++) {
			for(int j=0;j<Column_Count;j++) {
				Value.add(formatter.formatCellValue(TestDataSheet.getRow(i).getCell(j)));
			}
		}
		System.out.println(Value);
		
		for(int k=0;k<Key.size();k++) {
			DataMap.put(Key.get(k), Value.get(k));
		}
		System.out.println(DataMap);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
