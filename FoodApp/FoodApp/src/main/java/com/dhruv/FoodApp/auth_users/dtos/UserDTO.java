package com.dhruv.FoodApp.auth_users.dtos;



import com.dhruv.FoodApp.role.dtos.RoleDTO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDTO {

    private Long id;
    private String name;
    private String phoneNumber;

    private String profileUrl;

//    write only: included when recieve data, exclude when sending data
//    only used for writing (deserialization), ignored during reading (serialization)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    private boolean isActive;

    private String address;

    private List<RoleDTO> roles;


    private MultipartFile imageFile;


}
