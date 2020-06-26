package io.cutebot.telegram.tgmodel.photo

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class TgPhotoSize (

    @field: JsonProperty("file_id")
    val fileId: String,

    @field: JsonProperty("file_unique_id")
    val fileUniqueId: String,

    @field: JsonProperty
    val width: Int,

    @field: JsonProperty
    val height: Int,

    @field: JsonProperty("file_size")
    val fileSize: Int?
)
