package org.example.Record;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class CreateXmlFileDemo {

    public static void writeXml(List<String[]> insure) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();
            Element document = null;
            Element formatId = null;

            Element rootElement = doc.createElement("file");
            doc.appendChild(rootElement);

            formatId = doc.createElement("formatId");
            formatId.setTextContent("001");
            rootElement.appendChild(formatId);

            document = doc.createElement("document");
            rootElement.appendChild(document);

            for(int i=0;i<insure.size();i++) {
                Element record00 = RecordType00.getRecord00(doc, insure.get(i));
                document.appendChild(record00);

                Element record02 = RecordType02.getRecord02(doc, insure.get(i));
                document.appendChild(record02);

                Element record03 = RecordType03.getRecord03(doc);
                document.appendChild(record03);

                Element record04 = RecordType04.getRecord04(doc);
                document.appendChild(record04);

                Element record05 = RecordType05.getRecord05(doc);
                document.appendChild(record05);

                Element record07 = RecordType07.getRecord07(doc);
                document.appendChild(record07);

                Element record08 = RecordType08.getRecord08(doc);
                document.appendChild(record08);
            }


//            Element record17 = Record.getRecord17(doc, headerData, clmdetList.get(0));
//            document.appendChild(record17);

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMddyy");
            LocalDateTime now = LocalDateTime.now();
            String filePath = "/tmp/" + "BL_CHK_" + dtf.format(now) + ".xml";

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(filePath));
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setParameter(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.METHOD, "html");
            transformer.transform(source, result);
            //StreamResult consoleResult = new StreamResult(System.out);
            //transformer.transform(source, consoleResult);
            System.out.println("file saved in this location: " + filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}