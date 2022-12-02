package org.example.record;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class RecordType01 {

    public static Element getRecord01(Document doc, String[] insure) {

        Element record01 = doc.createElement("record");
        Attr attrType = doc.createAttribute("recordType");
        attrType.setValue(String.valueOf("01"));
        record01.setAttributeNode(attrType);

        Element field01 = doc.createElement("field");
        field01.setAttribute("fieldName", "cRecordType");
        field01.setTextContent("01");
        record01.appendChild(field01);

        Element field2 = doc.createElement("field");
        field2.setAttribute("fieldName", "cRecordVersion");
        field2.setTextContent("1");
        record01.appendChild(field2);

        Element field3 = doc.createElement("field");
        field3.setAttribute("fieldName", "cDocId");
        field3.setTextContent("1");
        record01.appendChild(field3);

        Element field04 = doc.createElement("field");
        field04.setAttribute("fieldName", "cGroupName");
        field04.setTextContent("ARCBEST CORPORATION");
        record01.appendChild(field04);

        Element field4 = doc.createElement("field");
        field4.setAttribute("fieldName", "cGroupHierarchy1");
        field4.setTextContent("");//blank
        record01.appendChild(field4);

        Element field5 = doc.createElement("field");
        field5.setAttribute("fieldName", "cGroupHierarchy2");
        field5.setTextContent("");
        record01.appendChild(field5);

        Element field6 = doc.createElement("field");
        field6.setAttribute("fieldName", "cGroupHierarchy3");
        field6.setTextContent("");
        record01.appendChild(field6);

        Element field7 = doc.createElement("field");
        field7.setAttribute("fieldName", "cGroupHierarchy4");
        field7.setTextContent("");
        record01.appendChild(field7);

        Element field8 = doc.createElement("field");
        field8.setAttribute("fieldName", "cGroupHierarchy5");
        field8.setTextContent("");
        record01.appendChild(field8);

        Element field9 = doc.createElement("field");
        field9.setAttribute("fieldName", "cGroupHierarchy6");
        field9.setTextContent("");
        record01.appendChild(field9);

        Element field10 = doc.createElement("field");
        field10.setAttribute("fieldName", "cGroupHierarchy7");
        field10.setTextContent("");
        record01.appendChild(field10);

        Element field11 = doc.createElement("field");
        field11.setAttribute("fieldName", "cGroupHierarchy8");
        field11.setTextContent("");
        record01.appendChild(field11);

        Element field12 = doc.createElement("field");
        field12.setAttribute("fieldName", "cGroupHierarchy9");
        field12.setTextContent("");
        record01.appendChild(field12);

        Element field13 = doc.createElement("field");
        field13.setAttribute("fieldName", "cGroupHierarchy10");
        field13.setTextContent("");
        record01.appendChild(field13);

        Element field14 = doc.createElement("field");
        field14.setAttribute("fieldName", "cEinNumber");
        field14.setTextContent("");
        record01.appendChild(field14);

        Element field15 = doc.createElement("field");
        field15.setAttribute("fieldName", "cEnrolleeFullName");
        field15.setTextContent(insure[2].trim()+" " +insure[3].trim());
        record01.appendChild(field15);

        Element field16 = doc.createElement("field");
        field16.setAttribute("fieldName", "cEnrolleePrefix");
        field16.setTextContent("");
        record01.appendChild(field16);

        Element field17 = doc.createElement("field");
        field17.setAttribute("fieldName", "cEnrolleeFirstName");
        field17.setTextContent(insure[2].trim());
        record01.appendChild(field17);

        Element field18 = doc.createElement("field");
        field18.setAttribute("fieldName", "cEnrolleeLastName");
        field18.setTextContent(insure[3].trim());
        record01.appendChild(field18);

        Element field19 = doc.createElement("field");
        field19.setAttribute("fieldName", "cEnrolleeMiddleInitial");
        field19.setTextContent("");
        record01.appendChild(field19);

        Element field20 = doc.createElement("field");
        field20.setAttribute("fieldName", "cEnrolleeSuffix");
        field20.setTextContent("");
        record01.appendChild(field20);

        Element field21 = doc.createElement("field");
        field21.setAttribute("fieldName", "cEnrolleeId");
        field21.setTextContent(insure[1]);
        record01.appendChild(field21);

        Element field22 = doc.createElement("field");
        field22.setAttribute("fieldName", "cEnrolleeSsn");
        field22.setTextContent("");
        record01.appendChild(field22);

        Element field23 = doc.createElement("field");
        field23.setAttribute("fieldName", "cEnrolleeDateOfBirth");
        field23.setTextContent("");
        record01.appendChild(field23);

        Element field24 = doc.createElement("field");
        field24.setAttribute("fieldName", "cEnrolleeSex");
        field24.setTextContent("");
        record01.appendChild(field24);

        Element field25 = doc.createElement("field");
        field25.setAttribute("fieldName", "cEnrolleePhone");
        field25.setTextContent("");
        record01.appendChild(field25);

        Element field26 = doc.createElement("field");
        field26.setAttribute("fieldName", "cEnrolleePrimCareName");
        field26.setTextContent("");
        record01.appendChild(field26);

        Element field27 = doc.createElement("field");
        field27.setAttribute("fieldName", "cEnrolleePrimCareAddress1");
        field27.setTextContent("");
        record01.appendChild(field27);

        Element field28 = doc.createElement("field");
        field28.setAttribute("fieldName", "cEnrolleePrimCareAddress2");
        field28.setTextContent("");
        record01.appendChild(field28);

        Element field29 = doc.createElement("field");
        field29.setAttribute("fieldName", "cEnrolleePrimCareAddress3");
        field29.setTextContent("");
        record01.appendChild(field29);

        Element field30 = doc.createElement("field");
        field30.setAttribute("fieldName", "cEnrolleePrimCareCity");
        field30.setTextContent("");
        record01.appendChild(field30);

        Element field31 = doc.createElement("field");
        field31.setAttribute("fieldName", "cEnrolleePrimCareState");
        field31.setTextContent("");
        record01.appendChild(field31);

        Element field32 = doc.createElement("field");
        field32.setAttribute("fieldName", "cEnrolleePrimCareZip");
        field32.setTextContent("");
        record01.appendChild(field32);

        Element field33 = doc.createElement("field");
        field33.setAttribute("fieldName", "cEnrolleePrimCarePhone");
        field33.setTextContent("");
        record01.appendChild(field33);

        Element field34 = doc.createElement("field");
        field34.setAttribute("fieldName", "cEnrolleePrimCareId");
        field34.setTextContent("");
        record01.appendChild(field34);

        Element field35 = doc.createElement("field");
        field35.setAttribute("fieldName", "cEnrolleePrimCareNpi");
        field35.setTextContent("");
        record01.appendChild(field35);

        Element field36 = doc.createElement("field");
        field36.setAttribute("fieldName", "cCoverageType");
        field36.setTextContent("");
        record01.appendChild(field36);

        Element field37 = doc.createElement("field");
        field37.setAttribute("fieldName", "cPlanType1");
        field37.setTextContent("");
        record01.appendChild(field37);

        Element field38 = doc.createElement("field");
        field38.setAttribute("fieldName", "cPlanType1EffectiveDate");
        field38.setTextContent("");
        record01.appendChild(field38);

        Element field39 = doc.createElement("field");
        field39.setAttribute("fieldName", "cPlanType2");
        field39.setTextContent("");
        record01.appendChild(field39);

        Element field40 = doc.createElement("field");
        field40.setAttribute("fieldName", "cPlanType3");
        field40.setTextContent("");
        record01.appendChild(field40);

        Element field41 = doc.createElement("field");
        field41.setAttribute("fieldName", "cPlanType3EffectiveDate");
        field41.setTextContent("");
        record01.appendChild(field41);

        Element field42 = doc.createElement("field");
        field42.setAttribute("fieldName", "cPlanType4");
        field42.setTextContent("");
        record01.appendChild(field42);

        Element field43 = doc.createElement("field");
        field43.setAttribute("fieldName", "cPlanType4EffectiveDate");
        field43.setTextContent("");
        record01.appendChild(field43);

        Element field44 = doc.createElement("field");
        field44.setAttribute("fieldName", "cPlanType5");
        field44.setTextContent("");
        record01.appendChild(field44);

        Element field45 = doc.createElement("field");
        field45.setAttribute("fieldName", "cPlanType5EffectiveDate");
        field45.setTextContent("");
        record01.appendChild(field45);

        Element field46 = doc.createElement("field");
        field46.setAttribute("fieldName", "cPlanType6");
        field46.setTextContent("");
        record01.appendChild(field46);

        Element field47 = doc.createElement("field");
        field47.setAttribute("fieldName", "cPlanType6EffectiveDate");
        field47.setTextContent("");
        record01.appendChild(field47);

        Element field48 = doc.createElement("field");
        field48.setAttribute("fieldName", "cSecondaryEnrolleeId");
        field48.setTextContent("");
        record01.appendChild(field48);


        Element field49 = doc.createElement("field");
        field49.setAttribute("fieldName", "cNationalPayerId");
        field49.setTextContent("");
        record01.appendChild(field49);

        Element field50 = doc.createElement("field");
        field50.setAttribute("fieldName", "cCardEffectiveDate");
        field50.setTextContent("");
        record01.appendChild(field50);

        Element field51 = doc.createElement("field");
        field51.setAttribute("fieldName", "cOpenUse");
        field51.setTextContent("");
        record01.appendChild(field51);

        Element field52 = doc.createElement("field");
        field52.setAttribute("fieldName", "cOpenUse2");
        field52.setTextContent("");
        record01.appendChild(field52);

        Element field53 = doc.createElement("field");
        field53.setAttribute("fieldName", "cOpenUse3");
        field53.setTextContent("");
        record01.appendChild(field53);

        Element field54 = doc.createElement("field");
        field54.setAttribute("fieldName", "cDepartmentName");
        field54.setTextContent("");
        record01.appendChild(field54);

        Element field55 = doc.createElement("field");
        field55.setAttribute("fieldName", "cMaritalStatus");
        field55.setTextContent("");
        record01.appendChild(field55);

        Element field56 = doc.createElement("field");
        field56.setAttribute("fieldName", "cOpenUse4");
        field56.setTextContent("");
        record01.appendChild(field56);

        Element field57 = doc.createElement("field");
        field57.setAttribute("fieldName", "cOpenUse5");
        field57.setTextContent("");
        record01.appendChild(field57);

        Element field58 = doc.createElement("field");
        field58.setAttribute("fieldName", "cOpenUse6");
        field58.setTextContent("");
        record01.appendChild(field58);

        Element field59 = doc.createElement("field");
        field59.setAttribute("fieldName", "cOpenUse7");
        field59.setTextContent("");
        record01.appendChild(field59);

        Element field60 = doc.createElement("field");
        field60.setAttribute("fieldName", "cOpenUse8");
        field60.setTextContent("");
        record01.appendChild(field60);

        Element field61 = doc.createElement("field");
        field61.setAttribute("fieldName", "cGroupLogo");
        field61.setTextContent("");
        record01.appendChild(field61);

        Element field62 = doc.createElement("field");
        field62.setAttribute("fieldName", "cOpenUse9");
        field62.setTextContent("");
        record01.appendChild(field62);

        Element field63 = doc.createElement("field");
        field63.setAttribute("fieldName", "cOpenUse10");
        field63.setTextContent("");
        record01.appendChild(field63);

        Element field64 = doc.createElement("field");
        field64.setAttribute("fieldName", "cWebAddress1");
        field64.setTextContent("");
        record01.appendChild(field64);

        Element field65 = doc.createElement("field");
        field65.setAttribute("fieldName", "cWebAddress2");
        field65.setTextContent("");
        record01.appendChild(field65);

        Element field66 = doc.createElement("field");
        field66.setAttribute("fieldName", "cBackgroundImageFront");
        field66.setTextContent("");
        record01.appendChild(field66);

        Element field67 = doc.createElement("field");
        field67.setAttribute("fieldName", "cBackgroundImageBack");
        field67.setTextContent("");
        record01.appendChild(field67);

        Element field68 = doc.createElement("field");
        field68.setAttribute("fieldName", "cOpenUse11");
        field68.setTextContent("");
        record01.appendChild(field68);

        Element field69 = doc.createElement("field");
        field69.setAttribute("fieldName", "cOpenUse12");
        field69.setTextContent("");
        record01.appendChild(field69);

        Element field70 = doc.createElement("field");
        field70.setAttribute("fieldName", "cOpenUse13");
        field70.setTextContent("");
        record01.appendChild(field70);

        Element field71 = doc.createElement("field");
        field71.setAttribute("fieldName", "cOpenUse14");
        field71.setTextContent("");
        record01.appendChild(field71);

        Element field72 = doc.createElement("field");
        field72.setAttribute("fieldName", "cOpenUse15");
        field72.setTextContent("");
        record01.appendChild(field72);

        Element field73 = doc.createElement("field");
        field73.setAttribute("fieldName", "cEnrolleeBenefitClass");
        field73.setTextContent("");
        record01.appendChild(field73);

        Element field74 = doc.createElement("field");
        field74.setAttribute("fieldName", "cEnrolleeStatus");
        field74.setTextContent("");
        record01.appendChild(field74);

        Element field75 = doc.createElement("field");
        field75.setAttribute("fieldName", "cEnrolleeType");
        field75.setTextContent("");
        record01.appendChild(field75);

        Element field76 = doc.createElement("field");
        field76.setAttribute("fieldName", "cEnrolleeOpenLogo1");
        field76.setTextContent("");
        record01.appendChild(field76);

        Element field77 = doc.createElement("field");
        field77.setAttribute("fieldName", "cEnrolleeOpenLogo2");
        field77.setTextContent("");
        record01.appendChild(field77);

        Element field78 = doc.createElement("field");
        field78.setAttribute("fieldName", "cEnrolleeOpenLogo3");
        field78.setTextContent("");
        record01.appendChild(field78);

        Element field79 = doc.createElement("field");
        field79.setAttribute("fieldName", "cEnrolleeOpenLogo4");
        field79.setTextContent("");
        record01.appendChild(field79);

        Element field80 = doc.createElement("field");
        field80.setAttribute("fieldName", "cEnrolleeOpenLogo5");
        field80.setTextContent("");
        record01.appendChild(field80);

        Element field81 = doc.createElement("field");
        field81.setAttribute("fieldName", "cEnrolleeOpenLogo6");
        field81.setTextContent("");
        record01.appendChild(field81);

        Element field82 = doc.createElement("field");
        field82.setAttribute("fieldName", "cEnrolleeOpenLogo7");
        field82.setTextContent("");
        record01.appendChild(field82);


        return record01;
    }
}
