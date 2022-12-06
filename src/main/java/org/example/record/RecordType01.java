package org.example.record;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class RecordType01 {

    public static Element getRecord01(Document doc, String[] insure) {

        Element record01 = doc.createElement("record");
        Attr attrType = doc.createAttribute("recordType");
        attrType.setValue(String.valueOf("01"));
        record01.setAttributeNode(attrType);

        Element field04 = doc.createElement("field");
        field04.setAttribute("fieldName", "cGroupName");
        field04.setTextContent("");
        record01.appendChild(field04);

        Element field4 = doc.createElement("field");
        field4.setAttribute("fieldName", "cGroupHierarchy1");
        field4.setTextContent("");
        record01.appendChild(field4);

        Element field15 = doc.createElement("field");
        field15.setAttribute("fieldName", "cEnrolleeFullName");
        field15.setTextContent(insure[2].trim()+" " +insure[3].trim());
        record01.appendChild(field15);

        Element field16 = doc.createElement("field");
        field16.setAttribute("fieldName", "cEnrolleePrefix");
        field16.setTextContent("");
        record01.appendChild(field16);

        Element field17 = doc.createElement("field");
        field17.setAttribute("fieldName", "cEnrolleeFirstName");
        field17.setTextContent(insure[2].trim());
        record01.appendChild(field17);

        Element field18 = doc.createElement("field");
        field18.setAttribute("fieldName", "cEnrolleeLastName");
        field18.setTextContent(insure[3].trim());
        record01.appendChild(field18);

        Element field19 = doc.createElement("field");
        field19.setAttribute("fieldName", "cEnrolleeMiddleInitial");
        field19.setTextContent("");
        record01.appendChild(field19);

        Element field20 = doc.createElement("field");
        field20.setAttribute("fieldName", "cEnrolleeSuffix");
        field20.setTextContent("");
        record01.appendChild(field20);

        Element field21 = doc.createElement("field");
        field21.setAttribute("fieldName", "cEnrolleeId");
        field21.setTextContent("");
        record01.appendChild(field21);

        return record01;
    }
}
