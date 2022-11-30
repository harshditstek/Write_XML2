package org.example.beans;

import org.example.Main;
import org.example.Record.CreateXmlFileDemo;

import java.util.List;

public class Insure {

    public static List<String[]> searchHeaderGroup() {
        String alias = "QTEMP.insure";
        String file = "testdata.insure(TRT)";
        String sql = "select IGRPNO,ISSN,IFNAM,ILNAM,IADD1,IADD2,ICITY,ISTATE,IZIP,IEMAIL,ISEX from qtemp.insure limit 5";
        List<String[]> resultList = iSeries.executeSQLByAlias(sql, alias, file);
        CreateXmlFileDemo.writeXml(resultList);
        return resultList;
    }
}
