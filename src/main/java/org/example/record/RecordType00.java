package org.example.record;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class RecordType00 {
    public static Element getRecord00(Document doc, String[] insure) {

        Element record00 = doc.createElement("record");
        Attr attrType = doc.createAttribute("recordType");
        attrType.setValue(String.valueOf("00"));
        record00.setAttributeNode(attrType);

        Element field01 = doc.createElement("field");
        field01.setAttribute("fieldName", "cRecordType");
        field01.setTextContent("00");
        record00.appendChild(field01);

        Element field2 = doc.createElement("field");
        field2.setAttribute("fieldName", "cRecordVersion");
        field2.setTextContent("1");
        record00.appendChild(field2);

        Element field3 = doc.createElement("field");
        field3.setAttribute("fieldName", "cDocId");
        field3.setTextContent("1");
        record00.appendChild(field3);

        Element field4 = doc.createElement("field");
        field4.setAttribute("fieldName", "cName");
        field4.setTextContent(insure[2].trim()+" " +insure[3].trim());
        record00.appendChild(field4);

        Element field6 = doc.createElement("field");
        field6.setAttribute("fieldName", "cAddress1");
        field6.setTextContent(insure[4].trim());
        record00.appendChild(field6);

        Element field10 = doc.createElement("field");
        field10.setAttribute("fieldName", "cCity");
        field10.setTextContent(insure[6].trim());
        record00.appendChild(field10);

        Element field11 = doc.createElement("field");
        field11.setAttribute("fieldName", "cState");
        field11.setTextContent(insure[7].trim());
        record00.appendChild(field11);

        Element field12 = doc.createElement("field");
        field12.setAttribute("fieldName", "cZip");
        field12.setTextContent(insure[8].trim());
        record00.appendChild(field12);

        Element field21 = doc.createElement("field");
        field21.setAttribute("fieldName", "cDocumentType");
        field21.setTextContent("");
        record00.appendChild(field21);

        Element field22 = doc.createElement("field");
        field22.setAttribute("fieldName", "cRICode");
        if(!insure[11].equals(" ") && !insure[12].equals(" ") && !insure[13].equals(" ") && !insure[14].equals(" ")){
            field22.setTextContent("MD");
        }else if(!insure[13].equals(" ") || !insure[14].equals(" ")){
            field22.setTextContent("D");
        }else if(!insure[11].equals(" ") || !insure[12].equals(" ")){
            field22.setTextContent("M");
        }else{
            field22.setTextContent("");
        }
        record00.appendChild(field22);

        Element field23 = doc.createElement("field");
        field23.setAttribute("fieldName", "cDeliveryType");
        field23.setTextContent("");
        record00.appendChild(field23);

        Element field24 = doc.createElement("field");
        field24.setAttribute("fieldName", "cReturnAddressState");
        field24.setTextContent("");
        record00.appendChild(field24);

        return record00;
    }
}
