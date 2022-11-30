package org.example.Record;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class RecordType00 {
    public static Element getRecord00(Document doc) {
        Element record02 = doc.createElement("record");
        Attr attrType = doc.createAttribute("recordType");
        attrType.setValue(String.valueOf("00"));
        record02.setAttributeNode(attrType);

        Element field01 = doc.createElement("field");
        field01.setAttribute("fieldName", "cRecordType");
        field01.setTextContent("00");
        record02.appendChild(field01);

        Element field2 = doc.createElement("field");
        field2.setAttribute("fieldName", "cRecordVersion");
        field2.setTextContent("");
        record02.appendChild(field2);

        Element field3 = doc.createElement("field");
        field3.setAttribute("fieldName", "cDocId");
        field3.setTextContent("");
        record02.appendChild(field3);

        Element field4 = doc.createElement("field");
        field4.setAttribute("fieldName", "cName");
        field4.setTextContent("");
        record02.appendChild(field4);

        Element field5 = doc.createElement("field");
        field5.setAttribute("fieldName", "cName2");
        field5.setTextContent("");
        record02.appendChild(field5);

        Element field6 = doc.createElement("field");
        field6.setAttribute("fieldName", "cAddress1");
        field6.setTextContent("");
        record02.appendChild(field6);

        Element field7 = doc.createElement("field");
        field7.setAttribute("fieldName", "cAddress2");
        field7.setTextContent("");
        record02.appendChild(field7);

        Element field9 = doc.createElement("field");
        field9.setAttribute("fieldName", "cAddress3");
        field9.setTextContent("");
        record02.appendChild(field9);

        Element field10 = doc.createElement("field");
        field10.setAttribute("fieldName", "cAddress4");
        field10.setTextContent("");
        record02.appendChild(field10);

        Element field11 = doc.createElement("field");
        field11.setAttribute("fieldName", "cLastName");
        field11.setTextContent("");
        record02.appendChild(field11);

        Element field12 = doc.createElement("field");
        field12.setAttribute("fieldName", "cMiddleInitial");
        field12.setTextContent(" ");
        record02.appendChild(field12);

        Element field13 = doc.createElement("field");
        field13.setAttribute("fieldName", "cSuffix");
        field13.setTextContent("");
        record02.appendChild(field13);

        Element field14 = doc.createElement("field");
        field14.setAttribute("fieldName", "cAge");
        field14.setTextContent("");
        record02.appendChild(field14);

        Element field15 = doc.createElement("field");
        field15.setAttribute("fieldName", "cDateOfBirth");
        field15.setTextContent("");
        record02.appendChild(field15);

        Element field16 = doc.createElement("field");
        field16.setAttribute("fieldName", "cSex");
        field16.setTextContent("");
        record02.appendChild(field16);

        Element field17 = doc.createElement("field");
        field17.setAttribute("fieldName", "cId");
        field17.setTextContent("");
        record02.appendChild(field17);

        Element field18 = doc.createElement("field");
        field18.setAttribute("fieldName", "cSsn");
        field18.setTextContent("");
        record02.appendChild(field18);

        Element field19 = doc.createElement("field");
        field19.setAttribute("fieldName", "cPlanType1");
        field19.setTextContent("");
        record02.appendChild(field19);

        Element field20 = doc.createElement("field");
        field20.setAttribute("fieldName", "cPlanType1EffectiveDate");
        field20.setTextContent("");
        record02.appendChild(field20);

        Element field21 = doc.createElement("field");
        field21.setAttribute("fieldName", "cPlanType2");
        field21.setTextContent("");
        record02.appendChild(field21);

        Element field22 = doc.createElement("field");
        field22.setAttribute("fieldName", "cPlanType2EffectiveDate");
        field22.setTextContent("");
        record02.appendChild(field22);

        Element field23 = doc.createElement("field");
        field23.setAttribute("fieldName", "cPlanType3");
        field23.setTextContent("");
        record02.appendChild(field23);

        Element field24 = doc.createElement("field");
        field24.setAttribute("fieldName", "cPlanType3EffectiveDate");
        field24.setTextContent("");
        record02.appendChild(field24);

        Element field25 = doc.createElement("field");
        field25.setAttribute("fieldName", "cPlanType4");
        field25.setTextContent("");
        record02.appendChild(field25);

        Element field26 = doc.createElement("field");
        field26.setAttribute("fieldName", "cPlanType4EffectiveDate");
        field26.setTextContent("");
        record02.appendChild(field26);

        Element field27 = doc.createElement("field");
        field27.setAttribute("fieldName", "cPlanType5");
        field27.setTextContent("");
        record02.appendChild(field27);



        Element field28 = doc.createElement("field");
        field13.setAttribute("fieldName", "cPlanType5EffectiveDate");
        field13.setTextContent("");
        record02.appendChild(field28);

        Element field29 = doc.createElement("field");
        field14.setAttribute("fieldName", "cPlanType6");
        field14.setTextContent("");
        record02.appendChild(field29);

        Element field30 = doc.createElement("field");
        field15.setAttribute("fieldName", "cPlanType6EffectiveDate");
        field15.setTextContent("");
        record02.appendChild(field30);

        Element field31 = doc.createElement("field");
        field16.setAttribute("fieldName", "cOpenUse");
        field16.setTextContent("");
        record02.appendChild(field31);

        Element field32 = doc.createElement("field");
        field17.setAttribute("fieldName", "cDependentPrimCareName");
        field17.setTextContent("");
        record02.appendChild(field32);

        Element field33 = doc.createElement("field");
        field18.setAttribute("fieldName", "cDependentPrimCarePhone");
        field18.setTextContent("");
        record02.appendChild(field33);

        Element field34 = doc.createElement("field");
        field19.setAttribute("fieldName", "cDependentCardEffective");
        field19.setTextContent("");
        record02.appendChild(field34);

        Element field35 = doc.createElement("field");
        field20.setAttribute("fieldName", "cOpenUse2");
        field20.setTextContent("");
        record02.appendChild(field35);

        Element field36 = doc.createElement("field");
        field21.setAttribute("fieldName", "cOpenUse3");
        field21.setTextContent("");
        record02.appendChild(field36);

        Element field37 = doc.createElement("field");
        field22.setAttribute("fieldName", "cOpenUse4");
        field22.setTextContent("");
        record02.appendChild(field37);

        Element field38 = doc.createElement("field");
        field23.setAttribute("fieldName", "cOpenUse5");
        field23.setTextContent("");
        record02.appendChild(field38);

        Element field39 = doc.createElement("field");
        field24.setAttribute("fieldName", "cOpenUse6");
        field24.setTextContent("");
        record02.appendChild(field39);

        Element field40 = doc.createElement("field");
        field25.setAttribute("fieldName", "cDependentPrimCareAddress1");
        field25.setTextContent("");
        record02.appendChild(field40);

        Element field41 = doc.createElement("field");
        field26.setAttribute("fieldName", "cDependentPrimCareAddress2");
        field26.setTextContent("");
        record02.appendChild(field41);

        Element field42 = doc.createElement("field");
        field27.setAttribute("fieldName", "cDependentPrimCareAddress3");
        field27.setTextContent("");
        record02.appendChild(field42);

        Element field43 = doc.createElement("field");
        field22.setAttribute("fieldName", "cDependentPrimCareCity");
        field22.setTextContent("");
        record02.appendChild(field43);

        Element field44 = doc.createElement("field");
        field23.setAttribute("fieldName", "cDependentPrimCareState");
        field23.setTextContent("");
        record02.appendChild(field44);

        Element field45 = doc.createElement("field");
        field24.setAttribute("fieldName", "cDependentPrimCareZip");
        field24.setTextContent("");
        record02.appendChild(field45);

        Element field46 = doc.createElement("field");
        field25.setAttribute("fieldName", "cDependentPrimCareId");
        field25.setTextContent("");
        record02.appendChild(field46);

        Element field47 = doc.createElement("field");
        field26.setAttribute("fieldName", "cDependentPrimCareNpi");
        field26.setTextContent("");
        record02.appendChild(field47);

        Element field48 = doc.createElement("field");
        field27.setAttribute("fieldName", "cDependentBenefitClass");
        field27.setTextContent("");
        record02.appendChild(field48);

        Element field49 = doc.createElement("field");
        field27.setAttribute("fieldName", "cDependentStatus");
        field27.setTextContent("");
        record02.appendChild(field49);

        return record02;
    }
}
