package org.example.Record;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class RecordType03 {
    public static Element getRecord03(Document doc) {
        Element record03 = doc.createElement("record");
        Attr attrType = doc.createAttribute("recordType");
        attrType.setValue(String.valueOf("03"));
        record03.setAttributeNode(attrType);

        Element field01 = doc.createElement("field");
        field01.setAttribute("fieldName", "cRecordType");
        field01.setTextContent("03");
        record03.appendChild(field01);

        Element field2 = doc.createElement("field");
        field2.setAttribute("fieldName", "cRecordVersion");
        field2.setTextContent("");
        record03.appendChild(field2);

        Element field3 = doc.createElement("field");
        field3.setAttribute("fieldName", "cDocId");
        field3.setTextContent("");
        record03.appendChild(field3);

        Element field4 = doc.createElement("field");
        field4.setAttribute("fieldName", "cEffectiveDate");
        field4.setTextContent("");
        record03.appendChild(field4);

        Element field5 = doc.createElement("field");
        field5.setAttribute("fieldName", "cPlanType");
        field5.setTextContent("");
        record03.appendChild(field5);

        Element field6 = doc.createElement("field");
        field6.setAttribute("fieldName", "cCoverageType");
        field6.setTextContent("");
        record03.appendChild(field6);

        Element field7 = doc.createElement("field");
        field7.setAttribute("fieldName", "cNetworkType");
        field7.setTextContent("");
        record03.appendChild(field7);

        Element field9 = doc.createElement("field");
        field9.setAttribute("fieldName", "cRiskType");
        field9.setTextContent("");
        record03.appendChild(field9);

        Element field10 = doc.createElement("field");
        field10.setAttribute("fieldName", "cNetworkCode");
        field10.setTextContent("");
        record03.appendChild(field10);

        Element field11 = doc.createElement("field");
        field11.setAttribute("fieldName", "cNetworkDescription");
        field11.setTextContent("");
        record03.appendChild(field11);

        Element field12 = doc.createElement("field");
        field12.setAttribute("fieldName", "cOpenUse");
        field12.setTextContent("");
        record03.appendChild(field12);

        Element field13 = doc.createElement("field");
        field13.setAttribute("fieldName", "cCopayLine1");
        field13.setTextContent("");
        record03.appendChild(field13);

        Element field14 = doc.createElement("field");
        field14.setAttribute("fieldName", "cCopayLine1");
        field14.setTextContent("");
        record03.appendChild(field14);

        Element field15 = doc.createElement("field");
        field15.setAttribute("fieldName", "cCopayLine2");
        field15.setTextContent("");
        record03.appendChild(field15);

        Element field16 = doc.createElement("field");
        field16.setAttribute("fieldName", "cCopayLine3");
        field16.setTextContent("");
        record03.appendChild(field16);

        Element field17 = doc.createElement("field");
        field17.setAttribute("fieldName", "cCopayLine4");
        field17.setTextContent("");
        record03.appendChild(field17);

        Element field18 = doc.createElement("field");
        field18.setAttribute("fieldName", "cInNetworkOfficeVisitCopay");
        field18.setTextContent("");
        record03.appendChild(field18);

        Element field19 = doc.createElement("field");
        field19.setAttribute("fieldName", "cInNetworkSpecialistCopay");
        field19.setTextContent("");
        record03.appendChild(field19);

        Element field20 = doc.createElement("field");
        field20.setAttribute("fieldName", "cInNetworkEmergencyCopay");
        field20.setTextContent("");
        record03.appendChild(field20);

        Element field21 = doc.createElement("field");
        field21.setAttribute("fieldName", "cInNetworkUrgentCareCopay");
        field21.setTextContent("");
        record03.appendChild(field21);

        Element field22 = doc.createElement("field");
        field22.setAttribute("fieldName", "cInNetworkCoinsuranceCopay");
        field22.setTextContent("");
        record03.appendChild(field22);

        Element field23 = doc.createElement("field");
        field23.setAttribute("fieldName", "cInNetworkDeductibleCopay");
        field23.setTextContent("");
        record03.appendChild(field23);

        Element field24 = doc.createElement("field");
        field24.setAttribute("fieldName", "cOutNetworkOfficeVisitCopay");
        field24.setTextContent("");
        record03.appendChild(field24);

        Element field25 = doc.createElement("field");
        field25.setAttribute("fieldName", "cOutNetworkSpecialistCopay");
        field25.setTextContent("");
        record03.appendChild(field25);

        Element field26 = doc.createElement("field");
        field26.setAttribute("fieldName", "cOutNetworkEmergencyCopay");
        field26.setTextContent("");
        record03.appendChild(field26);

        Element field27 = doc.createElement("field");
        field27.setAttribute("fieldName", "cOutNetworkUrgentCareCopay");
        field27.setTextContent("");
        record03.appendChild(field27);

        Element field28 = doc.createElement("field");
        field13.setAttribute("fieldName", "cOutNetworkCoInsuranceCopay");
        field13.setTextContent("");
        record03.appendChild(field28);

        Element field29 = doc.createElement("field");
        field14.setAttribute("fieldName", "cOutNetworkDeductibleCopay");
        field14.setTextContent("");
        record03.appendChild(field29);

        Element field30 = doc.createElement("field");
        field15.setAttribute("fieldName", "cDentalPreventativeCopay");
        field15.setTextContent("");
        record03.appendChild(field30);

        Element field31 = doc.createElement("field");
        field16.setAttribute("fieldName", "cDentalBasicCopay");
        field16.setTextContent("");
        record03.appendChild(field31);

        Element field32 = doc.createElement("field");
        field17.setAttribute("fieldName", "cDentalMajorCopay");
        field17.setTextContent("");
        record03.appendChild(field32);

        Element field33 = doc.createElement("field");
        field18.setAttribute("fieldName", "cDentalCoinsuranceCopay");
        field18.setTextContent("");
        record03.appendChild(field33);

        Element field34 = doc.createElement("field");
        field19.setAttribute("fieldName", "cDentalDeductibleCopay");
        field19.setTextContent("");
        record03.appendChild(field34);

        Element field35 = doc.createElement("field");
        field20.setAttribute("fieldName", "cDentalYearMaxCopay");
        field20.setTextContent("");
        record03.appendChild(field35);

        Element field36 = doc.createElement("field");
        field21.setAttribute("fieldName", "cRxGenericCopay");
        field21.setTextContent("");
        record03.appendChild(field36);

        Element field37 = doc.createElement("field");
        field22.setAttribute("fieldName", "cRxPreferredCopay");
        field22.setTextContent("");
        record03.appendChild(field37);

        Element field38 = doc.createElement("field");
        field23.setAttribute("fieldName", "cRxBrandCopay");
        field23.setTextContent("");
        record03.appendChild(field38);

        Element field39 = doc.createElement("field");
        field24.setAttribute("fieldName", "cRxMailOrderGenericCopay");
        field24.setTextContent("");
        record03.appendChild(field39);

        Element field40 = doc.createElement("field");
        field25.setAttribute("fieldName", "cRxMailOrderPreferredCopay");
        field25.setTextContent("");
        record03.appendChild(field40);

        Element field41 = doc.createElement("field");
        field26.setAttribute("fieldName", "cRxMailOrderBrandCopay");
        field26.setTextContent("");
        record03.appendChild(field41);

        Element field42 = doc.createElement("field");
        field27.setAttribute("fieldName", "cOtherAmount1");
        field27.setTextContent("");
        record03.appendChild(field42);

        Element field43 = doc.createElement("field");
        field43.setAttribute("fieldName", "cOtherAmount2");
        field43.setTextContent("");
        record03.appendChild(field43);

        Element field44 = doc.createElement("field");
        field44.setAttribute("fieldName", "cOtherAmount3");
        field44.setTextContent("");
        record03.appendChild(field44);

        Element field45 = doc.createElement("field");
        field45.setAttribute("fieldName", "cOtherAmount4");
        field45.setTextContent("");
        record03.appendChild(field45);

        Element field46 = doc.createElement("field");
        field46.setAttribute("fieldName", "cOtherAmount5");
        field46.setTextContent("");
        record03.appendChild(field46);

        Element field47 = doc.createElement("field");
        field47.setAttribute("fieldName", "cOtherAmount6");
        field47.setTextContent("");
        record03.appendChild(field47);

        return record03;
    }
}
