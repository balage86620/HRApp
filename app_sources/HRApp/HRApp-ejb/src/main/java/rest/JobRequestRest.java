/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import dto.JobDTO;
import process.DataProcessor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;

/**
 *
 * @author lkg
 */
@RequestScoped
public class JobRequestRest {
    @Inject
    DataProcessor dp;
    String url = "http://www.google.com/search?q=httpClient";//Ez jön a másik csoporttól!!!!!%!%

    public List<JobDTO> getJobs() {
        HttpClient client = new HttpClient();
        GetMethod getMethod = new GetMethod(url);

        int responseCode;
        try {
            responseCode = client.executeMethod(getMethod);
            System.out.println("Response Code : " + responseCode);
            System.out.println("Response  : " + getMethod.getResponseBodyAsString());
            if(responseCode != 200) {
                throw new IOException("Baj van");
            } else {
                return dp.process(getMethod.getResponseBodyAsString());
            }

        } catch (IOException ex) {
            Logger.getLogger(JobRequestRest.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<JobDTO>();
        }

    }
}
