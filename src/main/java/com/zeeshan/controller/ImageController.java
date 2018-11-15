package com.zeeshan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.zeeshan.dao.ImageDAO;

@Controller
public class ImageController {

	@Autowired
	public ImageDAO dao;

	@RequestMapping(value = "/InsertImage", method = RequestMethod.POST)
	public ModelAndView save(@RequestParam("name") String name, @RequestParam("age") int age,
			@RequestParam("photo") MultipartFile photo) {

		try {
			dao.insertRecords(name, age, photo);
			return new ModelAndView("index", "msg", "Records succesfully inserted into database.");
		} catch (Exception e) {
			return new ModelAndView("index", "msg", "Error: " + e.getMessage());
		}

	}
}
