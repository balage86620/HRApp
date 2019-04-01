/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package process;

import dto.DegreeDTO;
import dto.ApplicationDTO;
import dto.ApplicationDTO.ApplicationDTOBuilder;
import dto.CvDTO;
import dto.SkillDTO;
import dto.CvDTO.CvDTOBuilder;
import dto.Degree2hiringDTO;
import dto.Degree2hiringDTO.Degree2hiringDTOBuilder;
import dto.Degree2personDTO;
import dto.Degree2personDTO.Degree2personDTOBuilder;
import dto.DegreeDTO.DegreeDTOBuilder;
import dto.HiringDTO;
import dto.HiringDTO.HiringDTOBuilder;
import dto.InterviewDTO;
import dto.InterviewDTO.InterviewDTOBuilder;
import dto.PersonDTO;
import dto.PersonDTO.PersonDTOBuilder;
import dto.Skill2hiringDTO;
import dto.Skill2hiringDTO.Skill2hiringDTOBuilder;
import dto.Skill2personDTO;
import dto.Skill2personDTO.Skill2personDTOBuilder;
import dto.SkillDTO.SkillDTOBuilder;
import model.Application;
import model.Cv;
import model.Hiring;
import model.Skill;
import model.Degree;
import model.Degree2hiring;
import model.Degree2person;
import model.Interview;
import model.Person;
import model.Skill2hiring;
import model.Skill2person;

/**
 *
 * @author Win10
 */
public class Mapper {

    private static final Mapper MAPPER = new Mapper();

    private Mapper() {
    }

    public static Mapper getMapper() {
        return MAPPER;
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

    public Application convertFromApplicationDTOToEntity(ApplicationDTO data) {
        Application application = new Application();
        application.setDateOfApplication(data.getDateOfApplication());
        application.setHiringId(data.getHiringId());
        application.setId(data.getId());
        application.setInterviewList(ListMapper.getListMapper()
                .convertFromInterviewDTOList(data.getInterviewList()));
        application.setModificationDate(data.getModificationDate());
        application.setPersonId(data.getPersonId());
        application.setStatus(data.getStatus());
        return application;
    }

    public Cv convertFromCvDTOToEntity(CvDTO cvDTO) {
        Cv cv = new Cv();
        cv.setId(cvDTO.getId());
        cv.setLanguage(cvDTO.getLanguage());
        cv.setPathToFile(cvDTO.getPathToFile());
        cv.setPersonId(cvDTO.getPersonId());
        cv.setUploadDate(cvDTO.getUploadDate());
        return cv;
    }

    public CvDTO convertFromCvEntityToDTO(Cv cv) {
        return new CvDTOBuilder()
                .withId(cv.getId())
                .withLanguage(cv.getLanguage())
                .withPathToFile(cv.getPathToFile())
                .withPersonId(cv.getPersonId())
                .withUploadDate(cv.getUploadDate())
                .build();
    }

    public Degree convertFromDegreeDTOToEntity(DegreeDTO data) {
        Degree degree = new Degree();
        degree.setId(data.getId());
        degree.setName(data.getName());
        degree.setDegree2hiringList(ListMapper.getListMapper()
                .convertFromDegree2hiringDTOList(data.getDegree2hiringList()));
        degree.setDegree2personList(ListMapper.getListMapper()
                .convertFromDegree2personDTOList(data.getDegree2personList()));
        return degree;
    }

    public DegreeDTO convertFromDegreeEntityToDTO(Degree degree) {
        return new DegreeDTOBuilder()
                .withId(degree.getId())
                .withName(degree.getName())
                .withDegree2hiringList(degree.getDegree2hiringList())
                .withDegree2personList(degree.getDegree2personList())
                .build();
    }

    public Degree2hiring convertFromDegree2hiringDTOToEntity(Degree2hiringDTO data) {
        Degree2hiring degree2hiring = new Degree2hiring();
        degree2hiring.setDegreeId(data.getDegreeId());
        degree2hiring.setHiringId(data.getHiringId());
        degree2hiring.setId(data.getId());
        return degree2hiring;
    }

    public Degree2hiringDTO convertFromDegree2hiringEntityToDTO(Degree2hiring entity) {
        return new Degree2hiringDTOBuilder()
                .withDegreeId(entity.getDegreeId())
                .withHiringId(entity.getHiringId())
                .withId(entity.getId())
                .build();
    }

    public Degree2person convertFromDegree2personDTOToEntity(Degree2personDTO data) {
        Degree2person degree2person = new Degree2person();
        degree2person.setDateOfIssue(data.getDateOfIssue());
        degree2person.setDegreeId(data.getDegreeId());
        degree2person.setId(data.getId());
        degree2person.setPersonId(data.getPersonId());
        return degree2person;
    }

    public Degree2personDTO convertFromDegree2personEntityToDTO(Degree2person entity) {
        return new Degree2personDTOBuilder()
                .withDateOfIssue(entity.getDateOfIssue())
                .withDegreeId(entity.getDegreeId())
                .withId(entity.getId())
                .withPersonId(entity.getPersonId())
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
        hiring.setApplicationList(
                ListMapper.getListMapper().convertFromApplicationDTOList(data.getApplicationList()));
        hiring.setDegree2hiringList(ListMapper.getListMapper()
                .convertFromDegree2hiringDTOList(data.getDegree2hiringList()));
        hiring.setId(data.getId());
        hiring.setJobDescription(data.getJobDescription());
        hiring.setJobId(data.getJobId());
        hiring.setJobLocation(data.getJobLocation());
        hiring.setJobName(data.getJobName());
        hiring.setSalaryCategory(data.getSalaryCategory());
        hiring.setSkill2hiringList(ListMapper.getListMapper()
                .convertFromSkill2hiringDTOList(data.getSkill2hiringList()));
        return hiring;
    }

    public InterviewDTO convertFromInterviewEntityToDTO(Interview interview) {
        return new InterviewDTOBuilder()
                .withApplicationId(interview.getApplicationId())
                .withId(interview.getId())
                .withDate(interview.getDate())
                .withDescription(interview.getDescription())
                .build();
    }

    public Interview convertFromInterviewDTOToEntity(InterviewDTO data) {
        Interview interview = new Interview();
        interview.setId(data.getId());
        interview.setDate(data.getDate());
        interview.setDescription(data.getDescription());
        interview.setApplicationId(data.getApplicationId());
        return interview;
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

    public Person convertFromPersonDTOToEntity(PersonDTO data) {
        Person person = new Person();
        person.setApplicationList(ListMapper.getListMapper()
                .convertFromApplicationDTOList(data.getApplicationList()));
        person.setCvList(data.getCvList());
        person.setDegree2personList(ListMapper.getListMapper()
                .convertFromDegree2personDTOList(
                        data.getDegree2personList()));
        person.setEmail(data.getEmail());
        person.setId(data.getId());
        person.setName(data.getName());
        person.setPassword(data.getPassword());
        person.setSkill2personList(ListMapper.getListMapper()
                .convertFromSkill2personDTOList(data.getSkill2personList()));
        person.setUserName(data.getUserName());
        return person;
    }

    public Skill2hiring convertFromSkill2hiringDTOToEntity(Skill2hiringDTO data) {
        Skill2hiring skill2hiring = new Skill2hiring();
        skill2hiring.setHiringId(data.getHiringId());
        skill2hiring.setId(data.getId());
        skill2hiring.setSkillId(data.getSkillId());
        skill2hiring.setSkillLevel(data.getSkillLevel());
        return skill2hiring;
    }

    public Skill2hiringDTO convertFromSkill2hiringEntityToDTO(Skill2hiring entity) {
        return new Skill2hiringDTOBuilder()
                .withHiringId(entity.getHiringId())
                .withId(entity.getId())
                .withSkillId(entity.getSkillId())
                .withSkillLevel(entity.getSkillLevel())
                .build();
    }

    public Skill2person convertFromSkill2personDTOToEntity(Skill2personDTO data) {
        Skill2person skill2person = new Skill2person();
        skill2person.setId(data.getId());
        skill2person.setPersonId(data.getPersonId());
        skill2person.setSkillId(data.getSkillId());
        skill2person.setSkillLevel(data.getSkillLevel());
        return skill2person;
    }

    public Skill2personDTO convertFromSkill2personEntityToDTO(Skill2person entity) {
        return new Skill2personDTOBuilder()
                .withSkillId(entity.getSkillId())
                .withId(entity.getId())
                .withSkillId(entity.getSkillId())
                .withSkillLevel(entity.getSkillLevel())
                .build();
    }

    public Skill convertFromSkillDTOToEntity(SkillDTO data) {
        Skill skill = new Skill();
        skill.setId(data.getId());
        skill.setName(data.getName());
        skill.setSkill2hiringList(ListMapper.getListMapper()
                .convertFromSkill2hiringDTOList(data.getSkill2hiringList()));
        skill.setSkill2personList(ListMapper.getListMapper()
                .convertFromSkill2personDTOList(data.getSkill2personList()));
        skill.setType(data.getType());
        return skill;
    }

    public SkillDTO convertFromSkillEntityToDTO(Skill skill) {
        return new SkillDTOBuilder()
                .withId(skill.getId())
                .withName(skill.getName())
                .withSkill2hiringList(skill.getSkill2hiringList())
                .withSkill2personList(skill.getSkill2personList())
                .withType(skill.getType())
                .build();
    }

}
