package com.ltp.gradesubmission.repository;

import java.util.ArrayList;
import java.util.List;

import com.ltp.gradesubmission.Grade;

//this a repositruy class wich is do all CURD opretions

public class GradeRepository {

      private List<Grade> studentGrades = new ArrayList<>();

      public Grade getGrade(int index){
        return studentGrades.get(index);
      }
      
      public void addGrade(Grade grade){
        studentGrades.add(grade);
      }

      public void updateGrade(Grade grade , int index){
        studentGrades.set(0, grade);
      }

      public List<Grade> getGrades(){
        return studentGrades;
      }

}
