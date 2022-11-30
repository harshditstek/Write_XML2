package org.example.Record;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class RecordType09 {

    public static Element getRecord09(Document doc) {
        Element record09 = doc.createElement("record");
        Attr attrType = doc.createAttribute("recordType");
        attrType.setValue(String.valueOf("09"));
        record09.setAttributeNode(attrType);

        Element field01 = doc.createElement("field");
        field01.setAttribute("fieldName", "cRecordType");
        field01.setTextContent("09");
        record09.appendChild(field01);

        Element field2 = doc.createElement("field");
        field2.setAttribute("fieldName", "cRecordVersion");
        field2.setTextContent("");
        record09.appendChild(field2);

        Element field3 = doc.createElement("field");
        field3.setAttribute("fieldName", "cDocId");
        field3.setTextContent("");
        record09.appendChild(field3);

        Element field4 = doc.createElement("field");
        field4.setAttribute("fieldName", "cOpenDate1");
        field4.setTextContent("");
        record09.appendChild(field4);

        Element field5 = doc.createElement("field");
        field5.setAttribute("fieldName", "cOpenDate2");
        field5.setTextContent("");
        record09.appendChild(field5);

        Element field6 = doc.createElement("field");
        field6.setAttribute("fieldName", "cOpenDate3");
        field6.setTextContent("");
        record09.appendChild(field6);

        Element field7 = doc.createElement("field");
        field7.setAttribute("fieldName", "cOpenDate4");
        field7.setTextContent("");
        record09.appendChild(field7);

        Element field9 = doc.createElement("field");
        field9.setAttribute("fieldName", "cOpenDate5");
        field9.setTextContent("");
        record09.appendChild(field9);

        Element field10 = doc.createElement("field");
        field10.setAttribute("fieldName", "cOpenAmount1");
        field10.setTextContent("");
        record09.appendChild(field10);

        Element field11 = doc.createElement("field");
        field11.setAttribute("fieldName", "cOpenAmount2");
        field11.setTextContent("");
        record09.appendChild(field11);

        Element field12 = doc.createElement("field");
        field12.setAttribute("fieldName", "cOpenAmount3");
        field12.setTextContent(" ");
        record09.appendChild(field12);

        Element field13 = doc.createElement("field");
        field13.setAttribute("fieldName", "cOpenAmount4");
        field13.setTextContent("");
        record09.appendChild(field13);

        Element field14 = doc.createElement("field");
        field14.setAttribute("fieldName", "cOpenAmount5");
        field14.setTextContent("");
        record09.appendChild(field14);

        Element field15 = doc.createElement("field");
        field15.setAttribute("fieldName", "cOpenAmount6");
        field15.setTextContent("");
        record09.appendChild(field15);

        Element field16 = doc.createElement("field");
        field16.setAttribute("fieldName", "cOpenAmount7");
        field16.setTextContent("");
        record09.appendChild(field16);

        Element field17 = doc.createElement("field");
        field17.setAttribute("fieldName", "cOpenAmount8");
        field17.setTextContent("");
        record09.appendChild(field17);

        Element field18 = doc.createElement("field");
        field18.setAttribute("fieldName", "cOpenAmount9");
        field18.setTextContent("");
        record09.appendChild(field18);

        Element field19 = doc.createElement("field");
        field19.setAttribute("fieldName", "cOpenAmount10");
        field19.setTextContent("");
        record09.appendChild(field19);


        Element field20 = doc.createElement("field");
        field20.setAttribute("fieldName", "cOpenField1");
        field20.setTextContent("");
        record09.appendChild(field20);

        Element field21 = doc.createElement("field");
        field21.setAttribute("fieldName", "cOpenField2");
        field21.setTextContent("");
        record09.appendChild(field21);

        Element field22 = doc.createElement("field");
        field22.setAttribute("fieldName", "cOpenField3");
        field22.setTextContent("");
        record09.appendChild(field22);

        Element field23 = doc.createElement("field");
        field23.setAttribute("fieldName", "cOpenField4");
        field23.setTextContent("");
        record09.appendChild(field23);

        Element field24 = doc.createElement("field");
        field24.setAttribute("fieldName", "cOpenField5");
        field24.setTextContent("");
        record09.appendChild(field24);

        Element field25 = doc.createElement("field");
        field25.setAttribute("fieldName", "cOpenField6");
        field25.setTextContent("");
        record09.appendChild(field25);

        Element field26 = doc.createElement("field");
        field26.setAttribute("fieldName", "cOpenField7");
        field26.setTextContent("");
        record09.appendChild(field26);

        Element field27 = doc.createElement("field");
        field27.setAttribute("fieldName", "cOpenField8");
        field27.setTextContent("");
        record09.appendChild(field27);

        Element field28 = doc.createElement("field");
        field28.setAttribute("fieldName", "cOpenField9");
        field28.setTextContent("");
        record09.appendChild(field28);

        Element field29 = doc.createElement("field");
        field29.setAttribute("fieldName", "cOpenField10");
        field29.setTextContent("");
        record09.appendChild(field29);

        Element field30 = doc.createElement("field");
        field30.setAttribute("fieldName", "cOpenField11");
        field30.setTextContent("");
        record09.appendChild(field30);

        Element field31 = doc.createElement("field");
        field31.setAttribute("fieldName", "cOpenField12");
        field31.setTextContent("");
        record09.appendChild(field31);

        Element field32 = doc.createElement("field");
        field32.setAttribute("fieldName", "cOpenField13");
        field32.setTextContent("");
        record09.appendChild(field32);

        Element field33 = doc.createElement("field");
        field33.setAttribute("fieldName", "cOpenField14");
        field33.setTextContent("");
        record09.appendChild(field33);

        Element field34 = doc.createElement("field");
        field34.setAttribute("fieldName", "cOpenField15");
        field34.setTextContent("");
        record09.appendChild(field34);

        Element field35 = doc.createElement("field");
        field35.setAttribute("fieldName", "cOpenField16");
        field35.setTextContent("");
        record09.appendChild(field35);

        Element field36 = doc.createElement("field");
        field36.setAttribute("fieldName", "cOpenField17");
        field36.setTextContent("");
        record09.appendChild(field36);

        Element field37 = doc.createElement("field");
        field37.setAttribute("fieldName", "cOpenField18");
        field37.setTextContent("");
        record09.appendChild(field37);

        Element field38 = doc.createElement("field");
        field38.setAttribute("fieldName", "cOpenField19");
        field38.setTextContent("");
        record09.appendChild(field38);

        Element field39 = doc.createElement("field");
        field39.setAttribute("fieldName", "cOpenField20");
        field39.setTextContent("");
        record09.appendChild(field39);

        Element field40 = doc.createElement("field");
        field40.setAttribute("fieldName", "cCustomRecordType");
        field40.setTextContent("");
        record09.appendChild(field40);

        Element field41 = doc.createElement("field");
        field41.setAttribute("fieldName", "cCustomReportCondition1");
        field41.setTextContent("");
        record09.appendChild(field41);

        Element field42 = doc.createElement("field");
        field42.setAttribute("fieldName", "cCustomReportCondition2");
        field42.setTextContent("");
        record09.appendChild(field42);

        Element field43 = doc.createElement("field");
        field43.setAttribute("fieldName", "cCustomReportCondition3");
        field43.setTextContent("");
        record09.appendChild(field43);

        Element field44 = doc.createElement("field");
        field44.setAttribute("fieldName", "cCustomReportCondition4");
        field44.setTextContent("");
        record09.appendChild(field44);

        Element field45 = doc.createElement("field");
        field45.setAttribute("fieldName", "cCustomReportCondition5");
        field45.setTextContent("");
        record09.appendChild(field45);


        return record09;
    }
}
