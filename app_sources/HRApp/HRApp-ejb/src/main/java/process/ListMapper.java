/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package process;

import dto.ApplicationDTO;
import dto.CvDTO;
import dto.Degree2hiringDTO;
import dto.Degree2personDTO;
import dto.Skill2personDTO;
import dto.DegreeDTO;
import dto.HiringDTO;
import dto.InterviewDTO;
import dto.Skill2hiringDTO;
import java.util.ArrayList;
import java.util.List;
import model.Application;
import model.Cv;
import model.Degree;
import model.Degree2hiring;
import model.Degree2person;
import model.Hiring;
import model.Interview;
import model.Skill2hiring;
import model.Skill2person;

/**
 *
 * @author Win10
 */
public class ListMapper {

    private static final Mapper MAPPER = Mapper.getMapper();
    private static final ListMapper LIST_MAPPER = new ListMapper();

    private ListMapper() {

    }

    public static ListMapper getListMapper() {
        return LIST_MAPPER;
    }

    public List<Application> convertFromApplicationDTOList(List<ApplicationDTO> list) {
        List<Application> result = new ArrayList<>();
        for (ApplicationDTO a : list) {
            result.add(MAPPER.convertFromApplicationDTOToEntity(a));
        }
        return result;
    }

    public List<Cv> convertFromCvDTOList(List<CvDTO> list) {
        List<Cv> result = new ArrayList<>();
        for (CvDTO a : list) {
            result.add(MAPPER.convertFromCvDTOToEntity(a));
        }
        return result;
    }

    public List<Degree> convertFromDegreeDTOList(List<DegreeDTO> list) {
        List<Degree> result = new ArrayList<>();
        for (DegreeDTO a : list) {
            result.add(MAPPER.convertFromDegreeDTOToEntity(a));
        }
        return result;
    }

    public List<Hiring> convertFromHiringDTOList(List<HiringDTO> list) {
        List<Hiring> result = new ArrayList<>();
        for (HiringDTO a : list) {
            result.add(MAPPER.convertFromHiringDTOToEntity(a));
        }
        return result;
    }

    public List<Interview> convertFromInterviewDTOList(List<InterviewDTO> list) {
        List<Interview> result = new ArrayList<>();
        for (InterviewDTO a : list) {
            result.add(MAPPER.convertFromInterviewDTOToEntity(a));
        }
        return result;
    }

    public List<Degree2hiring> convertFromDegree2hiringDTOList(List<Degree2hiringDTO> list) {
        List<Degree2hiring> result = new ArrayList<>();
        for (Degree2hiringDTO a : list) {
            result.add(MAPPER.convertFromDegree2hiringDTOToEntity(a));
        }
        return result;
    }

    public List<Degree2person> convertFromDegree2personDTOList(List<Degree2personDTO> list) {
        List<Degree2person> result = new ArrayList<>();
        for (Degree2personDTO a : list) {
            result.add(MAPPER.convertFromDegree2personDTOToEntity(a));
        }
        return result;
    }

    public List<Skill2hiring> convertFromSkill2hiringDTOList(List<Skill2hiringDTO> list) {
        List<Skill2hiring> result = new ArrayList<>();
        for (Skill2hiringDTO a : list) {
            result.add(MAPPER.convertFromSkill2hiringDTOToEntity(a));
        }
        return result;
    }

    public List<Skill2person> convertFromSkill2personDTOList(List<Skill2personDTO> list) {
        List<Skill2person> result = new ArrayList<>();
        for (Skill2personDTO a : list) {
            result.add(MAPPER.convertFromSkill2personDTOToEntity(a));
        }
        return result;
    }

    public List<InterviewDTO> convertFromInterviewEntityList(List<Interview> list) {
        List<InterviewDTO> result = new ArrayList<>();
        for (Interview a : list) {
            result.add(MAPPER.convertFromInterviewEntityToDTO(a));
        }
        return result;
    }

    public List<Degree2personDTO> convertFromDegree2personEntityList(List<Degree2person> list) {
        List<Degree2personDTO> result = new ArrayList<>();
        for (Degree2person a : list) {
            result.add(MAPPER.convertFromDegree2personEntityToDTO(a));
        }
        return result;
    }

    public List<Degree2hiringDTO> convertFromDegree2hiringEntityList(List<Degree2hiring> list) {
        List<Degree2hiringDTO> result = new ArrayList<>();
        for (Degree2hiring a : list) {
            result.add(MAPPER.convertFromDegree2hiringEntityToDTO(a));
        }
        return result;
    }

    public List<ApplicationDTO> convertFromApplicationEntityList(List<Application> list) {
        List<ApplicationDTO> result = new ArrayList<>();
        for (Application a : list) {
            result.add(MAPPER.convertFromApplicationEntityToDTO(a));
        }
        return result;
    }

    public List<Skill2hiringDTO> convertFromSkill2hiringEntityList(List<Skill2hiring> list) {
        List<Skill2hiringDTO> result = new ArrayList<>();
        for (Skill2hiring a : list) {
            result.add(MAPPER.convertFromSkill2hiringEntityToDTO(a));
        }
        return result;
    }

    public List<Skill2personDTO> convertFromSkill2personEntityList(List<Skill2person> list) {
        List<Skill2personDTO> result = new ArrayList<>();
        for (Skill2person a : list) {
            result.add(MAPPER.convertFromSkill2personEntityToDTO(a));
        }
        return result;
    }
}
