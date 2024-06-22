package app.zinu.employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.zinu.employee.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Long, Employee>{
    
}
