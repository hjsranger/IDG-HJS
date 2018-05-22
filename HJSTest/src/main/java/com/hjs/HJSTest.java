package com.hjs;


import com.idg.QuarterreportCapital;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

/**
 * Created by jianshuang_huang on 2018/4/28.
 * jianshuang_huang的测试文件
 */
public class HJSTest {


    public static void main(String[] args) throws Exception {



        /*String a ="HJS";

        System.out.println(a+"1");
        Thread.sleep(10000);
        System.out.println(a+"2");*/


        /*String fileName = "F0022_2014Q3";

        String qrid = "20"+fileName.substring(fileName.lastIndexOf("Q")-2,fileName.lastIndexOf("Q")+2);

        System.out.println(qrid);*/


        //转pdf，分页的问题
        //TestPDF();
        //htmlToPdf();
        //getExcelValue();

        /*Map<String,Object> map = getExcelValue();


        String reportName = (String)map.get("reportName");
        System.out.println(reportName);

        List<QuarterreportCapital> list = (List<QuarterreportCapital>)map.get("reportList");

        System.out.println(list.size());

        for (QuarterreportCapital report : list){
            System.out.println(report.toString());
        }*/


        //测试时间格式
        /*SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd,yyyy",Locale.ENGLISH);

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(sdf2.parse("2018-12-31")));*/


        //getExcelValue2();


    }

/*

    public static Map<String,Object> getExcelValue2(Quarterlyreportassetsandliab liabResult) throws Exception{

        File excelFile = new File("D:\\MyWork\\美元基金账户项目\\财务报表\\IDGCC3 _18Q1.xlsx");

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(new FileInputStream(excelFile));


        //获取工作Sheet，就一个Sheet页，不用循环
        XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(2);

        Map<String,Object> resultMap = new HashMap<>();


        //获取单元格的行，列
        XSSFRow row = null;
        XSSFCell cell = null;
        String valueStr = "";
        Double valueDou = 0d;

        //FairValue
        row = xssfSheet.getRow(8);
        cell = row.getCell(1);

        if(cell.getCellType() == XSSFCell.CELL_TYPE_STRING || cell.getCellType()==XSSFCell.CELL_TYPE_FORMULA){
            valueStr = cell.getStringCellValue();
            valueStr = valueStr.substring(valueStr.indexOf("$")+1,valueStr.indexOf(")"));
            DecimalFormat df = new DecimalFormat("#,###");
            liabResult.setFairvalue(new BigDecimal(df.parse(valueStr).doubleValue()));
        }

        //InvestmentAtEstimated
        cell = row.getCell(7);
        if(cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC || cell.getCellType()==XSSFCell.CELL_TYPE_FORMULA){
            valueDou = cell.getNumericCellValue();
            liabResult.setInvestmentsatestimated(new BigDecimal(valueDou));
        }


        //Cash
        row = xssfSheet.getRow(10);
        cell = row.getCell(7);
        if(cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC || cell.getCellType()==XSSFCell.CELL_TYPE_FORMULA){
            valueDou = cell.getNumericCellValue();
            liabResult.setCashandequivalents(new BigDecimal(valueDou));
        }

        //Cash
        row = xssfSheet.getRow(11);
        cell = row.getCell(7);
        if(cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC || cell.getCellType()==XSSFCell.CELL_TYPE_FORMULA){
            valueDou = cell.getNumericCellValue();
            liabResult.setRestrictedcash(new BigDecimal(valueDou));
        }

        //AccuredInterest
        row = xssfSheet.getRow(13);
        cell = row.getCell(7);
        if(cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC || cell.getCellType()==XSSFCell.CELL_TYPE_FORMULA){
            valueDou = cell.getNumericCellValue();
            liabResult.setAccruedinterest(new BigDecimal(valueDou));
        }
        //OtherAssets
        row = xssfSheet.getRow(14);
        cell = row.getCell(7);
        if(cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC || cell.getCellType()==XSSFCell.CELL_TYPE_FORMULA){
            valueDou = cell.getNumericCellValue();
            liabResult.setOtherassets(new BigDecimal(valueDou));
        }

        //totalAssets
        row = xssfSheet.getRow(16);
        cell = row.getCell(7);
        if(cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC || cell.getCellType()==XSSFCell.CELL_TYPE_FORMULA){
            valueDou = cell.getNumericCellValue();
            liabResult.setTotalassets(new BigDecimal(valueDou));
        }


        //accruedLia
        row = xssfSheet.getRow(22);
        cell = row.getCell(7);
        if(cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC || cell.getCellType()==XSSFCell.CELL_TYPE_FORMULA){
            valueDou = cell.getNumericCellValue();
            liabResult.setAccruedliabilities(new BigDecimal(valueDou));
        }

        //Contribution
        row = xssfSheet.getRow(24);
        cell = row.getCell(7);
        if(cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC || cell.getCellType()==XSSFCell.CELL_TYPE_FORMULA){
            valueDou = cell.getNumericCellValue();
            liabResult.setContributionreceivedinadvance(new BigDecimal(valueDou));
        }

        //Contribution
        row = xssfSheet.getRow(26);
        cell = row.getCell(7);
        if(cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC || cell.getCellType()==XSSFCell.CELL_TYPE_FORMULA){
            valueDou = cell.getNumericCellValue();
            liabResult.setBorrowing(new BigDecimal(valueDou));
        }

        //Contribution
        row = xssfSheet.getRow(28);
        cell = row.getCell(7);
        if(cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC || cell.getCellType()==XSSFCell.CELL_TYPE_FORMULA){
            valueDou = cell.getNumericCellValue();
            liabResult.setNetassets(new BigDecimal(valueDou));
        }



        return resultMap;

    }
*/



    /**
     * 解析Excel
     * @param
     */
    public static Map<String,Object> getExcelValue() throws Exception{


        File excelFile = new File("D:\\MyWork\\美元基金账户项目\\发送Qu邮件\\IDGVC5Main 17Q4.xlsx");

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(new FileInputStream(excelFile));


        //获取工作Sheet，就一个Sheet页，不用循环
        XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);

        Map<String,Object> resultMap = new HashMap<String, Object>();
        //获取reportCapitalList
        List<QuarterreportCapital>  reportList = new ArrayList<QuarterreportCapital>();

        String reportName = "";


        //循环row
        /**
         * 从第三行开始，前两行没有需要的数据
         */
        for (int rowNum = 2;rowNum <= xssfSheet.getLastRowNum();rowNum++){

            QuarterreportCapital reportCapital = new QuarterreportCapital();

            XSSFRow xssfRow = xssfSheet.getRow(rowNum);

            //int count = 0;
            if (xssfRow == null) {
                continue;
            }

            //单独处理第三行
            if(rowNum  ==2){

                //获取第四个单元格的内容，作为reportName
                XSSFCell xssfCell = xssfRow.getCell(3);
                if (xssfCell == null || xssfCell.equals("") || xssfCell.getCellType() == xssfCell.CELL_TYPE_BLANK) {
                    return null;
                }

                if(xssfCell.getCellType() == XSSFCell.CELL_TYPE_STRING){
                    reportName = xssfCell.getStringCellValue().trim();
                }

                System.out.println(reportName);
                continue;
            }


            Date startDate = null;
            //单独处理第四行，获取开始时间
            if(rowNum ==3){
                //获取第5个单元格的内容，作为reportName
                XSSFCell xssfCell = xssfRow.getCell(4);
                if (xssfCell == null || xssfCell.equals("") || xssfCell.getCellType() == xssfCell.CELL_TYPE_BLANK) {
                    return null;
                }
                if(xssfCell.getCellType() == XSSFCell.CELL_TYPE_STRING){
                    String value = xssfCell.getStringCellValue().trim().replace("\n","");
                    //获取时间
                    String startDateStr = value.substring(value.lastIndexOf("of")+2).trim();

                    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
                    startDate = sdf.parse(startDateStr);
                    resultMap.put("startDate",startDate);
                }


            }



            //第四行第五行不处理
            if (rowNum ==4){
                continue;
            }

            //这一行的错误不影响其他行的解析
            try{

                //遍历其他数据行
                for(int cellNum = 0; cellNum <= xssfRow.getLastCellNum(); cellNum++){

                    XSSFCell xssfCell = xssfRow.getCell(cellNum);
                    if (xssfCell == null || xssfCell.equals("") || xssfCell.getCellType() == xssfCell.CELL_TYPE_BLANK) {
                        continue;
                    }


                    //第一列，是LPID
                    if(cellNum == 0 && xssfCell.getCellType() == XSSFCell.CELL_TYPE_STRING){

                        String lpid = xssfCell.getStringCellValue().trim();

                        //如果lpId为空，则不执行
                        if (lpid == null || "".equals(lpid)){

                            continue;
                        }
                        //System.out.println(lpid);
                        reportCapital.setLpid(lpid);
                    }

                    //后面的全是数字
                    if(xssfCell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC){

                        BigDecimal value = new BigDecimal(xssfCell.getNumericCellValue());

                        //判断每一列对应的数据库字段，然后插入
                        //第五列，是Partners'Capital
                        if(cellNum == 4){
                            //TODO 找不到对应的数据库字段
                        }
                        //第六列，是CapitalContributions
                        if(cellNum == 5){
                            reportCapital.setCapitalcontributions(value);
                        }
                        //第7列，是temporaryIncome
                        if(cellNum == 6){
                            reportCapital.setTemporaryincome(value);
                        }
                        //第八列，是OperatingExpense
                        if(cellNum == 7){
                            reportCapital.setOperatingexpense(value);
                        }
                        //9是InvestmentInterestIncome
                        if(cellNum == 8){
                            reportCapital.setInvestinterestincome(value);
                        }
                        //10是DiveidendIncome
                        if(cellNum == 9){
                            reportCapital.setInvestmentdividendincome(value);
                        }
                        //11是RealizedGain
                        if(cellNum == 10){
                            reportCapital.setRealizedinvest(value);
                        }
                        //12是RealizedTranslation
                        if(cellNum == 11){
                            reportCapital.setRealizedtranslation(value);
                        }
                        //13是totalNet
                        if(cellNum == 12){
                            reportCapital.setNetgain(value);
                        }
                        //14存的是UnrealizedGain
                        if(cellNum == 13){
                            reportCapital.setUnrealizedOtherinvest(value);
                        }
                        //15存的是UnrealizedInvestment
                        if(cellNum == 14){
                            reportCapital.setUnrealizedFundinvest(value);
                        }
                        //16存的是UnrealizedGain
                        if(cellNum == 15){
                            reportCapital.setUnrealizedreallocation(value);
                        }
                        //14是Distributions
                        if(cellNum == 16){
                            reportCapital.setDistribution(value);
                        }
                        //15是PartnersTransfers
                        if(cellNum == 17){
                            reportCapital.setPartnertransfers(value);
                        }
                        //16是endCapital
                        if(cellNum == 18){
                            reportCapital.setQuarterendcapital(value);
                        }
                        //17是capitalCommit
                        if(cellNum == 19){
                            reportCapital.setCapitalcommitment(value);
                        }
                        //18是capitalContributed
                        if(cellNum == 20){
                            reportCapital.setCapitalcontributed(value);
                        }
                        //19是transfer
                        if(cellNum == 21){
                            reportCapital.setTransfer(value);
                        }
                        //20是PartanersTransferA
                        if(cellNum == 22){
                            reportCapital.setPartnertransfersa(value);
                        }
                        //21是PartanersTransferB
                        if(cellNum == 23){
                            reportCapital.setPartnertransfersb(value);
                        }//22是PartanersTransferC
                        if(cellNum == 24){
                            reportCapital.setPartnertransfersc(value);
                        }

                    }

                }

            }catch (Exception e){
                e.printStackTrace();
            }

            //判断LPID是否是NULL，如果是就不加入

            //将对象加入List
            if(reportCapital.getLpid() != null){
                reportList.add(reportCapital);
            }



        }

        resultMap.put("reportName",reportName);
        resultMap.put("reportList",reportList);

        return resultMap;


    }


    /**
     * 测试将HTML转PDF
     */
    public static void TestPDF() {

        try {

            String htmlFilePath = "D:\\MyWork\\美元基金账户项目\\发送Qu邮件\\a4_hori4.html";
            //String cssPath = "D:\\MyWork\\美元基金账户项目\\发送Qu邮件\\a4.css";
            String pdfFilePath = "D:\\MyWork\\美元基金账户项目\\发送Qu邮件\\a4_hori.pdf";

            //String cssSource = getURLSource(new File(cssPath));



            //横版的A4
            Document document = new Document(new RectangleReadOnly(842.0F,595.0F));



            PdfWriter writer = PdfWriter.getInstance(document,new FileOutputStream(new File(pdfFilePath)));
            //InputStream cssis = new ByteArrayInputStream(cssSource.toString().getBytes());

            document.open();

            XMLWorkerHelper.getInstance().parseXHtml(writer,document,new FileInputStream(new File(htmlFilePath)));

            document.close();


        }catch (Exception e){
            e.printStackTrace();
        }






    }


    /**
     * 尝试新的方式，html转pdf
     */
    public static void htmlToPdf(){


        try{

            StringBuilder content = new StringBuilder();
            byte[] bys = new byte[1024];
            int len;
            BufferedInputStream in = new BufferedInputStream(new FileInputStream("D:\\MyWork\\美元基金账户项目\\发送Qu邮件\\a4_hori7.html"));


            while ((len = in.read(bys)) != -1){
                content.append(new String(bys, 0, len));
            }

            FileOutputStream os = new FileOutputStream(new File("D:\\MyWork\\美元基金账户项目\\发送Qu邮件\\a4_hori.pdf"));



            ITextRenderer renderer = new ITextRenderer();
            renderer.setDocumentFromString(content.toString());
            renderer.layout();
            renderer.createPDF(os);


        }catch (Exception e){
            e.printStackTrace();
        }






    }




}
