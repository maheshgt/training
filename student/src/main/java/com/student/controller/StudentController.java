package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.student.entity.Student;
import com.student.repository.StudentDao;

@Controller
public class StudentController {

	@Autowired
	private StudentDao studentDao;

	@RequestMapping("/studentform")
	public String showform(Model m) {
		m.addAttribute("command", new Student());
		return "studentform";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("student") Student student) {
		studentDao.save(student);
		return "redirect:/viewstudent";// will redirect to viewemp request mapping
	}

	@RequestMapping("/viewstudent")
	public String viewemp(Model m) {
		List<Student> list = studentDao.getStudents();
		m.addAttribute("list", list);
		return "viewstudent";
	}

	@RequestMapping(value = "/studentedit"
			+ "/{id}")
	public String edit(@PathVariable int id, Model m) {
		Student student = studentDao.getStudentById(id);
		m.addAttribute("command", student);
		return "studentedit";
	}

	/* It updates model object. */
	@RequestMapping(value = "/editsave", method = RequestMethod.POST)
	public String editsave(@ModelAttribute("student") Student student) {
		studentDao.update(student);
		return "redirect:/viewstudent";
	}

	/* It deletes record for the given id in URL and redirects to /viewemp */
	@RequestMapping(value = "/deleteemp/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable int id) {
		studentDao.delete(id);
		return "redirect:/viewstudent";
	}
}
