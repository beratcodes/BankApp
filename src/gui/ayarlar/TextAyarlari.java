
package gui.ayarlar;

import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class TextAyarlari {
    
    private static String originalText;
    
    public static void checkTheTextFocusGained(JTextField textfield, String org)
    {
        originalText = org;
        
        if(textfield.getText().trim().equals(org))
        {
            textfield.setText("");
        }
    }
    
    public static void checkTheTextFocusLost(JTextField textfield)
    {
        
        if(textfield.getText().trim().equals(""))
        {
            textfield.setText(originalText);
        }
    }
    
    // Rakam Ayarları
    public static void setOnlyNumber(JTextField textfield)
    {
        textfield.addKeyListener(new KeyAdapter() {
           
            @Override 
            public void keyTyped(KeyEvent e)
            {
                char c = e.getKeyChar();
                // isDigit() girilen karakterin rakam olup olmadığına bakar.
                if(!Character.isDigit(c)) // Eğer girilen karakter rakam değilse 
                {
                    e.consume(); // girilen karakterleri devre dışı bırak.
                }
            }       
        });
    }
    
    public static void setOnlyAlphabetic(JTextField textfield) {
    textfield.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            // Eğer girilen karakter alfabetik değilse ve boşluk değilse
            if (!Character.isAlphabetic(c) && !Character.isWhitespace(c)) {
                e.consume(); // Girilen karakteri devre dışı bırak
            }
        }
    });
}

    
    // Limit Ayarları
    private static int limit;
    public static void setMaximumLimit(JTextField textfield, int lim)
    {
        limit = lim;
        
        textfield.setDocument(new PlainDocument(){
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                if(str == null)
                {
                    return;
                }
                if((getLength() + str.length()) <= limit)
                {
                    super.insertString(offs, str, a);
                }
            }
            
        });
    }
    
    public static boolean uzunlukSundanKucukMu(int length, String str)
    {
        return (str.length() < length);
    }
    
    /*
    Para miktarı ayarları
    */
    
    public static int checkTheTextKeyReleased(JTextField textField, int moneyLimit)
    {
        int miktar;
        String text = textField.getText();
        if(!text.equals(""))
        {
            miktar = Integer.valueOf(text);
            if(miktar > moneyLimit)
            {
                miktar = moneyLimit;
                textField.setText(String.valueOf(miktar));
            }
            return miktar;
        } 
        else 
        {
            miktar = 0;
        }
        return 0;
    }
    
    // Text Alanları Kontrolü
    
    public static boolean textAlanlariDolumu(JPanel panel)
    {
        Component [] components = panel.getComponents();
        for(Component c:components)
        {
            if(c instanceof JTextField)
            {
                JTextField textField = (JTextField) c;
                if(textField.getText().trim().equals("") && textField.isEnabled())
                {
                    return false;
                }
            }
        }
        return true;
    }
    
}
