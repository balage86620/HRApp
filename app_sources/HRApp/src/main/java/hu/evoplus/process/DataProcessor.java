/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.evoplus.process;

import com.fasterxml.jackson.databind.ObjectMapper;
import hu.evoplus.control.HiringFacade;
import hu.evoplus.rest.JobDTO;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author lkg
 */
@Stateless
public class DataProcessor {

    @Inject
    HiringFacade hf;

    public List<JobDTO> process(String listOfJobsJson) throws IOException {
        ObjectMapper om = new ObjectMapper();
        List<JobDTO> jobs = Arrays.asList(om.readValue(listOfJobsJson, JobDTO[].class));
        return jobs;

    }
}
