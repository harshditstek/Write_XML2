package org.example.beans;

import org.example.Main;
import org.example.record.CreateXmlFileDemo;

import java.util.List;

public class Insure {

    public static List<String[]> searchInsureData(String ssn) {
        String alias = "QTEMP.insure";
        String file = "testdata.insure(" + Main.member + ")";
        String sql = "select IGRPNO,ISSN,IFNAM,ILNAM,IADD1,IADD2,ICITY,ISTATE,IZIP,IEMAIL,ISEX,IINO01,IINO02,IINO03,IINO04 from qtemp.insure limit 5";
        List<String[]> insureList = iSeries.executeSQLByAlias(sql, alias, file);
        if(insureList.size() <1){
            System.out.println("Data not available");
        }else {
            CreateXmlFileDemo.writeXml(insureList);
        }
        return insureList;
    }

    public static List<String[]> searchInsdepData(String ssn) {
        String alias = "QTEMP.insdep";
        String file = "testdata.insdep(" + Main.member + ")";
        String sql = "select DFNAM,DLNAM from qtemp.insdep where dessn='" + ssn + "'";
        List<String[]> insureList = iSeries.executeSQLByAlias(sql, alias, file);

        return insureList;
    }
}
