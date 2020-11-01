package com.luohz.tuantuan.product;

import com.luohz.tuantuan.product.entity.BrandEntity;
import com.luohz.tuantuan.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TuantuanProductApplicationTests {


	@Autowired
	BrandService brandService;
	@Test
	void contextLoads() {
		BrandEntity brandEntity = new BrandEntity();
		brandEntity.setName("小米");
		brandService.save(brandEntity);
		System.out.println("save success...");
	}

}
