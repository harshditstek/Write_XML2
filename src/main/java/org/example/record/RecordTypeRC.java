package org.example.record;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class RecordTypeRC {

    public static Element getRecordRC(Document doc) {

        Element recordRC = doc.createElement("record");
        Attr attrType = doc.createAttribute("recordType");
        attrType.setValue(String.valueOf("RC"));
        recordRC.setAttributeNode(attrType);

        Element field01 = doc.createElement("field");
        field01.setAttribute("fieldName", "cRecordType");
        field01.setTextContent("RC");
        recordRC.appendChild(field01);

        Element field2 = doc.createElement("field");
        field2.setAttribute("fieldName", "cRecordVersion");
        field2.setTextContent("");
        recordRC.appendChild(field2);

        Element field3 = doc.createElement("field");
        field3.setAttribute("fieldName", "cRecordTypeCounted");
        field3.setTextContent("");
        recordRC.appendChild(field3);

        Element field4 = doc.createElement("field");
        field4.setAttribute("fieldName", "cCount");
        field4.setTextContent("");
        recordRC.appendChild(field4);

        return recordRC;
    }
    }
