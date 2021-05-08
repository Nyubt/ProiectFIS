/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Elena
 */
public class Recurenta {
    private int modRecurenta;
    private Date dateSfarsit;
    
    public Recurenta(){
        this.modRecurenta = 0;
        this.dateSfarsit = new Date();
    }
    
    public Recurenta(int modRecurenta, Date dateSfarsit){
        this.modRecurenta = modRecurenta;
        this.dateSfarsit = dateSfarsit;
    }
    
    /**
     * Returneaza valoare modului de recurenta
     * @return 
     */
    public int getModRecurenta() {
        return this.modRecurenta;
    }
    
    /**
     * Returneaza ultima data de recurenta
     * @return 
     */
    public Date getDataSfarsit() {
        return this.dateSfarsit;
    }
}
