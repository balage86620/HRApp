/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.io.Serializable;

/**
 *
 * @author Hirsch
 */
@JsonDeserialize(as = JobDTO.class)
public interface JobDTOInterface extends Serializable{
    
}
