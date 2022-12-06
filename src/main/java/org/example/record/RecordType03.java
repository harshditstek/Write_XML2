package org.example.record;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class RecordType03 {
    public static Element getRecord03(Document doc, String[] insureData) {
        Element record03 = doc.createElement("record");
        Attr attrType = doc.createAttribute("recordType");
        attrType.setValue(String.valueOf("03"));
        record03.setAttributeNode(attrType);

        Element field5 = doc.createElement("field");
        field5.setAttribute("fieldName", "cPlanType");
        field5.setTextContent("");
        record03.appendChild(field5);

        Element field10 = doc.createElement("field");
        field10.setAttribute("fieldName", "cNetworkCode");
        field10.setTextContent("");
        record03.appendChild(field10);

        return record03;
    }
}
