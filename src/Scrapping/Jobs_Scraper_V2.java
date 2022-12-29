import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Jobs_Scraper_V2 {

    private static String[] columns = {"id","sitename", "Postname",
            "description", "DateDePublication", "Entreprise","EntrepriseDes", "region", "Competence","Type_de_contrat","secteur","experience","niveau_etude","langue","nombre_de_poste","Postuler"};
    private static List<data_V2> data_V2 = new ArrayList<data_V2>();

    public static void main(String[] args) throws IOException {
        try {
            int j;
            int k = 1;
            int nombre_de_poste=1;

            for (int i = 0; i < 48; i++) {

                Document doc = Jsoup.connect("https://www.emploi.ma/recherche-jobs-maroc?page=" + i).get();
                Elements newsHeadlines = doc.select(".job-description-wrapper");
                for (Element hicham : newsHeadlines) {

                    Elements Postname = hicham.select(".job-title h5");
                    Elements DateDePublication = hicham.select(".job-title .job-recruiter");
                    Elements Entreprise = hicham.select(".job-title .job-recruiter .company-name");
                    Elements description = hicham.select(".job-title .search-description");
                    Elements region = hicham.select(".job-title p");
                    Elements Competence = hicham.select(".job-title .job-tags .badge");
                    Document emploi = Jsoup.connect(hicham.absUrl("data-href")).get();

                    Elements Type_de_contrat = emploi.select(".field-name-field-offre-contrat-type .field-item");
                    Elements secteur = emploi.select(".field-name-field-offre-secteur .field-item");
                    Elements experience = emploi.select(".field-name-field-offre-niveau-experience .field-item");
                    Elements niveau_etude = emploi.select(".field-name-field-offre-niveau-etude .field-item");
                    Elements langue = emploi.select(".field-name-field-offre-niveau-langue .field-item");
                    Elements EntrepriseDes = emploi.select(".job-ad-company-description");
                    String sitename="Emploi.ma";

                    data_V2.add(new data_V2(k,sitename, Postname.text(), description.text(), DateDePublication.text().split(" ")[0],
                            Entreprise.text(),EntrepriseDes.text(), region.last().text().split(":")[1], Competence.text(),
                            Type_de_contrat.text(),secteur.text(),experience.text(),niveau_etude.text(),langue.text(),nombre_de_poste,hicham.absUrl("data-href")));

                    System.out.println("Emploi " + k+ " succefully collected !!!!!!!!!!");




                    k++;

                }
                j = i + 1;
                System.out.println("page " + j + " succefully collected!!!!!");



            }

            SAVE();
        }
        catch (Exception e){
            System.out.println("Erreur de la connexion");
            SAVE();

        }


    }
    public static void SAVE() throws IOException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Jobs-Scraper-V2");

        Font headerFont = workbook.createFont();
        headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 14);
        headerFont.setColor(IndexedColors.RED.getIndex());

        CellStyle headerCellStyle = workbook.createCellStyle();
        headerCellStyle.setFont(headerFont);

        Row headerRow = sheet.createRow(0);


        for (int i = 0; i < columns.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i]);
            cell.setCellStyle(headerCellStyle);
        }


        int rowNum = 1;

        for (data_V2 data : data_V2) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(data.id);
            row.createCell(1).setCellValue(data.sitename);
            row.createCell(2).setCellValue(data.Postname);
            row.createCell(3).setCellValue(data.description);
            row.createCell(4).setCellValue(data.DateDePublication);
            row.createCell(5).setCellValue(data.Entreprise);
            row.createCell(6).setCellValue(data.EntrepriseDes);
            row.createCell(7).setCellValue(data.region);
            row.createCell(8).setCellValue(data.Competence);
            row.createCell(9).setCellValue(data.Type_de_contrat);
            row.createCell(10).setCellValue(data.secteur);
            row.createCell(11).setCellValue(data.experience);
            row.createCell(12).setCellValue(data.niveau_etude);
            row.createCell(13).setCellValue(data.langue);
            row.createCell(14).setCellValue(data.nombre_de_poste);
            row.createCell(15).setCellValue(data.Postuler);
        }


        FileOutputStream fileOut = new FileOutputStream("Jobs-Scraper-V2.xlsx");
        workbook.write(fileOut);
        fileOut.close();

    }
}
