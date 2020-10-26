package com.org.department.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection="Department")
public class Department {
    @Id
    private Integer deptid;
    private String deptname;
    private Double salary;
    private String address;

}
