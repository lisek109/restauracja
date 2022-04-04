package com.example.restauracja.repository;

import com.example.restauracja.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//@Repository
//public class EmployeeRepo {
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    List<Employee> findAllByIsFree(Boolean isFree); // SELECT * FROM employee WHERE isFree = ?



  //  private List<Employee> employeeList = new ArrayList<>();
  //  private Long idSequence = 1L;
//
  //  public Employee save(Employee employee) {
  //      employee.setId(idSequence++);
  //      employeeList.add(employee);
  //      return employee;
  //  }
//
  //  public List<Employee> findAll() {
  //      return new ArrayList<>(employeeList);
  //  }
//
  //  public Employee findById (Long id) {
  //      return employeeList.stream()
  //             .filter(e -> e.getId().equals(id))
  //              .findFirst().orElseThrow(RuntimeException::new);
  //  }
//
  //  public boolean deleteById(Long id) {
  //      employeeList.remove(findById(id));
  //      return true;
  //  }

}
