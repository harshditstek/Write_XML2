package org.example.record;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class RecordType11 {

    public static Element getRecord11(Document doc, String[] insureData) {
        Element record11 = doc.createElement("record");
        Attr attrType = doc.createAttribute("recordType");
        attrType.setValue(String.valueOf("11"));
        record11.setAttributeNode(attrType);

        Element field4 = doc.createElement("field");
        field4.setAttribute("fieldName", "cSequence");
        field4.setTextContent("");
        record11.appendChild(field4);

        Element field5 = doc.createElement("field");
        field5.setAttribute("fieldName", "cFromPageNumber");
        field5.setTextContent("");
        record11.appendChild(field5);

        Element field11 = doc.createElement("field");
        field11.setAttribute("fieldName", "cToPageNumber");
        field11.setTextContent("");
        record11.appendChild(field11);

        return record11;
    }
}
