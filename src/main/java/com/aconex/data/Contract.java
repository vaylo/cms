package com.aconex.data;

/**
 * Created by vlo on 4/17/2016.
 */
public class Contract {

    private Long id;
    private String projectName;
    private String name;
    private String code;
    private String description;
    private Integer budget;
    private Integer committedCost;
    private Integer forecast;
    private Integer paid;
    private Integer completePercentage;
    private String vendor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    public Integer getCommittedCost() {
        return committedCost;
    }

    public void setCommittedCost(Integer committedCost) {
        this.committedCost = committedCost;
    }

    public Integer getForecast() {
        return forecast;
    }

    public void setForecast(Integer forecast) {
        this.forecast = forecast;
    }

    public Integer getPaid() {
        return paid;
    }

    public void setPaid(Integer paid) {
        this.paid = paid;
    }

    public Integer getCompletePercentage() {
        return completePercentage;
    }

    public void setCompletePercentage(Integer completePercentage) {
        this.completePercentage = completePercentage;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

}
