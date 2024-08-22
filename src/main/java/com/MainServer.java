package com;

import com.util.ExcelCoverUtils;


public class MainServer {
    public static void main(String[] args) {
        //exccel文件转 html
        String excelPath = "C:\\Users\\haitang\\Downloads\\附件2：派工回执模版.xlsx";
        String htmlPath = "C:\\Users\\haitang\\Downloads\\cover\\myExcel.html";
        ExcelCoverUtils.excelTohtml(excelPath, htmlPath);

        //excel文件转pdf
//        String excelPath1 = "C:\\Users\\haitang\\Downloads\\bbb.xlsx";
//        String pdfPath1 = "C:\\Users\\haitang\\Downloads\\cover\\myExcel.pdf";
//        ExcelCoverUtils.excelToPdf(excelPath1, pdfPath1);

    }


}


