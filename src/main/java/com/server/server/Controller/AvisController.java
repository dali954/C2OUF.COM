package com.server.server.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.server.server.Service.AvisService;

@RequestMapping("/oauth")
@RestController
public class AvisController {
  @Autowired
  AvisService avisService;
}
