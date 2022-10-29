package com.example.sample2;

import javafx.scene.chart.PieChart;

import java.util.Date;

public class StudentData3 {
    public String lesson_id;
    private String course_id;

    public String getLesson_id() {
        return lesson_id;
    }

    public void setLesson_id(String lesson_id) {
        lesson_id = lesson_id;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        course_id = course_id;
    }

    public String getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(String roll_no) {
        roll_no = roll_no;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        date = date;
    }

    private String roll_no;
    private Date date;

    public StudentData3(String roll_no, String course_id,String lesson_id,Date date) {
        this.course_id=course_id;
        this.lesson_id=lesson_id;
        this.roll_no=roll_no;
        this.date=date;
    }







}
