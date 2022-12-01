package org.example.record;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class RecordType11 {

    public static Element getRecord11(Document doc) {
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
        field4.setAttribute("fieldName", "cObjectStore");
        field4.setTextContent("");
        record11.appendChild(field4);

        Element field5 = doc.createElement("field");
        field5.setAttribute("fieldName", "cOpenField1");
        field5.setTextContent("");
        record11.appendChild(field5);

        Element field6 = doc.createElement("field");
        field6.setAttribute("fieldName", "cOpenField2");
        field6.setTextContent("");
        record11.appendChild(field6);

        Element field7 = doc.createElement("field");
        field7.setAttribute("fieldName", "cOpenField3");
        field7.setTextContent("");
        record11.appendChild(field7);

        Element field9 = doc.createElement("field");
        field9.setAttribute("fieldName", "cOpenField4");
        field9.setTextContent("");
        record11.appendChild(field9);

        Element field10 = doc.createElement("field");
        field10.setAttribute("fieldName", "cOpenField5");
        field10.setTextContent("");
        record11.appendChild(field10);

        Element field11 = doc.createElement("field");
        field11.setAttribute("fieldName", "cOpenField6");
        field11.setTextContent("");
        record11.appendChild(field11);

        Element field12 = doc.createElement("field");
        field12.setAttribute("fieldName", "cOpenField7");
        field12.setTextContent("");
        record11.appendChild(field12);

        Element field13 = doc.createElement("field");
        field13.setAttribute("fieldName", "cOpenField8");
        field13.setTextContent("");
        record11.appendChild(field13);

        Element field14 = doc.createElement("field");
        field14.setAttribute("fieldName", "cOpenField9");
        field14.setTextContent("");
        record11.appendChild(field14);

        Element field15 = doc.createElement("field");
        field15.setAttribute("fieldName", "cOpenField10");
        field15.setTextContent("");
        record11.appendChild(field15);

        Element field16 = doc.createElement("field");
        field16.setAttribute("fieldName", "cOpenField11");
        field16.setTextContent("");
        record11.appendChild(field16);

        Element field17 = doc.createElement("field");
        field17.setAttribute("fieldName", "cOpenField12");
        field17.setTextContent("");
        record11.appendChild(field17);

        Element field18 = doc.createElement("field");
        field18.setAttribute("fieldName", "cOpenField13");
        field18.setTextContent("");
        record11.appendChild(field18);

        Element field19 = doc.createElement("field");
        field19.setAttribute("fieldName", "cOpenField14");
        field19.setTextContent("");
        record11.appendChild(field19);


        Element field20 = doc.createElement("field");
        field20.setAttribute("fieldName", "cOpenField15");
        field20.setTextContent("");
        record11.appendChild(field20);

        Element field21 = doc.createElement("field");
        field21.setAttribute("fieldName", "cOpenField16");
        field21.setTextContent("");
        record11.appendChild(field21);

        Element field22 = doc.createElement("field");
        field22.setAttribute("fieldName", "cOpenField17");
        field22.setTextContent("");
        record11.appendChild(field22);

        Element field23 = doc.createElement("field");
        field23.setAttribute("fieldName", "cOpenField18");
        field23.setTextContent("");
        record11.appendChild(field23);

        return record11;
    }
}
