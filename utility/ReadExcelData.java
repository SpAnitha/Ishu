package com.leaftaps.UI.utility;

	import java.io.IOException;
		public class ReadExcelData {
			public static String[][] readData(String excelFileName) throws IOException {
				// Open the excel Sheet
				XSSFWorkbook book = new XSSFWorkbook("./testData/" + excelFileName + "001.xlsx");
				// Get to the sheet where data is available
				XSSFSheet sheet = book.getSheetAt(0);
				// Get the row count
				int rowCount = sheet.getLastRowNum();
				System.out.println("Row Count: " + rowCount);
				// Get the column count
				XSSFRow headerRow = sheet.getRow(0);
				short colCount = headerRow.getLastCellNum();
				System.out.println("Column Count: " + colCount);

				// For storing and sending data to dataProvider, creating 2D array
				String[][] data = new String[rowCount][colCount];

				for (int i = 1; i <= rowCount; i++) {
					// Get each row out of the sheet
					XSSFRow eachRow = sheet.getRow(i);
					for (int j = 0; j < colCount; j++) {
						XSSFCell eachCell = eachRow.getCell(j);
						String value = eachCell.getStringCellValue();
						data[i - 1][j] = value;
					}
					System.out.println();
				}
				book.close();
				return data;
			}
		}



	

}
