
package database;

import database.transaction.HesapBilgileri;


public interface IBilgiController {
    
    public boolean bilgilerGecerliMi();
    
    
    public HesapBilgileri getHesapBilgileri();
    
}
