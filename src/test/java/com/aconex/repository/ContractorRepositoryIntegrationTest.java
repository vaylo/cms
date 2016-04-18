package com.aconex.repository;

import com.aconex.Application;
import com.aconex.model.ContractorModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.core.Is.is;

/**
 * Created by vlo on 4/17/2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ContractorRepositoryIntegrationTest {

    @Autowired
    private ContractorRepository contractorRepository;

    @Test
    public void testFinalAll() {
        List<ContractorModel> contractors = contractorRepository.findAll();

        assertThat(contractors.size(), is(greaterThanOrEqualTo(0)));
    }
}
