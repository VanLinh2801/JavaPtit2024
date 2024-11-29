import com.formdev.flatlaf.FlatLightLaf;
import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.TimePicker;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class Test1 {
    public static void main(String[] args) {
        // Áp dụng FlatLaf (Look and Feel hiện đại)
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize FlatLaf");
        }

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("DateTime Picker with FlatLaf");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 250);
            frame.setLayout(new FlowLayout());

            // Tạo DatePicker
            DatePicker datePicker = new DatePicker();
            datePicker.setToolTipText("Chọn ngày");

            // Tạo TimePicker
            TimePicker timePicker = new TimePicker();
            timePicker.setToolTipText("Chọn giờ");

            // Nút để hiển thị ngày giờ đã chọn
            JButton button = new JButton("Xác nhận");
            JLabel resultLabel = new JLabel();

            button.addActionListener(e -> {
                LocalDate selectedDate = datePicker.getDate();
                LocalTime selectedTime = timePicker.getTime();
                if (selectedDate != null && selectedTime != null) {
                    resultLabel.setText("Ngày giờ đã chọn: " + selectedDate + " " + selectedTime);
                } else {
                    resultLabel.setText("Vui lòng chọn cả ngày và giờ!");
                }
            });

            // Thêm các thành phần vào giao diện
            frame.add(new JLabel("Chọn ngày:"));
            frame.add(datePicker);
            frame.add(new JLabel("Chọn giờ:"));
            frame.add(timePicker);
            frame.add(button);
            frame.add(resultLabel);

            frame.setVisible(true);
        });
    }
}
