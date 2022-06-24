package com.devyoung.apiservice;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// 원래는 각각의 서버에 구성해야 하는데 연습용으로 한 서버에 서버(1,2,3)이라고 가정하고 구성
@RestController
public class ApiController {

	@PostMapping("/api/product/1")
	public String product1(@RequestBody ApiInfo apiInfo) {
		List<ProductVO> productVOList = apiInfo.getApiRequestList().stream().map(item -> item.getProductVO()).collect(Collectors.toList());
		System.out.println("productVOList = " + productVOList);
		
		return "product1 was successfully processed";
	}
	
	@PostMapping("/api/product/2")
	public String product2(@RequestBody ApiInfo apiInfo) {
		List<ProductVO> productVOList = apiInfo.getApiRequestList().stream().map(item -> item.getProductVO()).collect(Collectors.toList());
		System.out.println("productVOList = " + productVOList);
		
		return "product2 was successfully processed";
	}
	
	@PostMapping("/api/product/3")
	public String product3(@RequestBody ApiInfo apiInfo) {
		List<ProductVO> productVOList = apiInfo.getApiRequestList().stream().map(item -> item.getProductVO()).collect(Collectors.toList());
		System.out.println("productVOList = " + productVOList);
		
		return "product3 was successfully processed";
	}
	
}
