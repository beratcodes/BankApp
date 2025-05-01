
package gui.ayarlar;

import java.awt.Color;
import javax.swing.JButton;

public class ButonAyarları {
    
    private static Color OriginalbgColor;
    
    
    public static void setBg(JButton button, Color bgColor)
    {
        OriginalbgColor = button.getBackground();
        button.setBackground(bgColor);
    }
    
    public static void setOriginalBg(JButton button)
    {
        button.setBackground(OriginalbgColor);
    }
}
