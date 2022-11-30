package org.example.Record;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class RecordType07 {

    public static Element getRecord07(Document doc) {
        Element record07 = doc.createElement("record");

        Attr attrType = doc.createAttribute("recordType");
        attrType.setValue(String.valueOf("03"));
        record07.setAttributeNode(attrType);

        Element field01 = doc.createElement("field");
        field01.setAttribute("fieldName", "cRecordType");
        field01.setTextContent("02");
        record07.appendChild(field01);

        Element field2 = doc.createElement("field");
        field2.setAttribute("fieldName", "cRecordVersion");
        field2.setTextContent("");
        record07.appendChild(field2);

        Element field3 = doc.createElement("field");
        field3.setAttribute("fieldName", "cDocId");
        field3.setTextContent("");
        record07.appendChild(field3);

        Element field4 = doc.createElement("field");
        field4.setAttribute("fieldName", "cPageNumberStart");
        field4.setTextContent("");
        record07.appendChild(field4);

        Element field5 = doc.createElement("field");
        field5.setAttribute("fieldName", "cPageNumberEnd");
        field5.setTextContent("");
        record07.appendChild(field5);

        Element field6 = doc.createElement("field");
        field6.setAttribute("fieldName", "cPaperStock");
        field6.setTextContent("");
        record07.appendChild(field6);

        Element field7 = doc.createElement("field");
        field7.setAttribute("fieldName", "cPDFType");
        field7.setTextContent("");
        record07.appendChild(field7);

        Element field8 = doc.createElement("field");
        field8.setAttribute("fieldName", "cUseSpecificPageMargins");
        field8.setTextContent("");
        record07.appendChild(field8);

        Element field9 = doc.createElement("field");
        field9.setAttribute("fieldName", "cTopMarginInInches");
        field9.setTextContent("");
        record07.appendChild(field9);

        Element field10 = doc.createElement("field");
        field10.setAttribute("fieldName", "cBottomMarginInInches");
        field10.setTextContent("");
        record07.appendChild(field10);

        Element field11 = doc.createElement("field");
        field11.setAttribute("fieldName", "cLeftMarginInInches");
        field11.setTextContent("");
        record07.appendChild(field11);

        Element field12 = doc.createElement("field");
        field12.setAttribute("fieldName", "cRightMarginInInches");
        field12.setTextContent("");
        record07.appendChild(field12);

        return record07;
    }
}
