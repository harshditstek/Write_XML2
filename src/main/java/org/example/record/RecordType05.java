package org.example.record;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class RecordType05 {

    public static Element getRecord05(Document doc, String[] insure) {

        Element record05 = doc.createElement("record");
        Attr attrType = doc.createAttribute("recordType");
        attrType.setValue(String.valueOf("05"));
        record05.setAttributeNode(attrType);

        Element field4 = doc.createElement("field");
        field4.setAttribute("fieldName", "cName");
        field4.setTextContent(insure[2].trim()+" " +insure[3].trim());
        record05.appendChild(field4);

        Element field6 = doc.createElement("field");
        field6.setAttribute("fieldName", "cAddress1");
        field6.setTextContent(insure[4].trim());
        record05.appendChild(field6);

        Element field10 = doc.createElement("field");
        field10.setAttribute("fieldName", "cCity");
        field10.setTextContent(insure[6].trim());
        record05.appendChild(field10);

        Element field11 = doc.createElement("field");
        field11.setAttribute("fieldName", "cState");
        field11.setTextContent(insure[7].trim());
        record05.appendChild(field11);

        Element field12 = doc.createElement("field");
        field12.setAttribute("fieldName", "cZip");
        field12.setTextContent(insure[8].trim());
        record05.appendChild(field12);

        return record05;
    }
}
