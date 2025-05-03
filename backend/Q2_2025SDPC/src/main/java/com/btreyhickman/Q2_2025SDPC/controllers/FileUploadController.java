package com.btreyhickman.Q2_2025SDPC.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.*;
import java.util.Scanner;

@Controller
public class FileUploadController {

	@RequestMapping("/upload")
	public String uploadFile(@RequestBody String file)  {
		System.out.println(file);
		try (Scanner scanner = new Scanner(new File(file))) {
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] values = line.split(",");

			}
		} catch (IOException e){
			e.printStackTrace();
		}

		// This method will handle the file upload logic
		return "upload"; // This should return the name of your HTML file (without .html)
	}

}
