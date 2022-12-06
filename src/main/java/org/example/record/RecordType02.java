package org.example.record;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class RecordType02 {

    public static Element getRecordInsure02(Document doc, String[] insdep) {

        Element record02 = doc.createElement("record");
        Attr attrType = doc.createAttribute("recordType");
        attrType.setValue("02");
        record02.setAttributeNode(attrType);

        Element field7 = doc.createElement("field");
        field7.setAttribute("fieldName", "cFullName");
        field7.setTextContent(insdep[0].trim()+" "+insdep[1].trim());
        record02.appendChild(field7);

        Element field9 = doc.createElement("field");
        field9.setAttribute("fieldName", "cPrefix");
        field9.setTextContent("");
        record02.appendChild(field9);

        Element field10 = doc.createElement("field");
        field10.setAttribute("fieldName", "cFirstName");
        field10.setTextContent(insdep[0].trim());
        record02.appendChild(field10);

        Element field11 = doc.createElement("field");
        field11.setAttribute("fieldName", "cLastName");
        field11.setTextContent(insdep[1].trim());
        record02.appendChild(field11);

        Element field12 = doc.createElement("field");
        field12.setAttribute("fieldName", "cMiddleInitial");
        field12.setTextContent("");
        record02.appendChild(field12);

        Element field13 = doc.createElement("field");
        field13.setAttribute("fieldName", "cSuffix");
        field13.setTextContent("");
        record02.appendChild(field13);

        Element field14 = doc.createElement("field");
        field14.setAttribute("fieldName", " cDependentPrimCareNpi");
        field14.setTextContent("");
        record02.appendChild(field14);

        return record02;
    }

    public static Element getRecord02(Document doc) {

        Element record02 = doc.createElement("record");
        Attr attrType = doc.createAttribute("recordType");
        attrType.setValue("02");
        record02.setAttributeNode(attrType);

        Element field7 = doc.createElement("field");
        field7.setAttribute("fieldName", "cFullName");
        field7.setTextContent("");
        record02.appendChild(field7);

        Element field9 = doc.createElement("field");
        field9.setAttribute("fieldName", "cPrefix");
        field9.setTextContent("");
        record02.appendChild(field9);

        Element field10 = doc.createElement("field");
        field10.setAttribute("fieldName", "cFirstName");
        field10.setTextContent("");
        record02.appendChild(field10);

        Element field11 = doc.createElement("field");
        field11.setAttribute("fieldName", "cLastName");
        field11.setTextContent("");
        record02.appendChild(field11);

        Element field12 = doc.createElement("field");
        field12.setAttribute("fieldName", "cMiddleInitial");
        field12.setTextContent("");
        record02.appendChild(field12);

        Element field13 = doc.createElement("field");
        field13.setAttribute("fieldName", "cSuffix");
        field13.setTextContent("");
        record02.appendChild(field13);

        return record02;
    }
}

