package modelo;

import java.io.FileOutputStream;
import javax.swing.text.Document;


public class EscritorPDF {

	public static void exritorPDF() {
		String texto = txtPrueba.getText();

		try {
			FileOutputStream archivo = new FileOutputStream("pdfPrueba.pdf");
			Document doc = new Document();
			PdfWriter.getInstance(doc, archivo);
			doc.open();
			doc.add(new Paragraph(texto));
			doc.close();
			
			System.out.println("PDF GENERADO");
		}
		catch(Exception e){
			System.out.println("error" + e);
		}
		
	}
	
}
