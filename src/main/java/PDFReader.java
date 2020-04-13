import org.apache.pdfbox.cos.COSName;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDResources;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDTrueTypeFont;
import org.apache.pdfbox.pdmodel.font.encoding.Encoding;
import org.apache.pdfbox.pdmodel.font.encoding.WinAnsiEncoding;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class PDFReader {


    public static void main(String[] args) {
        try (PDDocument document = PDDocument.load( PDFReader.class.getResourceAsStream("Rajasthan.pdf"))) {

            PDFont font = PDTrueTypeFont.load(document, PDFReader.class.getResourceAsStream("fonts/DevLys 010 Normal.ttf"), Encoding.getInstance(COSName.WIN_ANSI_ENCODING));

            PDResources defaultResources = document.getDocumentCatalog().getAcroForm().getDefaultResources();
            if(defaultResources == null)
                defaultResources = new PDResources();

            defaultResources.add(font);

            //if (!document.isEncrypted()) {

                PDFTextStripperByArea stripper = new PDFTextStripperByArea();
                stripper.setSortByPosition(true);

                PDFTextStripper tStripper = new PDFTextStripper();

                String pdfFileInText = tStripper.getText(document);
                //System.out.println("Text:" + st);

                // split by whitespace
                String lines[] = pdfFileInText.split("\\r?\\n");
                for (String line : lines) {
                    System.out.println(line);
                    // to convert the pdf to excel in the following format -
                    // Country	State	City	Name of Gaushala	No of Cows	Address	E-Mail ID	Phone No	Website	Social media links	Single Point of Contact (SPOC)	Referral Contact (if any)	Remarks / Comment	Goshala Verified
                }

            //}

        } catch (InvalidPasswordException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
