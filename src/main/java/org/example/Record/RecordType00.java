package org.example.Record;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class RecordType00 {
    public static Element getRecord00(Document doc, String[] insure) {

        Element record00 = doc.createElement("record");
        Attr attrType = doc.createAttribute("recordType");
        attrType.setValue(String.valueOf("00"));
        record00.setAttributeNode(attrType);

        Element field01 = doc.createElement("field");
        field01.setAttribute("fieldName", "cRecordType");
        field01.setTextContent("00");
        record00.appendChild(field01);

        Element field2 = doc.createElement("field");
        field2.setAttribute("fieldName", "cRecordVersion");
        field2.setTextContent("");
        record00.appendChild(field2);

        Element field3 = doc.createElement("field");
        field3.setAttribute("fieldName", "cDocId");
        field3.setTextContent("");
        record00.appendChild(field3);

        Element field4 = doc.createElement("field");
        field4.setAttribute("fieldName", "cName");
        field4.setTextContent(insure[2].trim()+" " +insure[3].trim());
        record00.appendChild(field4);

        Element field5 = doc.createElement("field");
        field5.setAttribute("fieldName", "cName2");
        field5.setTextContent("");
        record00.appendChild(field5);

        Element field6 = doc.createElement("field");
        field6.setAttribute("fieldName", "cAddress1");
        field6.setTextContent(insure[4].trim());
        record00.appendChild(field6);

        Element field7 = doc.createElement("field");
        field7.setAttribute("fieldName", "cAddress2");
        field7.setTextContent("");
        record00.appendChild(field7);

        Element field8 = doc.createElement("field");
        field8.setAttribute("fieldName", "cAddress3");
        field8.setTextContent("");
        record00.appendChild(field8);

        Element field9 = doc.createElement("field");
        field9.setAttribute("fieldName", "cAddress4");
        field9.setTextContent("");
        record00.appendChild(field9);

        Element field10 = doc.createElement("field");
        field10.setAttribute("fieldName", "cCity");
        field10.setTextContent(insure[6].trim());
        record00.appendChild(field10);

        Element field11 = doc.createElement("field");
        field11.setAttribute("fieldName", "cState");
        field11.setTextContent(insure[7].trim());
        record00.appendChild(field11);

        Element field12 = doc.createElement("field");
        field12.setAttribute("fieldName", "cZip");
        field12.setTextContent(insure[8].trim());
        record00.appendChild(field12);

        Element field13 = doc.createElement("field");
        field13.setAttribute("fieldName", "cSortKey");
        field13.setTextContent("");
        record00.appendChild(field13);

        Element field14 = doc.createElement("field");
        field14.setAttribute("fieldName", "cInternationalCityOrTown");
        field14.setTextContent("");
        record00.appendChild(field14);

        Element field15 = doc.createElement("field");
        field15.setAttribute("fieldName", "cInternationalProvidenceOrTerritory");
        field15.setTextContent("");
        record00.appendChild(field15);

        Element field16 = doc.createElement("field");
        field16.setAttribute("fieldName", "cInternationalPostalCode");
        field16.setTextContent("");
        record00.appendChild(field16);

        Element field17 = doc.createElement("field");
        field17.setAttribute("fieldName", "cInternationalCountry");
        field17.setTextContent("");
        record00.appendChild(field17);

        Element field18 = doc.createElement("field");
        field18.setAttribute("fieldName", "cEMailAddress");
        field18.setTextContent("");
        record00.appendChild(field18);

        Element field19 = doc.createElement("field");
        field19.setAttribute("fieldName", "cEmailAddressForNotification");
        field19.setTextContent("");
        record00.appendChild(field19);

        Element field20 = doc.createElement("field");
        field20.setAttribute("fieldName", "cRecipientCode");
        field20.setTextContent("");
        record00.appendChild(field20);

        Element field21 = doc.createElement("field");
        field21.setAttribute("fieldName", "cDocumentType");
        field21.setTextContent("");
        record00.appendChild(field21);

        Element field22 = doc.createElement("field");
        field22.setAttribute("fieldName", "cRICode");
        field22.setTextContent("");
        record00.appendChild(field22);

        Element field23 = doc.createElement("field");
        field23.setAttribute("fieldName", "cDeliveryType");
        field23.setTextContent("");
        record00.appendChild(field23);

        Element field24 = doc.createElement("field");
        field24.setAttribute("fieldName", "cEarlyDelivery");
        field24.setTextContent("");
        record00.appendChild(field24);

        Element field25 = doc.createElement("field");
        field25.setAttribute("fieldName", "cSaturdayDelivery");
        field25.setTextContent("");
        record00.appendChild(field25);

        Element field26 = doc.createElement("field");
        field26.setAttribute("fieldName", "cSignatureRequired");
        field26.setTextContent("");
        record00.appendChild(field26);

        Element field27 = doc.createElement("field");
        field27.setAttribute("fieldName", "cHoldCode");
        field27.setTextContent("");
        record00.appendChild(field27);

        Element field28 = doc.createElement("field");
        field28.setAttribute("fieldName", "cClientCode");
        field28.setTextContent("");
        record00.appendChild(field28);

        Element field29 = doc.createElement("field");
        field29.setAttribute("fieldName", "cTestFlag");
        field29.setTextContent("");
        record00.appendChild(field29);

        Element field30 = doc.createElement("field");
        field30.setAttribute("fieldName", "cPurgeFlag");
        field30.setTextContent("");
        record00.appendChild(field30);

        Element field31 = doc.createElement("field");
        field31.setAttribute("fieldName", "cPurgeReason");
        field31.setTextContent("");
        record00.appendChild(field31);

        Element field32 = doc.createElement("field");
        field32.setAttribute("fieldName", "cQuantity");
        field32.setTextContent("");
        record00.appendChild(field32);

        Element field33 = doc.createElement("field");
        field33.setAttribute("fieldName", "cRuleEffectiveDate");
        field33.setTextContent("");
        record00.appendChild(field33);

        Element field34 = doc.createElement("field");
        field34.setAttribute("fieldName", "cUseProposed");
        field34.setTextContent("");
        record00.appendChild(field34);

        Element field35 = doc.createElement("field");
        field35.setAttribute("fieldName", "cOverrideDistributionRule");
        field35.setTextContent("");
        record00.appendChild(field35);

        Element field36 = doc.createElement("field");
        field36.setAttribute("fieldName", "cAltConsolidationKey");
        field36.setTextContent("");
        record00.appendChild(field36);

        Element field37 = doc.createElement("field");
        field37.setAttribute("fieldName", "cPlainTextConsolidationKey");
        field37.setTextContent("");
        record00.appendChild(field37);

        Element field38 = doc.createElement("field");
        field38.setAttribute("fieldName", "cReturnAddressName");
        field38.setTextContent("");
        record00.appendChild(field38);

        Element field39 = doc.createElement("field");
        field39.setAttribute("fieldName", "cReturnAddressAttention");
        field39.setTextContent("");
        record00.appendChild(field39);

        Element field40 = doc.createElement("field");
        field40.setAttribute("fieldName", "cReturnAddressAddress1");
        field40.setTextContent("");
        record00.appendChild(field40);

        Element field41 = doc.createElement("field");
        field41.setAttribute("fieldName", "cReturnAddressAddress2");
        field41.setTextContent("");
        record00.appendChild(field41);

        Element field42 = doc.createElement("field");
        field42.setAttribute("fieldName", "cReturnAddressAddress3");
        field42.setTextContent("");
        record00.appendChild(field42);

        Element field43 = doc.createElement("field");
        field43.setAttribute("fieldName", "cReturnAddressCity");
        field43.setTextContent("");
        record00.appendChild(field43);

        Element field44 = doc.createElement("field");
        field44.setAttribute("fieldName", "cReturnAddressState");
        field44.setTextContent("");
        record00.appendChild(field44);

        Element field45 = doc.createElement("field");
        field45.setAttribute("fieldName", "cReturnAddressZip");
        field45.setTextContent("");
        record00.appendChild(field45);

        Element field46 = doc.createElement("field");
        field46.setAttribute("fieldName", "cDependentPrimCareNpi");
        field46.setTextContent("");
        record00.appendChild(field46);

        Element field47 = doc.createElement("field");
        field47.setAttribute("fieldName", "cReturnAddressInternationalCityOrTown");
        field47.setTextContent("");
        record00.appendChild(field47);

        Element field48 = doc.createElement("field");
        field48.setAttribute("fieldName", "creturnAddressInternationalProvinceOrTerritory");
        field48.setTextContent("");
        record00.appendChild(field48);


        Element field49 = doc.createElement("field");
        field49.setAttribute("fieldName", "cReturnAddressInternationalPostalCode");
        field49.setTextContent("");
        record00.appendChild(field49);

        Element field50 = doc.createElement("field");
        field50.setAttribute("fieldName", "cReturnAddressInternationalCountry");
        field50.setTextContent("");
        record00.appendChild(field50);

        Element field51 = doc.createElement("field");
        field51.setAttribute("fieldName", "cReturnAddressLogoName");
        field51.setTextContent("");
        record00.appendChild(field51);

        Element field52 = doc.createElement("field");
        field51.setAttribute("fieldName", "cReturnAddressLogoStyle");
        field51.setTextContent("");
        record00.appendChild(field52);

        Element field53 = doc.createElement("field");
        field53.setAttribute("fieldName", "cReturnAddressState");
        field53.setTextContent("");
        record00.appendChild(field53);

        Element field54 = doc.createElement("field");
        field54.setAttribute("fieldName", "cDocumentIndex1");
        field54.setTextContent("");
        record00.appendChild(field54);

        Element field55 = doc.createElement("field");
        field55.setAttribute("fieldName", "cDocumentIndex2");
        field55.setTextContent("");
        record00.appendChild(field55);

        Element field56 = doc.createElement("field");
        field56.setAttribute("fieldName", "cDocumentIndex3");
        field56.setTextContent("");
        record00.appendChild(field56);

        Element field57 = doc.createElement("field");
        field57.setAttribute("fieldName", "cDocumentIndex4");
        field57.setTextContent("");
        record00.appendChild(field57);

        Element field58 = doc.createElement("field");
        field58.setAttribute("fieldName", "cDoNotConsolidateFlag");
        field58.setTextContent("");
        record00.appendChild(field58);

        Element field59 = doc.createElement("field");
        field59.setAttribute("fieldName", "cIssuanceCode");
        field59.setTextContent("");
        record00.appendChild(field59);

        Element field60 = doc.createElement("field");
        field60.setAttribute("fieldName", "cStickerIndicator");
        field60.setTextContent("");
        record00.appendChild(field60);

        Element field61 = doc.createElement("field");
        field61.setAttribute("fieldName", "cReportingRollupValue1");
        field61.setTextContent("");
        record00.appendChild(field61);

        Element field62 = doc.createElement("field");
        field62.setAttribute("fieldName", "cReportingRollupValue2");
        field62.setTextContent("");
        record00.appendChild(field62);

        Element field63 = doc.createElement("field");
        field63.setAttribute("fieldName", "cReportingRollupValue3");
        field63.setTextContent("");
        record00.appendChild(field63);

        Element field64 = doc.createElement("field");
        field64.setAttribute("fieldName", "cReportingRollupValue4");
        field64.setTextContent("");
        record00.appendChild(field64);

        Element field65 = doc.createElement("field");
        field65.setAttribute("fieldName", "cReportingRollupValue5");
        field65.setTextContent("");
        record00.appendChild(field65);

        Element field66 = doc.createElement("field");
        field66.setAttribute("fieldName", "cReportingRollupValue6");
        field66.setTextContent("");
        record00.appendChild(field66);

        Element field67 = doc.createElement("field");
        field67.setAttribute("fieldName", "cReportingRollupValue7");
        field67.setTextContent("");
        record00.appendChild(field67);

        Element field68 = doc.createElement("field");
        field68.setAttribute("fieldName", "cReportingRollupValue8");
        field68.setTextContent("");
        record00.appendChild(field68);

        Element field69 = doc.createElement("field");
        field69.setAttribute("fieldName", "cReportingRollupValue9");
        field69.setTextContent("");
        record00.appendChild(field69);

        Element field70 = doc.createElement("field");
        field70.setAttribute("fieldName", "cReportingRollupValue10");
        field70.setTextContent("");
        record00.appendChild(field70);

        Element field71 = doc.createElement("field");
        field71.setAttribute("fieldName", "cAdditionalDuplicateFileDetectionValue");
        field71.setTextContent("");
        record00.appendChild(field71);

        Element field72 = doc.createElement("field");
        field72.setAttribute("fieldName", "cPhoneNumber");
        field72.setTextContent("");
        record00.appendChild(field72);

        Element field73 = doc.createElement("field");
        field73.setAttribute("fieldName", "cOriginalFileFormat");
        field73.setTextContent("");
        record00.appendChild(field73);

        Element field74 = doc.createElement("field");
        field74.setAttribute("fieldName", "cTranslationId");
        field74.setTextContent("");
        record00.appendChild(field74);

        Element field75 = doc.createElement("field");
        field75.setAttribute("fieldName", "cSupplementDeliveryPriority");
        field75.setTextContent("");
        record00.appendChild(field75);

        Element field76 = doc.createElement("field");
        field76.setAttribute("fieldName", "cCleverLetterMatch");
        field76.setTextContent("");
        record00.appendChild(field76);

        Element field77 = doc.createElement("field");
        field77.setAttribute("fieldName", "cUseReducedPdfPage");
        field77.setTextContent("");
        record00.appendChild(field77);

        Element field78 = doc.createElement("field");
        field78.setAttribute("fieldName", "cForceACoverSheet");
        field78.setTextContent("");
        record00.appendChild(field78);

        Element field79 = doc.createElement("field");
        field79.setAttribute("fieldName", "cDataRoleSecurity");
        field79.setTextContent("");
        record00.appendChild(field79);


        return record00;
    }
}
