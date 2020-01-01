/**
 * 
 */
package com.codersknowledge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zubayer Ahamed
 *
 */
@RestController
@RequestMapping("/list")
public class ListController {

	@GetMapping("/all")
	public String getAllList() {
		return "Hi i am activated now";
	}
}
