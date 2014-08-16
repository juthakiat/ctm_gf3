/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.geonine.ctm;

import com.geonine.ctm.entities.Contractor;
import java.awt.event.ActionEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

/**
 *
 * @author Juthakiat Tipchai
 */
@ManagedBean
@ViewScoped
public class SearchContractor implements Serializable {

    private String contractId = null;
    private Date startDate = null;
    private Date endDate = null;
    private String contractorName = null;
    private String selectedPurchaseMethod = null;
    private List<SelectItem> purchaseMethods = null;
    private String selectedDepartment = null;
    private List<SelectItem> departments = null;
    private List<Contractor> results = null;
    
    @PostConstruct
    public void initialize() {
        purchaseMethods = new ArrayList<>();
        purchaseMethods.add(new SelectItem("1", "Method I"));
        purchaseMethods.add(new SelectItem("2", "Method II"));
        purchaseMethods.add(new SelectItem("3", "Method III"));
        
        departments = new ArrayList<>();
        departments.add(new SelectItem("1", "Department A"));
        departments.add(new SelectItem("2", "Department B"));
        departments.add(new SelectItem("3", "Department C"));
        
        results = new ArrayList<>(); 
    }
    
    /**
     * Creates a new instance of SearchContractor
     */
    public SearchContractor() {
    }
    
    public List<Contractor> search(ActionEvent evt) {
        System.out.println("contractId: " + contractId);
        System.out.println("startDate: " + startDate);
        System.out.println("endDate: " + endDate);
        System.out.println("contractorName: " + contractorName);
        System.out.println("selectedPurchaseMethod: " + selectedPurchaseMethod);
        System.out.println("selectedDepartment: " + selectedDepartment);
        
        this.results.clear();
        for (int i = 50; --i >= 0;) {
            this.results.add(new Contractor());
        }
        
        // TODO: call entity.find() here...
        return this.results;
    }

    public void reset(ActionEvent evt) {
        this.contractId = null;
        this.startDate = null;
        this.endDate = null;
        this.contractorName = null;
        this.selectedPurchaseMethod = null;
        this.selectedDepartment = null;
        this.results.clear();
        System.out.println("Result is cleared");
    }
    
    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
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

    public String getContractorName() {
        return contractorName;
    }

    public void setContractorName(String contractorName) {
        this.contractorName = contractorName;
    }

    public String getSelectedPurchaseMethod() {
        return selectedPurchaseMethod;
    }

    public void setSelectedPurchaseMethod(String selectedPurchaseMethod) {
        this.selectedPurchaseMethod = selectedPurchaseMethod;
    }

    public List<SelectItem> getPurchaseMethods() {
        return purchaseMethods;
    }

    public String getSelectedDepartment() {
        return selectedDepartment;
    }

    public void setSelectedDepartment(String selectedDepartment) {
        this.selectedDepartment = selectedDepartment;
    }

    public List<SelectItem> getDepartments() {
        return departments;
    }

    public List<Contractor> getResults() {
        return results;
    }
    
}
