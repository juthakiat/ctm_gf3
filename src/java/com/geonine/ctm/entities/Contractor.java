/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.geonine.ctm.entities;


import com.geonine.ctm.utils.LoremIpsum;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Juthakiat Tipchai
 */
public class Contractor {
    private String contractId;
    private Date contractDate;
    private String desc;
    private String place;
    private Date startDate;
    private Date endDate;

    /**
 * Returns a pseudo-random number between min and max, inclusive.
 * The difference between min and max can be at most
 * <code>Integer.MAX_VALUE - 1</code>.
 *
 * @param min Minimum value
 * @param max Maximum value.  Must be greater than min.
 * @return Integer between min and max, inclusive.
 * @see java.util.Random#nextInt(int)
 */
public static int randInt(int min, int max) {
    // NOTE: Usually this should be a field rather than a method
    // variable so that it is not re-seeded every call.
    Random rand = new Random();
    // nextInt is normally exclusive of the top value,
    // so add 1 to make it inclusive
    int randomNum = rand.nextInt((max - min) + 1) + min;
    return randomNum;
}
    
    public Contractor() {
        this.contractId = "Contrac " + Contractor.randInt(10000, 50000);
        
        LoremIpsum loremIpsum = new LoremIpsum(2);
        String[] lines = loremIpsum.getLines();
        this.desc = lines[0];
        this.place = lines[1];
        
        this.contractDate = new Date();
        this.startDate = new Date();
        this.endDate = new Date();
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public Date getContractDate() {
        return contractDate;
    }

    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
}
