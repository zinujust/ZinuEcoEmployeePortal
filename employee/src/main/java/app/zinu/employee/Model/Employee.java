package app.zinu.employee.Model;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
    
    private Long id;
    private String Fname;
    private String LName;
    private LocalDate dob;
    private String idCardType;
    private String idCardNum;
    private String idCardExp;
    private String email;

}
