package io.cutebot.telegram.tgmodel

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class TgResponseUpdate (
    @field: JsonProperty
    val ok: Boolean,

    @field: JsonProperty
    val result: List<TgUpdate>

)
