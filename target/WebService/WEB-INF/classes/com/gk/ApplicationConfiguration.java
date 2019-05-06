package com.gk.WebService;

import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration

@EnableWebMvc

@ComponentScan(basePackages = "com.gk.WebService")

public class ApplicationConfiguration {

}