
package gui.ayarlar;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class IconAyarları {
    private static Icon originalIcon;
    
    public static void changeIcon(JLabel label,String fileName)
    {
        originalIcon = label.getIcon();
        label.setIcon(new ImageIcon(IconAyarları.class.getResource("/gui/iconlar/" + fileName + ".png")));
    }
    
    public static void setOriginalIcon(JLabel label)
    {
        label.setIcon(originalIcon);
    }
}
