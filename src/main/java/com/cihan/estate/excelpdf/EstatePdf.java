package com.cihan.estate.excelpdf;

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
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfWriter;

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
	        String message = "aaaaaaaaaaaaa fffffffffffffffffff ";
	        
	        Document document = new Document( PageSize.A4, 50, 50, 100, 100 );
	        PdfWriter.getInstance(document, new FileOutputStream(filename));
	         
	        document.open();
	        
	       // Font fontB = FontFactory.getFont(FontFactory.COURIER, 30, BaseColor.BLACK);
	        BaseFont bf = BaseFont.createFont(BaseFont.TIMES_ROMAN, "Cp1254", BaseFont.EMBEDDED);
		    Font fontB = new Font(bf, 30, Font.BOLD, BaseColor.BLUE);
		    
	        
	        Chunk chunk = new Chunk("EMLAK BİLGİSİ ", fontB);
	        document.add(chunk);
	        document.add(Chunk.NEWLINE );
	        document.add(Chunk.NEWLINE );
	        document.add(Chunk.NEWLINE );
	        
	        //Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
	        BaseFont bf1 = BaseFont.createFont(BaseFont.TIMES_ROMAN, "Cp1254", BaseFont.EMBEDDED);
		    Font font = new Font(bf, 15, Font.BOLD, BaseColor.BLUE);
	        
	      //  document.add( new Paragraph( "Hello, World!" ) );
	        document.add( new Paragraph( "Emlağın Adresi : " +estate.getAddress() ) );
	        document.add( new Paragraph( "Emlağın Adresi : " +estate.getAddress() ) );
	        document.add( new Paragraph( "Emlağın Adresi : " +estate.getAddress() ) );
	        document.add( new Paragraph( "Emlağın Adresi : " +estate.getAddress() ) );
	        document.add( new Paragraph( "Emlağın Adresi : " +estate.getAddress() ) );
	        document.add( new Paragraph( "Emlağın Adresi : " +estate.getAddress() ) );
	        document.add( new Paragraph( "Emlağın Adresi : " +estate.getAddress() ) );
	        document.add( new Paragraph( "Emlağın Adresi : " +estate.getAddress() ) );
	        


	        
	        document.close();
	        
	       
	    }


}
