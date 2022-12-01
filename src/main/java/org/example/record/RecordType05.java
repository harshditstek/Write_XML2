package org.example.record;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class RecordType05 {

    public static Element getRecord05(Document doc, String[] insure) {
        Element record05 = doc.createElement("record");

        Attr attrType = doc.createAttribute("recordType");
        attrType.setValue(String.valueOf("05"));
        record05.setAttributeNode(attrType);

        Element field01 = doc.createElement("field");
        field01.setAttribute("fieldName", "cRecordType");
        field01.setTextContent("05");
        record05.appendChild(field01);

        Element field2 = doc.createElement("field");
        field2.setAttribute("fieldName", "cRecordVersion");
        field2.setTextContent("1");
        record05.appendChild(field2);

        Element field3 = doc.createElement("field");
        field3.setAttribute("fieldName", "cDocId");
        field3.setTextContent("1");
        record05.appendChild(field3);

        Element field4 = doc.createElement("field");
        field4.setAttribute("fieldName", "cName");
        field4.setTextContent(insure[2].trim()+" " +insure[3].trim());
        record05.appendChild(field4);

        Element field5 = doc.createElement("field");
        field5.setAttribute("fieldName", "cAttentionTo");
        field5.setTextContent("");
        record05.appendChild(field5);

        Element field6 = doc.createElement("field");
        field6.setAttribute("fieldName", "cAddress1");
        field6.setTextContent(insure[4].trim());
        record05.appendChild(field6);

        Element field7 = doc.createElement("field");
        field7.setAttribute("fieldName", "cAddress2");
        field7.setTextContent("");
        record05.appendChild(field7);

        Element field9 = doc.createElement("field");
        field9.setAttribute("fieldName", "cAddress3");
        field9.setTextContent("");
        record05.appendChild(field9);

        Element field10 = doc.createElement("field");
        field10.setAttribute("fieldName", "cCity");
        field10.setTextContent(insure[6].trim());
        record05.appendChild(field10);

        Element field11 = doc.createElement("field");
        field11.setAttribute("fieldName", "cState");
        field11.setTextContent(insure[7].trim());
        record05.appendChild(field11);

        Element field12 = doc.createElement("field");
        field12.setAttribute("fieldName", "cZip");
        field12.setTextContent(insure[8].trim());
        record05.appendChild(field12);

        Element field13 = doc.createElement("field");
        field13.setAttribute("fieldName", "cInternationalCityOrTown");
        field13.setTextContent("");
        record05.appendChild(field13);

        Element field14 = doc.createElement("field");
        field14.setAttribute("fieldName", "cInternationalProvidenceOrTerritory");
        field14.setTextContent("");
        record05.appendChild(field14);

        Element field15 = doc.createElement("field");
        field15.setAttribute("fieldName", "cInternationalPostalCode");
        field15.setTextContent("");
        record05.appendChild(field15);

        Element field16 = doc.createElement("field");
        field16.setAttribute("fieldName", "cInternationalCountry");
        field16.setTextContent("");
        record05.appendChild(field16);

        Element field17 = doc.createElement("field");
        field17.setAttribute("fieldName", "cPhoneNumber");
        field17.setTextContent("");
        record05.appendChild(field17);

        Element field18 = doc.createElement("field");
        field18.setAttribute("fieldName", "cEmailAddress");
        field18.setTextContent("");
        record05.appendChild(field18);

        Element field19 = doc.createElement("field");
        field19.setAttribute("fieldName", "cEmailAddressForNotification");
        field19.setTextContent("");
        record05.appendChild(field19);

        return record05;
    }
}
