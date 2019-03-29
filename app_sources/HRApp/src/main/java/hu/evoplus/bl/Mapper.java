/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.evoplus.bl;

import hu.evoplus.dto.PersonDTO;
import hu.evoplus.dto.PersonDTO.PersonDTOBuilder;
import hu.evoplus.entity.Person;

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
    
    public PersonDTO getPersonToDTO(Person person) {
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
    public Person getPersonDTOToEntity(PersonDTO dto) {
        Person person = new Person();
        person.setApplicationList(dto.getApplicationList());
        person.setCvList(dto.getCvList());
        person.setDegree2personList(dto.getDegree2personList());
        person.setEmail(dto.getEmail());
        person.setId(dto.getId());
        person.setName(dto.getName());
        person.setPassword(dto.getPassword());
        person.setSkill2personList(dto.getSkill2personList());
        person.setUserName(dto.getUserName());
        return person;
    }
}
