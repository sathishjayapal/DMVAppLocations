package me.sathish.kotlin.recipes.dmvapplocations

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DmvAppLocationsApplication

fun main(args: Array<String>) {
	runApplication<DmvAppLocationsApplication>(*args){
		setBannerMode(Banner.Mode.OFF)
	}
}
