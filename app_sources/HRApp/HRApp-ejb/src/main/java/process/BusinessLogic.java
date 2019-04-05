/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package process;

import dto.ApplicationDTO;
import dto.HiringDTO;
import dto.InterviewDTO;
import dto.PersonDTO;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import repository.ApplicationFacade;
import model.Application;
import model.Hiring;
import model.Interview;
import model.Person;
import repository.HiringFacade;
import repository.PersonFacade;

/**
 *
 * @author Hirsch
 */
@Stateless
public class BusinessLogic{

    @EJB
    private ApplicationFacade appFacade;
    @EJB
    private PersonFacade personFacade;
    @EJB
    private HiringFacade hiringFacade;
    private final Mapper mapper = new Mapper();

    public List<ApplicationDTO> getApplicationDTOForController() {
        List<ApplicationDTO> result = new ArrayList<>();
        for (Application a : appFacade.findAll()) {
            result.add(mapper.convertFromApplicationEntityToDTO(a));
        }
        return result;
    }
    public void newApplication(PersonDTO personDTO, HiringDTO hiringDTO){
        ApplicationDTO appDTO = new ApplicationDTO.ApplicationDTOBuilder()
                .withId(Integer.SIZE)
                .withPerson(mapper.convertFromPersonDTOToEntity(personDTO))
                .withHiring(mapper.convertFromHiringDTOToEntity(hiringDTO))
                .withModificationDate(getDate())
                .withStatus("Open")
                .withInterviewListDTO(new ArrayList<InterviewDTO>())
                .build();
        appFacade.create(mapper.convertFromApplicationDTOToEntity(appDTO));
    }
    private Person findPerson(Integer personId){
        return personFacade.find(personId);
    }
    private Hiring findHiring(Integer hiringId){
        return hiringFacade.find(hiringId);
    }
    private Date getDate(){
         return Calendar.getInstance().getTime();
    }
    
}
