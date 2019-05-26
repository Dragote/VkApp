package com.murtazin.vkapp.data.converters

import com.murtazin.vkapp.data.response.ProfileResponse
import com.murtazin.vkapp.domain.entity.ProfileEntity
import javax.inject.Inject

class ProfileEntityConverter @Inject constructor(): DataConverter<ProfileResponse, ProfileEntity> {

    override fun convertTo(t: ProfileResponse): ProfileEntity = ProfileEntity(
        t.id,
        t.firstName,
        t.lastName,
        t.status,
        t.birthday,
        t.sex,
        t.city,
        t.country,
        t.education,
        t.avatarUrl
    )

    override fun convertFrom(k: ProfileEntity): ProfileResponse = ProfileResponse(
        k.id,
        k.firstName,
        k.lastName,
        k.status,
        k.birthday,
        k.sex,
        k.city,
        k.country,
        k.education,
        k.avatarUrl
    )
}