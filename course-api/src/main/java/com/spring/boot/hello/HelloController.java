package com.spring.boot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController   //@Controller for mvc app //@RestController for webservice
public class HelloController 
{
  @RequestMapping("/hello") // if request URL match then below method got execute
  String sayHai()
  {
	  return "Hai";
  }
}
