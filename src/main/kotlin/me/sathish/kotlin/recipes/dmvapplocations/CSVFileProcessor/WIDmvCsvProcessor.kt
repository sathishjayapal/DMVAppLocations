package me.sathish.kotlin.recipes.dmvapplocations.CSVFileProcessor

import me.sathish.csvread.data.WIDmv
import org.apache.commons.csv.CSVFormat
import org.springframework.stereotype.Component
import java.io.InputStreamReader
import kotlin.random.Random

private const val FLD_SC_NM = "FLD_SC_NM"
private const val OBJECTID = "OBJECTID"
private const val DNV_STN_ADDR_STR = "DNV_STN_ADDR_STR"
private const val DMV_WI_CNTY_NM = "DMV_WI_CNTY_NM"
private const val DMV_STN_ZPCD = "DMV_STN_ZPCD"
private const val DMV_SERVICE_CENTER_CSV = "DMV_Service_Center.csv"

@Component
class WIDmvCsvProcessor {
    fun readFile(): List<WIDmv> {
        val wiDMVDataList = mutableListOf<WIDmv>()
        val reader =
            Thread.currentThread().contextClassLoader.getResourceAsStream(DMV_SERVICE_CENTER_CSV)
                ?.let { InputStreamReader(it) }
        val csvFormat = CSVFormat.Builder.create(CSVFormat.DEFAULT)
        csvFormat.setHeader()
        for (csvRecord in csvFormat.build().parse(reader)) {
            val wiDMVData = WIDmv(
                id = Random.nextDouble(),
                objectid = csvRecord.get(OBJECTID),
                dmvDesc = csvRecord.get(FLD_SC_NM),
                dmvAddress = csvRecord.get(DNV_STN_ADDR_STR),
                dmvCnty = csvRecord.get(DMV_WI_CNTY_NM),
                dmvZipCode = csvRecord.get(DMV_STN_ZPCD)
            )
            wiDMVDataList.add(wiDMVData)
        }
        return wiDMVDataList
    }
}
