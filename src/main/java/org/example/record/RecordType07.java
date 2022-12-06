package org.example.record;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class RecordType07 {

    public static Element getRecord07(Document doc, String [] insureData) {
        Element record07 = doc.createElement("record");

        Attr attrType = doc.createAttribute("recordType");
        attrType.setValue(String.valueOf("07"));
        record07.setAttributeNode(attrType);

        Element field4 = doc.createElement("field");
        field4.setAttribute("fieldName", "cPageNumberStart");
        field4.setTextContent("");
        record07.appendChild(field4);

        Element field5 = doc.createElement("field");
        field5.setAttribute("fieldName", "cPageNumberEnd");
        field5.setTextContent("");
        record07.appendChild(field5);

        Element field6 = doc.createElement("field");
        field6.setAttribute("fieldName", "cPaperStock");
        field6.setTextContent("");
        record07.appendChild(field6);

        return record07;
    }
}
