package org.example.record;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class RecordType12 {

    public static Element getRecord12(Document doc, String[] insureData) {
        Element record12 = doc.createElement("record");
        Attr attrType = doc.createAttribute("recordType");
        attrType.setValue(String.valueOf("12"));
        record12.setAttributeNode(attrType);

        Element field4 = doc.createElement("field");
        field4.setAttribute("fieldName", "cObjectStore");
        field4.setTextContent("Null");
        record12.appendChild(field4);

        return record12;
    }
}
