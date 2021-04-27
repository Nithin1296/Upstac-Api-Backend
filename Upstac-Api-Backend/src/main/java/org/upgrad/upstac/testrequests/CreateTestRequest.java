package org.upgrad.upstac.testrequests;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.upgrad.upstac.users.models.Gender;

import javax.validation.constraints.NotNull;

@Data
@Getter
@Setter

public class CreateTestRequest {



    private String name;
    private Gender gender;
    private String address;
    private Integer age;

    private String email;

    private String phoneNumber;


    private Integer pinCode;




}
