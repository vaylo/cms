package com.aconex.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by vlo on 4/17/2016.
 */
@Entity
@Table(name="PROJECT")
public class ProjectModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name="name")
    String name;
    @OneToMany(mappedBy="project")
    private List<ContractModel> contracts;


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

    public List<ContractModel> getContracts() {
        return contracts;
    }

    public void setContracts(List<ContractModel> contracts) {
        this.contracts = contracts;
    }

    public void addContractModel(ContractModel contractorModel) {
        this.contracts.add(contractorModel);
        if (contractorModel.getProject()!= this) {
            contractorModel.setProject(this);
        }
    }
}
