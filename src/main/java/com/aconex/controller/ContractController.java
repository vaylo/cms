package com.aconex.controller;

import com.aconex.data.Contractor;
import com.aconex.model.ContractorModel;
import com.aconex.repository.ContractorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vlo on 4/17/2016.
 */

@RestController
@RequestMapping("api/v1/")
public class ContractController {

    @Autowired
    private ContractorRepository contractorRepository;

    @RequestMapping(value="contractors", method = RequestMethod.GET)
    public List<Contractor> getContractors() {

        List<ContractorModel> cmList = contractorRepository.findAll();

        List<Contractor> contractors = new ArrayList<Contractor>();

        for (ContractorModel cm: cmList) {
            Contractor contractor = new Contractor();
            contractor.setId(cm.getId());
            contractor.setName(cm.getName());
            contractors.add(contractor);
        }

        return contractors;
    }
}
