package LearnAttributes;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Step:1 set the path of your filename		
		XSSFWorkbook book =new XSSFWorkbook("./data/CreateLead.xlsx");
		
		//Step:2 get into the required sheet	
		XSSFSheet sheet = book.getSheetAt(0);
					
		/*
		 * int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		 * System.out.println(physicalNumberOfRows);
		 */
		//Step:to get the row count
		int rowCount = sheet.getLastRowNum();
		System.out.println("No of rows" +rowCount);
		
		int colCount = sheet.getRow(1).getLastCellNum();
		
		System.out.println("No of Columns " +colCount);
		
		//book-->sheet-->row-->cols
		
		for(int i=1;i<=rowCount;i++)
		{//(2)
			for(int j=0;j<colCount;j++) {
				//r=1,c=0
				//(1,0),(1,1)(1,2)(1,3)
				//(2,0)(2,1)..
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
			}
			
			
		}
		
	}

}
