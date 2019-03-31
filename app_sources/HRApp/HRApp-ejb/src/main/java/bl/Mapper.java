/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import dto.HiringDTO;
import dto.HiringDTO.HiringDTOBuilder;
import dto.PersonDTO;
import dto.PersonDTO.PersonDTOBuilder;
import dto.ApplicationDTO;
import dto.ApplicationDTO.ApplicationDTOBuilder;
import model.Application;
import model.Hiring;
import model.Person;

/**
 *
 * @author lkg
 */
public final class Mapper {

    private static Mapper mapper = new Mapper();

    private Mapper() {
    }

    public static Mapper getMapper() {
        return mapper;
    }

    public ApplicationDTO convertFromApplicationEntityToDTO(Application application) {
        return new ApplicationDTOBuilder()
                .withDateOfApplication(application.getDateOfApplication())
                .withHiringId(application.getHiringId())
                .withId(application.getId())
                .withInterviewList(application.getInterviewList())
                .withModificationDate(application.getModificationDate())
                .withPersonId(application.getPersonId())
                .withStatus(application.getStatus())
                .build();
    }

    public PersonDTO convertFromPersonEntityToDTO(Person person) {
        return new PersonDTOBuilder()
                .withApplicants(person.getApplicationList())
                .withCvList(person.getCvList())
                .withDegrees(person.getDegree2personList())
                .withEmail(person.getEmail())
                .withID(person.getId())
                .withName(person.getName())
                .withPassword(person.getPassword())
                .withSkills(person.getSkill2personList())
                .withUserName(person.getUserName())
                .build();
    }

    public HiringDTO convertFromHiringEntityToDTO(Hiring hiring) {
        return new HiringDTOBuilder()
                .withAddedAt(hiring.getAddedAt())
                .withApplicationList(hiring.getApplicationList())
                .withDegree2hiringList(hiring.getDegree2hiringList())
                .withId(hiring.getId())
                .withJobDescription(hiring.getJobDescription())
                .withJobId(hiring.getJobId())
                .withJobLocation(hiring.getJobLocation())
                .withJobName(hiring.getJobName())
                .withSalaryCategory(hiring.getSalaryCategory())
                .withSkill2hiringList(hiring.getSkill2hiringList())
                .build();
    }

    public Hiring convertFromHiringDTOToEntity(HiringDTO data) {
        Hiring hiring = new Hiring();
        hiring.setAddedAt(data.getAddedAt());
        hiring.setApplicationList(data.getApplicationList());
        hiring.setDegree2hiringList(data.getDegree2hiringList());
        hiring.setId(data.getId());
        hiring.setJobDescription(data.getJobDescription());
        hiring.setJobId(data.getJobId());
        hiring.setJobLocation(data.getJobLocation());
        hiring.setJobName(data.getJobName());
        hiring.setSalaryCategory(data.getSalaryCategory());
        hiring.setSkill2hiringList(data.getSkill2hiringList());
        return hiring;
    }

    public Application convertFromApplicationDTOToEntity(ApplicationDTO data) {
        Application application = new Application();
        application.setDateOfApplication(data.getDateOfApplication());
        application.setHiringId(data.getHiringId());
        application.setId(data.getId());
        application.setInterviewList(data.getInterviewList());
        application.setModificationDate(data.getModificationDate());
        application.setPersonId(data.getPersonId());
        application.setStatus(data.getStatus());
        return application;
    }

    public Person convertFromPersonDTOToEntity(PersonDTO data) {
        Person person = new Person();
        person.setApplicationList(data.getApplicationList());
        person.setCvList(data.getCvList());
        person.setDegree2personList(data.getDegree2personList());
        person.setEmail(data.getEmail());
        person.setId(data.getId());
        person.setName(data.getName());
        person.setPassword(data.getPassword());
        person.setSkill2personList(data.getSkill2personList());
        person.setUserName(data.getUserName());
        return person;
    }

}
