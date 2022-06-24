package com.devyoung.apiservice;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApiRequestVO {

	private Long id;
	private ProductVO productVO;
	
}
