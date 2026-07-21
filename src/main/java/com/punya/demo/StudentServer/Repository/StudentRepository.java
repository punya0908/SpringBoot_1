package com.punya.demo.StudentServer.Repository;

import com.punya.demo.StudentServer.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
