package org.example.record;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class RecordType06 {

    public static Element getRecord06(Document doc, String [] insureData) {
        Element record06 = doc.createElement("record");
        Attr attrType = doc.createAttribute("recordType");
        attrType.setValue("06");
        record06.setAttributeNode(attrType);

        Element field4 = doc.createElement("field");
        field4.setAttribute("fieldName", "cInsertIdType");
        field4.setTextContent("1");
        record06.appendChild(field4);

        Element field5 = doc.createElement("field");
        field5.setAttribute("fieldName", "cInsertId");
        field5.setTextContent("");
        record06.appendChild(field5);

        Element field6 = doc.createElement("field");
        field6.setAttribute("fieldName", "cEliminateDuplicates");
        field6.setTextContent("");
        record06.appendChild(field6);

        return record06;
    }
}
