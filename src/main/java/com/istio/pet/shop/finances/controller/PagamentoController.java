package com.istio.pet.shop.finances.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pagamentos")
public class PagamentoController {

	@PostMapping
	public ResponseEntity<String> criaPagamento() {
		return ResponseEntity.ok("OK");
	}

}
