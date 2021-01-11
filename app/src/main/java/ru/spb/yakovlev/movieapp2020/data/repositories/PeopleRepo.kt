package ru.spb.yakovlev.movieapp2020.data.repositories

import ru.spb.yakovlev.movieapp2020.data.remote.RestService
import ru.spb.yakovlev.movieapp2020.data.remote.resp.CreditsResponse
import ru.spb.yakovlev.movieapp2020.model.ActorData
import ru.spb.yakovlev.movieapp2020.model.ApiKey
import ru.spb.yakovlev.movieapp2020.model.ApiSettings
import javax.inject.Inject

interface IPeopleRepo {
    suspend fun getCastByMovieId(movieId: Int, language: String): List<ActorData>
}

class PeopleRepo @Inject constructor(
    private val network: RestService,
    apiKey: ApiKey,
    private val apiSettings: ApiSettings,
) : IPeopleRepo {
    private val key = apiKey.value

    override suspend fun getCastByMovieId(movieId: Int, language: String): List<ActorData> {
        return network.getMovieCredits(
            movieId = movieId,
            apiKey = key,
            language = language,
        ).cast.map { it.toActorData() }
    }

    private fun CreditsResponse.Cast.toActorData() =
        ActorData(
            id = castId,
            name = name,
            photo = if (profilePath != null) "${apiSettings.secureBaseUrl}${apiSettings.profileSize}$profilePath" else "",
        )
}