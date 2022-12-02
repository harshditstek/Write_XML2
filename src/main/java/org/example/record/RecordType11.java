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

        Element field01 = doc.createElement("field");
        field01.setAttribute("fieldName", "cRecordType");
        field01.setTextContent("11");
        record11.appendChild(field01);

        Element field2 = doc.createElement("field");
        field2.setAttribute("fieldName", "cRecordVersion");
        field2.setTextContent("1");
        record11.appendChild(field2);

        Element field3 = doc.createElement("field");
        field3.setAttribute("fieldName", "cDocId");
        field3.setTextContent("1");
        record11.appendChild(field3);

        Element field4 = doc.createElement("field");
        field4.setAttribute("fieldName", "cSequence");
        field4.setTextContent("");
        record11.appendChild(field4);

        Element field5 = doc.createElement("field");
        field5.setAttribute("fieldName", "cFromPageNumber");
        field5.setTextContent("");
        record11.appendChild(field5);

        Element field6 = doc.createElement("field");
        field6.setAttribute("fieldName", "cFromLeft");
        field6.setTextContent("");
        record11.appendChild(field6);

        Element field7 = doc.createElement("field");
        field7.setAttribute("fieldName", "cFromTop");
        field7.setTextContent("");
        record11.appendChild(field7);

        Element field9 = doc.createElement("field");
        field9.setAttribute("fieldName", "cFromRight");
        field9.setTextContent("");
        record11.appendChild(field9);

        Element field10 = doc.createElement("field");
        field10.setAttribute("fieldName", "cFromBottom");
        field10.setTextContent("");
        record11.appendChild(field10);

        Element field11 = doc.createElement("field");
        field11.setAttribute("fieldName", "cToPageNumber");
        field11.setTextContent("");
        record11.appendChild(field11);

        Element field12 = doc.createElement("field");
        field12.setAttribute("fieldName", "cToLeft");
        field12.setTextContent("");
        record11.appendChild(field12);

        Element field13 = doc.createElement("field");
        field13.setAttribute("fieldName", "cToTop");
        field13.setTextContent("");
        record11.appendChild(field13);

        Element field14 = doc.createElement("field");
        field14.setAttribute("fieldName", "cToRight");
        field14.setTextContent("");
        record11.appendChild(field14);

        Element field15 = doc.createElement("field");
        field15.setAttribute("fieldName", "cToBottom");
        field15.setTextContent("");
        record11.appendChild(field15);

        Element field16 = doc.createElement("field");
        field16.setAttribute("fieldName", "cRotationToApply");
        field16.setTextContent("");
        record11.appendChild(field16);

        Element field17 = doc.createElement("field");
        field17.setAttribute("fieldName", "cCopyOutsideArea");
        field17.setTextContent("");
        record11.appendChild(field17);

        Element field18 = doc.createElement("field");
        field18.setAttribute("fieldName", "cSourcePageHeight");
        field18.setTextContent("");
        record11.appendChild(field18);

        Element field19 = doc.createElement("field");
        field19.setAttribute("fieldName", "cSourcePageWidth");
        field19.setTextContent("");
        record11.appendChild(field19);

        return record11;
    }
}
