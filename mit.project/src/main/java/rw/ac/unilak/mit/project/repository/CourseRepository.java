package rw.ac.unilak.mit.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rw.ac.unilak.mit.project.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
