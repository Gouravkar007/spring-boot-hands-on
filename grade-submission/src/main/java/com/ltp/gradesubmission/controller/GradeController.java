package com.ltp.gradesubmission.controller;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.ltp.gradesubmission.Grade;

import com.ltp.gradesubmission.service.GradeService;

//This is the controller class which represent the view of the data

@Controller
public class GradeController {

  GradeService gradeServoService = new GradeService();

    @GetMapping("/") 
    public String getForm(Model model, @RequestParam(required = false) String id) {
        
        model.addAttribute("grade",gradeServoService.getGradebyId(id));
        return "form";
    }

    @PostMapping("/handleSubmit")
    public String submitForm(@Valid Grade grade, BindingResult result) {
        if (result.hasErrors()) return "form";
        gradeServoService.submitGrade(grade);
        return "redirect:/grades";
    }

    @GetMapping("/grades")
    public String getGrades(Model model) {
        model.addAttribute("grades", gradeServoService.getGrades());
        return "grades";
    }

    
    

}