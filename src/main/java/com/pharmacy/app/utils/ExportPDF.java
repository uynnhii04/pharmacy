/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pharmacy.app.utils;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.kernel.font.*;
import com.itextpdf.layout.element.*;
import com.itextpdf.io.font.*;
import java.lang.reflect.Field;
import java.io.File;
import java.util.List;
import javax.swing.JOptionPane;
import com.itextpdf.layout.Document;
/**
 *
 * @author BOI QUAN
 */
public class ExportPDF {
    // Phương thức tổng quát để xuất một danh sách đối tượng ra PDF
    public static void exportListToPDF(List<?> list, String fileName, String[] headers) {
        try {
            String fontPath = "C:/Windows/Fonts/arial.ttf";
            PdfFont font = PdfFontFactory.createFont(fontPath, PdfEncodings.IDENTITY_H, true);
            // Đảm bảo thư mục exportpdf tồn tại
            File dir = new File("exportpdf");
            if (!dir.exists()) {
                dir.mkdirs(); // Tạo thư mục nếu chưa có
            }

            // Xác định đường dẫn đầy đủ đến file PDF
            String dest = dir.getAbsolutePath() + "/" + fileName;
            File file = new File(dest);

            // Tạo PdfDocument và Document
            PdfDocument pdf = new PdfDocument(new PdfWriter(dest));
            Document document = new Document(pdf){};
//            document.setFont(font);
            // Tiêu đề của tài liệu
            document.add(new Paragraph("Danh Sách").setFont(font).setBold().setFontSize(18));

            // Tạo bảng để hiển thị danh sách
            float[] columnWidths = new float[headers.length]; // Chiều rộng các cột
            for (int i = 0; i < headers.length; i++) {
                columnWidths[i] = 2f; // Đặt chiều rộng cột mặc định (có thể thay đổi)
            }
            Table table = new Table(columnWidths);

            // Thêm tiêu đề cột
            for (String header : headers) {
                table.addHeaderCell(new Cell().add(new Paragraph(header)));
            }

            // Thêm dữ liệu vào bảng từ danh sách
            for (Object obj : list) {
                Field[] fields = obj.getClass().getDeclaredFields();
                for (Field field : fields) {
                    field.setAccessible(true); // Cho phép truy cập vào trường private
                    Object value = field.get(obj); // Lấy giá trị trường
                    table.addCell(new Cell().add(new Paragraph(value != null ? value.toString() : "")));
                }
            }

            // Thêm bảng vào document
            document.add(table);

            // Đóng document
            document.close();
            JOptionPane.showMessageDialog(null, "Danh sách đã được xuất ra file PDF tại: " + dest);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
