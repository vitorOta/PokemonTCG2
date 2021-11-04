package com.vitorota.pokemontcg2.data.api

import com.vitorota.pokemontcg2.data.api.schema.CardSchema
import com.vitorota.pokemontcg2.data.api.schema.ListCardResponseSchema
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokemonTCGApi {

    @GET("cards")
    suspend fun searchByName(): ListCardResponseSchema

    @GET("cards")
    suspend fun listAll(): ListCardResponseSchema
}