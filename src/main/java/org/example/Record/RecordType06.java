package org.example.Record;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class RecordType06 {

    public static Element getRecord06(Document doc) {
        Element record06 = doc.createElement("record");
        Attr attrType = doc.createAttribute("recordType");
        attrType.setValue("06");
        record06.setAttributeNode(attrType);

        Element field01 = doc.createElement("field");
        field01.setAttribute("fieldName", "cRecordType");
        field01.setTextContent("06");
        record06.appendChild(field01);

        Element field2 = doc.createElement("field");
        field2.setAttribute("fieldName", "cRecordVersion");
        field2.setTextContent("");
        record06.appendChild(field2);

        Element field3 = doc.createElement("field");
        field3.setAttribute("fieldName", "cDocId");
        field3.setTextContent("");
        record06.appendChild(field3);

        Element field4 = doc.createElement("field");
        field4.setAttribute("fieldName", "cInsertIdType");
        field4.setTextContent("");
        record06.appendChild(field4);

        Element field5 = doc.createElement("field");
        field5.setAttribute("fieldName", "cInsertId");
        field5.setTextContent("");
        record06.appendChild(field5);

        Element field6 = doc.createElement("field");
        field6.setAttribute("fieldName", "cEliminateDuplicates");
        field6.setTextContent("");
        record06.appendChild(field6);

        Element field7 = doc.createElement("field");
        field7.setAttribute("fieldName", "cPerforationId");
        field7.setTextContent("");
        record06.appendChild(field7);

        Element field9 = doc.createElement("field");
        field9.setAttribute("fieldName", "cPerforationPageSelection");
        field9.setTextContent("");
        record06.appendChild(field9);

        Element field10 = doc.createElement("field");
        field10.setAttribute("fieldName", "cSimplexDuplex");
        field10.setTextContent("");
        record06.appendChild(field10);

        return record06;
    }
}
