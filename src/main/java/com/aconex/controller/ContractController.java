package com.aconex.controller;

import com.aconex.data.Contract;
import com.aconex.model.ContractModel;
import com.aconex.model.ProjectModel;
import com.aconex.repository.ContractRepository;
import com.aconex.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vlo on 4/17/2016.
 */

@RestController
@RequestMapping("api/v1/")
public class ContractController {

    @Autowired
    private ContractRepository contractorRepository;

    @Autowired
    private ProjectRepository projectRepository;

    @RequestMapping(value="contracts", method = RequestMethod.GET)
    public List<Contract> getContracts() {

        List<ContractModel> cmList = contractorRepository.findAll();

        List<Contract> contracts = new ArrayList<Contract>();

        for (ContractModel cm: cmList) {
            contracts.add(convertToContract(cm));
        }

        return contracts;
    }

    @RequestMapping(value="contracts", method = RequestMethod.POST)
    public Contract create(@RequestBody Contract contract) {

        String projectName = contract.getProjectName();

        ProjectModel existingProject = projectRepository.findByName(projectName);

        if (existingProject == null) {
            ProjectModel newProject = new ProjectModel();
            newProject.setName(projectName);
            existingProject = projectRepository.saveAndFlush(newProject);
        }

        ContractModel model = convertToModel(contract);
        model.setProject(existingProject);

        ContractModel cm = contractorRepository.saveAndFlush(model);
        return convertToContract(cm);
    }

    @RequestMapping(value="contracts/{id}", method = RequestMethod.GET)
    public Contract get(@PathVariable Long id) {
        return convertToContract(contractorRepository.findOne(id));
    }

    @RequestMapping(value="contracts/{id}", method = RequestMethod.PUT)
    public Contract update(@PathVariable Long id, @RequestBody Contract contract) {

        ContractModel existingContractorModel = contractorRepository.findOne(id);

        existingContractorModel.setName(contract.getName());
        existingContractorModel.setDescription(contract.getDescription());
        existingContractorModel.setCode(contract.getCode());
        existingContractorModel.setBudget(contract.getBudget());
        existingContractorModel.setCommittedCost(contract.getCommittedCost());
        existingContractorModel.setCompletePercentage(contract.getCompletePercentage());
        existingContractorModel.setForecast(contract.getForecast());
        existingContractorModel.setPaid(contract.getPaid());
        existingContractorModel.setVendor(contract.getVendor());


       return convertToContract(contractorRepository.saveAndFlush(existingContractorModel));

    }
    @RequestMapping(value="contracts/{id}", method = RequestMethod.DELETE)
    public Contract delete(@PathVariable Long id) {

        Contract contract = convertToContract(contractorRepository.findOne(id));
        contractorRepository.delete(id);
        return contract;
    }

    private ContractModel convertToModel(Contract contractor) {
        ContractModel cm = new ContractModel();
        cm.setName(contractor.getName());
        cm.setBudget(contractor.getBudget());
        cm.setCode(contractor.getCode());
        cm.setCommittedCost(contractor.getCommittedCost());
        cm.setCompletePercentage(contractor.getCompletePercentage());
        cm.setDescription(contractor.getDescription());
        cm.setForecast(contractor.getForecast());
        cm.setPaid(contractor.getPaid());
        cm.setVendor(contractor.getVendor());

        return cm;

    }
    private Contract convertToContract(ContractModel cm) {

        Contract contract = new Contract();

        contract.setId(cm.getId());
        contract.setProjectName(cm.getProject().getName());
        contract.setName(cm.getName());
        contract.setBudget(cm.getBudget());
        contract.setCode(cm.getCode());
        contract.setCommittedCost(cm.getCommittedCost());
        contract.setCompletePercentage(cm.getCompletePercentage());
        contract.setDescription(cm.getDescription());
        contract.setForecast(cm.getForecast());
        contract.setPaid(cm.getPaid());
        contract.setVendor(cm.getVendor());

        return contract;
    }

}
