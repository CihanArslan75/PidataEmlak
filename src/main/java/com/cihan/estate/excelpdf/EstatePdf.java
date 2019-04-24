package com.cihan.estate.excelpdf;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import com.cihan.estate.models.Estate;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfImage;
import com.itextpdf.text.pdf.PdfIndirectObject;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.parser.Path;
import com.itextpdf.text.pdf.parser.clipper.Paths;

public class EstatePdf {
	private Estate estate;
	
	public EstatePdf( Estate estate) {
		this.estate=estate;
		try {
			getPdf();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static final String RESULT = "hello.pdf";
	
	 public void getPdf() throws DocumentException, IOException {
		 
		    String filename = "C:/Doc/BlankPdf.pdf";
	        
	        Document document = new Document( PageSize.A4, 50, 50, 80, 20 );
	        PdfWriter.getInstance(document, new FileOutputStream(filename));
	         
	        document.open();
	        
	       // Font fontB = FontFactory.getFont(FontFactory.COURIER, 30, BaseColor.BLACK);
	        BaseFont bf = BaseFont.createFont(BaseFont.TIMES_ROMAN, "Cp1254", BaseFont.EMBEDDED);
		    Font fontB = new Font(bf, 30, Font.BOLD, BaseColor.RED);
		    System.out.println("img1:");
		    String imgPath = "C:/Doc/emlak1.jpg";
		    Image img = null;
		    System.out.println("img2:");
		    
		    
	        Chunk chunk = new Chunk("EMLAK BİLGİSİ ", fontB);
	        document.add(chunk);
	        document.add(Chunk.NEWLINE );
	        System.out.println("img3");
            try {
            	 img = Image.getInstance(imgPath);
            	 document.add(img);
			} catch (Exception e) {
				// TODO: handle exception
			}
           
	        
            System.out.println("img4:");
	       
			
	              
	        BaseFont bf1 = BaseFont.createFont(BaseFont.TIMES_ROMAN, "Cp1254", BaseFont.EMBEDDED);
		    Font font = new Font(bf, 15, Font.BOLD, BaseColor.BLUE);
	   
	        document.add( new Paragraph( "Yetkili İşletme Adı : " +estate.getRealEstateAgent().getAgentName() ,font) );
	        document.add(Chunk.NEWLINE );
	        document.add( new Paragraph( "Müşteri Adı Soyadı : " +estate.getCustomer().getName()+" "+estate.getCustomer().getSurname() ,font) );
	        document.add(Chunk.NEWLINE );
	        document.add( new Paragraph( "Emlak Tipi : " +estate.getEstateType() ,font) );
	        
	        document.add( new Paragraph( "Emlağın Durumu : " +estate.getEstateState() ,font) );
	        
	        document.add( new Paragraph( "Fiyatı : " +estate.getPrice()  ,font));
	       
	        document.add( new Paragraph( "MetreKaresi : " +estate.getSize() ,font) );
	       
	        document.add( new Paragraph( "Oda Sayısı : " +estate.getRoomNumber() ,font) );
	       
	        document.add( new Paragraph( "Katı : " +estate.getFloor() ,font) );
	        
	        document.add( new Paragraph( "Emlağın Yaşı : " +estate.getBuildingAge() ,font) );
	        
	        document.add( new Paragraph( "Yapı Tipi : " +estate.getBuildingType() ,font) );
	        
	        document.add( new Paragraph( "Isınma Tipi : " +estate.getWarmingType() ,font) );
	        
	        document.add( new Paragraph( "Tapunun Türü : " +estate.getDeedType() ,font) );
	        document.add( new Paragraph( "Adres: " +estate.getAddress() ,font) );

	        
	       
	        


	        
	        document.close();
	        
	       
	    }


}
