package org.example.record;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class RecordType08 {

    public static Element getRecord08(Document doc, String[] insureData) {
        Element record08 = doc.createElement("record");

        Attr attrType = doc.createAttribute("recordType");
        attrType.setValue(String.valueOf("08"));
        record08.setAttributeNode(attrType);

        Element field01 = doc.createElement("field");
        field01.setAttribute("fieldName", "cRecordType");
        field01.setTextContent("08");
        record08.appendChild(field01);

        Element field2 = doc.createElement("field");
        field2.setAttribute("fieldName", "cRecordVersion");
        field2.setTextContent("1");
        record08.appendChild(field2);

        Element field3 = doc.createElement("field");
        field3.setAttribute("fieldName", "cDocId");
        field3.setTextContent("1");
        record08.appendChild(field3);

        return record08;
    }

}
