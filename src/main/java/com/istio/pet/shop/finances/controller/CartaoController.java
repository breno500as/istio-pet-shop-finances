package com.istio.pet.shop.finances.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.istio.pet.shop.finances.entity.Cartao;

@RestController
@RequestMapping("cartoes")
public class CartaoController {

	@GetMapping
	public ResponseEntity<List<Cartao>> getUsuarios() {
		final List<Cartao> cartoes = new ArrayList<>();
		cartoes.add(new Cartao(1L, "34234235"));
		cartoes.add(new Cartao(2L, "56645767"));
		return ResponseEntity.ok(cartoes);
	}

}
