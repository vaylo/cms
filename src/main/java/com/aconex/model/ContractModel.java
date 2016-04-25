package com.aconex.model;

import javax.persistence.*;

/**
 * Created by vlo on 4/17/2016.
 */

@Entity
@Table(name="CONTRACT")
public class ContractModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "code")
    private String code;
    @Column(name = "description")
    private String description;
    @Column(name = "budget")
    private Integer budget;
    @Column(name ="committed_cost")
    private Integer committedCost;
    @Column(name = "forecast")
    private Integer forecast;
    @Column(name="paid")
    private Integer paid;
    @Column(name="completed_percentage")
    private Integer completePercentage;
    @Column(name="vendor")
    private String vendor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="PROJECT_ID")
    private ProjectModel project;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public Integer getCompletePercentage() {
        return completePercentage;
    }

    public void setCompletePercentage(Integer completePercentage) {
        this.completePercentage = completePercentage;
    }

    public Integer getPaid() {
        return paid;
    }

    public void setPaid(Integer paid) {
        this.paid = paid;
    }

    public Integer getForecast() {
        return forecast;
    }

    public void setForecast(Integer forecast) {
        this.forecast = forecast;
    }

    public Integer getCommittedCost() {
        return committedCost;
    }

    public void setCommittedCost(Integer committedCost) {
        this.committedCost = committedCost;
    }

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProjectModel getProject() {
        return project;
    }

    public void setProject(ProjectModel projectModel) {
        this.project = projectModel;
        if (project.getContracts() != null && !projectModel.getContracts().contains(this)) {
            projectModel.getContracts().add(this);
        }
    }
}
