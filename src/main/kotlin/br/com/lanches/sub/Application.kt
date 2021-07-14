package br.com.lanches.sub

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("br.com.lanches.sub")
		.start()
}

