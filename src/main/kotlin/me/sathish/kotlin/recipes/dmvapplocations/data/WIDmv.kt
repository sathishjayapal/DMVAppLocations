package me.sathish.csvread.data

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("WIDMV")
data class WIDmv(
    @Id val id: Double,
    val objectid: String,
    val dmvDesc: String,
    val dmvAddress: String,
    val dmvCnty: String,
    val dmvZipCode: String
)
