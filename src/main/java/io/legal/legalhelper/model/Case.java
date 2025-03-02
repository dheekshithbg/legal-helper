package io.legal.legalhelper.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Case {
    @Id
    @GeneratedValue
    private Long id;
    private String casenumber;
    private String clientname;
    private String courtname;
    private LocalDate registerdate;
    private LocalDate hearingdate;
    private String type;
    private String category;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCasenumber() {
        return casenumber;
    }
    public void setCasenumber(String casenumber) {
        this.casenumber = casenumber;
    }
    public String getClientname() {
        return clientname;
    }
    public void setClientname(String clientname) {
        this.clientname = clientname;
    }
    public String getCourtname() {
        return courtname;
    }
    public void setCourtname(String courtname) {
        this.courtname = courtname;
    }
    public LocalDate getRegisterdate() {
        return registerdate;
    }
    public void setRegisterdate(LocalDate registerdate) {
        this.registerdate = registerdate;
    }
    public LocalDate getHearingdate() {
        return hearingdate;
    }
    public void setHearingdate(LocalDate hearingdate) {
        this.hearingdate = hearingdate;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }      
    
    
}
