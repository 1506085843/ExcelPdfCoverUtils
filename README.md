## 介绍及使用

**1. 本项目可方便的将**

- excel 文件转化为 html、pdf 文件
- 多个 pdf 进行合并
- pdf 提取文字
- pdf 拆分
- pdf 转换为 word

**2. 项目运行构建**

运行项目中的 init_local_repository.bat 脚本将 lib 目录下的 jar 包安装到本地 maven 仓库，然后刷新项目加载依赖。

**3. 使用**

使用方法如下

## 一、excel 文件转换为 html

```java
        String excelPath = "C:\\Users\\haitang\\Downloads\\bbb.xlsx";
        String htmlPath = "C:\\Users\\haitang\\Downloads\\cover\\myExcel.html";
        ExcelCoverUtils.excelTohtml(excelPath, htmlPath);
```

## 二、excel 文件转换为 pdf
1. excel 文件里的所有 sheet 转化为 pdf

```java
        String excelPath = "C:\\Users\\haitang\\Downloads\\bbb.xlsx";
        String pdfPath = "C:\\Users\\haitang\\Downloads\\cover\\myExcel.pdf";
        ExcelCoverUtils.excelToPdf(excelPath, pdfPath);
```
2. excel 文件里选择指定的 sheet 转化为 pdf

```java
        String excelPath = "C:\\Users\\haitang\\Downloads\\bbb.xlsx";
        String pdfPath = "C:\\Users\\haitang\\Downloads\\cover\\myExcel.pdf";
        //选择第1、3、4 个sheet页面转化为pdf (sheet页面从0开始)
        ExcelCoverUtils.excelToPdf(excelPath, pdfPath,new int[]{0,2,3});
```

## 三、pdf 合并
```java
        //待合并的pdf文件
        String pdf1 = "C:\\Users\\haitang\\Downloads\\test.pdf";
        String pdf2 = "C:\\Users\\haitang\\Downloads\\effective-java-2.pdf";
        List<String> pdfPaths = Arrays.asList(pdf1, pdf2);
        //合并为一个pdf
        PdfCoverUtils.pdfMergePdf(pdfPaths, "C:\\myCode\\mavenTest\\merge.pdf");
```

## 四、pdf 提取文字内容到 txt
```java
        String pdf = "C:\\Users\\haitang\\Downloads\\effective-java-2.pdf";
        PdfCoverUtils.pdfGetContent(pdf,"C:\\myCode\\mavenTest\\pdfContent.txt");
```


## 五、pdf 拆分
```java
        String pdf = "C:\\Users\\haitang\\Downloads\\effective-java-2.pdf";
        //获取原pdf文件的第2到第5页为一个新的pdf  
        PdfCoverUtils.getNewPdfRange(pdf,2,5,"C:\\myCode\\mavenTest\\newPdf.pdf");
```

## 六、pdf 转换为 word
```java
        String pdf = "C:\\Users\\haitang\\Downloads\\effective-java-2.pdf";
        PdfCoverUtils.convertPDFtoWord(pdf,"C:\\myCode\\mavenTest\\word.docx");
```