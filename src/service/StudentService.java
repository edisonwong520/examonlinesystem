package service;

import java.util.List;

import po.Pagination;
import po.Student;

public interface StudentService {
	Integer checkLogin(Student student) throws Exception;

	Integer checkSignIn(Student student) throws Exception;

	Integer insertStudent(Student student) throws Exception;

	Student findOne(String name) throws Exception;

	Student findOneById(Integer id) throws Exception;

	void editOne(Student student) throws Exception;

	List<Student> getList() throws Exception;

	List<Student> getListByLimit(Pagination pagination) throws Exception;

	void deleteOneById(Integer id);
}
