package id.ac.umn.app.challenge3


import android.os.Parcelable
import java.io.Serializable


data class Data(
    val nama : String,
    val usia : Int,
    val alamat : String,
    val pekerjaan : String
): Serializable