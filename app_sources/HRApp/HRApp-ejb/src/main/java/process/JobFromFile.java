/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package process;

import dto.JobDTO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;

/**
 *
 * @author lkg
 */
public class JobFromFile {

    @Inject
    DataProcessor dp;

    public List<JobDTO> getJobs() {
        try (Scanner scanner = new Scanner("jobs.json")) {
            String jobsInString = "";
            while (scanner.hasNextLine()) {
                jobsInString = jobsInString
                        + scanner.nextLine();
            }
            return dp.process(jobsInString);
        } catch (IOException ex) {
            Logger.getLogger(JobFromFile.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<JobDTO>();
        }
    }
    
//    public static void main(String[] args) {
//        List<JobDTO> jobs = new JobFromFile().getJobs();
//        for (JobDTO job : jobs) {
//            System.out.println("job");
//        }
//    }
}
