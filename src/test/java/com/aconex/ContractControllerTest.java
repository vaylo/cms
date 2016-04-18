package com.aconex;

import com.aconex.controller.ContractController;
import com.aconex.repository.ProjectRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * Created by vlo on 4/17/2016.
 */
public class ContractControllerTest {


    @InjectMocks
    private ContractController cc;

    @Mock
    private ProjectRepository budgetRepository;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetContractors() {
        /**
         * TODO
         */
    }
}
