package me.sathish.kotlin.recipes.dmvapplocations.controller;

import me.sathish.kotlin.recipes.dmvapplocations.CSVFileProcessor.WIDmvCsvProcessor
import me.sathish.kotlin.recipes.dmvapplocations.service.WIDMVService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class WIDMVController(val wiDMVService: WIDMVService) {
    @GetMapping("/")
    fun listDMVS(model: Model): String {
        val wiDmvCsvProcessor = WIDmvCsvProcessor()
        val myList = wiDmvCsvProcessor.readFile();
        myList.forEach { wiDMVData ->
            {
                wiDMVService.post(wiDMVData)
            }
        }
        println("The size: ${wiDMVService.findMessages().size}");
        model["widmvs"] = myList
        return "widmvs";
    }
}

