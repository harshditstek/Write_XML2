package org.example.record;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.example.beans.Insure;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CreateXmlFileDemo {
    public static void writeXml(List<String[]> insureList) {
        try {
            List<String[]> insdepList = new ArrayList<String[]>();
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();
            Element document = null;
            Element formatId = null;

            Element rootElement = doc.createElement("file");
            doc.appendChild(rootElement);

            formatId = doc.createElement("formatId");
            formatId.setTextContent("000");
            rootElement.appendChild(formatId);
            int i=0;
            for(String[] insureData:insureList){
                i++;

                document = doc.createElement("document");
                rootElement.appendChild(document);

                Attr attr = doc.createAttribute("inboundDocumentIdentifier");
                attr.setValue(String.valueOf(i));
                document.setAttributeNode(attr);

                Element record00 = RecordType00.getRecord00(doc, insureData);
                document.appendChild(record00);

                Element record01 = RecordType01.getRecord01(doc, insureData);
                document.appendChild(record01);

                insdepList = Insure.searchInsdepData(insureData[1]);

                Element record02;
                if(insdepList.size()>0){
                    for(String[] insdep:insdepList){
                        record02 = RecordType02.getRecordInsure02(doc, insdep);
                        document.appendChild(record02);
                    }
                }else{
                    record02 = RecordType02.getRecord02(doc);
                    document.appendChild(record02);
                }

                Element record03 = RecordType03.getRecord03(doc, insureData);
                document.appendChild(record03);

                Element record04 = RecordType04.getRecord04(doc, insureData);
                document.appendChild(record04);

                Element record05 = RecordType05.getRecord05(doc, insureData);
                document.appendChild(record05);

                Element record06 = RecordType06.getRecord06(doc);
                document.appendChild(record06);

                Element record07 = RecordType07.getRecord07(doc);
                document.appendChild(record07);

                Element record08 = RecordType08.getRecord08(doc);
                document.appendChild(record08);

                Element record09 = RecordType09.getRecord09(doc);
                document.appendChild(record09);

                Element record10 = RecordType10.getRecord10(doc);
                document.appendChild(record10);

                Element record11 = RecordType11.getRecord11(doc);
                document.appendChild(record11);

                Element recordRC = RecordTypeRC.getRecordRC(doc);
                document.appendChild(recordRC);
            }

            String filePath = "/tmp/" + "999920220304R01E584D11.xml";

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(filePath));
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setParameter(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.METHOD, "html");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

            transformer.transform(source, result);
            System.out.println("file saved in this location: " + filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}