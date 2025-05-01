
package gui.ayarlar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Dialogs {
    
    public static void bosOlamazMesajıGoster(JFrame frame)
    {
        JOptionPane.showMessageDialog(frame, "Tüm alanlar dolu olmalıdır", "Hata", JOptionPane.WARNING_MESSAGE);
    }
    
    public static void ozelMesajGoster(JFrame frame, String message)
    {
        JOptionPane.showMessageDialog(frame, message);
    }
    
    public static boolean onayMesajiGoster(JFrame frame, String message) {
    int selected = JOptionPane.showConfirmDialog(
        frame,
        message,
        "UYARI",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE
    );
    return selected == JOptionPane.YES_OPTION;
    }

}
