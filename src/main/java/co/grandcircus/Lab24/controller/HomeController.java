package co.grandcircus.Lab24.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.Lab24.dao.CoffeeDao;
import co.grandcircus.Lab24.model.User;


@Controller
public class HomeController {
	@Autowired
	CoffeeDao dao;
	
	@RequestMapping("/registration")
    public ModelAndView goToRegistrationPage() {
        ModelAndView registrationView = new ModelAndView();
        registrationView.setViewName("registration"); //name of the jsp-file in the 'page' folder
         return registrationView;
    }

//@RequestMapping("/summary")
//public ModelAndView goToSummaryPage() {
//	ModelAndView summaryView = new ModelAndView();
//	summaryView.setViewName("summary");
//	return summaryView;
//}

@PostMapping("/summary")
public ModelAndView formDeets(@RequestParam("first") String firstStr, @RequestParam("last") String lastStr,
		@RequestParam("email") String emailStr, @RequestParam("number") String numberStr, @RequestParam("password") String passwordStr, 
		@RequestParam("gender") String genderStr) {
	User newUser = new User(firstStr, lastStr, emailStr, numberStr, passwordStr, genderStr);
	return new ModelAndView("summary", "user", newUser.toString());
			
}

@RequestMapping("/summary")
public ModelAndView home() {
	System.out.println(dao.findAllUsers());
	return new ModelAndView("summary", "userList", dao.findAllUsers());
}

@RequestMapping("/")
public ModelAndView home2() {
	System.out.println(dao.findAllProducts());
	return new ModelAndView("index", "productList", dao.findAllProducts());
}

@RequestMapping("add-user") 
public ModelAndView addUser(User u) {
dao.addUser(u.getFirstName(), u.getLastName(), u.getEmail(), u.getPhoneNumber(), u.getPassword(), u.getGender());

return new ModelAndView("redirect:/summary");
}

@RequestMapping("update-user") //mapping from HREF mapping
public ModelAndView updateForm(int id) {
	
	return new ModelAndView("updateuser-form", "userId", id); //takes us to update-form.jsp view
}

@RequestMapping("update")
public ModelAndView update(User user) {
	dao.updateUser(user);
	return new ModelAndView("redirect:/summary");
}

@RequestMapping("delete-user")
public ModelAndView delete(int id) {
	dao.deleteUser(id);
	return new ModelAndView("redirect:/summary");
}
}
