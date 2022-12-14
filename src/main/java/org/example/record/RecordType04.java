package org.example.record;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class RecordType04 {

    public static Element getRecord04(Document doc, String[] insure) {
        Element record04 = doc.createElement("record");

        Attr attrType = doc.createAttribute("recordType");
        attrType.setValue("04");
        record04.setAttributeNode(attrType);

        Element field01 = doc.createElement("field");
        field01.setAttribute("fieldName", "cRecordType");
        field01.setTextContent("04");
        record04.appendChild(field01);

        Element field2 = doc.createElement("field");
        field2.setAttribute("fieldName", "cRecordVersion");
        field2.setTextContent("1");
        record04.appendChild(field2);

        Element field3 = doc.createElement("field");
        field3.setAttribute("fieldName", "cDocId");
        field3.setTextContent("1");
        record04.appendChild(field3);

        return record04;
    }
}
