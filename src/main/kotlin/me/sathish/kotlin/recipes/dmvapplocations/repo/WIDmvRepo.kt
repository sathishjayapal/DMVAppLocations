package me.sathish.kotlin.recipes.dmvapplocations.repo

import me.sathish.csvread.data.WIDmv
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface WIDmvRepo : CrudRepository<WIDmv, String> {
    @Query("select * from widmv")
    fun findDMVS(): List<WIDmv>
}

