package com.example.workmanager

import android.graphics.Bitmap
import android.net.Uri
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import java.util.UUID

class PhotoViewModel:ViewModel() {
    var uncompresseduri : Uri? by mutableStateOf(null)
    var compressedBitmap : Bitmap? by mutableStateOf(null)

    var workId:UUID? by mutableStateOf(null)
    private set


    fun updateUncompressUri(uri:Uri?){
        uncompresseduri = uri
    }
    fun updateCompressedBitmap(bmp:Bitmap?){
        compressedBitmap = bmp
    }

    fun  updateWorkId(uuid:UUID?){
        workId =uuid
    }
}