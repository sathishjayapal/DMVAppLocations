package me.sathish.kotlin.recipes.dmvapplocations.service

import me.sathish.csvread.data.WIDmv
import me.sathish.kotlin.recipes.dmvapplocations.repo.WIDmvRepo
import org.springframework.stereotype.Service

@Service
class WIDMVService(val db: WIDmvRepo) {

    fun findMessages(): List<WIDmv> = db.findDMVS()

    fun post(message: WIDmv) {
        db.save(message)
    }
}
