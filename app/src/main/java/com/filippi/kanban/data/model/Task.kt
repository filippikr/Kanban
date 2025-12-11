package com.filippi.kanban.data.model
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Task(
    var id: String,
    var description: String,
    var status: Status
) : Parcelable {
    constructor() : this(
        id = "",
        description = "",
        status = Status.TODO
    )
}