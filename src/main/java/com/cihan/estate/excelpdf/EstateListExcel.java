package com.cihan.estate.excelpdf;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.cihan.estate.models.Estate;


public class EstateListExcel {
	private static final String FILE_NAME = "C:/Doc/EmlakListesi.xlsx";
	private static String[] columns = {"NO","Yetkili İşletme Adı","Müşteri Adı Soyadı","Emlak Tipi","Emlağın Durumu","Fiyatı","MetreKaresi","Oda Sayısı","Katı","Emlağın Yaşı ","Yapı Tipi","Isınma Tipi ","Tapunun Türü","Adres"};
    private List<Estate> listEstate;
	
	public EstateListExcel(List<Estate> listEstate) {
		this.listEstate=listEstate;
	}
	
	public void estateExcel(){
	 XSSFWorkbook workbook = new XSSFWorkbook();
     XSSFSheet sheet = workbook.createSheet("Ürün Listesi");
     CreationHelper createHelper = workbook.getCreationHelper();
    
     // Create a Font for styling header cells
     Font headerFont = workbook.createFont();
     headerFont.setBold(true);
     headerFont.setFontHeightInPoints((short) 14);
     headerFont.setColor(IndexedColors.RED.getIndex());

     // Create a CellStyle with the font
     CellStyle headerCellStyle = workbook.createCellStyle();
     headerCellStyle.setFont(headerFont);

     // Create a Row
     Row headerRow = sheet.createRow(0);
     
     // Create cells
     for(int i = 0; i < columns.length; i++) {
         Cell cell = headerRow.createCell(i);
         cell.setCellValue(columns[i]);
         cell.setCellStyle(headerCellStyle);
     }
     
     
  // Create Cell Style for formatting Date
     CellStyle dateCellStyle = workbook.createCellStyle();
     dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));
     int rowNum = 1;
 		
		for (int i = 0; i < listEstate.size(); i++) {
				Row row = sheet.createRow(rowNum++);		
				row.createCell(0).setCellValue(listEstate.get(i).getId());
				
				if(listEstate.get(i).getRealEstateAgent().getAgentName()!=null)
					row.createCell(1).setCellValue(listEstate.get(i).getRealEstateAgent().getAgentName());
				else
					row.createCell(1).setCellValue("");
				
				if(listEstate.get(i).getCustomer().getName()!=null)
					row.createCell(2).setCellValue(listEstate.get(i).getCustomer().getName()+" "+listEstate.get(i).getCustomer().getSurname());
				else
					row.createCell(2).setCellValue("");
				
				
				if(listEstate.get(i).getEstateType()!=null)
					row.createCell(3).setCellValue(listEstate.get(i).getEstateType());
				else
					row.createCell(3).setCellValue("");
				
				if(listEstate.get(i).getEstateState()!=null)
					row.createCell(4).setCellValue(listEstate.get(i).getEstateState());
				else
					row.createCell(4).setCellValue("");
				
				if(listEstate.get(i).getPrice()!=null)
					row.createCell(5).setCellValue(listEstate.get(i).getPrice());
				else
					row.createCell(5).setCellValue("");
				
				if(listEstate.get(i).getSize()!=null)
					row.createCell(6).setCellValue(listEstate.get(i).getSize());
				else
					row.createCell(6).setCellValue("");
				
				if(listEstate.get(i).getRoomNumber()!=null)
					row.createCell(7).setCellValue(listEstate.get(i).getRoomNumber());
				else
					row.createCell(7).setCellValue("");
				if(listEstate.get(i).getFloor()!=null)
					row.createCell(8).setCellValue(listEstate.get(i).getRoomNumber());
				else
					row.createCell(8).setCellValue("");
				
				if(listEstate.get(i).getBuildingAge()!=null)
					row.createCell(9).setCellValue(listEstate.get(i).getBuildingAge());
				else
					row.createCell(9).setCellValue("");
				
				if(listEstate.get(i).getBuildingType()!=null)
					row.createCell(10).setCellValue(listEstate.get(i).getBuildingType());
				else
					row.createCell(10).setCellValue("");
				
				if(listEstate.get(i).getWarmingType()!=null)
					row.createCell(11).setCellValue(listEstate.get(i).getWarmingType());
				else
					row.createCell(11).setCellValue("");
				
				if(listEstate.get(i).getDeedType()!=null)
					row.createCell(12).setCellValue(listEstate.get(i).getDeedType());
				else
					row.createCell(12).setCellValue("");
				
				if(listEstate.get(i).getAddress()!=null)
					row.createCell(13).setCellValue(listEstate.get(i).getAddress());
				else
					row.createCell(13).setCellValue("");
				
			}
	

	 // Resize all columns to fit the content size
	    for(int i = 0; i < columns.length; i++) {
	        sheet.autoSizeColumn(i);
	    }
	
	    try {
         FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
         workbook.write(outputStream);
         workbook.close();
     } catch (FileNotFoundException e) {
         e.printStackTrace();
     } catch (IOException e) {
         e.printStackTrace();
     }

 }

}
